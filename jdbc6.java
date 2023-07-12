import java.sql.*;

public class jdbc6 {
    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","anas2002");
        PreparedStatement stmt=con.prepareStatement("SELECT * FROM JAVASQL");
        ResultSet rs=stmt.executeQuery();

        while(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(2));
        }
        System.out.println(rs.getRow()+"\nRows selected");
        con.close();
    }
}

//Prepared Statement + Result set
