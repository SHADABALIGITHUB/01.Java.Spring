package PracticeCode.Packageinside;
public class Parent {

    //  default 
    // int result;  default working here

    //  private 
    // private int result;
    // not able to get outside the class 

    //    protected
    protected int result;
    //  access inside a child of this parent 

    // public 

    // public int result;
    // anywhere 
   

    



    public void say(){
       System.out.println("working ...."+result);
    }
    
}
