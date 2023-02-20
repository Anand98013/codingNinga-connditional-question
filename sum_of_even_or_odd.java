// write a program to input N number and print the sum of all even digit number and odd digit number in java.                                                                                                                                              
// Sample Input 1:
// 1234
// Sample Output 1:
// 6 4

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int evenSum = 0, oddSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            number /= 10;
        }
        System.out.println(evenSum + " " + oddSum);
    }
}

