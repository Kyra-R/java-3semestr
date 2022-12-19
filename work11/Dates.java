package work11;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Dates {
    public static int find1(String data, int pos){
        for(int i=pos;i<data.length();i++){
            if(data.charAt(i)=='<'){
                return i;
            }

        }

    return -1;
    }

    public static int find2(String data, int pos){
        for(int i=pos;i<data.length();i++){
            if(data.charAt(i)=='>'){
                return i;
            }

        }

        return -1;
    }


    public static void process(String[] arr,String data){
       // String [] arr = new String [5];
        int pos1=0;
        int pos2=0;
        for(int i=0;i<5;i++) {
            pos1=find1(data,pos1)+1;
            pos2=find2(data,pos1);
            arr[i] = data.substring(pos1,pos2);
        }
    }

    public static Date makeDate(String[] arr) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.M.d.h.m");
        //Parsing the given String to Date object
        String s=arr[0]+"."+arr[1]+"."+arr[2]+"."+arr[3]+"."+arr[4];
        Date date = formatter.parse(s);
        return date;
    }
    public static Calendar makeCalendar(String[] arr) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(makeDate(arr));
        return calendar;
    }

    public static void main(String[] args) throws ParseException {
        Scanner conin = new Scanner(System.in);
        System.out.println("Enter date");
        //String date = conin.nextLine();
        String date = "<2001><3><15><13><1>";
        String [] arr = new String [5];
        process(arr,date);
        Date realdate = makeDate(arr);
        Calendar calendar = makeCalendar(arr);
        System.out.println(realdate);
        System.out.println(calendar.getTime());
    }
}
