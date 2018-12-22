/**
 * Tipos em type script
 * string, boolean, array, number
 * variaveis usando o let ou var
 *
 * Quando se o LET a minha variavel se torna limitada ao bloco em que esta sendo utilizada
 * Quando se o o VAR a variavel tona em ambito Global, sem limite.
 * let -> variavel local
 * var -> variavel global
 */
//utilizando o var
function testarVariavelVar() {
    var x = 20;
    if (x == 20) {
        var x = 50;
        var y = x + 10;
        console.log("Dentro do if X vale " + x);
        console.log("Dentro do if y vale " + y);
    }
    console.log("Fora do if X vale " + x);
}
console.log(testarVariavelVar());
//utilizando o let
function testarVariavelLet() {
    var x = 20; //limita a variavel 
    if (x == 20) {
        var x_1 = 50; //variavel diferente do anterior
        var y = x_1 + 10;
        console.log("Dentro do if X vale " + x_1);
    }
    console.log("Fora do if X vale " + x);
    console.log("Fora do if y vale " + y);
}
console.log(testarVariavelLet());
