var mivideo, reproducir, barra, progreso, maximo;
maximo = 600;

function comenzar() {

    mivideo = document.getElementById("mivideo");
    reproducir = document.getElementById("reproducir");
    barra = document.getElementById("barra");
    progreso = document.getElementById("progreso");

    reproducir.addEventListener("click", clicando, false);

    progreso.addEventListener("click", adelantando, true);

    barra.addEventListener("click", adelantando, false);
}
/*
function clicando() {
    
    if ((mivideo.paused == false) && (mivideo.ended == false)) {
        mivideo.paused();
    } else {
        mivideo.play();
        reproducir.innerHTML = "Pause";
    }
}*/

function clicando() {

    /*
    Aqui establecemos un condicional para indicarle que debe 
    hacer el video cuando ocurra el evento "click", si esta 
    pausado usando el metodo play() hacemos que el video se 
    reproduzca, si esta reproduciendose por el contrario el 
    video se pausara por ello llamamos al metodo pause().
    Para indicar la situacion actual al texto del boton 
    usamos la funcion .innerHTML que me cambia el contenido 
    del texto del boton para indicarle que cuando este 
    pausado nos muestre play para reproducirlo y cuando este 
    reproduciendose nos muestre pause.
    */
    if (mivideo.paused) {
        mivideo.play();
        reproducir.innerHTML = "Pause";

        bucle = setInterval(estado, 1);

    } else {
        mivideo.pause();
        reproducir.innerHTML = "Play";
    }
}

function estado() {

    /*
    Total nos va a devolver cuanto en medida a avanzado nuestro 
    video, y con .style.width asignamos ese nuevo valor al 
    atributo width del selector progreso de nuestra hoja de 
    estilos CSS.
    Es importante destacar que debemos agregarle la unidad "px" 
    al final de la cifra concatenandola ya que si no CSS no 
    reconocera que se trata una medida de width
    */
    if (mivideo.ended == false) {
        var total = parseInt(mivideo.currentTime * maximo / mivideo.duration);

        progreso.style.width = total + "px";
    }
}

function adelantando(posicion) {
    var ratonX, nuevoTiempo;

    /*
    Aqui debemos considerar lo siguiente:
    "posicion.pageX" representara la distancia que hay desde el 
    boder izquierdo de la pantalla hasta el punto en el cual se 
    encuentra el puntero del raton en un determinado momento.
    "barra.offsetLeft" va a representar la distancia desde el 
    borde izquierdo de la pantalla al borde izquierdo de la 
    barra.
    Es por ello que al restar posicion.pageX - barra.offsetLeft 
    obtenemos "ratonX" que es la distancia de la barra de 
    progreso en el punto donde se encuentre en ese momento el 
    cursor al hacer click.
    Es por ello que ademas tengamos que calcular la duracion del 
    video en ese instante, por lo que aplicando una regla de 3 
    donde le indicamos el tiempo maximo del video tiene una 
    logitud maxima de tantos pixeles en una distancia especifica 
    (ratonX) que tiempo habra transcurrido, y asi obtenemos la 
    variable nuevoTiempo, la cual se la asignamos al currentTime 
    del video para indicarle que el video retroseda o adelante a 
    ese tiempo indicado. A su vez ajustamos el ancho de la barra 
    progreso haciendo uso de la funcion .style.width que vimos 
    anteriormente.
    */
    if (mivideo.play) {

        ratonX = posicion.pageX - barra.offsetLeft;

        nuevoTiempo = ratonX * mivideo.duration / maximo;

        mivideo.currentTime = nuevoTiempo;

        progreso.style.width = ratonX + "px";

    } else {

    }
}

window.addEventListener("load", comenzar, false);