/*  you are given an array 'Arr' consisting of 'N' distinct integers and a positive integer 'K'. 
    find out Kth smallest and Kth largest element of the array. it is guaranteed that K is not greater than 
    the size of the array.   
                                                                                         
Sample Input 1:
2
4 4
5 6 7 2
4 3
1 2 5 4
Sample Output 1:
7 2 
4 2 

*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	 public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {

        Collections.sort(arr);
        ArrayList<Integer> res = new ArrayList<>();
        res.add(arr.get(k-1));
        Collections.reverse(arr);
        res.add(arr.get(k-1));
        return res;
    }

	 public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(2);
        int k = 4;
        ArrayList<Integer> res = kthSmallLarge(arr, arr.size(), k);
        System.out.println(res.get(1) + " " + res.get(0));

        arr.clear();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        k = 3;
        res = kthSmallLarge(arr, arr.size(), k);
        System.out.println(res.get(1) + " " + res.get(0));
    }
}

    }
}
