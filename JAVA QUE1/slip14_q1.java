// Write a program to create JDBC connection. On successful connection with database display appropriate message to user.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class slip14_q1 {
    public static void main(String[] args) {
        String databaseUrl="jdbc:mysql://localhost:3306/test";
        String user="root";
        String password="root123";
        Connection conn=null;
        try{
            conn=DriverManager.getConnection(databaseUrl, user, password);
            if(conn!=null){
                System.out.println("connected to the database");
            }
        }
        catch(SQLException ex){
            System.out.println("\nerror occurred");
            ex.printStackTrace();
        }
        finally{
            if(conn!=null){
                try{
                    conn.close();
                }
                catch(SQLException ex){
                    ex.printStackTrace();
                }
            }

        }
    }
}
