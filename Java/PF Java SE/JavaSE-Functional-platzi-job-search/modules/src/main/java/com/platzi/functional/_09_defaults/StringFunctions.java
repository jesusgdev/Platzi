package com.platzi.functional._09_defaults;

public class StringFunctions {

  /* Esta interface funcional es un metodo abstracto que no tiene
     una definicion y devuelve un valor entero */
    @FunctionalInterface
    interface StringOperation {
        int getAmount();

      /*default nos permite definir un cuerpo para un metodo dentro
        de una interfaz, este metodo recibe un String, el valor del
        entero que obtenemos del metodo StringOperation se la pasamos
        se lo asignamos a una variable x, y a partir un ciclo while
        ejecutaremos una condicion que imprima un texto(que es el que
        definimos como argumento de operate) */

        default void operate(String text) {
            int x = getAmount();
            while (x-- > 0) {
                System.out.println(text);
            }
        }
    }

    @FunctionalInterface
    interface DoOperation {
        void take(String text);

     /* A diferencia del caso anterior la funcion de la interfaz DoOperation
        llama a la funcion operationFive la cual recibe un texto y devuelve
        la impresion del mismo texto con resultado, esta funcion se invoca
        a traves del metodo execute que recibe un entero y un String, y a
        traves de un ciclo while(Esta vez el cual se recorrera 5 veces),
        execute devuelve a traves del take el retorno de la funcion OperationFive
        la cual imprimira el texto 5 veces. */

        default void execute(int x, String text) {
            while (x-- > 0) {
                take(text);
            }

    }

     /* A traves de main creamos una funcion de la interfaz StringOperation
        que llamaremos six, el cual no recibe nada y devuelve un 6,
        posteriormente invocamos la funcion six a traves del metodo operate,
        lo que hara que el metodo abstracto getAmount reciba el valor entero
        6 que es el resultado de la funcion six, el cual se asigna a la variable
        x y lo que validara el ciclo while, imprimira el texto hasta que la
        condicion no se cumpla(en este caso 6 veces, de haber sido la condicion
        (--x > 0) si habria impreso 5 veces) */

        public static void main(String[] args) {
        StringOperation six = () -> 6;
        six.operate("Alumno");

        DoOperation operationFive = text -> System.out.println(text);
        operationFive.execute(5,"Platzi");
    }

    }
}
