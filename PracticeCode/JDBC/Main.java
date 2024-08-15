// package PracticeCode.JDBC;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Shadab";
        String uname = "root";
        String pass = "Shadab89@";
        String query = "SELECT * FROM user";
        System.out.println("Enter 0 to read data Otherwise Anythig to Enter");
        Scanner sc=new Scanner(System.in);
        String new_user=sc.nextLine();
        String  insert="INSERT INTO user (name) VALUES (?)";
        Connection con=null;
        Statement st=null;
        PreparedStatement pre=null;
        
        // System.out.println( new_user);   

       
        

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            con = DriverManager.getConnection(url, uname, pass);

            // Create a statement
           
          

         if(!new_user.equals("0")){

                pre=con.prepareStatement(insert);
                pre.setString(1, new_user);
                pre.executeUpdate();
                System.out.println("Data Insert Succesfully");


            }
            else{
            st = con.createStatement();
            // Execute the query
            ResultSet result = st.executeQuery(query);

            // // Process the result
            while (result.next()) {
                String name = result.getString("name");
                System.out.println("Name: " + name);
            }
           }
          
            
            if(st!=null)st.close();
            if(pre!=null)pre.close();
            con.close();
            sc.close();

            // // Close resources
           
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
       
    }
    
}
