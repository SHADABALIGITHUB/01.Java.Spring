package PracticeCode.newFeaturesJava;
abstract class A{


    public abstract void say();
}

public class AnnonymousClass2 {

    public static void main(String[] args) {

        A obj=new A(){
            public void say(){
                System.out.println("Here i am ");
            }

          };obj.say();
        
    }
    
}
