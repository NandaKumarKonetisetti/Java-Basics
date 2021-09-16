class sum {
    int a;
    int b;

}

class sum1 extends sum {
    public sum1(int val1,int val2){
        super.a = val1;
        super.b = val2;
    }
        public void   addition (){
            int c =super.a+super.b;
            System.out.println("The sum of two numbers "+c);
        
    }
}

public class super1 {
    public static void main(String[] args) {
        sum1 obj = new sum1(2,3);
        obj.addition();

    }

}