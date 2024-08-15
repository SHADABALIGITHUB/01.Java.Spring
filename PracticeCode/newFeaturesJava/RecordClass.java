package PracticeCode.newFeaturesJava;

record A(int n){  }

class B{
    private int n;

    public B(int n){
       this.n=n;
    }
    public String toString(){
        return Integer.toString(n);
    }
}


public class RecordClass {

    public static void main(String[] args) {


        
           A obj=new A(20);
           B obj2=new B(20);

           System.out.println(obj);
           System.out.println(obj2);

        //    output
        
        // A[n=20]
        // B@5cad8086






    }
    
}
