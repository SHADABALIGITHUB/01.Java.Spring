package PracticeCode.CollectionInJava;

import java.util.*;

public class ListOfTreeSet {

    public static void main(String[] args) {

        Collection<Integer> nums=new TreeSet<Integer>();
        nums.add(20);
        nums.add(21);
        nums.add(3);
        nums.add(19);


//    1.) loop 
        // for(int n:nums){

        //       System.out.println(n);
        // }

    // 2.) Iteration

          Iterator<Integer> it=nums.iterator();

          while(it.hasNext())
            System.out.println(it.next());

        //  output 3,9,20,21 
        
    }
    
}
