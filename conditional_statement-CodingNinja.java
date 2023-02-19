/*  Write a program to calculate the total salary of a person. The user has to enter the basix salary(an integer) and and 
the grade(an uppercase character), and depending upon which the total salary is calculated as - total salary = basic + hra + da + allow - pf 
where: hra = 20% of basic, da=50% of basic, allow=1700 if grade = "A" allow=1500 if grade is "B" allow=1300 if grade is "C" or any other character pf = 11% of basic. */

Footer
© 2023 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing




import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int bs = sc.nextInt();
		String str = sc.next();
		char c = str.charAt(0);
		int all;
		if(c==65)
		{
			all=1700;
		}
		else if(c==66)
		{
			all=1500;
		}
		else
		{
			all = 1300;
		}
		double ts = ((bs+(0.20*bs)+(0.50*bs)+all)-(0.11*bs));
		double p=Math.round(ts);
		int h =(int)(p);
		System.out.println(h);
		
	}
}