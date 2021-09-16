import java.util.concurrent.atomic.AtomicInteger;

class thread {
AtomicInteger count =new AtomicInteger();

    public  void increment() {

        count.incrementAndGet();
        // System.out.println(count);
    }
}
public class thrdSafety1 {
    public static void main(String[] args) throws Exception {
        thread t = new thread();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    t.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    t.increment();
                }
            }
        });
        t1.start();
        t2.start();
        t2.join();
        t1.join();

        System.out.println("The value of a count is " + t.count);

    }

    
}