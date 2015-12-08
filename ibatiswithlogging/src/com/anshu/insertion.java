package com.anshu;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import java.io.*;
import java.sql.SQLException;

public class insertion {
	public static void main(String[] args) throws IOException, SQLException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		System.out.println("Going to insert record.....");
		Employee em = new Employee(99699, "anshu", "thegreat", 5000);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		smc.insert("Employee.insert", em);
		System.out.println(em.getFirstName());
	}
}
