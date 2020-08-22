package com.sou;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.sou.beans.CustomerData;
import com.sou.receipt.ReceiptGeneratorData;

@SpringBootApplication
public class Application {
	

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		try {
			ctx = SpringApplication.run(Application.class, args);
			CustomerData customerData = ctx.getBean(CustomerData.class);
		    customerData.insertDataIntoFile();
		    
		    ReceiptGeneratorData receiptGeneratorData = ctx.getBean(ReceiptGeneratorData.class);
		    receiptGeneratorData.generateReceiptData();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main

}//class
