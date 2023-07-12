import java.sql.*;
import java.sql.DriverManager;

public class jdbc1 {
    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","anas2002");
        Statement stmt=con.createStatement();
        stmt.executeUpdate("CREATE TABLE JAVASQL(NAME VARCHAR2(12),MOB NUMBER, AGE NUMBER)");

        System.out.println("Table created");
        con.close();
    }
}

//CREATE TABLE