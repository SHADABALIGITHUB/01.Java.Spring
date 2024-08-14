package PracticeCode.Exception;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class TryAndFinally {
        public static void main(String[] args) throws Exception {

            // int num=System.in.read();
            // System.out.println(num); 
            
            BufferedReader bf=null;
            
           try{

           
            InputStreamReader in=new InputStreamReader(System.in);

            bf=new BufferedReader(in);

            int num=Integer.parseInt(bf.readLine());

            System.out.println(num);

           }

           finally{
            bf.close();
           }

            

        }
        
    }
