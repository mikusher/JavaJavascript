class Robot {

    //atribuir valor 
    _nome: string;
    _apelido: string;

    //contrutor
    constructor(nome?: string){
        if (nome !== undefined) {
            this._nome = nome;
        } else {
            this._nome = "User"
        }
    }



    //metodo
    saudar(): string{
        return "Ola sou "+this._nome;
    }
}

let robo = new Robot("Luis Amilcar");
let robo2 = new Robot();

console.log(robo.saudar());
console.log(robo2.saudar());