class thread implements Runnable {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Nanda");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
class thread1 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Kumar");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }

}
public class runnablintrfcethrd {
    public static void main(String [] args) {

  //thread obj1 = new thread();
 // thread1 obj2 = new thread1();
  
  Thread t1 = new Thread(new thread());
  Thread t2 = new Thread(new thread1());
    t1.start();
    t2.start();
    }
    
}