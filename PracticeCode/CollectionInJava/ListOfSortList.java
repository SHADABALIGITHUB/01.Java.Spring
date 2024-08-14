package PracticeCode.CollectionInJava;
import java.util.*;

public class ListOfSortList{

    public static void main(String[] args) {
        
        List<Integer> nums=new ArrayList<Integer>();

        nums.add(23);
        nums.add(40);
        nums.add(45);
        
        Collections.sort(nums);

        nums.forEach(n->{
            System.out.println(n);
        });

        
        
    }

}