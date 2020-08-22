package com.sou.test;



import java.sql.Connection;

import org.apache.commons.dbcp2.BasicDataSource;

import com.sou.config.DataSourceConnection;

public class ConnectionTest {

	public static void main(String[] args) {
		BasicDataSource basicDs,basicDs1 =null;
		Connection con=null;
		try {
			//get Datasource object
			basicDs = DataSourceConnection.getInstance().getBasicDs();
			basicDs1= DataSourceConnection.getInstance().getBasicDs();
			
			//get Connection object
			con=basicDs.getConnection();
			System.out.println(basicDs.getClass().hashCode());
			System.out.println(basicDs1.getClass().hashCode());


		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
