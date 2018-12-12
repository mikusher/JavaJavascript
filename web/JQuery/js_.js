function exibirElemntoPorTag(tag) {
    $(tag).show();
}

function ocultarElemntoPorTag(tag) {
    $(tag).hide();
}

function exibirElemntoPorClasse(classe) {
    $('.' + classe).show();
}

function ocultarElemntoPorClasse(classe) {
    $('.' + classe).hide();
}

function exibirElemntoPorId(id) {
    $('#' + id).show();
}

function ocultarElemntoPorId(id) {
    $('#' + id).hide();
}