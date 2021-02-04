package bitlab.askar.module1.lesson9.lab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        User[] users = new User[10];
        int cnt = 0;

        while (true) {
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");

            int choice = in.nextInt();

            if (choice == 1) {
                System.out.println("PRESS [1] TO ADD STUDENT\n" + "PRESS [2] TO ADD STAFF");
                int choice2 = in.nextInt();

                int id = in.nextInt();
                String login = in.next();
                String password = in.next();
                String name = in.next();
                String surname = in.next();

                if (choice2 == 1) {
                    double gpa = in.nextDouble();
                    Student student = new Student(id, login, password, name, surname, gpa);

                    while (true){
                        System.out.println("[1] add course");
                        System.out.println("[0] exit");
                        int choice3 = in.nextInt();
                        if (choice3==2) break;

                        String course = in.next();
                        student.addCourse(course);
                    }

                    users[cnt] = student;
                    cnt++;

                } else if (choice2 == 2) {
                    double salary = in.nextDouble();
                    Staff staff = new Staff(id, login, password, name, surname, salary);

                    while (true){
                        System.out.println("[1] add subject");
                        System.out.println("[0] exit");
                        int choice3 = in.nextInt();
                        if (choice3==2) break;

                        String subject = in.next();
                        staff.addSubject(subject);
                    }


                    users[cnt] = staff;
                    cnt++;

                }

            } else if (choice == 2) {
                System.out.println("PRESS [1] TO LIST STUDENTS\n" + "PRESS [2] TO LIST STAFF");

                int choice2 = in.nextInt();

                for (int i = 0; i < cnt; i++) {
                    if (choice2 == 1) {
                        if (users[i] instanceof Student) {
                            Student student = (Student) users[i];
                            System.out.println(student.toString());
                        }
                    } else {
                        if (users[i] instanceof Staff) {
                            Staff staff = (Staff) users[i];
                            System.out.println(staff.toString());
                        }
                    }

                }

            } else {
                break;
            }
        }


    }
}
