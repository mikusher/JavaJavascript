var Robot = /** @class */ (function () {
    //contrutor
    function Robot(nome) {
        if (nome !== undefined) {
            this._nome = nome;
        }
        else {
            this._nome = "User";
        }
    }
    //metodo
    Robot.prototype.saudar = function () {
        return "Ola sou " + this._nome;
    };
    return Robot;
}());
var robo = new Robot("Luis Amilcar");
var robo2 = new Robot();
console.log(robo.saudar());
console.log(robo2.saudar());
