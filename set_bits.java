/*
write a program to count the numbers of 1s in the binary representation of an  integer.

Sample Input 1:
9
Sample Output 1:
2

Explanation Of Sample Input 1:
Binary Representation of 9 is 1001.
*/


import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countSetBits(int n) {
		// Write your code here.
		int count =0;
		while(n!=0)
		{
			count += n&1;
			n=n>>>1;
		}
		return count;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = countSetBits(n);
		System.out.println(count);

	}
}