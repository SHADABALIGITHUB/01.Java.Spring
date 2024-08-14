package PracticeCode.CollectionInJava;
import java.util.*;
public class ListOfMap {

    public static void main(String[] args) {

        Map<String,Integer> student=new HashMap<String,Integer>();
        student.put("Shadab",20);
        student.put("Asif",30);

        System.out.println(student.entrySet());

        
    }
    
}
