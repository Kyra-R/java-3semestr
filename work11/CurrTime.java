package work11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
public class CurrTime {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Scanner in = new Scanner(System.in);
        String dateInString = in.nextLine();
        //String dateInString = "7-Jun-2013";
        Date date1 = formatter.parse(dateInString);
        Date date2 = new Date();
        if(date1.compareTo(date2)==0){
            System.out.println("Same time");
        } else if (date1.compareTo(date2)==1){
            System.out.println("User's date is bigger");
        } else {
            System.out.println("Current date is bigger");
        }
    }

}
