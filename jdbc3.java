import java.sql.*;

public class jdbc3 {
    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","anas2002");
        Statement stmt=con.createStatement();
        stmt.executeUpdate("DROP TABLE JAVASQL");

        System.out.println("Table Dropped");
        con.close();
    }
}

//Table dropped
