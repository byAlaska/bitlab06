package bitlab.askar.module2.lesson6.lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        ArrayList<Car> cars = new ArrayList<>();

        ThreadGroup group = new ThreadGroup("group1");
        Car car = new Car(group,"Ferrari",100,1000);
        Car car2 = new Car(group,"Renault",200,1000);
        Car car3 = new Car(group,"BMW",150,1000);
        Car car4 = new Car(group,"Mers",50,1000);
        Car car5 = new Car(group,"Bugatti",120,1000);

        cars.add(car);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);


        for (Car c:cars){
            c.start();
        }


        ArrayList<Car> finishedCars = new ArrayList<>();


        int myCount = group.activeCount();
        while (true){
            if (group.activeCount()==0) break;
            if (myCount>group.activeCount()){

                Car toDelete = null;
                for (Car c:cars){
                    if (!c.isAlive()){
                        finishedCars.add(c);
                        toDelete = c;
                    }
                }

                cars.remove(toDelete);

                myCount--;
            }
        }




        for (int i=0;i<5;i++){
            System.out.println(finishedCars.get(i).getName() + " is on -> " + (i+1) + " place");
        }

    }
}
