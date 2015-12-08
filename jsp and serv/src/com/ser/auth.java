package com.ser;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class auth{
  public static void main(String[] args)
   throws IOException,SQLException{
   /*Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
   SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

    This would insert one record in Employee table. 
   System.out.println("Going to insert record.....");
   Employee em = new Employee(99,"yogita", "thegreat", 5000);

   smc.insert("Employee.insert", em);

   System.out.println("Record Inserted Successfully ");
*/
  }

public void authenticate(String userid, String password) {
	// TODO Auto-generated method stub
	Reader rd;
	try {
		rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

		   /* This would insert one record in Employee table. */
		   System.out.println("Going to insert record.....");
		   Employee em = new Employee(779,"yogita", "thegreat", 5000);

		   smc.insert("Employee.insert", em);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  

	   System.out.println("Record Inserted Successfully ");
}
} 