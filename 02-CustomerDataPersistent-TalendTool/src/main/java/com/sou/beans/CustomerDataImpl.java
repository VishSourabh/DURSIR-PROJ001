package com.sou.beans;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDataImpl implements CustomerData {

	@Override
	public String insertDataIntoFile() throws IOException {
		//create empty list collection for storing some dummy data

		int custId=0;

		List<String> custName=null;
		List<String> addrs1=null;

		List<String> state=null;
		List<String> country=null;
		int pinNo;
		long mobNo;
		String emailId; 
		List<String> email=null;
		String panNo; 
		List<String> gender=null;//list
		long birthDate;
		List<Integer> age=null;

		List<String> custType=null;//list
		List<String> kycStatus=null;//list
		List<String> deliveryChannel=null;

		List<String> processedFlag=null;
		Date processedDate; //list

		int checkNo;
		Date effectDate;   //list

		int polNumText; 
		int regNo;
		int engineNo; 
		int chassisNo;
		int coverNoteNo;
		int propsalNo;
		long endoresemenmtEffDate;

		List<Integer> docId=null;
		int vendorPriority; //list
		List<String> vandorName=null;//list
		String telephoneNo; 
		String nomineeName;//list
		List<String> relationship=null;//list
		long policyNo;
		long epolicyNo; 
		long issueDate;
		List<String> maker=null; 
		int modelNo; //list
		String bodyType; //list
		int manifactureYear; //list
		int sitingCapacity; //list
		float premiumAmount;
		long receiptDate;


		Random rand=null;
		FileWriter fw=null;
		int custRNum,addrRNum1,addrRNum2,stateRNum,countryRNum,ageRno;
		String name; //initials
		String namespart[];
		boolean flag=true;
		StringBuilder sb =null;


		try {

			//customer name  and Initials
			custName=new ArrayList<String>();
			custName.add("Smith");
			custName.add("Siya");
			custName.add("Anand");
			custName.add("Kapil");
			custName.add("Abhishek");
			custName.add("Tarun");
			custName.add("Subba");
			custName.add("Sachin");
			custName.add("Vinay");
			custName.add("Tesla");
			custName.add("Anamika");
			custName.add("Suraj");
			custName.add("Nikhil");
			custName.add("Neeraj");
			custName.add("Parul");
			custName.add("Sonali");

			//addrs1 | addrs2 | addrs3
			addrs1=new ArrayList<String>();
			addrs1.add("Bhopal");
			addrs1.add("pune");
			addrs1.add("hyd");
			addrs1.add("Banglore");
			addrs1.add("maysur");
			addrs1.add("Delhi");
			addrs1.add("Bombay");
			addrs1.add("Nagpur");
			addrs1.add("Los Angeles");
			addrs1.add("Houston");
			addrs1.add("Chicago");
			addrs1.add("Texas");
			addrs1.add("California");
			addrs1.add("Ohio");
			addrs1.add("Nevada");
			addrs1.add("Oregon");
			addrs1.add("Missouri");
			addrs1.add("Kentucky");

			//State
			state=new ArrayList<String>();
			state.add("Andhra Pradesh");
			state.add("Bihar");
			state.add("MP");
			state.add("UP");
			state.add("Gujarat");
			state.add("Jharkhand");
			state.add("Goa");
			state.add("Kerala");

			//Country

			country=new ArrayList<String>();
			country.add("Afghanistan");
			country.add("Albania");
			country.add("Brazil");
			country.add("India");
			country.add("Oman");
			country.add("Pakistan");
			country.add("Peru");

			//NSB to execute once

			age=new ArrayList<Integer>();


			for (int i = 15; i < 60; i++) {
				age.add(i);
			}



			//email extension
			email=new ArrayList<String>();
			email.add("@yahoo.com");email.add("@gmail.com");email.add("@rediff.co.in");


			//add gender
			gender=new ArrayList<String>();
			gender.add("Male");gender.add("Female");gender.add("Transgender");

			//CustomerType
			custType=new ArrayList<String>();
			custType.add("Potential ");custType.add("New ");custType.add("Impulsive");custType.add("Loyal ");


			//Types KYC status

			kycStatus=new ArrayList<String>();
			kycStatus.add("CustomerIdentificationProgram");kycStatus.add("CustomerDueDiligence");kycStatus.add("OngoingMonitoring");


			//deliveryChannel types
			deliveryChannel=new ArrayList<String>();
			deliveryChannel.add("G-Mail");deliveryChannel.add("courier");


			//processedFlag value
			processedFlag=new ArrayList<String>();
			processedFlag.add("true");processedFlag.add("false");

			//generate doc id
			//NSB

			docId=new ArrayList<Integer>();
			for (int i = 0; i < 50; i++){
				docId.add(i);
			}




			//List of Licensed Vendors
			vandorName=new ArrayList<String>();
			vandorName.add("ImprintInc");vandorName.add("ClubColorsBuyer");vandorName.add("BroderBros");
			vandorName.add("AlmaMaterLLC");vandorName.add("AuthenticStreeSignsInc");
			vandorName.add("DriStickDecalCorp");

			//relationship 
			relationship=new ArrayList<String>();
			relationship.add("SINGLE");relationship.add("MARRID");

			//maker
			maker=new ArrayList<String>();
			maker.add("RTA");maker.add("RTO");
			maker.add("Maruti.pvt");maker.add("sinoploxpvt");maker.add(" ACS ");


			rand=new Random();
			
			
			for (int i = 0; i < 10000; i++) {
				//generate some random number for different  list collection
				custRNum=rand.nextInt(custName.size());
				addrRNum1=rand.nextInt(addrs1.size());

				countryRNum=rand.nextInt(country.size());
				stateRNum=rand.nextInt(state.size());
				ageRno=rand.nextInt(age.size());

				pinNo=ThreadLocalRandom.current().nextInt(100000, 1000000);
				mobNo=ThreadLocalRandom.current().nextInt(1000000, 1000000000);
				//generate initials char
				name=custName.get(custRNum);
				namespart=name.split(" ");
				char initials1 = namespart[0].charAt(0);

				emailId=custName.get(custRNum)+""+age.get(ageRno)+""+email.get(rand.nextInt(email.size()));
				panNo=custName.get(custRNum).subSequence(0,3)+""+ThreadLocalRandom.current().nextInt(100, 1000)+""+initials1;

				//generate date
				LocalDate startDate = LocalDate.of(1990, 1, 1); //start date
				long start = startDate.toEpochDay();


				LocalDate endDate =LocalDate.of(2010, 1, 1);//end date
				long end = endDate.toEpochDay();

				birthDate = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
				System.out.println(LocalDate.ofEpochDay(birthDate)); // random date between the range


				//checkNo generation
				checkNo=ThreadLocalRandom.current().nextInt(100000000, 1000000000);

				//polNumText 
				polNumText=ThreadLocalRandom.current().nextInt(100, 1000);

				//registration
				regNo=ThreadLocalRandom.current().nextInt(1000, 5000);

				//endoresemenmtEffDate
				endoresemenmtEffDate = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
				System.out.println(LocalDate.ofEpochDay(endoresemenmtEffDate)); // random date between the range


				//engineNo
				engineNo=ThreadLocalRandom.current().nextInt(2000, 5000);;

				//chassisNo
				chassisNo=ThreadLocalRandom.current().nextInt(2000, 5000);
				//chassisNo
				coverNoteNo=ThreadLocalRandom.current().nextInt(1, 10000);

				// propsalNo
				propsalNo=ThreadLocalRandom.current().nextInt(100, 10000);


				//generate vendorPriority
				vendorPriority=ThreadLocalRandom.current().nextInt(1, 5);; //list


				telephoneNo="+0"+""+ThreadLocalRandom.current().nextInt(11, 95)+""+ThreadLocalRandom.current().nextInt(2000, 4000); 
				//String nomineeName;//list

				policyNo=ThreadLocalRandom.current().nextInt(1, 10000);
				epolicyNo=ThreadLocalRandom.current().nextInt(1, 10000); 

				//issueDate
				//generate date
				issueDate = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();



				//generate model number
				modelNo=ThreadLocalRandom.current().nextInt(100, 10000);

				bodyType="All"; //list

				manifactureYear=ThreadLocalRandom.current().nextInt(1990, 2020); //list
				sitingCapacity=ThreadLocalRandom.current().nextInt(1, 12); //list
				premiumAmount=ThreadLocalRandom.current().nextInt(15000, 1000000);



				//receiptDate
				receiptDate = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();



				custId=ThreadLocalRandom.current().nextInt(1, 10000);


				fw=new FileWriter("CUSTOMER_MASTER1.csv", true);


				fw.write(custId+","+initials1+","+custName.get(custRNum)+","+addrs1.get(addrRNum1)+","+addrs1.get(addrRNum1)+","
						+addrs1.get(addrRNum1)+","+addrs1.get(addrRNum1)+","+state.get(stateRNum)+","+country.get(countryRNum)+","+pinNo+","+mobNo+","+emailId+","+panNo+","
						+gender.get(rand.nextInt(gender.size()))+","+LocalDate.ofEpochDay(birthDate)+","+age.get(ageRno)+","+custType.get(rand.nextInt(custType.size()))+","+kycStatus.get(rand.nextInt(kycStatus.size()))
						+","+deliveryChannel.get(rand.nextInt(deliveryChannel.size()))+","+LocalDate.ofEpochDay(birthDate)/*Record insert date*/+","+processedFlag.get(rand.nextInt(processedFlag.size()))+","+
						LocalDate.ofEpochDay(birthDate)+","+checkNo+","+LocalDate.ofEpochDay(birthDate)+","+polNumText+","+regNo+","+engineNo+","+chassisNo+","+coverNoteNo+","+propsalNo+","+LocalDate.ofEpochDay(endoresemenmtEffDate)+
						","+docId.get(rand.nextInt(docId.size()))+","+
						vendorPriority+","+vandorName.get(rand.nextInt(vandorName.size()))+","+telephoneNo+","+custName.get(custRNum)/*nomineeName*/+","+relationship.get(rand.nextInt(relationship.size()))
						+","+policyNo+","+epolicyNo+","+LocalDate.ofEpochDay(issueDate)+","+maker.get(rand.nextInt(maker.size()))+","+modelNo+","+bodyType+","+
						manifactureYear+","+sitingCapacity+","+premiumAmount+","+LocalDate.ofEpochDay(receiptDate));
				

				fw.write("\n");

				flag=false;
				fw.close();


			}


		} catch (Exception e) {
			e.printStackTrace();
		}
		if (flag==true) {
			return "Data is not inserted  ";
		}else {
			return "Data is inserted";
		}

	}



}
