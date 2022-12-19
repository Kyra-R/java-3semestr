package work10;


import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class SortingStudentsByGPA implements Comparator<Student2> {
    String genString() {
        byte[] array = new byte[7]; // length is bounded by 7
        final Random random = new Random();
        for(int i=0;i<7;i++){
            array[i]=(byte) ((random.nextInt()%26+25)%26+97);
        }
        String generatedString = new String(array);

        return generatedString;
    }
    Student2[] iDNumber;
    public void setArray(){

        Scanner in = new Scanner(System.in);
        System.out.println("Size of the array");
        int x = in.nextInt();
        iDNumber = new Student2[x];
        int rand;
        int rand2;
        final Random random = new Random();
        for(int i=0;i<x;i++){
            rand = (random.nextInt()%20+20)%20;
            rand2 = (random.nextInt()%4+3)%4+1;
            iDNumber[i] = new Student2(genString(),genString()," Spec"+(rand2+1)," group-"+(rand+1),rand2, ((rand+rand2)/5.0));
        }
    }

    public void outArray() {
        int x= iDNumber.length;
        System.out.println("=================");
        for(int i=0;i<x;i++) {
            System.out.println( iDNumber[i].getName()+" "+iDNumber[i].getSurname()+":"+iDNumber[i].getIDspec()
                    +iDNumber[i].getGroup()+" year:"+iDNumber[i].getYear()+" Result:"+iDNumber[i].getResult());
        }
    }

    public static void quickSort(Student2[] source, int leftBorder, int rightBorder, int mode) {
        Comparator<Student2> test;
        if(mode==1)
            test = new LearningResultsComparator();
       else {
            test = new LearningYearComparator();
       }
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student2 tmp;
        Student2 pivot = source[(leftMarker + rightMarker) / 2];
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
            quickSort(source, leftMarker, rightBorder, mode);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker, mode);
        }
    }


    public static Student2[] arraycopy (Student2[] src, int beg, int amount){
        Student2[] copy = new Student2 [amount];
        for(int i=0;i<amount;i++){
            copy[i] = new Student2();
            copy[i]=src[beg+i];

        }
        return copy;
    }


    public static void mergeSort(Student2[] src, int n, int mode) {
        if (n < 2)
        {return;}

        int mid = n / 2;
        Student2[] left = new Student2[mid];
        for(int i=0;i<mid;i++){
            left[i] = new Student2();
        }
        Student2[] right = new Student2[n - mid];
        for(int i=0;i<n-mid;i++){
            right[i] = new Student2();
        }
        left=arraycopy(src,0,mid);
        right=arraycopy(src,mid,n - mid);



        mergeSort(left, mid,mode);
        mergeSort(right, n - mid,mode);

        merge( src,left, right,mode);
    }
    public static void merge(Student2[] src, Student2[] left, Student2[] right, int mode) {

        Comparator<Student2> test;
        if(mode==1)
            test = new LearningResultsComparator();
        else {
            test = new LearningYearComparator();
        }

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

    }


    public static void merge2(Student2[] src, Student2[] left, Student2[] right, int mode) {

        Comparator<Student2> test;
        if(mode==1)
            test = new LearningResultsComparator();
        else {
            test = new LearningYearComparator();
        }

        int k = 0, i = 0, j = 0;
        int rightLength = right.length;
        int leftLength = left.length;
        while (i < leftLength && j < rightLength) {
            if ((test.compare(left[i],right[j])==1) || (test.compare(left[i],right[j])==0))
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

    }
    public static void listOf(Student2[] test){
      System.out.println("====================");
        for(int i=0;i<test.length;i++){
            System.out.println( test[i].getName()+" "+test[i].getSurname()+":"+test[i].getIDspec()
                    +test[i].getGroup()+" year:"+test[i].getYear()+" Result:"+test[i].getResult());
    }
    }


    public static void main(String[] args) {
        SortingStudentsByGPA test = new SortingStudentsByGPA();
        SortingStudentsByGPA test1 = new SortingStudentsByGPA();
        SortingStudentsByGPA test2 = new SortingStudentsByGPA();


        Scanner in = new Scanner(System.in);
        System.out.println("1 - for 2 exercise, other - for 3");
        int x = in.nextInt();
        if (x == 1) {
            test.setArray();
            test.outArray();
            System.out.println("Choose the mode and sort");
            x = in.nextInt();
            if (x == 1)
                quickSort(test.iDNumber, 0, test.iDNumber.length - 1, 1);
            else if (x == 2)
                mergeSort(test.iDNumber, test.iDNumber.length, 1);
            else if (x == 3)
                quickSort(test.iDNumber, 0, test.iDNumber.length - 1, 2);
            else if (x == 4)
                mergeSort(test.iDNumber, test.iDNumber.length, 2);
            test.outArray();
        } else {
            test1.setArray();
            quickSort(test1.iDNumber, 0, test1.iDNumber.length - 1, 1);
            test1.outArray();
            test2.setArray();
            quickSort(test2.iDNumber, 0, test2.iDNumber.length - 1, 1);
            test2.outArray();
            Student2[] result = new Student2[test1.iDNumber.length+test2.iDNumber.length];
            System.out.println(result.length);
            for(int i=0;i<test1.iDNumber.length+test2.iDNumber.length;i++){
                result[i] = new Student2();
            }
            merge2(result,test1.iDNumber,test2.iDNumber,1);
            test1.listOf(result);
        }
    }


    @Override
    public int compare(Student2 o1, Student2 o2) {
        if(o1.Result>o2.Result){
            return 1;
        } else if (o1.Result==o2.Result){
            return 0;
        } else {
            return -1;
        }
    }
}

class LearningYearComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        if(o1.getYear()>o2.getYear()){
            return 1;
        } else if (o1.getYear()==o2.getYear()){
            return 0;
        } else {
            return -1;
        }
    }
}

class LearningResultsComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        if(o1.Result>o2.Result){
            return 1;
        } else if (o1.Result==o2.Result){
            return 0;
        } else {
            return -1;
        }
    }
}
