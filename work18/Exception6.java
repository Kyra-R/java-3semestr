package work18;

public class Exception6 {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        try {
            if(key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
        return "data for " + key; }

    public static void main(String[] args) {
        Exception6 e = new Exception6();
        e.printMessage(null);
        e.printMessage("key is set");
    }
}
