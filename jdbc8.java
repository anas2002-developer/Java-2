import java.sql.*;

public class jdbc8 {
    public static void main(String[] args) throws Exception{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con= DriverManager.getConnection("jdbc:odbc:mydsn");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("SELECT * FROM JAVASQL");

        while(rs.next()){
            System.out.println(rs.getString(1));
        }
        System.out.println(rs.getRow()+"\nRows selected");
        con.close();
    }
}

//DSN (Data Source Name)
