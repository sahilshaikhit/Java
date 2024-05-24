import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try {

            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsimulator","root","Tejas@12345");
            s=c.createStatement();

        }catch (Exception e){

            System.out.println(e);
        }
    }
    public static void main(String[] args) {
    }
}
