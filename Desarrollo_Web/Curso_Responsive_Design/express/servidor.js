var cafecito = require("express");

var application = cafecito();

application.get("/", inicio);


function inicio(peticion, resultado) {
    resultado.send("Este es el home");
}

application.listen(3000, "0.0.0.0");