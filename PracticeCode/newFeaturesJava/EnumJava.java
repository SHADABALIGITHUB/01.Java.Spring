package PracticeCode.newFeaturesJava;
enum A{
    Shadab("devloper"),Faisal("Programmer"),Mohit("DataBase Engg."),zakir("Networking engg.");

    private String position;

    private A(String str){
       position=str;
    }
    public String getposition(){
        return position;
    }
    public void setposition(String data){
        position=data;
    }

}

public class EnumJava {

    public static void main(String[] args) {
        // A obj=A.Shadab;
        // System.out.println(obj+" : "+obj.getposition());

           for(A obj:A.values()){
              System.out.println(obj+" : "+obj.getposition());
           }
    }

    



    
}
