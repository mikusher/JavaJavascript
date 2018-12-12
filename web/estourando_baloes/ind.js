function inicia_Jogo() {
    var nivel_jogo = document.getElementById('nivelJogo').value;

    //forçando a passagem do nivel, juntamente com a pagina de Jogo
    window.location.href = 'jogo.html?' + nivel_jogo;
}