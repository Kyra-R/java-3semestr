package work2.Pack3;

public class Tester {
    public static void main(String args[]) {
        int n=5;
        Circle[] arr=new Circle [n];
        System.out.println("Premade circles:");
        for(int i=0;i<n;i++){
            arr[i] = new Circle((double) i,(double) i);
            System.out.println(arr[i].toString());
        }
    }
}
