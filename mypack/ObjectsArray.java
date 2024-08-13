package mypack;
class Student{
     
        int rollno;
        String name;
        int marks;
}
public class ObjectsArray {

    

    public static void main(String[] args) {
        
         Student s1=new Student();
         s1.rollno=1;
         s1.marks=90;
         s1.name="Sid";

         Student s2=new Student();
         s2.rollno=2;
         s2.marks=90;
         s2.name="pop";

         Student s3=new Student();
         s3.rollno=3;
         s3.marks=90;
         s3.name="money";

         Student students[]=new Student[4];
         students[0]=s1;
         students[1]=s2;
         students[2]=s3;
         students[3]=s1;

         for(int i=0;i<students.length;i++){
            System.out.println(students[i].name);
         }


    }
    
}
