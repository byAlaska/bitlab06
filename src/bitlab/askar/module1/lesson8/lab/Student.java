package bitlab.askar.module1.lesson8.lab;

public class Student {
    int id;
    String name;
    String surname;
    public double gpa;

    public Student(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public Student() {
    }

    public String getStudentData(){
        return "id:" + id + ", name:" + name + ", surname" + surname + ", gpa:" + gpa;
    }
}
