class CalcController{

    constructor(locale){

        this._last = {
            operator: '',
            number: ''
        };

        this._screenInfo = {
            locale: locale,
            display: "display",
            date: "date",
            time: "time"
        };

        this._audio = new Audio('click.mp3');
        this._audioOnOff = false;
        this._operations = [];
        this._displayEL = document.getElementById(this._screenInfo.display);
        this._dateEL = document.getElementById(this._screenInfo.date);
        // Second option for time.
        this._timeEL = document.getElementById(this._screenInfo.time);
        //this._currentDate;
        this.init();
        this.initButtonEvents();
        this.initKeyBoard();
    };

    copyToClipBoard(){
        let input = document.createElement('input');

        input.value = this.displayCalc;

        document.body.appendChild(input);

        input.select();

        document.execCommand("Copy");

        input.remove();

    }

    pasteFromClipBoard(){
        document.addEventListener('paste', evt=>{
            let text = evt.clipboardData.getDate('Text');
            this.displayCalc = parseFloat(text);
        })
    }

    init(){

        this.setDisplayDateScreen();
        setInterval(() =>{
            this.setDisplayDateScreen();
        }, 1000);
        this.setLastNumberDisplay();
        this.pasteFromClipBoard();

        document.querySelectorAll('#logo-hcode').forEach(btn =>{
            btn.addEventListener('click', evt => {
                this.toggleAudio();
            });
            this.addEventListenerAll(btn, 'mouseover,mouseup,mousedown', execEvt => {
                btn.style.cursor = "pointer";
            });
        });

        let timeEL = document.getElementById(this._screenInfo.time);
        // This can also be facilitated and leave as the displayDate the logic is the same,
        // I prefer to have so in case of study, has always multiple solutions to a single challenge.
        function startTime() {
            let today = new Date();
            let h = today.getHours();
            let m = today.getMinutes();
            let s = today.getSeconds();
            m = checkTime(m);
            s = checkTime(s);
            timeEL.innerHTML = h + ":" + m + ":" + s;
            //call time
            let t = setTimeout(startTime, 500);
        }
        function checkTime(i) {
            if (i < 10) {
                i = "0" + i
            }  // add zero in front of numbers < 10
            return i;
        }
        startTime();
    };

    toggleAudio(){
        this._audioOnOff = (!this._audioOnOff);
    }

    playAudio(){
        if(this._audioOnOff){
            this._audio.currentTime = 0;
            this._audio.play();
        }
    }

    initKeyBoard(){
        document.addEventListener('keyup', evt => {
            this.playAudio();
            switch (evt.key) {
                case 'Escape':
                    this.setAc();
                    break;
                case 'Backspace':
                    this.setCe();
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                case '%':
                    this.addOperations(evt.key);
                    break;
                case '.':
                case ',':
                    this.addDot('.');
                    break;
                case 'Enter':
                case '=':
                    this.calculate();
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    this.addOperations(parseInt(evt.key));
                    break;
                case 'c':
                    if(evt.ctrlKey){
                        this.copyToClipBoard();
                    }
                    break;
            }
        });
    }

    //create a new function for all button event
    addEventListenerAll(element, events, func){
        events.split(',').forEach(event => {
            element.addEventListener(event, func, false);
        })
    }

    // button events
    setError(){
        this.displayCalc = "Error";
    }

    isOperator(value){
        return (['+','-','*','%','/'].indexOf(value) > -1);
    }

    setLastValueOperation(value){
        this._operations[this._operations.length - 1] = value;
    }

    getLastOperation(){
        return this._operations[this._operations.length - 1];
    }

    pushOperation(value){
        this._operations.push(value);
        if(this._operations.length > 3){
            this.calculate();
        }
    }

    setAc(){
        this._last.operator = '';
        this._last.number = '';
        this._operations = [];
        this.setLastNumberDisplay();
    }

    setCe(){
        this._operations.pop();
        this.setLastNumberDisplay();
    }

