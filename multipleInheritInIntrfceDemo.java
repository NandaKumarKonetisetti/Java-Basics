
interface India {
    void show();

    default void runn() {
        System.out.println("In India inside the run method");
    }
}

interface Mumbai {
    default void runn() {
        System.out.println("In mumbai  inside the run method");
    }
}

class pune implements India, Mumbai {
    public void show() {
        System.out.println("in pune inside the show method");
    }
    // In ambiguity  issue while doing multiplw inheritance we can do by defining that method in subcclss in this way other one is as shown below.
    // public  void runn() {
    //     System.out.println("In pune inside the run method");
    // }
    public void runn(){
        Mumbai.super.runn(); // it will invoke the method in mumbai.
        India.super.runn(); // It will invoke the method in India.
    }

}

public class multipleInheritInIntrfceDemo {
    public static void main(String[] args) {
        India i = new pune();
        i.show();
        i.runn();

    }

}