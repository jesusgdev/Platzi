package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        System.out.println(squareFunction.apply(5));
        System.out.println(square(5));

        //Un ejemplo de una funcion lambda que recibe como parametro un entero
        //y devuelve un boleano para determinar si un numero es inpar(isOdd).
        //A traves de la funcion .apply la funcion isOdd puede recibir un parametro
        //como argumento y delvolver un resultado, en este caso un boleano que nos
        //dira con un verdadero o falso si el numero es inpar.
        //Notese que tanto el valor que recibe como el que devuelve estan definidos
        //dentro de la sintaxis de Function.
        // recibe       devuelve
        //    x    ->   x % 2 = 1
        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;
        isOdd.apply(5); //True
        System.out.println(isOdd.apply(5));


        //A traves de la funcion predicate s diferencia del caso anterior, siempre
        //va a devolver un boleano como resultado, por lo que solo debemos definir
        //el tipo de argumento que recibe y la operacion logica para evaluar la condicion.
        Predicate<Integer> isEven = x -> x % 2 == 0;
        isEven.test(4); //True
        System.out.println(isEven.test(4));

        Predicate<Student> isAproved = student -> student.getCalificacion() >= 6.0;

        Student sinuhe = new Student(5.9);
        isAproved.test(sinuhe); //False
        System.out.println(isAproved.test(sinuhe));

    }

    static class Student {
        private double calificacion;

        public Student(double calificacion) {
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }
    }

    static int square(int x) {
        return x * x;
    }
}
