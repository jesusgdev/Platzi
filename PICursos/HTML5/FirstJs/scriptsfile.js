
/*
Para poder mostrar un alert cuando se ejecute una accion en el 
browser podemos programarlo desde JavaScript, para ello hacemos 
una funcion que lea los tags(etiquetas) que hay en el documento 
y le especificamos que lea solo aquellas que tengan como nombre 
p, es decir los parrafos. Las etiquetas representa un bloque o 
elemento que esta dentro de una pagina web, las cuales ademas 
de mostrar la informacion que deseamos y darles un diseño 
llamativo, nos permiten crear animaciones o acciones en funcion 
de lo que el usuario haga, para ello usamos JavaScript, en 
nuestro caso definimos que todas aquellas etiquetas de tipo 
p(parrafo) en la posicion[0](la primera etiqueta en el orden de 
ejecucion) ejecutaran un accion al hacer click(onclick), la 
accion la llamamos salute por darle un nombre. Ahora procedemos 
a contruir la funcion salute() que es la accion que va a 
ejecutar el browser cuando hagamos el click, colocamos un 
alert en este caso que es una ventana que se activa y muestra 
un mensaje en ella. Al final el window.onload = execute indica 
que al cargar el browser el primer punto de entrada de la 
ejecucion del script sera la funcion execute().
***Nota:getElementsByTagName me genera un array de todos los 
elementos con ese nombre, por ello colocamos los [] indicando 
la posicion de elemento que queremos usar.
*/

/*
function execute() {
    for (var i = 0; i < 3; i++) {
        document.getElementsByTagName("p")[i].onclick = salute;
    }
} */

/*
Una manera de ejecutar una accion diferente al tag, es 
utilizando el id de nuestra etiqueta, para ello la etiqueta a 
la cual queramos asignarle un evento especifico debera tener un
id declarado en la etiqueta dentro del documento html, con lo 
cual hacemos uso luego del metodo getElementById para seleccionar 
la etiqueta vinculada a in id en particular, y asi especificamos 
el tipo de accion en este caso al hacer click sobre el elemento 
nuevamente a la funcion salute().
*/

/*
function execute() {
    document.getElementById("importante").onclick = salute;
} */

/*
Al igual que con la funcion getElementsbyId, la funcion que lo hace 
por clase(getElementsByClassName) nos permite asignar un determinado 
evento o accion a uno o varios elementos en especifico los cuales 
tengamos representados en nuestro archivo html dentro de la etiqueta.
*/

/*
function execute() {
    var z = document.getElementsByClassName("importante")[0].onclick = salute;
} */

/*
Con querySelector voy a revisar todos los elementos dentro de mi archivo
html cuyo primer selector coincida con el nombre importante, en este caso 
nuestro archivo posee un solo selector css que llamamos (.importante) pero 
que esta vinculado a dos elementos, el querySelector utilizara el primero 
dentro del archivo para que cuando ocurra el evento onclick(hacer click 
sobre el) se ejecute la funcion salute() que en este caso nos mostrara un 
mensaje con una ventana alert.
*/

/*
function execute() {
    document.querySelector(".importante").onclick = salute;
} */

/*
En este caso el querySelector va a apuntar al primer elemento que se 
encuentre con las caracteristicas que indicamos dentro del (), es 
decir #principal indica que apunte al div con el id= "principal" que 
es el que tenemos dentro de nuestro body, que ademas tome solo los 
"p" es decir los parrafos que decienden o son hijos de principal y 
que ademas seleccion el ultimo hijo de #principal que este caso 
seria el ultimo parrafo.
*/

/*
function execute() {
    document.querySelector("#principal p:last-child").onclick = salute;
} */

/*
function execute() {

    for (var i = 0; i < 4; i++) {
        var elementos = document.querySelectorAll("#principal p");
        elementos[i].onclick = salute;
    }
} */

/*
Otra manera de agregar selectores(id, clases o grupos) al query es 
usando una coma para separarlos dentro del query.
*/
function execute() {

    var elementos = document.querySelectorAll("#principal p, span");
    for (var i = 0; i < elementos.length; i++) {
        elementos[i].onclick = salute;
    }
}

function salute() {
    alert("Hello!!!!!!");
}

window.onload = execute;