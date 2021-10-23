package com.bz.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	static Scanner sc = new Scanner(System.in);

	public void validFirstName() {
		System.out.println("Enter your First Name : ");
		String firstName = sc.nextLine();
		System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));
	}

	public static void main(String[] args) {
		UserRegistration object = new UserRegistration();
		object.validFirstName();
	}
}