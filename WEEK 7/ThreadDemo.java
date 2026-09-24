class MyThread extends Thread {


    public void run() {
        try {
            System.out.println("Thread is running...");


            // Thread enters TIMED_WAITING state
            Thread.sleep(2000);


            System.out.println("Thread completed execution.");


        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}


public class ThreadStatesDemo {


    public static void main(String[] args) throws InterruptedException {


        MyThread t = new MyThread();


        // NEW state
        System.out.println("After creating thread: " + t.getState());


        // Start the thread
        t.start();


        // RUNNABLE or TIMED_WAITING
        System.out.println("After calling start(): " + t.getState());


        // Wait for some time so that thread enters sleep()
        Thread.sleep(500);


        System.out.println("While thread is sleeping: " + t.getState());


        // Wait until thread finishes
        t.join();


        // TERMINATED state
        System.out.println("After thread completion: " + t.getState());
    }
}
