package mypack;
public class Constructor {
    private String n;
    Constructor(String name){
        n=name;
        System.out.println("before");
        call();
        System.out.println("After");
    }
    public void call(){
        System.out.println("I will : "+n);
    }
    public static void main(String[] args) {
        
         Constructor ob=new Constructor("make");

         System.out.println();

           
              
    }
    
}
