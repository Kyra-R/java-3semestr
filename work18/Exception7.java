package work18;
import java.util.Scanner;

public class Exception7 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in
        );
        String key = myScanner.next();
        printDetails( key );
    }

    public void getKey(String key) throws Exception {
        printDetails( key );
    }
    public void printDetails(String key) throws Exception {
        try { String message = getDetails(key);
            System.out.println( message );
        } catch ( Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key; }

    public static void main(String[] args) throws Exception {
        Exception7 e = new Exception7();
        e.getKey();
        e.getKey("");
    }
}
