var miAudio, reproducir, barra, progreso, maximo;
maximo = 600;

function comenzar() {

    miAudio = document.getElementById("miAudio");
    reproducir = document.getElementById("play");
    barra = document.getElementById("barra");
    progreso = document.getElementById("progreso");

    reproducir.addEventListener("click", clicando, false);

    progreso.addEventListener("click", adelantando, true);

    barra.addEventListener("click", adelantando, false);
}

function clicando() {

    if (miAudio.paused) {
        miAudio.play();
        reproducir.innerHTML = "Pause";

        bucle = setInterval(estado, 1);

    } else {
        miAudio.pause();
        reproducir.innerHTML = "Play";
    }
}

function estado() {

    if (miAudio.ended == false) {
        var total = parseInt(miAudio.currentTime * maximo / miAudio.duration);

        progreso.style.width = total + "px";
    }
}

function adelantando(posicion) {
    var ratonX, nuevoTiempo;

    if (miAudio.play) {

        ratonX = posicion.pageX - barra.offsetLeft;

        nuevoTiempo = ratonX * miAudio.duration / maximo;

        miAudio.currentTime = nuevoTiempo;

        progreso.style.width = ratonX + "px";

    } else {

    }
}

window.addEventListener("load", comenzar, false);