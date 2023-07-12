import java.sql.*;

public class jdbc2 {
    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","anas2002");
        Statement stmt=con.createStatement();
        stmt.executeUpdate("INSERT INTO JAVASQL VALUES('SHRUTI',7060,20)");
        stmt.executeUpdate("INSERT INTO JAVASQL VALUES('PALKI',7060,20)");
        stmt.executeUpdate("INSERT INTO JAVASQL VALUES('NIKHIL',7060,20)");
        stmt.executeUpdate("INSERT INTO JAVASQL VALUES('SEMCY',7060,20)");

        System.out.println("Rows Inserted");
        con.close();
    }
}

//INSERT RECORDS
