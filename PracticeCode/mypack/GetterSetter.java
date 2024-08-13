package PracticeCode.mypack;
class User{
    private int company;
    private String name;

    void setUser(int data,String n){
        company=data;
        name=n;
        //  we can use this for string n is also name
        // this.name=name;
    }
    int getRoll(){
        return company;
    }
    String getName(){
        return name;
    }
}

public class GetterSetter {

    public static void main(String[] args) {

              User obj=new User();

             obj.setUser(0, "Pokimon");
             System.out.println(obj.getName());
             System.out.println(obj.getRoll());

        
    }
    
}
