package com.code;

import java.time.LocalDate;
public class Customer 
{
	private int custId;
	private String name,lastName,email,password,role;
	private double regAmt;
	private LocalDate dob;
	private ServicePlan sp;
	private LocalDate lastSubPaid;
	private LocalDate registeredDate;
	private static int idcnt;
	
	static
	{
		idcnt=100;
	}

	public Customer(String name, String lastName, String email, double regAmt, LocalDate dob,String password
			,String role, LocalDate registeredDate,ServicePlan sp) {
		super();
		
		this.custId = idcnt;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.regAmt = regAmt;
		this.dob = dob;
		this.sp = sp;
		this.password=password;
		this.registeredDate=this.registeredDate;
		this.lastSubPaid=LocalDate.parse(registeredDate.toString());
		this.role =role;
		idcnt++;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public LocalDate getLastSubPaid() {
		return lastSubPaid;
	}

	public void setLastSubPaid(LocalDate lastSubPaid) {
		this.lastSubPaid = lastSubPaid;
	}

	public LocalDate getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(LocalDate registeredDate) {
		this.registeredDate = registeredDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer(String email) {
		this.email=email;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static int getIdcnt() {
		return idcnt;
	}

	public static void setIdcnt(int idcnt) {
		Customer.idcnt = idcnt;
	}

	
	
	
	

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", role=" + role + ", regAmt=" + regAmt + ", dob=" + dob + ", sp=" + sp
				+ ", lastSubPaid=" + lastSubPaid + ", registeredDate=" + registeredDate + "]";
	}

	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Customer)
		{
			//Customer c1= (Customer)obj;
			//return this.email.equals(c1.email);
			return this.email.equals(((Customer)obj).email);
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
