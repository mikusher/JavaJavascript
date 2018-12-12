// herança e modificadores de acesso
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
//classe mãe 
var Animais = /** @class */ (function () {
    function Animais(nome) {
        this._nomeAnimal = nome;
    }
    Animais.prototype.quantasPatas = function (patas) {
        this._numeroPatas = patas;
        console.log("Tenho " + this._numeroPatas + " patas!");
    };
    Animais.prototype.corAnimal = function (cor) {
        this._corPele = cor;
        console.log("Minha cor é " + this._corPele);
    };
    //um metodo set/get para a cor do animal
    Animais.prototype.setCorPele = function (cor) {
        return this._corPele = cor;
    };
    Animais.prototype.getCorPele = function () {
        console.log("Minha cor é " + this._corPele);
    };
    return Animais;
}());
//class filha, herda a class mãe Animais
var Dog = /** @class */ (function (_super) {
    __extends(Dog, _super);
    function Dog(name) {
        return _super.call(this, name) || this;
    }
    Dog.prototype.saudar = function () {
        console.log("Ola sou " + this._nomeAnimal + "!");
    };
    return Dog;
}(Animais));
var golias = new Dog("Golias");
golias.saudar();
golias.quantasPatas(4);
golias.setCorPele("Preto");
golias.getCorPele();
// golias.corAnimal("Castanho"); // da um erro em typescript, mas o javascript compila na mesma 
