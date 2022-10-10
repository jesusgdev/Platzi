package com.platzi.functional.util;

import java.util.Arrays;
import java.util.List;

public class Utils {
    @SafeVarargs
    public static <T> List<T> getListOf(T... items) {
        return Arrays.asList(items);
    }
}