    addOperations(value){

        if(isNaN(this.getLastOperation())){
            //string
            if(this.isOperator(value)){
                // change o operator
                this.setLastValueOperation(value);
            }else if(isNaN(value)){

            }else {
                this.pushOperation(value);
                this.setLastNumberDisplay();
            }
        }else {
            //number
            if(this.isOperator(value)){
                this.pushOperation(value);
            }else {
                //number
                let newValue = this.getLastOperation().toString() + value.toString();
                this.setLastValueOperation(newValue);

                //update display
                this.setLastNumberDisplay();
            }
        }

    }

    getResult(){
        try {
            return  eval(this._operations.join(""));
        }catch (e) {
            setTimeout(() =>{
                this.setError();
            }, 1);
        }

    }

    calculate() {
        let last = '';
        this._last.operator = this.getLastItem();

        if(this._operations.length < 3){
            let firstItem = this._operations[0];
            this._operations = [firstItem, this._last.operator, this._last.number];
        }

        if(this._operations.length > 3){
            last = this._operations.pop();
            this._last.number = this.getResult();
        }else if(this._operations.length === 3){
            this._last.number = this.getLastItem(false);
        }

        let result = this.getResult();

        if (last == '%'){
            result = result / 100;
            this._operations = [result];
        }else {
            this._operations = [result];

            if(last){
                this._operations.push(last);
            }
        }

        this.setLastNumberDisplay();
    }

    getLastItem(isOperator = true){
        let lastItem;
        for (let i = this._operations.length - 1; i >= 0; i--){
            if (this.isOperator(this._operations[i]) == isOperator){
                lastItem = this._operations[i];
                break;
            }
        }
        if(!lastItem){
            lastItem = (isOperator) ? this._last.operator : this._last.number;
        }
        return lastItem;
    }

    setLastNumberDisplay() {
        let lastNumber = this.getLastItem(false);

        if(!lastNumber){
            lastNumber = 0;
        }
        this.displayCalc = lastNumber;
    }

    addDot(){
        let lastOp = this.getLastOperation();

        if(typeof lastOp === 'string' && lastOp.split('').indexOf('.') > -1 ) return;

        if(this.isOperator(lastOp) || !lastOp){
            this.pushOperation('0.');
        }else {
            this.setLastValueOperation(lastOp.toString() + '.');
        }
        this.setLastNumberDisplay();
    }

    //button controler - action
    buttonController(value){
        this.playAudio();

        switch (value) {
            case 'ac':
                this.setAc();
                break;
            case 'ce':
                this.setCe();
                break;
            case 'soma':
                this.addOperations('+');
                break;
            case 'subtracao':
                this.addOperations('-');
                break;
            case 'multiplicacao':
                this.addOperations('*');
                break;
            case 'divisao':
                this.addOperations('/');
                break;
            case 'porcento':
                this.addOperations('%');
                break;
            case 'ponto':
                this.addDot('.');
                break;
            case 'igual':
                this.calculate();
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                this.addOperations(parseInt(value));
                break;
            default:
                this.setError();
                break;
        }
    }

    //button control - baseVal -> because svg
    initButtonEvents(){
        let buttons = document.querySelectorAll("#buttons > g, #parts > g");

        buttons.forEach((lstBtn, index) => {
            this.addEventListenerAll(lstBtn, 'click,drag', execEvt => {
                let bClick = lstBtn.className.baseVal.replace("btn-", "");
                this.buttonController(bClick);
            });

            this.addEventListenerAll(lstBtn, 'mouseover,mouseup,mousedown', execEvt => {
                lstBtn.style.cursor = "pointer";
            });
        });
    }



    setDisplayDateScreen(){
        this.displayDate = this.currentDate.toLocaleDateString(this._screenInfo.locale);
    }

    get displayDate(){
        return this._dateEL.innerHTML;
    }

    set displayDate(date){
        this._dateEL.innerHTML = date;
    }

    get displayTime(){
        return this._timeEL.innerHTML;
    }

    set displayTime(time){
        this._timeEL.innerHTML = time;
    }

    get displayCalc(){
        return this._displayEL.innerHTML;
    }

    set displayCalc(value){
        if(value.toString().length > 10){
            this.setError();
            return false;
        }

        this._displayEL.innerHTML = value;
    }

    get currentDate(){
        return new Date();
    }

    set currentDate(date){
        this._currentDate = date;
    }
}