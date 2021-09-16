import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int rollno, marks;
    String subject;

    public Student(int rollno, String subject, int marks) {
        this.rollno = rollno;
        this.subject = subject;
        this.marks = marks;

    }

    // public String toString() {
    //     return "Student[rollno = " + rollno + " , subject = " + subject + " , marks = " + marks + "]";
    // }
    public String toString(){
        return "Rollno = "+this.rollno+" Subject = "+this.subject+" Marks = "+this.marks;
    }

    public int compareTo(Student s) {
        return rollno > s.rollno ? 1 : -1;
    }

}


public class comparableIntrfceDemo {
    public static void main(String[] args) {
        List<Student> stud = new ArrayList<>();
        stud.add(new Student(1, "c languange", 80));
        stud.add(new Student(2, "database", 82));
        stud.add(new Student(3, "java", 76));
        stud.add(new Student(4, "python", 89));
        stud.add(new Student(5, "oracle", 87));
        stud.add(new Student(6, "javascript", 65));
        stud.add(new Student(7, "React js", 74));
        stud.add(new Student(8, "Angular js", 62));
        Collections.sort(stud);
        // for(int i = 0 ; i<stud.size();i++)
        // System.out.println(stud.get(i));
        // for(Student s:stud)
        // System.out.println(s);
        // Collections.sort(stud, new sortbysubject());
        for(int i =0  ; i<stud.size();i++)
        System.out.println(stud.get(i));

    }
  

}