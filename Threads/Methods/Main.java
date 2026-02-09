package Methods;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadMethods());
        Thread t2 = new Thread(new ThreadMethods());
        Thread t3 = new Thread(new ThreadMethods());

//run and start
        t1.start();

        
        try{
//sleep
        Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.print(e);
        }
        System.out.println("After 1 sec sleep ");

///.join()
         t1.join();

         System.out.println("after t1 execution join");

//// setPriority()
      
      t1.setPriority(Thread.MIN_PRIORITY);
      System.out.println("t1");
    //   t1.start();
      t2.setPriority(Thread.MAX_PRIORITY);
      System.out.println("t2");
      t2.start();
      t3.setPriority(Thread.NORM_PRIORITY);
      System.out.println("t3");
      t3.start();

    }
}
