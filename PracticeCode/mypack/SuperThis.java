package PracticeCode.mypack;
class A{
    A(){
        // this();
        super();
        System.out.println("A");
    }
    A(int n){
        // super();
        this();
        System.out.println("A int");
    }

}
class B extends A{
     B(){
        super(20);
        System.out.println("B");
     }
     B(int n){
        this();
        System.out.println("B int");
     }
}

public class SuperThis {

    public static void main(String[] args) {

           new B(30);
        // new A();

        // B
        
    }
    
}
