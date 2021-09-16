class thread extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Nanda");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
class thread1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Kumar");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }

}

public class thrd {
    public static void main(String [] args) throws Exception {
        Thread t= new thread();
        Thread t1 = new thread1();
        t.start();
     Thread.sleep(100);
        t1.start();



    }
    
}