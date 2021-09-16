import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

class Student {
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
        
        
    }
    class sortbysubject implements Comparable <Student>{
        public int comparTo(Student st){
            return rollno>st.rollno?1:-1;
        }
    }
    
        public class comparetodemo1 {
            public static void main(String [] args) {
                List<Student> stud = new ArrayList<>();
                stud.add(new Student(1, "c languange", 80));
                stud.add(new Student(2, "database", 82));
                stud.add(new Student(3, "java", 76));
                stud.add(new Student(4, "python", 89));
                stud.add(new Student(5, "oracle", 87));
                stud.add(new Student(6, "javascript", 65));
                stud.add(new Student(7, "React js", 74));
                stud.add(new Student(8, "Angular js", 62));
                Collections.sort(stud, new sortbysubject());
                for(Student st:stud)
                System.out.println(st);
                
        }
    }