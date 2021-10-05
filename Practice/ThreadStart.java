class ImplementingRunnableInterface implements Runnable{
    public void run() {
        System.out.println("Thread is running by implementing the runnable interface ... ");
    }

}


class ExtendingThreadClass extends Thread {
    public void run() {
        System.out.println("Thread is running by extending the thread class ... ");
    }
}


public class ThreadStart {
    public static void main(String[] args) {

        //? Starting the thread by extending the Thread class.
        ExtendingThreadClass t1 = new ExtendingThreadClass();
        t1.start();

        //? Starting the thread by implementing the Runnable Interface.
        ImplementingRunnableInterface obj = new ImplementingRunnableInterface();
        Thread t2 = new Thread(obj); //! Using the constructor Thread(Runnable r)

        t2.start();

        //? Starting the thread using the constructor Thread(String name)
        Thread t3 = new Thread("My Third Thread");
        t3.start();
        String name = t3.getName(); //! getting the thread name by invoking getName() method.
        System.out.println(name);

        
        //? Starting the thread using the constructor Thread(Runnable r, String name)
        Runnable r = new ImplementingRunnableInterface();

        Thread t4 = new Thread(r, "My Fourth Thread");
        t4.start();
        String name2 = t4.getName();
        System.out.println(name2);


    }
}
