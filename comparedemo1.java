import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
                return "Rollno = "+this.rollno+" Subject =  "+this.subject+"        Marks = "+this.marks;
            }
        
        
    }
    class sortbysubjectName implements Comparator<Student>{
        public int compare(Student a,Student b){
            //return a.subject.compareTo(b.subject); It will compare each and every character in the subject based on the unicode lexicographically
            return a.subject.compareToIgnoreCase(b.subject);  //It will compare by igmoring the upperCase and lowerCase letters.
        }
    }
    class sortbyRollno implements Comparator<Student>{
        public int compare(Student a,Student b){
            return a.rollno>b.rollno?1:-1;
        }
    }
    class sortbyMarks implements Comparator<Student>{
        public int compare(Student a,Student b){
            return a.marks-b.marks;
        }
    }
    
        public class comparedemo1 {
            public static void main(String [] args) {
                List<Student> stud = new ArrayList<>();
                stud.add(new Student(1, "c languange", 80));
                stud.add(new Student(2, "database", 82));
                stud.add(new Student(3, "java", 76));
                stud.add(new Student(4, "python", 89));
                stud.add(new Student(5, "oracle", 87));
                stud.add(new Student(6, "javascript", 65));
                stud.add(new Student(7, "react js", 74));
                stud.add(new Student(8, "Angular js", 62));
              
              
              System.out.println("Sort by the subject Name is given below");
              System.out.println();
                Collections.sort(stud, new sortbysubjectName());
                for(Student st:stud)
                System.out.println(st);
                
                
                System.out.println();
                System.out.println();
                
                Collections.sort(stud, new sortbyRollno());
                System.out.println("Sort by the Rollno is given below");
                for(Student st:stud)
                System.out.println(st);
               
                System.out.println();
                System.out.println();
            
                
                Collections.sort(stud, new sortbyMarks());
                System.out.println("Sort by the marks is given below");
                for(int i=0 ; i<stud.size();i++)
                System.out.println(stud.get(i));
                
        }
    }