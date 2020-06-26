package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {
    public static void main(String[] args) {
        List<String> cursos = NombresUtils.getList("Java", "Functions");

        cursos.forEach(curso -> System.out.println(curso));

        usarZero(() -> 2);

        usarPredicado(text -> text.isEmpty());

        usarBifunction((x, y) -> x * y);

        usarBifunction((x, y) -> {
            System.out.println("X: " + ", Y:" + y);
            return x - y;
        });

        //Este es un caso practico de una funcion lambda que no recibe ningun
        //argumento y no devuelve ningun resultado, a traves de la interfaz
        //funcional OperarNada generamos una funcion que no recibe ningun
        // argumento y retorna un argumento vacio(nada), el metodo usarNada
        //recibe como parametro el argumento operarNada que es a su vez el
        //resultado o varible de retorno de la funcion OperarNada es decir
        //(nada), esto da como resultado que la sintaxis lambda al llamar
        //este metodo reciba () y devuelva {}, este tipo de funciones podrian
        //usarse cuando no requerimos de ningun argumento especifico para
        //ejecutar una funcion y cuya ejecucion no devuelve un resultado, un
        //ejemplo de ello seria la funcion "println" que cuando un string se
        //imprime mueve la ejecucion del siguiente bloque de impresion a la
        //siguiente linea por lo que no devuelve ni recibe ningun valor.
        usarNada(() -> {});
    }

    //Creamos el metodo usarZero que recibe como argumento zeroarguments de la
    //interfaz funcional Zeroarguments, como esta funcion no recibe argumentos
    //al llamar al metodo usarZero al no recibir argumentos el valor que recibe
    // es vacio y se representa con un ()
    static void usarZero(ZeroArguments zeroArguments) {

    }

    static void usarPredicado(Predicate<String> predicado) {

    }

    static void usarBifunction(BiFunction<Integer, Integer, Integer> operacion) {

    }

    static void usarNada(OperarNada operarNada) {

    }

    //Esta interface funcional no recibe argumentos y devuelve un entero
    @FunctionalInterface
    interface ZeroArguments {
        int get();
    }

    @FunctionalInterface
    interface OperarNada {
        void nada();
    }
}
