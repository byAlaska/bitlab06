package bitlab.askar.module1.lesson11;

public class Main {
    public static void main(String[] args){

        CanCharge []canCharges = {
                new Multivarka(),
                new ElectroCar(),
                new Telephone()
        };


        for (int i=0;i<3;i++){
            canCharges[i].charge();
        }



        Plita plita = new Plita();
        Plita plita2 = new Plita();

        int x = plita.compareTo(plita2);

        if (x==1){
            System.out.println("First pliat bolshe");
        }



    }
}
