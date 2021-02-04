package bitlab.askar.module1.lesson10;

public class Circle extends Shape {

    int radius;

    public Circle() {
    }

    public Circle(int radius) {
        super(0);
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println(radius*3.14*radius);
    }

    @Override
    public void getPerimeter() {
        System.out.println(2*3.14*radius);
    }
}
