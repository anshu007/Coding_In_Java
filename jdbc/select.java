package com.jdbc;

import java.sql.*;
class select{  
public static void main(String args[]){  
try{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@anshu-saas:1521:orcl","risk30","risk30");  
  

/*Statement statement = con.createStatement();
 String d="10-Dec-2014";
 String username="mahan07";
 String orgname="DEFAULTORG";
 int dmdv=81;
for (int i=1;i<10;i++) {
    String query = "insert into arwfauthauditlog(DMDV,ORGNAME,USERNAME,TXNID,DATECREATED) values("+ "'" + dmdv +"'" +","+ "'" + orgname +"'" +","+ "'" + username +"'" +","+ i +","+ "'" + d +"'" +")";
    statement.addBatch(query);
}
String sql = "SELECT * from arwfauthauditlog";
ResultSet rs = statement.executeQuery(sql);
while(rs.next()){
    //Retrieve by column name
    String last = rs.getString("CREDID");
    if(last==", Last: DEFAULTORG"){
    	System.out.println("hha");
    }
    System.out.println(", Last: " + last);
 }
 rs.close();*/

//"insert into arwfauthauditlog(TXNID,DATECREATED) values("+ 3 +","+ to_date('12/09/2014 18:30:00', 'mm/dd/yyyy hh24:mi:ss')")";


/*statement.executeBatch();
statement.close();*/
  
  
//step5 close the connection object  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}
