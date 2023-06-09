package multithread;
class runnable implements Runnable {
    private Thread t;
    private String threadName;

    runnable( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 1; i <=5; i++) {
                System.out.println("Thread: " + threadName + ", " + i +" time running ");
                // Let the thread sleep for a while.
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
public class Mtex1 {
    public static void main(String[] args)
    {
        runnable r1=new runnable("Thread 1");
        r1.start();
        runnable r2=new runnable("Thread 2");
        r2.start();
    }
}
