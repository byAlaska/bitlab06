package bitlab.askar.module2.lesson6;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {

        try {

            for (int i=0;i<10;i++){
                sleep(500);
                System.out.println("Hello -> " + getName());
            }

            System.out.println("Finished");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
