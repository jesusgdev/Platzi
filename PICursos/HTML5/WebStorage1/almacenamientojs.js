window.addEventListener("load", comenzar, false);

function comenzar() {
    var myButton = document.getElementById("grabar");

    myButton.addEventListener("click", itemNuevo, false);


}

function itemNuevo() {

    var clave = document.getElementById("clave").value;

    var valor = document.getElementById("valor").value;

    //sessionStorage.setItem(clave, valor);

    localStorage.setItem(clave, valor);

    //sessionStorage[clave] = valor;

    leerMostrar(clave);

    document.getElementById("clave").value = "";
    document.getElementById("valor").value = "";
}

function leerMostrar(clave) {

    var zonaDatos = document.getElementById("zonaDatos");

    zonaDatos.innerHTML = '<div><button onclick = "eliminarTodo()">Eliminar Todo</button></div>';
    //var elValor = sessionStorage[clave];

    /*
    for (var i = 0; i < sessionStorage.length; i++) {
        var clave = sessionStorage.key(i);
        var elValor = sessionStorage.getItem(clave);

        zonaDatos.innerHTML += '<div>Clave: ' + clave + ' -- ' +
            'Valor: ' + elValor + '<br><button onclick = "eliminarItem(\'' + clave + '\')">Eliminar</button></div>';
    } */

    for (var i = 0; i < localStorage.length; i++) {
        var clave = localStorage.key(i);
        var elValor = localStorage.getItem(clave);

        zonaDatos.innerHTML += '<div>Clave: ' + clave + ' -- ' +
            'Valor: ' + elValor + '<br><button onclick = "eliminarItem(\'' + clave + '\')">Eliminar</button></div>';
    }

}

function eliminarTodo() {

    if (confirm("Estas seguro que deseas borrar todo?")) {
        //sessionStorage.clear();
        localStorage.clear();

        leerMostrar();
    }
}

function eliminarItem(clave) {

    if (confirm("Esta seguro que desea eliminar este elemento?")) {
        //sessionStorage.removeItem(clave);
        localStorage.removeItem(clave);

        leerMostrar();
    }
}