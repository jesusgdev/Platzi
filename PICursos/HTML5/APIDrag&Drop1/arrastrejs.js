window.addEventListener("load", comenzar, false);
var elemOrigen;
var elemDestino;
function comenzar() {

    elemOrigen = document.getElementById("imagen");
    elemOrigen.addEventListener("dragstart", comenzamosArrastrar, false);

    elemDestino = document.getElementById("zonaDestino");

    elemDestino.addEventListener("dragover",
        function (e) { e.preventDefault(); }, true);

    elemDestino.addEventListener("drop", soltado, true);

    elemOrigen.addEventListener("dragend", terminado, false);

    elemDestino.addEventListener("dragenter", entrando, false);

    elemDestino.addEventListener("dragleave", saliendo, false);
}

function comenzamosArrastrar(e) {

    var codigo = "<img src = '" + elemOrigen.getAttribute("src") + "'>";

    e.dataTransfer.setData("Text", codigo);
}

function soltado(e) {

    e.preventDefault();

    elemDestino.innerHTML = e.dataTransfer.getData("Text");
}

function terminado(e) {

    var elemento = e.target;
    elemento.style.visibility = "hidden";
}

function entrando(e) {
    e.preventDefault();
    elemDestino.style.background = "rgba(102, 255, 153, 0.8)";
}

function saliendo(e) {
    e.preventDefault();
    elemDestino.style.background = "rgb(255, 255, 255)";
}