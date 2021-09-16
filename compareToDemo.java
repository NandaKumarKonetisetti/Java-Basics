class stu {
    int rollno,marks;
    String subject;
    public stu(int rollno,String subject,int marks){
        this.rollno = rollno;
        this.subject = subject;
        this.marks = marks;
        System.out.println(this.rollno+" " +this.subject+ " " +this.marks);
    }

}
public class compareToDemo {
    public static void main(String []  args){
        stu st = new stu(123,"java",76);
    }
    
}