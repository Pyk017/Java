class ABC implements Runnable {
    public void run() {
        System.out.println("RUN METHOD in ABC class executed!");
        System.out.println("START Sleeping t2---------");
        try {

            //? moving thread t2 to the state timed waiting 
            Thread.sleep(100);

        } catch (InterruptedException ie) {
            
            ie.printStackTrace();

        }

        System.out.println("The state of thread t1 while it invoked the method join() on thread t2 " + ThreadStates.t1.getState());

        System.out.println(("in ABC --------------"));

        try {
            Thread.sleep(200);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println(("in ABC class end --------------"));

    }
}



public class ThreadStates implements Runnable {

    public static Thread t1;
    public static ThreadStates obj;

    public static void main(String[] args) {

        //? creating an object of the class ThreadState
        obj = new ThreadStates();
        t1 = new Thread(obj);

        //! thread t1 is spawned
        //? The thread t1 is currently in the NEW state
        System.out.println("The state of thread t1 after spawning it :- " + t1.getState());

        //? invoking the start() method on t1 thread
        t1.start();

        //? The thread t1 is moved to the Runnable state
        System.out.println("The state of thread t1 after invoking the method start() it :- " + t1.getState());

    }


    @Override
    public void run() {
        System.out.println("RUN METHOD in ThreadStates class executed!");
        ABC obj2 = new ABC();
        Thread t2 = new Thread(obj2);

        //! thread t2 is spawned
        //? The thread t2 is created and is currently in the NEW state.
        System.out.println("The state of thread t2 after spawning it :- " + t2.getState());

        //? invoking the start() method on t2 thread
        t2.start();

        //? The thread t2 is moved to the Runnable state
        System.out.println("The state of thread t2 after invoking the method start() it :- " + t2.getState()); //* RUNNABLE
        
        System.out.println("in it testing!!!!!!!!!!!!!!!");
        try {
            //? moving the thread t1 to the state timed waiting.
            Thread.sleep(200);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("in it testing!!!!!!!!!!!!!!!!!!!!!");

        System.out.println("The state of thread t2 after invoking the method sleep() on it :- " + t2.getState());


        try {
            //? waiting for thread t2 to complete its execution.
            t2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("The state of thread t2 when it has completed it's execution :- " + t2.getState());

    }
    
}


// UI configurator > mtop Page > download(stm, ftm)

// dev_mohit@amity.com - faculty
// dev_ds0015@amity.com = student


//! desksdre@d