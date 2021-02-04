package bitlab.askar.module1.lesson9.lab;

public class Student extends User{

    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student() {
    }

    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getIndexOfCourses() {
        return indexOfCourses;
    }

    public void addCourse(String course){
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }

    public String getCourses(){
        String result = "";

        for (int i=0;i<indexOfCourses;i++){
            result += courses[i] + ", ";
        }
        return result;
    }

    @Override
    public String toString() {
        return "gpa=" + gpa +
                ", courses=" + getCourses()+
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'';
    }
}
