
/*Singleton

-ensures that only one instance of its kind exists
-provides only a single point of access to it
-Singleton let you access your object from anywhere in your application
-they encapsulate the attributes of this object in one single class and guarantee that only one instance of this
class will be available at any point in time

   Conclusion:
     When to use:
        -when a class must have a single instance variable;
-this pattern disables all means of creating objects of a class except for the static creation method
-returns the existing instance if it has already been created
-its code needs to be adapted to handle multiple threads
        (A thread in Java is the direction or path that is taken while a program is being executed.
         Generally, all the programs have at least one thread, known as the main thread, that is provided by
         the JVM or Java Virtual Machine at the starting of the program's execution.)
 */



public class Singleton {
    private static volatile Singleton instance;
    //A shared variable stored in the memory can reference a partially constructed object, so the
    // instance is not null even though the initialization in not done yet.
    //fix=>volatile
    //This keyword ensures that multiple threads will be able to handle the singleton instance correctly.
    private String data;

    private Singleton(String data){
        //This is a constructor to create an object based on this class.
        //It is private because we only need access to it using a
        // public static method created inside the Singleton class.
        this.data=data;
    }

    public static Singleton getInstance(String data){
        //It is called getInstance() to refer to the same single instance it returns.
        Singleton result=instance;
        //The variable we have is marked as volatile, so, every time we access this variable we need to read it
        // directly from the main memory as it cannot be cached.
        //We can store the instance in a local variable the first time we retrieve it from the memory to avoid
        //multiple direct reads of the memory.

        if(result==null){
            //The threads trying to retrieve the instance of our Singleton class after being
            // instantiated, do not necessarily have to acquire the lock on our class, as we ar first
            // testing the locking criteria.
            //We improved the performance of our code by limiting synchronization to the rare case
            //of computing the field's value or constructing a new instance of this field
            // and by skipping synchronization when retrieving an already created instance.
           synchronized (Singleton.class){
               //Every time a thread tries to create an instance of the Singleton class
               //it will have to wait for its turn as one thread only may execute this code
               //block at a given time.
               result=instance;
               if(result==null)
                   //The created instance is wrapped inside an if statement that checks if
                   // the static instance of our singleton is null or not to guarantee that the
                   // same instance is returned every single time.
                   instance = result= new Singleton(data);
           }
        }
    return instance;}

    public void doSomething(){
        System.out.println("Singletone is doing something");
    }
}
