package work19;

public class LabClass {
    Student[] list = new Student[10];
    int amount = 0;

    public void addStudent(Student student) {
        list[amount] = student;
        amount++;
    }

    public void deleteStudent(String studentName) throws StudentNotFoundException {
        int index = -1;
        for (int i = 0; i < amount; i++) {
            if (list[i].getName().equals(studentName)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new StudentNotFoundException();
        }
        for (int i = index; i < amount; i++) {
            list[i] = list[i + 1];
        }
        amount--;
    }

    public Student getStudent(String studentName) throws StudentNotFoundException {
        for (int i = 0; i < amount; i++) {
            if (list[i].getName().equals(studentName)) {
                return list[i];
            }
        }
        throw new StudentNotFoundException();
    }

    @Override
    public String toString() {
        String s="";
        for(int i=0;i<amount-1;i++){
            s+=list[i].toString()+", ";
        }
        s+=list[amount-1].toString();
        return "Class: " + '\n' + s + ", amount of students=" + amount;
    }

}
