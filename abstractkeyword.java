/*If we create an abstract class we cannnot create object of that particular class.
1.If a method inside a certain class is abstract then the class must be abstract.
2.If we declare a method,inside a class then that must be abstract.

*/

abstract class nanda {
    public abstract void code();

    public void exercise() {
        System.out.println("In class nanda inside exercise method");

    }
}

class kumar extends nanda {
    public void code() {
        System.out.println("In class kumar that can be code");
    }

}

public class abstractkeyword {
    public static void main(String[] args) {
        nanda obj = new kumar();
        obj.code();
        obj.exercise();

    }
}