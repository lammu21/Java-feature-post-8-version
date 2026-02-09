package Creation;
public class ThreadLearning
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThread t1 = new MyThread();
        t1.run();

        Thread.sleep(5000);
        
        Thread r1 = new Thread(new MyRunnable());

        r1.run();

        System.out.println("Main Thread");

    }

    public static class MyThread extends Thread {
    
        public void run(){

            System.out.println("Thread Running ");
    }

    
}
    
}
