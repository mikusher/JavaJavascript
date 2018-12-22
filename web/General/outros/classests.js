var Robot = /** @class */ (function () {
    function Robot() {
    }
    Robot.prototype.informacao = function () {
        if (this.getIdade !== undefined) {
            return "Meus dados: " + this._nome + " " + this._apelido + " Idade " + this._idade;
        }
        return "Meus dados: " + this._nome + " " + this._apelido;
    };
    Robot.prototype.getIdade = function () {
        return this._idade;
    };
    Robot.prototype.setIdade = function (value) {
        this._idade = value;
    };
    return Robot;
}());
var miDados = new Robot();
miDados._nome = "Luis";
miDados._apelido = "Amilcar";
miDados.setIdade(29);
//apresentar as informações
console.log(miDados.informacao());
