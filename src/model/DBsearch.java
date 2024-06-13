package model;
import java.sql.ResultSet;
import java.sql.Statement;



/**
 *
 * @author HP
 */
public class DBsearch {
    Statement stmt;
 ResultSet rs;
public ResultSet searchLogin(String usName) {
 try {
 stmt = DBConnection.getStatementConnection();
 String name = usName;
//Execute the Query
rs = stmt.executeQuery("SELECT * FROM login where username='" 
+ name + "'");
 } catch (Exception e) {
 e.printStackTrace();
 }
 return rs;
 }

    
}
