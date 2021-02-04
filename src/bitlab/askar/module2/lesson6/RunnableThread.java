package bitlab.askar.module2.lesson6;

public class RunnableThread implements Runnable {

    @Override
    public void run() {
        try {
            for (int i=0;i<10;i++){

                synchronized (this){
                    Thread.sleep(500);
                    System.out.println("Bye bye");
                }


            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
