/*   Take an array with n elements with possibly duplicate with possibly duplicate elements as the input. 
     The task is to find the index of the first occurence of the element x in the array and, 
     if it is not present, return -1 present, return -1  
                                                                                                                                        
Sample Input 1 :
8
7 5 2 11 2 43 1 1
2
Sample Output 1 :
2 
   
*/



import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}


