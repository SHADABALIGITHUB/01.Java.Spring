package PracticeCode.mypack;
// import java.util.*;

 class Car {


    public void run(){
        System.out.println("I can run");
    }
    public void average(int n){

        System.out.println("i provide an Average of :"+n);
    }



    
    
}
 class AdvCar extends Car {

    public void autodrive(){
        System.out.println("Advance car");
    }
    
}

public class Inheritance extends AdvCar{

    public static void main(String[] args) {

        //  Scanner sc=new Scanner(System.in);
        //  int a=sc.nextInt();
        int a=20;
        

          Inheritance obj=new Inheritance();

          obj.average(a);
          obj.autodrive();


        
    }
    
}

//  mutiple inheritance in java not supported why ? answer 

//   as we have a two parent classes we have two same name methods in parent so child get confuse which parent method should i take.
//   ambuguity 
