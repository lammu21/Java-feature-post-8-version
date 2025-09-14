public class Solution {

    public static void main(String[] args) {
//         int [] nums= {1,1,2,3,4,5};

// // Enchance For Loop
//         for(var n : nums){
//             System.out.print(n);
//         }
      Thread1 thread1 = new Thread1();

      thread1.start();
try {
     Thread.sleep(10);
} catch (Exception e) {
    // TODO: handle exception
   
}
      

      Thread2 thread2 = new Thread2();

      thread2.start();
    }
}

// Threads

class Thread1 extends Thread 
{

    public void run()
    {
        for(int i =0; i < 5; i++)
        {
            System.out.println("hi");

            
            try {
                Thread.sleep(10);
                } 
            catch (InterruptedException e) 
            { 
                e.printStackTrace();
            }
            
        }
    }
}

class Thread2 extends Thread 
{

    public void run()
    {
        for(int i =0; i < 5; i++)
        {
            System.out.println("hello");

            
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) 

            { 
                e.printStackTrace();
            }
            
        }
    }
}