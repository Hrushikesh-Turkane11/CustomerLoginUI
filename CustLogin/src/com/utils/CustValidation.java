package com.utils;
import java.time.LocalDate;
import java.util.List;

import com.code.Customer;
import com.code.ServicePlan;
import com.exception.ValuesMismatchException;

public class CustValidation {
	
	
	
	//method to parse and validate Serive plan
	
	private static void validateCustomer(String email,List<Customer> lst) throws ValuesMismatchException {
		Customer c=new Customer(email);
		if(lst.contains(c)) {
			throw new ValuesMismatchException("Email ALready exists...");
		}
	}
	private static ServicePlan parseAndValidatePlan(String str) throws ValuesMismatchException,IllegalAccessException
	{
		
		return ServicePlan.valueOf(str.toUpperCase());
		
	}
	
	
	private static void validatePlanAmt(double amt,ServicePlan plan) throws ValuesMismatchException,IllegalAccessException
	{
		if(plan.getPrice()!=amt) {
			throw new ValuesMismatchException("Plan Not available");
		}
		
	}
	
	/*int custId, String name, String lastName, String email, double regAmt, LocalDate ld,String password
			,ServicePlan sp */
	
public static Customer finalAllCustomer(String name, String lastName, String email, double regAmt, String ld,String password
			,String sp,List<Customer> lst) throws ValuesMismatchException,IllegalAccessException
	{
		ServicePlan sp1=parseAndValidatePlan(sp);
		LocalDate date=LocalDate.parse(ld);
		validatePlanAmt(regAmt,sp1);
		validateCustomer(email, lst);
		
		return new Customer(name,lastName,email,regAmt,date,password,sp1);
	}
	
}
