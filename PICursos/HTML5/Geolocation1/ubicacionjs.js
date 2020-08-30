window.addEventListener("load", comenzar, false);

function comenzar() {

    var myButtom = document.getElementById("dameUbicacion");

    myButtom.addEventListener("click", obtener, false);


}

function obtener() {

    var parametros = {
        enableHighAccuracy: true,
        timeout: 10000,
        maximunAge: 60000
    };

    navigator.geolocation.getCurrentPosition(mostrarPosicion, gestionErrores, parametros);
}

function mostrarPosicion(posicion) {

    var ubicacion = document.getElementById("ubicacion");

    // var miUbicacion = "";
    // miUbicacion += "Latitud: " + posicion.coords.latitude + "<br>";

    // miUbicacion += "Longitud: " + posicion.coords.longitude + "<br>";

    // miUbicacion += "Exactitud: " + posicion.coords.accuracy + "<br>";


    var Mimapa = "http://maps.googleapis.com/maps/api/staticmap?center" +
        posicion.coords.latitude + "," + posicion.coords.longitude + "," +
        "&zoom=12&size=600x300&sensor=false&markers=" + posicion.coords.latitude +
        "," + posicion.coords.longitude;

    //ubicacion.innerHTML = miUbicacion;

    ubicacion.innerHTML = "<div><img src= '" + Mimapa + "'></div>";
}

function gestionErrores(error) {

    //alert("Ha habido un error " + error.code + " " + error.message);

    if (error.message == "User denied Geolocation") {
        alert("Para hacer uso de esta funcionalidad \nDebes permitir el uso de la Geolocalizacion en tu navegador");
    }

}