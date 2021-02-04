package bitlab.askar.module1.lesson10;

public abstract class Shape {

    int angles;

    public Shape() {
    }

    public Shape(int angles) {
        this.angles = angles;
    }

    public abstract void getArea();
    public abstract void getPerimeter();

}
