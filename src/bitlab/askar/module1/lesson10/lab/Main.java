package bitlab.askar.module1.lesson10.lab;

public class Main {
    public static void main(String[] args){

        Engine[] engines = {
                new RenaultEngine(10,20,500,10),
                new RenaultEngine(15,22,50,5),
                new RenaultEngine(30,50,5,15),
                new FerrariEngine(20,20,4),
                new FerrariEngine(40,25,30),
                new FerrariEngine(34,50,100),
        };


        for (int i=0;i<engines.length;i++){
            System.out.println(engines[i].getMaxSpeed());
        }

    }
}
