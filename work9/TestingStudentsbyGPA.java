package work9;

import java.util.Comparator;
import java.util.Scanner;

class Students {
    public double Result;
    public String ID;

    public Students(double i, String id){
        Result = i;
        ID=id;
    }
    public Students(){
        Result = 0;
        ID="";
    }



}
public class TestingStudentsbyGPA implements Comparator <Students>  {

    @Override
    public int compare(Students o1, Students o2) {
        if(o1.Result>o2.Result){
            return 1;
        } else if (o1.Result==o2.Result){
            return 0;
        } else {
            return -1;
        }
    }

    public static void quickSort(Students[] source, int leftBorder, int rightBorder, TestingStudentsbyGPA test) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Students tmp = new Students();
        Students pivot = source[(leftMarker + rightMarker) / 2];
        do {

            while (test.compare(source[leftMarker],pivot)==1) {
                leftMarker++;
            }

            while (test.compare(source[rightMarker],pivot)==-1) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {

                if (leftMarker < rightMarker) {
                    tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }

                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);


        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder, test);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker, test);
        }
    }

    public static Students[] arraycopy (Students[] src, int beg, int amount){
        Students[] copy = new Students [amount];
        for(int i=0;i<amount;i++){
            copy[i] = new Students();
            copy[i]=src[beg+i];

        }
        return copy;
    }

    public static void mergeSort(Students[] src, int n, TestingStudentsbyGPA test) {
        if (n < 2)
        {return;}

        int mid = n / 2;
        Students[] left = new Students[mid];
        for(int i=0;i<mid;i++){
            left[i] = new Students();
        }
        Students[] right = new Students[n - mid];
        for(int i=0;i<n-mid;i++){
            right[i] = new Students();
        }
        left=arraycopy(src,0,mid);
        right=arraycopy(src,mid,n - mid);



        mergeSort(left, mid,test);
        mergeSort(right, n - mid,test);

        merge(src, left, right,test);
    }
    public static void merge(Students[] src, Students[] left, Students[] right,TestingStudentsbyGPA test) {


        int k = 0, i = 0, j = 0;
        int rightLength = right.length;
        int leftLength = left.length;
        while (i < leftLength && j < rightLength) {
            if ((test.compare(left[i],right[j])==-1) || (test.compare(left[i],right[j])==0))
            { src[k++] = left[i++];}
            else
            {src[k++] = right[j++];}
        }

        while (i < leftLength) {
            src[k++] = left[i++];
        }

        while (j < rightLength) {
            src[k++] = right[j++];
        }
        //listOf(src);
    }


    public static void listOf(Students [] test){
        System.out.println("====================");
        for(int i=0;i<test.length;i++){
            System.out.println(test[i].ID+" result:"+test[i].Result);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        TestingStudentsbyGPA test = new TestingStudentsbyGPA();
        Students[] list = new Students[10];

        Students[] list1 = new Students[4];
        Students[] list2 = new Students[6];
        if(x==1) {
            for (int i = 9; i >= 0; i--) {
                list[i] = new Students(((double) i) / 2.0, "Student" + (i + 1));
            }
            listOf(list);
            quickSort(list, 0, 9, test);
            listOf(list);
        } else {
            int count = 0;
            for (int i = 0; i <10; i++) {
                if(i%2 == 0) {
                    list[count] = new Students(((double) i) / 2.0, "Student" + (i + 1));
                    count++;

                }
            }

            for (int i = 9; i >= 0; i--) {
                if(i%2 == 1) {
                    list[count] = new Students((i), "Student" + (i + 10));
                    count++;

                }
            }
           listOf(list);
            mergeSort(list,10,test);

            listOf(list);
        }
    }

}
