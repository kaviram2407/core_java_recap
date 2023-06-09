package multithread;

class StopThread extends Thread
        {
@Override
public void run() {
    int c=0;
        while (!Thread.interrupted()) {
        System.out.println("Thread is running..."+c);
        c++;
        }
        System.out.println("Thread stopped!!!");
        }
        }

public class mtex3 {
    public static void main(String[] args) {

        StopThread stop_thread = new StopThread();
        stop_thread.start();
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop_thread.interrupt();
    }
}
