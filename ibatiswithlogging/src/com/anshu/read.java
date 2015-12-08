package com.anshu;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class read{
  public static void main(String[] args)
   throws IOException,SQLException{
   Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
   SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

   /* This would read all records from the Employee table. */
   System.out.println("Going to read records.....");
   Employee ee=new Employee();
   ee.setIdentity(979);
   List <Employee> ems = (List<Employee>)
                        smc.queryForList("Employee.getAll", ee);
   Employee em = null;
   for (Employee e : ems) {
      System.out.print("  " + e.getIdentity());
      System.out.print("  " + e.getFirstName());
      System.out.print("  " + e.getLastName());
      System.out.print("  " + e.getSalary());
      em = e;
      System.out.println("");
   }    

   System.out.println("Records Read Successfully ");

  }
} 