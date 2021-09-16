/*Types of interfaces
1.Normal Interface - -> if an interface consists of more than one  method then it is said to be a Normal Interface
2.Single Abstract method----Functional Interface - ->If an interface consists only one method then it is said to be a Functioal Interface.
3.marker Interface --->Interface does not have any methods is said to be a Marker Interface.
4.Lambda Expression only works with function interace means that the interface has only one method.








*/





@FunctionalInterface
interface nanda{
    public abstract void show();
}





public class lamdaExp {
    public static void main(String args[]){
        nanda obj = ()->System.out.println("I am Nanda Kumar Kontetisetty");    //Thi sis known as lambda Expression in java
        obj.show();

    }
    
}