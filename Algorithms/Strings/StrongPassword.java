import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        char ch;
        int digit = 0,lower=0,upper=0,special=0,count=0;
        for(int i=0 ;i<n;i++){
            ch=password.charAt(i);
            if(ch>=48 && ch<=57)
                digit++;
            else if(ch>=65 && ch<=90)
                lower++;
            else if(ch>=97 && ch<=122)
                upper++;
            else if(ch=='!' || ch=='@' || ch=='#' ||ch=='$' || ch=='%' || ch=='^' || ch=='&' || ch=='*' ||ch=='(' || ch==')' || ch=='-' || ch=='+')
                special++;
        }
        if((digit==0))
            count++; 
        if((lower==0))
            count++;
        if((upper==0))
            count++;
        if((special==0))
            count++;
        if(n+count<6)
            count+=6-(n+count);
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
