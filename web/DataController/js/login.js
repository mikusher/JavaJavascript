$(document).ready(function () {

    const inputBTSignInd = document.getElementById('inputBTSignInd');
    inputBTSignInd.addEventListener('click', login);

    //login controller
    function login() {
        const inputEmail = document.getElementById('inputEmail');
        const inputPassword = document.getElementById('inputPassword');

        if (inputEmail.value === "" || inputPassword.value === "") {
            document.getElementById('error').innerHTML = "<center class='text-warning'>Please Complete The Required Field!</center>";
        } else {
            if (inputEmail.value === 'luis@amilcar.cv' && inputPassword.value === 'tavares') {
                document.getElementById('error').innerHTML = "";
                if(Utils.getCookie(inputEmail.value) !== inputEmail.value){
                    Utils.setCookie(inputEmail.value, inputEmail.value, {secure: true, 'max-age': 3600});
                }
                inputEmail.value = "";
                inputPassword.value = "";
                window.location = "../pages/dashboard.html";
            } else {
                document.getElementById('error').innerHTML = "<center class='text-danger'>Invalid Username or Password</center>";
            }
        }
    }

    function toggleResetPswd(e){
        e.preventDefault();
        $('#logreg-forms .form-signin').toggle(); // display:block or none
        $('#logreg-forms .form-reset').toggle(); // display:block or none
    }

    function toggleSignUp(e){
        e.preventDefault();
        $('#logreg-forms .form-signin').toggle(); // display:block or none
        $('#logreg-forms .form-signup').toggle(); // display:block or none
    }

    $(()=>{
        // Login Register Form
        $('#logreg-forms #forgot_pswd').click(toggleResetPswd);
        $('#logreg-forms #cancel_reset').click(toggleResetPswd);
        $('#logreg-forms #btn-signup').click(toggleSignUp);
        $('#logreg-forms #cancel_signup').click(toggleSignUp);
    })

});