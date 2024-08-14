package PracticeCode.CollectionInJava;

import java.util.*;

public class ListofSet {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>();

        set.add(3);
        set.add(4);
        set.add(5);
        set.add(3);
        set.add(7);
        set.add(3);
        set.add(9);
        set.add(3);

        for(int st:set){
            System.out.println(st);
        }

    }

}
