/*key points about the anonymous class 
1.Anony,ous class does not have any name.
2.With the help of anynomous class we can create objects for both interfaces as well as abstract classes.
3.If we want to use the class only once at a time then  we can go for anonymous classes.
*/



abstract class forest {
 public void display(){
        System.out.println("forest consists of trees");
    }
} 





public class anonymousClass { 
    public static void main(String args[]){
        forest obj = new forest(){
                    public void display(){
                        System.out.println("forest consists of animals and trees along with some sedimentary rocks");
                    }
                };
                obj.display();

    }
    
}