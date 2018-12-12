const express = require('express');
const exphbs = require('express-handlebars');
const path = require('path');
const bodyParser = require('body-parser');
const methodOverride = require('method-override');
const redis = require('redis');

// set port
const port = 3000;

//init app
const app = express();

// view engine
app.engine('handlebars', exphbs({defaultLayout:'main'}));
app.set('view engine', 'handlebars');

//body-parser
app.use(bodyParser.json);
app.use(bodyParser.urlencoded({extended:false}));

// methodOverride
app.use(methodOverride('_method'));


app.get('/', function(req, res, next){
    res.render('searchusers');
});

app.listen(port, function(){
    console.log('Server started on port '+port);
});