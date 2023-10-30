package com.utils;

import java.util.HashMap;
import java.util.List;

import com.code.Customer;
import com.exception.ValuesMismatchException;

public class CustMethods {
	public static String emailLogged;
	static {
		emailLogged = "";
	}

	public static boolean authenticateUser(String email, String passwd, HashMap<String, Customer> hm)
			throws ValuesMismatchException
	{
		Customer c = hm.get(email);
		System.out.println(c);
		if (c != null) {
			if (c.getPassword().equals(passwd)) {
				System.out.println("Login Success");
				return true;
			} else {
				throw new ValuesMismatchException("Incorrect Password ...");
			}
		} else {
			throw new ValuesMismatchException("Email not Found...");
		}

	}

	public static void ChangePassword(String email, String newPass, HashMap<String, Customer> hm)
			throws ValuesMismatchException {
		Customer c = hm.get(email);

		if (c != null) {
			c.setPassword(newPass);
			System.out.println("Password Reset successfully");
		} else {
			throw new ValuesMismatchException("Email not Found...");
		}
	}

	public static void unsubscribeUser(String email, String passwd, HashMap<String, Customer> hm)
			throws ValuesMismatchException {
		Customer c = hm.get(email);

		if (c != null) {
			if (c.getPassword().equals(passwd)) {
				c = hm.remove(email);
				if (c != null) {
					System.out.println("Unsubscribed Successfully");
				}
			} else {
				throw new ValuesMismatchException("Incorrect Password ...");
			}

		} else {
			throw new ValuesMismatchException("Email not Found...");
		}
	}
}
