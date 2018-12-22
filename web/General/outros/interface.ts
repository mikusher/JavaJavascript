//criando uma interface, assim ajuda a controlar os dados passados
interface IPessoa{
    nome: string;
    apelido: string;
    idade?: number;
}

//criando uma função em que recebo variaveis de uma interface
function digaHola(inform:IPessoa) {
    if (inform.idade) {
        return "Hola "+inform.nome+" "+inform.apelido+" "+"Idade: "+inform.idade;
    }
    return "Hola "+inform.nome+" "+inform.apelido;
}

//criando as pessoas em que serão apresentadas
let individuo1 = {nome:"Luis", apelido:"Amilcar"};
let individuo2 = {nome:"Helio", apelido:"Miguel", idade: 26};

//imprimindo as pessoas na tela, um com idade e outra não. 
console.log(digaHola(individuo1));
console.log(digaHola(individuo2));