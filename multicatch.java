public class multicatch {
    public static void main(String[] args) {
        try {
            int a[] = new int[8];

            a[7] = 9;
            int num = 9;
            int denom = 0;
            int divide = num / denom;
            System.out.println("The output of two numbers is " + divide);
        }

        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {   // Instead of using many catch blocks of different exception  we can also do in this way 
            System.out.println(e.getMessage());
        } 
        
        
        catch (Exception e) {                       // At last it is better to use catch block of exception  because if any unknown exception occurs it can handle because it is the super class of all the exceptions.
            System.out.println("something gone wrong");
        }

    }

}