package bitlab.askar.module1.lesson11.lab;

public class Plane implements Moveable {

    MovingObject object;

    @Override
    public void move() {
        System.out.println(object.toString() + " is moving plane:" + toString());
    }
}
