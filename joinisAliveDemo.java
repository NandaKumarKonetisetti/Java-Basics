public class joinisAliveDemo {
    public static void main(String [] args) throws Exception {
        Thread t1 = new Thread(()->{
                           for(int i=1;i<=5;i++){
                               System.out.println("Nanda");
                               try{Thread.sleep(500);}catch(Exception e){}
                           } 
                        });
        Thread t2 = new Thread(()->{
            for(int i=1;i<=5;i++){
                System.out.println("kumar");
                try{Thread.sleep(500);}catch(Exception e){}
            } 
         });
         System.out.println(t1.isAlive());   // This is a  method to detect  whether the thread is in running state or not
         t1.start();
        Thread.sleep(10);
         t2.start();
         System.out.println(t2.isAlive());
         t1.join();
         t2.join();
         System.out.println("Hello Java programming");
    }
    
}