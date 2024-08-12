package Starting_code;
public class String_normal {

    public static void main(String[] args) {

        String str="Shadab";
        String me="Shadab";
        String str2="SHADAB";

        System.out.println(str.hashCode());
        System.out.println(me.hashCode());
        System.out.println(str2.hashCode());

        String str3=str;
        
        me=me+"Hello";

        System.out.println(str+" : "+me+" : "+str2+" :: "+str3);

        System.out.println(str.hashCode());
        System.out.println(me.hashCode());
        System.out.println(str2.hashCode());
        
    }
    
}
