class thread {
    int count = 0;

    public synchronized void increment() {

        count++;
        // System.out.println(count);
    }
}

public class thrdsafety {
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