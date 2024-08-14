package PracticeCode.Exception;

import java.io.*;

public class TryWithResource {

    public static void main(String[] args) throws Exception{

        try(BufferedReader bf=new BufferedReader(new InputStreamReader(System.in))){
            int num=Integer.parseInt(bf.readLine());

            System.out.println(num);
           }
            
    }
    
}
