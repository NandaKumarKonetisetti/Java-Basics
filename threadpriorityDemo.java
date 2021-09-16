public class threadpriorityDemo {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Nanda");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        },"Nanda Thread");
        Thread t2 = new Thread(() -> {
            System.out.println("Hello "+Thread.currentThread().getPriority());
            for (int i = 1; i <= 5; i++) {
                System.out.println("Kumar");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        },"Kunar Thread");
        // t1.setName("nandu"); // we can also mention the name of the thread by using the method or we can name it directly in thread object after passing the runnable object as shown above.
        // t2.setName("oye");
        t1.setPriority(Thread.MIN_PRIORITY+1); // It will give the least value in priority that means least priority is 1.
        t2.setPriority(Thread.MAX_PRIORITY); // It will give the maximum value in priority that means maximum priority is 10.
        // t1.setPriority(10);     // The Range of the thread priority varies from 1 to 10
        // t2.setPriority(1);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println();
        t1.start();
        Thread.sleep(100);
        t2.start();

    }

}