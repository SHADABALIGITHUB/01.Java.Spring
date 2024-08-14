package PracticeCode.mypack;


public class INTEGERCLASS {    

    public static void main(String[] args) {

         String str="123A";


         try{

         int num=Integer.parseInt(str);

         System.out.println(num);
        

         }
         catch(Exception e){

         System.out.println("Cannot possible to convert");


         }

         
    }
    
}
