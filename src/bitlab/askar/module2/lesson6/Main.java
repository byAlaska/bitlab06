package bitlab.askar.module2.lesson6;

import bitlab.askar.module2.lesson5.User;

public class Main {
    public static void main(String[] args){


        ThreadGroup group1 = new ThreadGroup("group1");

        MyThread thread1 = new MyThread(group1,"First");
        MyThread thread2 = new MyThread(group1,"Second");
        MyThread thread3 = new MyThread(group1,"Third");
        RunnableThread thread = new RunnableThread();


        User u = new User();

        thread1.start();
        thread2.start();
        thread3.start();
        thread.run();

        while (true){
            if (group1.activeCount()<=0){
                break;
            }
        }


        System.out.println("Client finshed");
    }
}
