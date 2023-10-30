package com.tester;

import static com.utils.CustValidation.finalAllCustomer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.code.Customer;
import com.code.ServicePlan;
import static com.utils.CustMethods.*;

public class TestCustomer {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			HashMap<String,Customer> hm = new HashMap<>();
			int exit = 0, ch;
			boolean isLoggedIn = false;
			while (exit != 1) {
				System.out.println("1.Register 2.Login 3.Change Password 4.Unsubscribe 5.Display 0.Exit");
				ch = sc.nextInt();
				try {
					
					/*String name, String lastName, String email, double regAmt, String ld,String password
			,String sp,String role,String regisDate,HashMap<String,Customer> hm*/

					switch (ch) {
					case 1:
						System.out.println("Enter name, lastName, email, regAmt, date, password ,plan");
						String email=sc.next();
						Customer c = finalAllCustomer(sc.next(), sc.next(), email, sc.nextDouble(), sc.next(),
								sc.next(), sc.next(),sc.next(), sc.next(),hm);
						hm.put(email,c);
						System.out.println("Registered Successfully..");
						break;
					case 2:
						System.out.println("Enter uname and Password ");
						 email = sc.next();
						isLoggedIn = authenticateUser(email, sc.next(), hm);
						if (isLoggedIn) {
							emailLogged = email;
						}
						break;
					case 3:
						if (isLoggedIn) {
							System.out.println("Enter new Passwd");
							ChangePassword(emailLogged, sc.next(), hm);
						} else {
							System.out.println("Please Login First....");
						}
						break;
					case 4:
						if (isLoggedIn) {
							System.out.println("Enter password to Unsubscribe");
							unsubscribeUser(emailLogged, sc.next(), hm);
						} else {
							System.out.println("Please Login First....");
						}
						break;
					case 5:
						if (hm.size() > 0) 
						{
							if(isLoggedIn) 
							{
								for (Customer cust : hm.values()) 
								{
									System.out.println(cust);
								}
							} 
							else 
							{
								System.out.println("Please log first....");
							}
						}
						else 
						{
							System.out.println("No Users Registered");
						}
					break;
					case 0:
						exit = 1;
						break;

					default:
						System.out.println("Invalid Choice");
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}

		}

		catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
