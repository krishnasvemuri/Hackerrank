import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr,int n){
        /*
         * Write your code here.
         */
        double neg=0,pos=0,zero=0;
        for(int i = 0 ; i<n ; i++){
            if(arr[i]<0)
                neg++;
            else if(arr[i]>0)
                pos++;
            else 
                zero++;
        }
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zero/n);
            
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr,n);
    }
}
