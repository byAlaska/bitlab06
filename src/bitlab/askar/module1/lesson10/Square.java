package bitlab.askar.module1.lesson10;

public class Square extends Shape {

    int width;

    public Square() {
    }

    public Square(int width) {
        super(4);
        this.width = width;
    }

    @Override
    public void getArea() {
        System.out.println(width*width);
    }

    @Override
    public void getPerimeter() {
        System.out.println(4*width);
    }
}
