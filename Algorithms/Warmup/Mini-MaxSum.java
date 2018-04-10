import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
        /*
         * Write your code here.
         */
        
        long totalSum = 0;
        int max=arr[0],min=arr[0];
        for(int i=0;i<5;i++){
             if(max < arr[i])
                max = arr[i];
             if(min > arr[i])
                min = arr[i];
            totalSum += arr[i];
        }
        System.out.print(totalSum-max+" ");
        System.out.print(totalSum-min);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
