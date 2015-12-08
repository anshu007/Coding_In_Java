package com.anshu;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import java.io.*;
import java.sql.SQLException;

public class update {
	public static void main(String[] args) throws IOException, SQLException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

		Employee ee = new Employee();
		ee.setSalary(100000);
		ee.setIdentity(909);
		smc.update("Employee.update", ee);

	}
}