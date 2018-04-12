import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int marsExploration(String s) {
        // Complete this function
        char[] ch = s.toCharArray();
        int count = 0;
        for(int i = 0 ;i<s.length();i=i+3){
            if(!(ch[i]=='S')){
                count++;
            }
            if(!(ch[i+1]=='O')){
                count++;
            }
            if(!(ch[i+2]=='S')){
                count++;
            }
        }
            return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
}
