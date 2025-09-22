package InterfaceFeatures;

interface Vehicle 
{
    // ABSTRACT METHODS
    void start();

    // DEFAULT METHOD 
    // Default methods to add new functionality/methods in existing interfaces without 
    // affecting the classes which already implemented the interface,not forcing them to implement 
    // the new method

    default void fuelType()
    {
        System.out.println("Petrol or Diesel by Default");
    }

    // STATIC METHOD
    // static methods belongs to interface itself and not to objects of class implementing the interface
    // utilities methods inside interface
    static void vehicleinfo()
    {
        System.out.println("This is a static method of Vehicle interface");
    }

    // PRIVATE METHOD
    // these are helper methods inside interface, resusable by default and static methods 
    // Not accecible by outside interface

    private void log(String message)
    {
        System.out.println("Log: " + message);
    }

    default void check()
    {
        // calling private method inside default method
        log("checking the vehicle");
    }
}

class Car implements Vehicle 
{
    @Override
    public void start()
    {
        System.out.println("Car started");
    }

    @Override
    public void fuelType()
    {
        System.out.println("Override default method : Car runs on Petrol");
    }
}

public class InterfaceFeatures {

    public static void main(String[] args) {
        Vehicle mycar = new Car();

        mycar.start();

        mycar.fuelType();

        mycar.check();

        Vehicle.vehicleinfo();
    }

    // Real-time example :
    //  Java collections add new methods 
    //  1.forEach() - default method
    //  2.stream() - default method
  
    // Java Comparator interface add new static methods
    //  1.comparing()

    // Java private methods in interfaces are used to avoid code duplication in default and static methods.

}
