package PracticeCode.mypack;
class Parent{
    public void start(){
        System.out.println("Parent");
    }
}

public class OverridingJava extends Parent {

   @Override public void start(){
       
        System.out.println("Child");
    }

    public static void main(String[] args) {

         OverridingJava obj=new OverridingJava();
         obj.start();
        
    }
    
}
