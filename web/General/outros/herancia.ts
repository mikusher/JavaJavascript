// herança e modificadores de acesso

//classe mãe 
class Animais {
    public _nomeAnimal: string;
    public _numeroPatas: number;
    private _corPele: string;

    constructor(nome: string) {
        this._nomeAnimal = nome;
    }

    public quantasPatas(patas: number){
        this._numeroPatas = patas;
        console.log("Tenho " +this._numeroPatas+" patas!");
    }

    private corAnimal(cor: string){
        this._corPele = cor;
        console.log("Minha cor é "+this._corPele);
    }

    //um metodo set/get para a cor do animal
    public setCorPele(cor:string):string{
        return this._corPele = cor;
    }

    public getCorPele():void{
        console.log("Minha cor é "+this._corPele);
    }

}

//class filha, herda a class mãe Animais
class Dog extends Animais{
    constructor(name: string){
        super(name)
    }

    saudar(){
        console.log("Ola sou "+this._nomeAnimal+"!")
    }
}


let golias = new Dog("Golias");
golias.saudar();
golias.quantasPatas(4);
golias.setCorPele("Preto");
golias.getCorPele();
// golias.corAnimal("Castanho"); // da um erro em typescript, mas o javascript compila na mesma