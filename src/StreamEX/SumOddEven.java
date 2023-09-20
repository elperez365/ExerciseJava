//Write a Java program to calculate the sum of all even, odd numbers in a list using streams

package StreamEX;

import java.util.Arrays;

public class SumOddEven {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        int sumEven = Arrays.stream(numbers).filter(n -> n % 2 == 0).sum();
        int sumOdd = Arrays.stream(numbers).filter(n -> n % 2 != 0).sum();

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
