package com.code;

import java.time.LocalDate;
public class Customer 
{
	private int custId;
	private String name,lastName,email,password;
	private double regAmt;
	private LocalDate ld;
	private ServicePlan sp;
	private static int idcnt;
	
	static
	{
		idcnt=100;
	}

	public Customer(String name, String lastName, String email, double regAmt, LocalDate ld,String password
			,ServicePlan sp) {
		super();
		
		this.custId = idcnt;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.regAmt = regAmt;
		this.ld = ld;
		this.sp = sp;
		this.password=password;
		idcnt++;
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
				+ ", password=" + password + ", regAmt=" + regAmt + ", ld=" + ld + ", sp=" + sp + "]";
	}

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
