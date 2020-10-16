
package cap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection(){
//        try{
//            Connection c;
//            
//            String banco = System.getenv("banco");
//            
//            if("mysql".equals(banco)){
//                c = DriverManager.getConnection("jdbc:mysql://localhost/users?allowPublicKeyRetrieval=true&useTimezone=true&serverTimezone=UTC&useSSL=false", 
//                    "root", "1234");
//            } else{
//                c = DriverManager.getConnection("jdbc:postgres://localhost/users?allowPublicKeyRetrieval=true&useTimezone=true&serverTimezone=UTC&useSSL=false", 
//                    "root", "1234");
//            }
//            
//            return c;
//            
//        } catch (SQLException e){
//            throw new RuntimeException(e);
//        }  
        try{
            Connection c;
            
            
            c = DriverManager.getConnection("jdbc:mysql://localhost/users?allowPublicKeyRetrieval=true&useTimezone=true&serverTimezone=UTC&useSSL=false", 
               "root", "1234");
            
            return c;
            
        } catch (SQLException e){
            throw new RuntimeException(e);
        }  
    }
}
