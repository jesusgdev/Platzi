package com.platzi.functional._05_sam;

import com.platzi.functional._04_functional.StringFunctions;
import com.sun.org.apache.xml.internal.serializer.ToStream;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class AgeUtils {
    public static void main(String[] args) {
        Function<Integer, String> addCeros = x -> x < 10 ? "0" + x : String.valueOf(x);

        TriFunction<Integer, Integer, Integer, LocalDate> parseDate =
                (day, month, year) -> LocalDate.parse(year + "-" +
                        addCeros.apply(month) + "-" + addCeros.apply(day));

        TriFunction<Integer,Integer, Integer, Integer> calculateAge =
                (day, month, year) -> Period.between(
                        parseDate.apply(day, month, year), LocalDate.now()).getYears();

        JOptionPane.showMessageDialog(null,
                "La edad de la persona es: " + calculateAge.apply(14,4,1984));
    }

    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u , V v);
    }
}
