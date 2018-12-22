//funções necessarias para a minha pagina de calcular

function calcular() {
    //pegando os valores atraves do elemente id.
    var operacao = document.getElementById('operacao').value;
    var _primeiroNumero = document.getElementById('primeiroNumero').value
    var _segundoNumero = document.getElementById('segundoNumero').value
    var resultado = null;

    //verificar se os campos são nulos ou vazio
    if (_primeiroNumero == '' || _primeiroNumero == null) {
        alert('Indica um valor valido para o primeiro numero');
        return false;
    } else if (_segundoNumero == '' || _segundoNumero == null) {
        alert('Indica um valor valido para o segundo numero')
        return false;
    } else {
        //verificar se os valores são do tipo numerico
        if (!isNaN(_primeiroNumero) && !isNaN(_segundoNumero)) {
            //forçar o tipo do valor para float, para ser calculado
            _primeiroNumero = parseFloat(_primeiroNumero);
            _segundoNumero = parseFloat(_segundoNumero);
            switch (operacao) {
                case '1': //sub
                    resultado = (_primeiroNumero - _segundoNumero);
                    break;
                case '2': //adi
                    resultado = (_primeiroNumero + _segundoNumero);
                    break;
                case '3': //mul
                    resultado = (_primeiroNumero * _segundoNumero);
                    break;
                case '4': //div
                    resultado = (_primeiroNumero / _segundoNumero);
                    break;
                default: //invalida
                    alert('Selecione uma operação.')
                    return false;
                    break;
            }
            // passar o resultado final para a variavel no html 
            document.getElementById('resultadoFinal').value = resultado;
        } else {
            alert('O valores devem ser do tipo numerico');
            return false;
        }
    }
} 