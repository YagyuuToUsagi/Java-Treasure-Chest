package dankesttourismprogram;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author brianaranda, danielnilo
 */
public class DatabaseConnect {
    public static void main (String args []) {

String userid = "Caranda";

String pwd = "Killertaker619";

String dbUrl = "jdbc:oracle:thin:@isoracle.hpu.edu:1521:isoracle";

String sql = "select dname from dept order by dname";

 

try{

DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());

Connection conn = DriverManager.getConnection(dbUrl, userid, pwd);

 

// Query the department names

   Statement stmt = conn.createStatement ();

    ResultSet rset = stmt.executeQuery (sql);

 

// Print the names out

    while(rset.next ())

       System.out.println (rset.getString ("dname"));

 

// Close up

      rset.close();

      stmt.close();

      conn.close();

}

 

catch(SQLException e) {

System.out.println("Database error." + e.getMessage());

}

  }

}


