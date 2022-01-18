package main.interviews;

import java.io.IOException;

public class integerToRoman {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        System.out.println(toRoman("245"));
    }

    public static String toRoman(String str) {
        String[] keys = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder result = new StringBuilder();
        Integer number = Integer.parseInt(str);

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                result.append(keys[i]);
            }
        }

        return result.toString();
    }


}
