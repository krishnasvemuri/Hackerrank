import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        // Complete this function
        Stack<Character> stack = new Stack<>();
         int size = 0;  
        
        for (int i=0; i<s.length(); i++) {
            if (!stack.isEmpty() && stack.peek().equals(s.charAt(i))) {
                stack.pop();    
                size--;
            } else {
                stack.push(s.charAt(i));
                size++;
            }
        }
        
        if (size == 0) {
            return "Empty String";
        }
        
        char[] reduced = new char[size];
        for (int i=size-1; i>=0; i--) {
            reduced[i] = stack.pop();
        }
        
        return new String(reduced);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
