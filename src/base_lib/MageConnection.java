package base_lib;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Connection;

/**
 * @author CatDevil
 *
 */

public class MageConnection 
{
	public Connection conn = null;
	public Statement statmt = null;
	public ResultSet resSet = null;
	private String db_Name = "h136894_mage_base";
	private String db_UserName = "h136894_client";
	private String db_Password = "6953472789";
	
	public Connection getConnection() throws ClassNotFoundException, SQLException
	{
	   try
	   {
	      String driver = "com.mysql.jdbc.Driver";	  
	      String url = "jdbc:mysql://h136894.s26.test-hf.su/" + db_Name + "?user=" + db_UserName + "&password=" + db_Password + "&useUnicode=true&characterEncoding=UTF-8";
	        
	      Class.forName(driver);
	      conn = (Connection) DriverManager.getConnection(url);
	      statmt = ((Connection) conn).createStatement();
	      System.out.println("Connection with database <<MAGE_Packets>> is stable...");
	      return conn;
	   } 
	      
	      catch(Exception ex) 
	      {
	    	System.err.println("Database's <<MAGE_Packets>> error with message: " + ex.getMessage());
	      }
	        
	      return null;
     }
	
	public String getBaseName()
	{
		return db_Name;
	}
	
	public void closeConn() throws Throwable
	{
	  conn.close();
	  statmt.close();
	  resSet.close();
	  System.out.println("Database's <<MAGE_Packets>> connection was closed...");
	}
}
