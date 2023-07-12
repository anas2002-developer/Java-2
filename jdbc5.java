import java.sql.*;

public class jdbc5 {
    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","anas2002");
        PreparedStatement stmt=con.prepareStatement("UPDATE JAVASQL SET NAME=? WHERE NAME=?");
        stmt.setString(1,"PALKI NANDA");
        stmt.setString(2,"PALKI");

        int count=stmt.executeUpdate();
        System.out.println(count+" rows affected");
        System.out.println("Table Updated");
        con.close();
    }
}

//Prepared Statement
