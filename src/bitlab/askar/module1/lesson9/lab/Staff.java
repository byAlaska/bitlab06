package bitlab.askar.module1.lesson9.lab;

public class Staff extends User{

    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff() {
    }

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }


    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void addSubject(String subject){
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }

    public String getSubjects(){
        String result = "";

        for (int i=0;i<indexOfSubject;i++){
            result += subjects[i] + ",  ";
        }

        return result;
    }

    @Override
    public String toString() {
        return "salary=" + salary +
                ", subjects=" + getSubjects() +
                ", indexOfSubject=" + indexOfSubject +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'';
    }
}
