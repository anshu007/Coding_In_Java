package com.jdbc;
import java.sql.*;  
class delete{  
public static void main(String args[])throws Exception{  
  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@mahan07-i89014:1521:database777","anshug7","oracle");  
Statement stmt=con.createStatement();  
  
//stmt.executeUpdate("insert into emp765 values(33,'Irfan',50000)");  
//int result=stmt.executeUpdate("update emp765 set name='Vimal',salary=10000 where id=33");  
int result=stmt.executeUpdate("delete from anshu where id=33");  
  
System.out.println(result+" records affected");  
con.close();  
}}