import java.sql.*;

public class jdbc7{
    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","anas2002");
        CallableStatement stmt=con.prepareCall("{call my_procedure(?,?)}");
        stmt.setString(1,"pussy");
        stmt.setInt(2,10);

        stmt.executeUpdate();
        System.out.println("\nProcedure called");
        con.close();
    }
}

//Callable Statement
