import java.util.Scanner;
import java.time.LocalDate;
public class Solution {
 public static String getDay(String dd, String mm, String yy) {
        LocalDate dt = LocalDate.of(Integer.parseInt(yy),Integer.parseInt(mm),Integer.parseInt(dd));
        return dt.getDayOfWeek()+"";
}
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}