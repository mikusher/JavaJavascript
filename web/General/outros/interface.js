//criando uma função em que recebo variaveis de uma interface
function digaHola(inform) {
    if (inform.idade) {
        return "Hola " + inform.nome + " " + inform.apelido + " " + "Idade: " + inform.idade;
    }
    return "Hola " + inform.nome + " " + inform.apelido;
}
//criando as pessoas em que serão apresentadas
var individuo1 = { nome: "Luis", apelido: "Amilcar" };
var individuo2 = { nome: "Helio", apelido: "Miguel", idade: 26 };
//imprimindo as pessoas na tela, um com idade e outra não. 
console.log(digaHola(individuo1));
console.log(digaHola(individuo2));
