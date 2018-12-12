interface SuperHero{
    realName: string;
    superName: string;
}

var superman: SuperHero = {
    realName: "Clark Kent",
    superName: "Superman"
}

var batman: SuperHero = {
    realName: "Bruce Wayne",
    superName: "Batman"
}

document.write(superman.realName+" is "+superman.superName+"<br />");