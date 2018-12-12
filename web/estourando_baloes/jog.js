//para cada nivel o utilizador tem alguns segundos para arrebentar todos os balões
// 1 facil - 120 seg
// 2 normal - 60 seg
// 3 dificel - 30 seg


var timerID = null;
var nivel_jogo = null;
var nRand = null;
/**
 * 
 * pegar a url completa e tirar somente o nivel
 */
function iniciaJogo() {
    var tempo_segundos = 0;
    var url = window.location.search;
    nivel_jogo = url.replace("?", "");

    if (nivel_jogo == 1) {
        tempo_segundos = 120;
        nRand = 1;
    } else if (nivel_jogo == 2) {
        tempo_segundos = 60;
        nRand = 2;
    } else {
        tempo_segundos = 30;
        nRand = 3;
    }

    //inserir os segundos no span
    document.getElementById('cronometro').innerHTML = tempo_segundos;

    //quantidade de baloes a ser adicionados
    var qnt_baloes = nivelRand(nRand);

    //imprimir quantidade de baloes na laterar 
    document.getElementById('qnt_bl').innerHTML = qnt_baloes;
    document.getElementById('qnt_bl_sto').innerHTML = 0;

    criarBaloes(qnt_baloes);
    contagem_tempo(tempo_segundos + 1);
}

function nivelRand(nivelRandom) {
    var gerarBaloes = 0;
    if (nivelRandom == 1) {
        gerarBaloes = ((Math.random() * (20 - 10 + 1)) + 10);
    } else if (nivelRandom == 2) {
        gerarBaloes = Math.floor((Math.random() * (40 - 20 + 1)) + 20);
    } else {
        gerarBaloes = Math.floor((Math.random() * (80 - 40 + 1)) + 40);
    }
    return gerarBaloes.toPrecision(2);
}

function criarBaloes(qt_bal) {
    for (var index = 1; index <= qt_bal; index++) {
        var balao = document.createElement("img");
        balao.src = 'imagens/bug/pequeno_bug.png';
        balao.style.margin = '10px';
        balao.id = 'balao_' + index;
        balao.onclick = function () {
            estoura(this);
        };

        document.getElementById('cenario').appendChild(balao);
    }
}

function estoura(elemento) {
    //outra forma de eliminar a possibilidade de clicar mais de uma vez, 
    //remover a operação do on click

    var id_balao = elemento.id;

    if ((id_balao == 0)) {
        return false;
    } else {
        //document.getElementById(id_balao).setAttribute("onclick","");
        document.getElementById(id_balao).src = 'imagens/bug/pequeno_fixe.png';
        document.getElementById(id_balao).id = 0;
        pontuacao(-1);
    }

}

function pontuacao(acao) {
    var balao_OK = document.getElementById('qnt_bl').innerHTML;
    var balao_KO = document.getElementById('qnt_bl_sto').innerHTML;

    balao_OK = parseInt(balao_OK);
    balao_KO = parseInt(balao_KO);

    balao_OK = balao_OK + acao;
    balao_KO = balao_KO - acao;

    document.getElementById('qnt_bl').innerHTML = balao_OK;
    document.getElementById('qnt_bl_sto').innerHTML = balao_KO;

    situacao_jogo(balao_OK);
}

function situacao_jogo(bl_restatntes) {
    if (bl_restatntes == 0) {
        clearTimeout(timerID);
        alert('Parabéns, jogo finalizado.');
        window.location.href = 'index.html';
    }
}

function contagem_tempo(segundos) {
    segundos = segundos - 1;
    if (segundos == -1) {
        clearTimeout(timerID); //para a função de time out
        game_over();
        return false;
    }
    document.getElementById('cronometro').innerHTML = segundos;
    timerID = setTimeout("contagem_tempo(" + segundos + ")", 1000); //cria um cronometro
}

function game_over() {
    var balao_KO = document.getElementById('qnt_bl_sto').innerHTML;
    alert('Fim de jogo, o seu tempo terminou. Arrebentou ' + balao_KO + ' balões');
    window.location.href = 'index.html';
}