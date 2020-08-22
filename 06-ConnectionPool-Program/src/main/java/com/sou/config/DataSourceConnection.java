package com.sou.config;

import org.apache.commons.dbcp2.BasicDataSource;

public class DataSourceConnection {
	private static final String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String DB_USER = "usersou";
	private static final String DB_PWD = "usersou";

	private  BasicDataSource basicDs=new BasicDataSource();//just eager instantiation
	private static DataSourceConnection ds;
   // private static Connection connection;
	private DataSourceConnection() {
		System.out.println("DataSourceConnection.DataSourceConnection()");
		//Prevent form the reflection api.
        if (ds != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
		
		//Connection related properties
		basicDs.setDriverClassName(DRIVER_CLASS);
		basicDs.setUrl(DB_CONNECTION_URL);
		basicDs.setUsername(DB_USER);
		basicDs.setPassword(DB_PWD);

		//DS related properties
		basicDs.setInitialSize(10);
		basicDs.setMaxIdle(15);
		basicDs.setMinIdle(5);
		basicDs.setMaxTotal(20);
    
	}

	public synchronized static DataSourceConnection getInstance() {
		System.out.println("DataSourceConnection.getInstance()");
		if (ds==null)
			ds=new DataSourceConnection();
     
		return ds;
		
	}
	
	//static method for getting instance
	public BasicDataSource getBasicDs() {
		return basicDs;
	}

	public void setBasicDs(BasicDataSource basicDs) {
		this.basicDs = basicDs;
	}


}//class
