public class Hello{
     public static void main(String[] args) {
       int a [][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

       for (int[] i: a) {
          
          for(int v:i){
             System.out.print(v);
          }
          System.out.println();
        
       }

    }
}