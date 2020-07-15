package com.platzi.functional._15_streams_intro;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TypeStream {
    public static void main(String[] args) {
        IntStream infiniteStream = IntStream.iterate(0, x -> x + 1);
        infiniteStream.limit(1000)
                .parallel()
                .filter(x -> x % 2 == 0)
                .forEachOrdered(System.out::println);

        /* A diferencia del caso anterior este Generaremos una lista de tipo
        Integer lo que nos va a permitir manejar los datos de una manera mas
        dinamica dependiendo de nuestras necesidades, para ello usamos la
        funion boxed que transforma cada uno de los elementos del Stream
        actual(Integers de tipo Stream) a un Stream que maneja elementos de
        tipo Integer, y posteriormente a traves de collect transfomaremos
        este Stream a una lista de enteros.

         */
        IntStream infiniteStream2 = IntStream.iterate(0, x -> x + 1);
        List<Integer> numberlist = infiniteStream2.limit(1000)
                .filter(x -> x % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }
}
