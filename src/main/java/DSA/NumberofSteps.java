package DSA;

/*public class NumberofSteps {

}*/

import java.util.*;
public class NumberofSteps {
    public static void main(String args[]) throws Exception {
         Scanner sc = new Scanner(System.in);
     //   String name = sc.nextLine();
         int n = sc.nextInt();
        int arr[] = new int[n];
        int def[] = new int[n];
        int small = 10000;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (small > arr[i]) {
                small = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            def[i] = sc.nextInt();
        }
       // System.out.println(small);
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            flag = true;
            if (arr[i] == small) continue;
            while (flag) {
                if (arr[i] > small) {
                    arr[i] = arr[i] - def[i];
                    count++;
                } else if (arr[i] < small) {
                    count = -1;
                    System.out.println(count);
                    return;
                } else {
                    flag = false;
                }
            }
        }
        System.out.print(count);
    }
}

//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/make-all-equal-90a21ab2/