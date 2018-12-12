var Terminado = {

    preload: function () {

    },

    create: function () {
        juego.stage.backgroundColor = "990000";
        if (confirm('Ha perdido, desea reiniciar?'))
            juego.state.start('Estado');
    },

    iniciar: function () {

    }
};