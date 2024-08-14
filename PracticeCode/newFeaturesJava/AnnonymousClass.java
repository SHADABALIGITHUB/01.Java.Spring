package PracticeCode.newFeaturesJava;
class A{
    public void say(){

       
    System.out.println("I am A class ");

    }
}

public class AnnonymousClass {

    public static void main(String args[]) {

        A obj=new A()
        {

            public void say()
            {
                System.out.println("I am from inner class");
            }
    
        };
        obj.say();
        
    }

   
    
}
