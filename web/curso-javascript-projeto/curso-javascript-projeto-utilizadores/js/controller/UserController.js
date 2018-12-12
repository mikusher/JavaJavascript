class UserController {
    constructor(formIdCreate, formIdUpdate, tableId){
        this.formEL = document.getElementById(formIdCreate);
        this.formUP = document.getElementById(formIdUpdate);
        this.tableEL = document.getElementById(tableId);
        this.storageType = 'local'; //local or session
        this.onSubmit();
        this.onEdit();
        this.onClearStorage(this.storageType);
        this.selectAllDataInStorage(this.storageType);
    }

    onClearStorage(storageType){
        document.getElementById("clearSLS").addEventListener("click", function(event){
            event.stopImmediatePropagation();
            event.preventDefault();
            (storageType === 'session') ? sessionStorage.clear() : localStorage.clear();
            location.reload();
        });
    }

    onEdit(){
        document.querySelector("#box-user-update .btn-cancel").addEventListener("click", e=>{
            UserController.showPanel("create");
        });

        this.formUP.addEventListener("submit", event => {
            event.preventDefault();

            let btn = this.formUP.querySelector("[type=submit]");
            btn.disabled = true;

            let values = this.getValues(this.formUP);

            let index = this.formUP.dataset.trIndex;
            let tr = this.tableEL.rows[index];
            let userOld = JSON.parse(tr.dataset.user);
            let result = Object.assign({}, userOld, values);

            //btn.disabled = false;
            this.getPhoto(this.formUP).then(
                (content) =>{
                    if(!values.photo){
                        result._photo = userOld._photo;
                    }else {
                        result._photo = content;
                    }
                    tr.dataset.user = JSON.stringify(result);

                    tr.innerHTML = `
                        <td><img src="${result._photo}" alt="User Image" class="img-circle img-sm"></td>
                        <td>${result._name}</td>
                        <td>${result._email}</td>
                        <td>${(result._admin) ? 'Sim' : 'Não'}</td>
                        <td>${Utils.dateFormat(result._register)}</td>
                        <td>
                          <button type="button" class="btn btn-primary btn-edit btn-xs btn-flat">Editar</button>
                          <button type="button" class="btn btn-danger btn-delete btn-xs btn-flat">Excluir</button>
                        </td>
                    `;

                    this.addEventsTr(tr);
                    this.updateCount();

                    this.formUP.reset();
                    btn.disabled = false;
                    UserController.showPanel("create");
                },
                (e) =>{
                    console.error(e);
                });

        });
    }

    onSubmit(){
        
        this.formEL.addEventListener("submit", (event) => {
            event.preventDefault();

            let btn = this.formEL.querySelector("[type=submit]");
            btn.disabled = true;

            let values = this.getValues(this.formEL);

            if(!values){
                return false;
            }

            this.getPhoto(this.formEL).then(
                (content) =>{
                    values.photo = content;
                    UserController.insertStorageData(values, this.storageType);
                    this.addLine(values);
                    this.formEL.reset();
                    btn.disabled = false;
            }, 
                (e) =>{
                    console.error(e);
            });
            
        });
    }

    getPhoto(formEL){

        return new Promise((resolve, reject)=>{
            let fileReader = new FileReader();

            let elements = [...formEL.elements].filter(item =>{
                if(item.name === 'photo'){
                    return item;
                }
            });
    
            let file = elements[0].files[0];
    
    
            fileReader.onload = () =>{
                resolve(fileReader.result);
            };

            fileReader.onerror = (e) =>{
                reject(e);
            };
    
            if(file){
                fileReader.readAsDataURL(file);   
            }else{
                resolve('dist/img/boxed-bg.jpg');
            }
        });
    }

    getValues(myForm){
        let user = {};
        var isValid = true;

        [...myForm.elements].forEach(function (field, index) {
            if(['name', 'email', 'password'].indexOf(field.name) > -1 && !field.value){
                field.parentElement.classList.add('has-error');
                isValid = false;
            }

            if (field.name === "gender"){
                if (field.checked){
                    user[field.name] = field.value;
                }
            }else if(field.name === "admin"){
                user[field.name] = field.checked;
            }else {
                user[field.name] = field.value;
            }
        });
    
        if(!isValid){
            return false;
        }

        return new User(
            user.name,
            user.gender,
            user.birth,
            user.country,
            user.email,
            user.password,
            user.photo,
            user.admin
        );
    }

    static getUserStorageData(storageType){
        let users = [];
        let storageData = (storageType === 'session') ? sessionStorage : localStorage;

        if(storageData.getItem("Users")){
            users = JSON.parse(storageData.getItem("Users"));
        }
        return users;
    }

    selectAllDataInStorage(storageType){
        let users = UserController.getUserStorageData(storageType);

        users.forEach(dataUser =>{
            let user = new User();
            user.loadFromJSON(dataUser);
            this.addLine(user);
        })

    }

    static insertStorageData(dataUser, storageType){
        let users = UserController.getUserStorageData(storageType);
        users.push(dataUser);
        (storageType === 'session') ? sessionStorage.setItem("Users", JSON.stringify(users)) : localStorage.setItem("Users", JSON.stringify(users));
    }

    addLine(dataUser){

        let tr = document.createElement('tr');

        tr.dataset.user = JSON.stringify(dataUser);

        tr.innerHTML = `
            <td><img src="${dataUser.photo}" alt="User Image" class="img-circle img-sm"></td>
            <td>${dataUser.name}</td>
            <td>${dataUser.email}</td>
            <td>${(dataUser.admin) ? 'Sim' : 'Não'}</td>
            <td>${Utils.dateFormat(dataUser.register)}</td>
            <td>
              <button type="button" class="btn btn-primary btn-edit btn-xs btn-flat">Editar</button>
              <button type="button" class="btn btn-danger btn-delete btn-xs btn-flat">Excluir</button>
            </td>
        `;

        this.addEventsTr(tr);
        this.tableEL.appendChild(tr);
        this.updateCount();
    }

    static showPanel(type){
        if(type === "create"){
            document.querySelector("#box-user-create").style.display = "block";
            document.querySelector("#box-user-update").style.display = "none";
        }else{
            document.querySelector("#box-user-create").style.display = "none";
            document.querySelector("#box-user-update").style.display = "block";
        }
    }

    updateCount(){
        let numberUsers = 0;
        let numberAdmin = 0;

        [...this.tableEL.children].forEach(tr =>{
            numberUsers++;
            let user = JSON.parse(tr.dataset.user);
            if(user._admin){
                numberAdmin++;
            }
        });

        document.querySelector("#number-users").innerHTML = numberUsers;
        document.querySelector("#number-users-admin").innerHTML = numberAdmin;

    }

    addEventsTr(tr) {

        tr.querySelector(".btn-delete").addEventListener("click", e=>{
            //TODO: change to modal
            if(confirm("Deseja realmente excluir?")){
                tr.remove();
                this.updateCount();
            }

        });

        tr.querySelector(".btn-edit").addEventListener("click", e=>{
            let json = JSON.parse(tr.dataset.user);
            this.formUP.dataset.trIndex = tr.sectionRowIndex;

            for (let name in json){
                let field = this.formUP.querySelector("[name=" + name.replace("_", "") + "]");
                if(field){

                    switch (field.type) {
                        case 'file':
                            continue;
                            break;

                        case 'radio':
                            field = this.formUP.querySelector("[name=" + name.replace("_", "") + "][value=" + json[name] + "]");
                            //field.checked = true;
                            break;

                        case 'checkbox':
                            field.checked = json[name];
                            break;

                        default:
                            field.value = json[name];
                    }
                }
            }
            this.formUP.querySelector('.photo').src = json._photo;
            UserController.showPanel("update");
        });
    }
}