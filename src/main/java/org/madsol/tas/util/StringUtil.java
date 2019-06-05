package org.madsol.tas.util;

public class StringUtil {

    public static String repeat(String element, int repetitions){
        StringBuilder result = new StringBuilder(element);
        for(int i = 1; i<= repetitions; i++){
            result.append(element).append(element);
        }
        return result.toString();
    }
}
