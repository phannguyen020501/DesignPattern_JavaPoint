package CreationalPattern.SingletonPattern.RealExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try{
            Connection con = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","phannguyen01");
            System.out.println(con);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
