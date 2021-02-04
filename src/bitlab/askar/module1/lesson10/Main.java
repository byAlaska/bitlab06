package bitlab.askar.module1.lesson10;

public class Main {
    public static void main(String[] args){
        Shape []shapes = new Shape[10];

        shapes[0] = new Circle(5);
        shapes[1] = new Square(10);
        shapes[2] = new Circle(20);
        shapes[3] = new Square(100);
        shapes[4] = new Circle(30);

        for (int i=0;i<5;i++){
            shapes[i].getPerimeter();
            shapes[i].getArea();
        }


    }
}
