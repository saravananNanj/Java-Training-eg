package com.dal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.util.function.BiPredicate;

public class AuthController {
	public boolean ValidateUser() throws IOException {
		try {
			String username;
			String pass;
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter UserName:");
			username = br.readLine();
			System.out.println("Enter Password:");
			pass = br.readLine();

			//Predefined functional interface - BiPredicate
			BiPredicate<String, String> res = (uname, pwd) -> uname.equals("saravanan") && pwd.equals("pass");			
			if (res.test(username, pass)) {
				System.out.println(  username  + " BiPredicate Validated ");
				return true;
			} else {
				System.out.println(  username  + " BiPredicate Failed ");
			}
			
			 					
		} catch (Exception err) {
			System.out.println(err);
		}
		return false;
	}
}
