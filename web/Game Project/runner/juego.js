var bg;
var carro;
var cursores;
var enemigos1;
var gasolinas;
var timer;
var timer2;
var puntos;

var Juego = {

    preload: function () {
        juego.load.image('bg', 'img/bg.png');
        juego.load.image('carro', 'img/carro.png');
        juego.load.image('enemigo1', 'img/carroMalo.png');
        juego.load.image('gasolina', 'img/gas.png');
        juego.forceSingleUpdate = true;
    },

    create: function () {
        bg = juego.add.tileSprite(0, 0, 290, 540, 'bg');

        carro = juego.add.sprite(juego.width / 2, 496, 'carro');
        carro.anchor.setTo(0.5);
        carro.enableBody = true;
        juego.physics.arcade.enable(carro, true);
        cursores = juego.input.keyboard.createCursorKeys();

        enemigos1 = juego.add.group();
        juego.physics.arcade.enable(enemigos1, true);
        enemigos1.enableBody = true;
        enemigos1.createMultiple(10, 'enemigo1');
        enemigos1.setAll('anchor.x', 0.5);
        enemigos1.setAll('anchor.y', 0.5);
        enemigos1.setAll('outOfBoundsKill', true);
        enemigos1.setAll('checkWorldBounds', true);

        gasolinas = juego.add.group();
        juego.physics.arcade.enable(enemigos1, true);
        gasolinas.enableBody = true;
        gasolinas.createMultiple(10, 'gasolina');
        gasolinas.setAll('anchor.x', 0.5);
        gasolinas.setAll('anchor.y', 0.5);
        gasolinas.setAll('outOfBoundsKill', true);
        gasolinas.setAll('checkWorldBounds', true);

        timer = juego.time.events.loop(1500, this.crearEnemigo, this);
        timer2 = juego.time.events.loop(1800, this.crearGasolina, this);

        puntos = 0;
    },

    update: function () {
        bg.tilePosition.y += 2;
        juego.physics.arcade.overlap(carro, enemigos1, this.choque, null, this);
        juego.physics.arcade.overlap(carro, gasolinas, this.cogerGas, null, this);
        if (carro.inWorld == false)
            juego.state.start('Terminado');
        else if (cursores.right.isDown && carro.position.x < 245) {
            carro.position.x += 5;
        }
        else if (cursores.left.isDown && carro.position.x > 45) {
            carro.position.x -= 5;
        }

        if (puntos > 4 && puntos < 10)
            timer.delay = 1250;
        else if (puntos >= 10 && puntos < 15)
            timer.delay = 1000;
        else if (puntos >= 15)
            timer.delay = 750;

    },

    crearEnemigo: function () {
        var posicion = Math.floor(Math.random() * 3) + 1;
        var enem = enemigos1.getFirstDead();
        enem.physicsBodyType = Phaser.Physics.ARCADE;
        enem.reset(posicion * 73, 0);
        enem.body.velocity.y = 200;
        enem.anchor.setTo(0.5);
    },

    crearGasolina: function () {
        var posicion = Math.floor(Math.random() * 3) + 1;
        var gas = gasolinas.getFirstDead();
        gas.reset(posicion * 73, -10);
        gas.body.velocity.y = 100;
        gas.anchor.setTo(0.5);
    },

    choque: function (car, enemi) {
        enemigos1.forEachAlive(function (e) {
            e.body.velocity.y = 0
        }, this);
        juego.time.events.remove(timer);
        juego.state.start('Terminado');
    },

    cogerGas: function (car, g) {
        g.kill();
        puntos++;
    }

};