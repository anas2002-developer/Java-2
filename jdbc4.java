import java.sql.*;

public class jdbc4 {
    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","anas2002");
        Statement stmt=con.createStatement();
        int count1=stmt.executeUpdate("UPDATE JAVASQL SET NAME='BATAK' WHERE NAME='SHRUTI'");
        int count2=stmt.executeUpdate("DELETE FROM JAVASQL WHERE NAME='SEMCY'");

        System.out.println(count1+count2+" rows affected");
        System.out.println("Table Updated");
        con.close();
    }
}

//Table updated
