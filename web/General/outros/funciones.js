/**
 * funções em type script é muito parecido com o java
 * se declarar uma função, mas não tem certeza que vais ter uma certa variavel
 * pode usar o ponto de interogação (?), veja o exemplo em baixo.
 */
//função simples que retorna um tipo number 
function soma(x, y) {
    return x + y;
}
//quando não tem a certeza se o apelido vai ser passado ou não. tambem essa função retorna o tipo string
function saudacao(nome, apelido) {
    if (apelido) {
        return "Ola " + nome + " " + apelido;
    }
    return "Ola " + nome;
}
//podes criar funções anonimas em que não vai ter nenhum nome definido
var funcaoAnonima = function (x, y) {
    return x + y;
};
console.log(soma(10, 20));
console.log(saudacao("Luis"));
console.log(saudacao("Luis", "Amilcar"));
//chamada da função anonima
console.log(funcaoAnonima(19, 20));
