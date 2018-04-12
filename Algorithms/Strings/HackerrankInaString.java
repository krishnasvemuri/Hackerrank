import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String hackerrankInString(String s) {
        // Complete this function
        char[] n = s.toCharArray();
        String hack = new String("hackerrank");
        char[] ch = hack.toCharArray();
        Stack <Character> st = new Stack();
        for(int i=0;i<hack.length();i++){
            st.push(ch[i]);
        }
        for(int i=s.length()-1;i>-1;i--){
            if(!st.empty()&&(st.peek()==n[i])){
                st.pop();
            }
        }
        if(st.empty())
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        in.close();
    }
}
