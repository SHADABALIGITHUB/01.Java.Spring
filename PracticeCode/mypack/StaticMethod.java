package PracticeCode.mypack;
class AnotherClass{

    int data;
    static String member="We Are animals not dogs";

    static void start(){
        System.out.println(member);
        // System.out.println(data);  can'not call non static here below i show how can we use in say method


    }
    static void say(AnotherClass obj){  
        //  need of object reference 
        System.out.println(member+ " Number of Animals"+ obj.data);
    }

}

public class StaticMethod {



    public static void main(String[] args) {

        AnotherClass obj1=new AnotherClass();

        obj1.data=2300;
    

        // AnotherClass obj2=new AnotherClass();

        AnotherClass.start();

        // call reference method

        AnotherClass.say(obj1);
        

    }
    
}
