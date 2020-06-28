package com.platzi.functional._11_composition;

import java.util.function.Function;

public class MathOperations2 {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy3 = x -> {
            System.out.println("Multiplicando x: " + x + " por 3");
            return x * 3;
        };

        Function<Integer, Integer> add1MultiplyBy3 =
                multiplyBy3.compose(y -> {
                    System.out.println("Le agregare 1 a: " + y);
                    return y + 1;
                });

        Function<Integer, Integer> andSquare =
                add1MultiplyBy3.andThen(x -> {
                    System.out.println("Estoy elevando " + x + " al cuadrado");
                    return  x * x;
                });

     /* A traves de la funcion andThen al igual que compose realizamos una
        ejecucion en cadena, pero en este caso ejecutara primero la funcion
        addMultiplyBy3, luego la funcion que llama al metodo compose que
        seria ente caso multiplayBy3 y posteriormente la funcion que llama
        a la funcion andThen que toma como argumento el resultado del paso
        anterior y ejecuta la funcion andSquare.
        La diferencia entre las funciones compose y andThen, es que compose
        ejecuta primero lo que hay en el lambda y luego la funcion que la
        mando a llamar, mientras que la funcion andThen hace lo opuesto
        primero ejecuta la funcion que la llama y luego el lambda. */

        System.out.println(andSquare.apply(3));

      /* En el caso de la funciones compuestas tenemos una funcion
         addMultiplyBy3 que devuelve como resultado (y + 1) y que
          toma como argumento 5, este resultado a traves la funcion
          compose pasa como argumento para ejecutar la funcion
          multiplyBy3, donde ahora el valor de retorno es (x * 3)
          la representacion de la funcion compuesta en este caso
          se veria asi ((5 + 1) * 3) = 18 */

        System.out.println(add1MultiplyBy3.apply(5));

    }
}
