public class wrapperClassDemo {
    public static void main(String args[]){
        int val = 7;
        Integer obj = new Integer(val); //Boxing or Wrapping 
        int j = obj.intValue(); //unBoxing -unWrapping
        System.out.println(j);
        Integer number = 9; //  AutoBoximg -or Autowrapping   ,because instead of writing like number 4 we can also do like this,if we did like this in backend java will take as like line number 4
        int num = number; //AutounBoxing or AutounWrapping     ,it is same as line number 5 ,But it is a simplified form of line no 5
        System.out.println(num);
        String no ="191811164";
        int regNo=Integer.parseInt(no);
        System.out.println(regNo);
        
    }
    
}