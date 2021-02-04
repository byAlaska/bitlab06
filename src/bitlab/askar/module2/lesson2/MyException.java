package bitlab.askar.module2.lesson2;

public class MyException extends Exception {
    @Override
    public String getMessage() {
        return "Login failed";
    }
}
