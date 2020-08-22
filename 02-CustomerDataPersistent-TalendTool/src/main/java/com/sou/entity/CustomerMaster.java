package com.sou.entity;






public class CustomerMaster {

	private String initials;
	private String custName;
	private String addrs1;

	private String city;
	private String state;
	private String country;

	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddrs1() {
		return addrs1;
	}
	public void setAddrs1(String addrs1) {
		this.addrs1 = addrs1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public CustomerMaster( String initials, String custName, String addrs1, String city, String state,
			String country) {
		super();

		this.initials = initials;
		this.custName = custName;
		this.addrs1 = addrs1;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	/*
	   private int pinNo;
	   private long mobNo;
	   private String emailId; 
	   private String panNo; 
	   private String gander;
	   private Date birthDate;
	   private int age;
	   private String custType;
	   private String kycStatus;
	   private String deliveryChannel;
	   private Date recordInsertDate;
	   private boolean processedFlag;
	   private Date processedDate;
	   private int checkNo;
	   private Date effectDate;
	   private String polNumText; 
	   private String regNo;
	   private String engineNo; 
	   private String chassisNo;
	   private String coverNoteNo;
	   private String propsalNo;
	   private Date endoresemenmtEffDate;
	   private int docId;
	   private int vendorPriority; 
	   private String vandorName;
	   private long telephoneNo; 
	   private String nomineeName;
	   private String relationship;
	   private long policyNo;
	   private long eplicyNo; 
	   private Date issueDate;
	   private String maker; 
	   private String modelNo;
	   private String bodyType; 
	   private int manifactureYear; 
	   private int sitingCapacity; 
	   private float premiumAmount;
	   private String receiptDate;
	 */

}
