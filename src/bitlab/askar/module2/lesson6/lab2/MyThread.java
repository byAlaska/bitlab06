package bitlab.askar.module2.lesson6.lab2;

import javax.swing.*;

public class MyThread extends Thread {

    JLabel label;

    public MyThread(JLabel label) {
        this.label = label;
    }

    @Override
    public void run() {

        try{
            for (int i=100;i<300;i+=10){
                Thread.sleep(50);
                label.setLocation(i,100);
            }

            label.setLocation(100,100);
        }catch (Exception exc){
            exc.printStackTrace();
        }

    }
}
