package App;

import Model.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Sang",20);
        Student student2 = new Student("Sang",20);

        boolean b1 = (student1 == student2) ? true : false;
        boolean b2 = (student1.equals(student2)) ? true : false;

        System.out.println("b1: " +b1 + " b2 " + b2);

    }
}
