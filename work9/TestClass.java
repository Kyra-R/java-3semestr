package work9;
class Student implements Comparable <Student>{
    public int ID;
    Student(int id){
        ID = id;
    }
    public int compareTo(Student st){
        if(st.ID>ID){
            return 1;
        } else if (st.ID==ID){
            return 0;
        } else {
            return -1;
        }
    }

}



public class TestClass {
    public static void insertionSort(Student[] array) {
        for (int i = 1; i < array.length; i++) {
            Student current = array[i];
            int j = i - 1;
            while(j >= 0 && current.compareTo(array[j])==-1) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
    Student[] arr = new Student[10];
    public TestClass(){
        for(int i=0;i<10;i++){
            arr[i] = new Student(i);
        }
    }
    public void AllStudents(){
        for(int i=0;i<10;i++){
            System.out.println("Student "+arr[i].ID);
        }
        System.out.println("===========");
    }
    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.AllStudents();
        insertionSort(test.arr);
        test.AllStudents();
    }
}
