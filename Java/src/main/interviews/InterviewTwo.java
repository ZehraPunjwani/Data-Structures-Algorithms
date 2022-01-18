package main.interviews;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class InterviewTwo {

    public static void main(String[] args) {
        assertEquals(validateCreditCardNumber("12345678903555"), 60);
        assertEquals(validateCreditCardNumber("012850003580200"), 30);
        assertEquals(sortString("9AZ1BY4ac"), Arrays.asList("1", "4", "9", "A", "B", "Y", "Z", "a", "c"));
    }

    /**
     * Read a credit card number into a string, reverse the characters and validating each number and doubling it. If
     * greater than 9 then invalid. The total of the 14 numbers had to equal 60. Had to write a test case for valid
     * and invalid numbers
     */
    private static int validateCreditCardNumber(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        int[] ints = new int[reversed.length()];
        int sum = 0;
        for (int i = 0; i < reversed.length(); i++) {
            // Character.getNumericValue(reversed.charAt(i)) OR Integer.parseInt(String.valueOf(reversed.charAt(i)))
            ints[i] = Character.getNumericValue(reversed.charAt(i));
            if (i % 2 != 0) {
                int iTimes2 = ints[i] * 2;
                if (iTimes2 > 9) {
                    iTimes2 = iTimes2 % 10 + 1;
                }
                ints[i] = iTimes2;
            }
            sum += ints[i];
        }
        // return Arrays.stream(ints).reduce(0, (subtotal, element) -> subtotal + element);
        return sum;
    }

    public static List<String> sortString(String str) {
        return Arrays.asList(str.split("")).stream().sorted().collect(Collectors.toList());

    }
}
