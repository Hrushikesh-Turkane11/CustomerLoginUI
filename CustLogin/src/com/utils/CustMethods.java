package com.utils;

import java.util.List;

import com.code.Customer;
import com.exception.ValuesMismatchException;

public class CustMethods {
	public static String emailLogged;
	static {
		emailLogged="";
	}
	public static boolean authenticateUser(String email,String passwd,List<Customer> lst) throws ValuesMismatchException {
		Customer c=new Customer(email);
		int index=lst.indexOf(c);
		if(index!=-1) {
			c=lst.get(index);
			if(c.getPassword().equals(passwd)) {
				System.out.println("Login Success");
				return true;
			}else {
				throw new ValuesMismatchException("Incorrect Password ...");
			}
		}else {
			throw new ValuesMismatchException("Email not Found...");
		}
	
	}
	public static void ChangePassword(String email,String newPass,List<Customer>lst) throws ValuesMismatchException {
		Customer c=new Customer(email);
		int index=lst.indexOf(c);
		if(index!=-1) {
			c=lst.get(index);
			c.setPassword(newPass);
			System.out.println("Password Reset successfully");
		}else {
			throw new ValuesMismatchException("Email not Found...");
		}
	}
	public static void unsubscribeUser(String email,String passwd,List<Customer>lst) throws ValuesMismatchException {
		Customer c=new Customer(email);
		int index=lst.indexOf(c);
		
		if(index!=-1) {
			c=lst.get(index);
			if(c.getPassword().equals(passwd)) {
				if(lst.remove(c)) {
					System.out.println("Unsubscribed Successfully");
				}
			}else {
				throw new ValuesMismatchException("Incorrect Password ...");
			}
			
		}else {
			throw new ValuesMismatchException("Email not Found...");
		}
	}
}
