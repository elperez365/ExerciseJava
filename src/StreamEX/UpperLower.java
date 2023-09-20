//Write a Java program to convert a list of strings to uppercase or lowercase using streams.

package StreamEX;

import java.util.Arrays;

public class UpperLower {
    public static void main(String[] args) {
        String[] strings = { "a", "b", "c", "d", "e" };

        System.out.println("Uppercase:");
        Arrays.stream(strings).map(String::toUpperCase).forEach(System.out::println);

        System.out.println("Lowercase:");
        Arrays.stream(strings).map(String::toLowerCase).forEach(System.out::println);
    }
}
