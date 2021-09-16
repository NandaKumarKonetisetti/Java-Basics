/*Encapsulation is the process of binding data wuth methods


*/

class Student {
     private int rollno;
     private String name;
    //setters and getters
    public void setRollno(int r){
        rollno = r;
        System.out.println("value of roll number is modified");
    }
    public int getRollno(){
        System.out.println("user is accessing the value");
        return rollno;
    }

    public void setName(String name){
        this.name = name;
        System.out.println("value of name is changed");
    }
    
        public String getName() {
            System.out.println("User is accessing the value");
        return name;
    }
    
}

class encapsulationdemo {
    public static void main(String[] args) {

        Student obj = new Student();
        obj.setRollno(9);
        obj.setName("nanda kumar");
        System.out.println(obj.getRollno());
        System.out.println(obj.getName());
    }

}