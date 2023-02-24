/*
wap to count the prime number between two numbers

Sample Input 1 :
2 10
Sample Output 1 :
4

Explanation Of Sample Input 1:
The prime numbers between 2 and 10
are 2,3,5 and 7

*/

import java.util.*;
import java.io.*;
import java.util.Scanner;

class CountPrime {
	// to check isPrime
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	} // total prime numbers

	public int totalPrime(int s, int e) {
		int count = 0;
		for (int i = s; i <= e; i++) {
			if (isPrime(i))
				count++;
		}
		return count;
	}

}

class Solution {
	public static void main(String args[]) {
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}