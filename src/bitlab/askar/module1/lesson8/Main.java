package bitlab.askar.module1.lesson8;

import bitlab.askar.module1.lesson8.lab.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student[] students = new Student[5];
        int count = 0;

        while (true) {
            System.out.println("[1] add student");
            System.out.println("[2] list student");
            System.out.println("[3] top student");
            System.out.println("[0] exit");

            int choice = in.nextInt();

            if (choice == 1) {

                int id = count + 1;
                String name = in.next();
                String surname = in.next();
                double gpa = in.nextDouble();

                students[count] = new Student(id, name, surname, gpa);
                count++;

            } else if (choice == 2) {
                for (int i = 0; i < count; i++) {
                    System.out.println(students[i].getStudentData());
                }
            } else if (choice == 3) {

                double maxGPA = students[0].gpa;
                Student maxStudent = students[0];

                for (int i = 0; i < count; i++) {
                    if (maxGPA < students[i].gpa) {
                        maxGPA = students[i].gpa;
                        maxStudent = students[i];
                    }
                }
                System.out.println(maxStudent.getStudentData());
            } else {
                break;
            }
        }


    }
}
