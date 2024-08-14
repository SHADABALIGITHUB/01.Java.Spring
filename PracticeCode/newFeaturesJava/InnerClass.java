package PracticeCode.newFeaturesJava;
class A{

    public void running(){
        System.out.println("I am running");
    }
    class B{

        public void innerfun(){

            System.out.println("i am inner class ");
            
        }
    }
}

public class InnerClass {

    public static void main(String[] args) {
        A obj=new A();
        A.B obj1=obj.new B();
        obj1.innerfun();
    
        
    }

    

   
    
    
}
