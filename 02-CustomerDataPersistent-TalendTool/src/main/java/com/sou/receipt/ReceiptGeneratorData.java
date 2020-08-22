package com.sou.receipt;

import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

@Component
public class ReceiptGeneratorData {

	public String generateReceiptData() {
		Random random=null;
		FileWriter fw=null;

		int policyNo;
		List<String> policyName=null;
		long receiptDate;
		List<String> paymentMode=null;
		int chequeNo;
		long chequeDate;
		int chequeAmt;
		int excessPremiumPaid;
		int premiumAmt;
		int depositeAmt;
		int serviceTax;
		int eduCessNo;
		int totalPremium;
		int totalFundValue;
		List<String> payAbleBy=null;
		List<String> premiumPayFrequency;
		int premiumPayment;
		int annualPayment;
		List<String> policyStatus;
		List<String> reason;
		List<String> remark;
		long dueDate;
		long nextPremiumDueDate;
		int totPremium;
		List<String> Life_assured_name;
		int Customer_id;
		int receipt_no;
		List<String> base_plan_product_name;
		int base_premium_paid;
		int base_premium_paid_tax;
		int base_premium_due;
		List<String> base_premium_tax_section;
		List<String> rider_name_1;
		int rider_premium_paid_1;
		int rider_premium_paid_1_tax;
		int rider_premium_due_1;
	    List<String> rider_tax_section_1;
		List<String> processed_flag;
		long processed_date;
		long inser_dt_tm;



		try {

			random=new Random();

			//policy name
			policyName=new ArrayList<String>();
			policyName.add("HeartBeat");
			policyName.add("iHealthPlan");
			policyName.add("HealthSuraksha");
			policyName.add("LifePayMoneyBack");

			//Payment status
			paymentMode=new ArrayList<String>();
			paymentMode.add("email");
			paymentMode.add("online");
			paymentMode.add("cash");

			//payable by
			payAbleBy=new ArrayList<String>();
			payAbleBy.add("HeartBeat");
			payAbleBy.add("iHealthPlan");
			payAbleBy.add("HealthSuraksha");
			payAbleBy.add("LifePayMoneyBack");

			//premiumPayFrequency
			premiumPayFrequency=new ArrayList<String>();
			premiumPayFrequency.add("half-yearly");
			premiumPayFrequency.add("yearly");
			premiumPayFrequency.add("quarterly ");

			//policyStatus
			policyStatus=new ArrayList<String>();
			policyStatus.add("PREMIUM");
			policyStatus.add("NON-PREMIUM");

			//reason
			reason=new  ArrayList<String>();
			reason.add("Personal-liberty");
			reason.add("educational ");
			reason.add("Health");

			//remark
			remark=new ArrayList<String>();
			remark.add("Please-pay-your-installment");
			remark.add("Its Good");

			Life_assured_name=new ArrayList<String>();
			Life_assured_name.add("Sourabh");
			Life_assured_name.add("Raja");
			Life_assured_name.add("Shubham");
			Life_assured_name.add("Sona");
			Life_assured_name.add("Raja");
			Life_assured_name.add("Surendra");
			
			//base_plan_product_name
			base_plan_product_name=new  ArrayList<String>();
			base_plan_product_name.add("Life-Cover");
			base_plan_product_name.add("Health-Insurance");
			base_plan_product_name.add("Car-Insurance");
			base_plan_product_name.add("Property-Insurance");
			
			//base_premium_tax_section
			base_premium_tax_section=new ArrayList<String>();
			base_premium_tax_section.add("80CCC");
			base_premium_tax_section.add("120CC");
			base_premium_tax_section.add("80BB");
			
			
			//rider_name_1
			rider_name_1=new ArrayList<String>();
			rider_name_1.add("Critical-illness-rider");
			rider_name_1.add("Disability-rider");
			rider_name_1.add("Accidental-death-benefit-rider");
			rider_name_1.add("Term-rider");
			
			
			//rider_tax_section_1
			rider_tax_section_1=new ArrayList<String>();
			rider_tax_section_1.add("80CCC");
			rider_tax_section_1.add("50BC");
			rider_tax_section_1.add("150CB");
			
			//processed_flag
			processed_flag=new ArrayList<String>();
			processed_flag.add("TRUE");
			processed_flag.add("FALSE");
			
			
			


			for (int i = 1; i < 10000; i++) {
				fw=new FileWriter("RECEIPTDATA1.csv", true);	

				policyNo=i;

				//generate date random date between the range
				LocalDate startDate = LocalDate.of(1990, 1, 1); //start date
				long start = startDate.toEpochDay();
				LocalDate endDate =LocalDate.of(2019, 1, 1);//end date
				long end = endDate.toEpochDay();
				receiptDate = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();

				//Cheque no
				chequeNo=ThreadLocalRandom.current().nextInt(100000000, 1000000000);

				//Cheack Date
				LocalDate startDate1 = LocalDate.of(2019, 1, 1); //start date
				long start1 = startDate1.toEpochDay();
				LocalDate endDate1 =LocalDate.of(2020, 1, 1);//end date
				long end1 = endDate1.toEpochDay();
				chequeDate = ThreadLocalRandom.current().longs(start1, end1).findAny().getAsLong();

				//chequeAmt
				chequeAmt=ThreadLocalRandom.current().nextInt(1000, 10000);

				//excessPremiumPaid
				excessPremiumPaid=ThreadLocalRandom.current().nextInt(10000, 20000);

				//premiumAmt
				premiumAmt=ThreadLocalRandom.current().nextInt(10000, 20000);

				//depositeAmt
				depositeAmt=ThreadLocalRandom.current().nextInt(1000, 20000);

				//serviceTax
				serviceTax=ThreadLocalRandom.current().nextInt(100, 2000);

				//eduCessNo
				eduCessNo=ThreadLocalRandom.current().nextInt(100, 200);

				//totalPremium
				totalPremium=premiumAmt+excessPremiumPaid;

				//totalFundValue
				totalFundValue=ThreadLocalRandom.current().nextInt(20000, 500000);


				//premiumPayment
				premiumPayment=ThreadLocalRandom.current().nextInt(20000, 500000);

				//annual payment
				annualPayment=12*premiumPayment;

				//dueDate
				LocalDate startDate2 = LocalDate.of(2019, 1, 1); //start date
				long start2 = startDate2.toEpochDay();
				LocalDate endDate2 =LocalDate.of(2020, 1, 1);//end date
				long end2 = endDate2.toEpochDay();
				dueDate = ThreadLocalRandom.current().longs(start2, end2).findAny().getAsLong();


				//nextPremiumDueDate
				LocalDate startDate3 = LocalDate.of(2020, 1, 1); //start date
				long start3 = startDate3.toEpochDay();
				LocalDate endDate3 =LocalDate.of(2021, 1, 1);//end date
				long end3 = endDate3.toEpochDay();
				nextPremiumDueDate = ThreadLocalRandom.current().longs(start3, end3).findAny().getAsLong();

				//totPremium
				totPremium=premiumPayment+premiumAmt;
				
				//Customer_id
				Customer_id=ThreadLocalRandom.current().nextInt(1, 10000);
				
				//receipt_no
				receipt_no=ThreadLocalRandom.current().nextInt(1, 10000);
				
				//base_premium_paid
				base_premium_paid=ThreadLocalRandom.current().nextInt(20000, 50000);
				
				//base_premium_paid_tax
				base_premium_paid_tax=ThreadLocalRandom.current().nextInt(1000, 5000);
				
				//base_premium_due
				base_premium_due=base_premium_paid-15000;
				
				//rider_premium_paid_1
				rider_premium_paid_1=ThreadLocalRandom.current().nextInt(10000, 50000);
				
				//rider_premium_paid_1_tax
				rider_premium_paid_1_tax=rider_premium_paid_1-90000;
				
				
				//rider_premium_due_1
				rider_premium_due_1=rider_premium_paid_1-5000;
				
				
				//processed_date
				LocalDate startDate4 = LocalDate.of(2020, 1, 1); //start date
				long start4 = startDate4.toEpochDay();
				LocalDate endDate4 =LocalDate.of(2021, 1, 1);//end date
				long end4 = endDate4.toEpochDay();
				processed_date = ThreadLocalRandom.current().longs(start4, end4).findAny().getAsLong();

				
				
				//inser_dt_tm
				LocalDate startDate5 = LocalDate.of(2020, 1, 1); //start date
				long start5 = startDate5.toEpochDay();
				LocalDate endDate5 =LocalDate.of(2021, 1, 1);//end date
				long end5 = endDate5.toEpochDay();
				inser_dt_tm = ThreadLocalRandom.current().longs(start5, end5).findAny().getAsLong();
				
				
				







				//writing data into file
				fw.write(policyNo+","+policyName.get(random.nextInt(policyName.size()))+","+LocalDate.ofEpochDay(receiptDate)+","
						+paymentMode.get(random.nextInt(paymentMode.size()))+","+chequeNo+","+LocalDate.ofEpochDay(chequeDate)+","+
						chequeAmt+","+excessPremiumPaid+","+premiumAmt+","+	depositeAmt+","+serviceTax+","+eduCessNo+","+totalPremium+","+
						totalFundValue+","+payAbleBy.get(random.nextInt(payAbleBy.size()))+","+premiumPayFrequency.get(random.nextInt(premiumPayFrequency.size()))
						+","+premiumPayment+","+annualPayment+","+policyStatus.get(random.nextInt(policyStatus.size()))+","+reason.get(random.nextInt(reason.size()))+","+
						remark.get(random.nextInt(remark.size()))+","+dueDate+","+LocalDate.ofEpochDay(nextPremiumDueDate)+","+totPremium+","+Life_assured_name.get(random.nextInt(Life_assured_name.size()))
						+","+Customer_id+","+receipt_no+","+base_plan_product_name.get(random.nextInt(base_plan_product_name.size()))
						+","+base_premium_paid+","+base_premium_paid_tax+","+base_premium_due+","+base_premium_tax_section.get(random.nextInt(base_premium_tax_section.size()))
						+","+rider_name_1.get(random.nextInt(rider_name_1.size()))+","+rider_premium_paid_1+","+rider_premium_paid_1_tax+","+
						rider_premium_due_1+","+rider_tax_section_1.get(random.nextInt(rider_tax_section_1.size()))+","+
						processed_flag.get(random.nextInt(processed_flag.size()))+","+LocalDate.ofEpochDay(processed_date)+","+
						LocalDate.ofEpochDay(inser_dt_tm));
				fw.write("\n");

				//close the file writer
				fw.close();



			}//for











		} catch (Exception e) {
			// TODO: handle exception
		}




		return "";
	}//genratereceiptData






}//class
