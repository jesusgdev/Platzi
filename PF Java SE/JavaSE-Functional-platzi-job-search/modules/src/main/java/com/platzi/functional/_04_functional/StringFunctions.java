package com.platzi.functional._04_functional;

import javax.swing.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";

        quote.apply("Hola Estudiante de platzi");
        System.out.println(quote.apply("Hola Estudiante de platzi"));

        UnaryOperator<String> addMark = text -> text + "!";
        addMark.apply("Hola Bienvenidos");
        System.out.println(addMark.apply("Hola Bienvenidos"));

        BiFunction<Integer, Integer, Integer> multiplicacion =
                (x, y) -> x * y;
        multiplicacion.apply(5,8);
        System.out.println(multiplicacion.apply(5,8));

        BinaryOperator<Integer> multiplicacion2 =
                (x, y) -> x * y;
        multiplicacion2.apply(5,8);
        System.out.println(multiplicacion2.apply(5,8));

        //En este caso a traves de la funcion BiFunction vamos a generar un
        //formato de texto, esta funcion recibe un string y un entero y devuelve
        //un string que sera nuestro texto con el formato aplicado.
        //String.format es un funcion que aplica un formato especifico a un
        //texto utilizando como referencia los argumentos
        //En este caso se agrega "%" para definir que el formato comienza al
        //inicion de la linea, luego se agrega "number" para indicar el numero
        //de unidades del formato, y "s" indica que se usaran espacios.
        //Al imprimir la funcion leftPad utilizando apply para evaluar los
        //argumentos obtenemos la palabra java 6 espacios hacia la derecha, lo
        //que complementa las 10 unidades del formato(6 espacios + 4 caracteres
        //de la palabra java)
        BiFunction<String, Integer, String> leftPad =
                (text, number) -> String.format("%" + number + "s", text);
        leftPad.apply("java", 10);
        System.out.println(leftPad.apply("java", 10));

    }
}
