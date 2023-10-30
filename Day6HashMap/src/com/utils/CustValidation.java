package com.utils;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

import com.code.Customer;
import com.code.ServicePlan;
import com.exception.ValuesMismatchException;

public class CustValidation {
	
	
	
	//method to parse and validate Serive plan
	
	private static void validateCustomer(String email,HashMap<String,Customer> hm) throws ValuesMismatchException {
		if(hm.containsKey(email)) {
			throw new ValuesMismatchException("Email Already exists...");
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
	
	/*String name, String lastName, String email, double regAmt, LocalDate dob,String password
			,String role,ServicePlan sp*/
	
public static Customer finalAllCustomer(String name, String lastName, String email, double regAmt, String ld,String password
			,String sp,String role,String regisDate,HashMap<String,Customer> hm) throws ValuesMismatchException,IllegalAccessException
	{
		ServicePlan sp1=parseAndValidatePlan(sp);
		LocalDate date=LocalDate.parse(ld);
		validatePlanAmt(regAmt,sp1);
		validateCustomer(email, hm);
		
		return new Customer(name,lastName,email,regAmt,date,password,role,LocalDate.parse(regisDate), sp1);
	}
	
}
