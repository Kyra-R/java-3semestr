package work18;

public class Exception5 {
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
        Exception5 e = new Exception5();
        e.printMessage(null);
        System.out.println("===========");
        e.printMessage("key is set");
    }
}
