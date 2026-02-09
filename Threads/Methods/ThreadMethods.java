package Methods;

public class ThreadMethods implements Runnable {
    // super(name);

    @Override
    public void run()
     {
     
        System.out.println("ThreadMethods");

        try{
              Thread.sleep(1000);
              System.out.println("Making wait for join method");
        }catch(Exception e)
        {
            System.out.println(e);
        }
      

     }
    
}
