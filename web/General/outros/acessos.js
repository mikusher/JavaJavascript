var conversor = /** @class */ (function () {
    function conversor() {
    }
    conversor.radiano = function (graus) {
        return "O radiona de " + graus + " é: " + (graus * conversor.PI / 180);
    };
    conversor.PI = 3.1416;
    return conversor;
}());
console.log(conversor.PI);
console.log(conversor.radiano(25));
