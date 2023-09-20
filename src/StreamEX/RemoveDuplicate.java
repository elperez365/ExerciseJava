//Write a Java program to remove all duplicate elements from a list using streams.

package StreamEX;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        System.out.println("Original List: " + nums);

        List<Integer> distinctNums = nums.stream().distinct().toList();
        System.out.println("Distinct List: " + distinctNums);
    }
}
