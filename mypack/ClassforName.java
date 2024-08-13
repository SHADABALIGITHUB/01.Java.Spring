package mypack;

class Fake{
    static {
        System.out.println("class Loaded");
    }
}

public class ClassforName {

    public static void main(String[] args) throws ClassNotFoundException {

        
        Class.forName("Fake");
        
    }
    
}
