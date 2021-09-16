/*Some key points to remeber the use of final keyword.
1.final keyword can be used in variables to make the variable constant.
3.It can be used in method to make that method cannot be overrided.
#.it also can be used in the class and it will made that class cannot be extended.

*/
 class Himalayas {
     public  static final  void show (){
         System.out.println("In class Himalayas show");
     }

   
}
class hills extends Himalayas{
   

}





public class finalDemo {
    public static void main(String [] args) {
        hills object  = new hills();
        hills.show();

    }
    
}