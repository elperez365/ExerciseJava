//Write a Java program to calculate the average of a list of integers using streams.

package StreamEX;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        double average = Arrays.stream(numbers).average().getAsDouble();

        System.out.println("Average: " + average);
    }

}