// Lambda Expression in java 
public class lambaexthrdDemo {
    public static void main(String[] args) throws Exception {
        // Since we are using this Runnable objects only one time so we can directly pass it inside the thread object
        // Runnable obj1 = ()->{
        //         for (int i = 1; i <= 5; i++) {
        //             System.out.println("Nanda");
        //             try {
        //                 Thread.sleep(500);
        //             } catch (Exception e) {
        //             }
        //         }
            
        // };
        // Runnable obj2 = ()-> {
        //                         for (int i = 1; i <= 5; i++) {
        //                             System.out.println("Kumar");
        //                             try {
        //                                 Thread.sleep(500);
        //                             } catch (Exception e) {
        //                             }
        //                         }
                            
                                
        //                     };

        Thread t1 = new Thread(()->{
            for (int i = 1; i <= 5; i++) {
                System.out.println("Nanda");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        
    });
        Thread t2 = new Thread(()->{
            for (int i = 1; i <= 5; i++) {
                System.out.println("kumar");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        
    });
        t1.start();
        Thread.sleep(100);
        t2.start();
        t1.join();;
        t2.join();
        System.out.println("Hello Nanda Kumar");

    }

}