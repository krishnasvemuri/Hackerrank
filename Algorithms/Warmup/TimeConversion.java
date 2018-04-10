import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        
		Scanner scan = new Scanner(System.in);
        String time = scan.next();
        String newtime[] = time.split(":");
        String am_or_pm = newtime[2].substring(2,4);
        int hh,mm,ss;
        hh = Integer.parseInt(newtime[0]);
        mm = Integer.parseInt(newtime[1]);
        ss = Integer.parseInt(newtime[2].substring(0,2));
        
        if(am_or_pm.equals("AM") && hh==12)
        	hh=0;
        else if(am_or_pm.equals("PM")&& hh<12)
        	hh+=12;
        
        System.out.printf("%02d:%02d:%02d",hh,mm,ss);
    }
}