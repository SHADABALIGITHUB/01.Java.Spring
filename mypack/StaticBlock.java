package mypack;
// package Starting_code;


// Direct without static 


// class Mobile{
//     int  value;
//     String brand;
//     String Company;



//     public void say(){
//         System.out.println("We are from"+brand+" with values"+ value+" From  company "+Company);
//     }
// }

// public class StaticBlock {
  
//         public static void main(String[] args) {
//         Mobile obj=new Mobile();
//         obj.brand="Samsung" ;
//         obj.value=2300;
//         obj.Company="Realmi";
//         obj.say();

//         Mobile obj2=new Mobile();
//         obj2.brand="Jio" ;
//         obj2.value=12300;
//         obj2.Company="Apple";
//         obj2.say();



       
        
//     }

    
// }


// static code  


class Mobile{
    int  value;
    String brand;
    static String Company;

    Mobile(){
        value=0;
        brand="default";
        // Company="Xyz";
    }

    static{

        Company="Xyz";

    }



    public void say(){
        System.out.println("We are from"+brand+" with values"+ value+" From  company "+Company);
    }
}

public class StaticBlock {
  
        public static void main(String[] args) {
        Mobile obj=new Mobile();
        obj.brand="Samsung" ;
        obj.value=2300;
        Mobile.Company="Realmi";
        obj.say();

        Mobile obj2=new Mobile();
        obj2.brand="Jio" ;
        obj2.value=12300;
        Mobile.Company="Apple";
        obj2.say();



       
        
    }

    
}

