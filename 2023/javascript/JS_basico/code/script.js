const h1 = document.querySelector('h1');
const p = document.querySelector('p');
const parrafocius = document.getElementsByClassName('parrafocius');
const pid = document.getElementById('pid');
const input = document.querySelector('input');

console.log({
    h1,
    p,
    parrafocius,
    pid,
    input
});

// Cambia el contenido de un elemento dentro del archivo html utilizando lenguaje html
h1.innerHTML = 'Dom is changing <br> in JS!!!';

// Cambia el contenido de un elemento dentro del archivo html utilizando texto plano
// h1.innerText = 'Doom is changing <br> in JS!!!';

// console.log(h1.getAttribute('class'));
// h1.setAttribute('class', 'rojo');

// Agrega una clase a un elemento del archivo html
h1.classList.add('rojo');

// Elimina una clase de un elemento del archivo html
h1.classList.remove('verde');

// h1.classList.toggle('verde');
// h1.classList.contains('verde');

// Setear un valor por defecto a un input
input.value = '4567';

// Crear un objeto de tipo imagen en JS
const img = document.createElement('img');

// Asignar a un objeto de tipo imagen una imagen desde una url
img.setAttribute('src', 'https://www.icegif.com/wp-content/uploads/icegif-2013.gif');


console.log(img);

pid.innerHTML = '';
pid.append(img);
