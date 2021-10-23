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

	public void validLastName() {
		System.out.println("Enter your last Name : ");
		String lastName = sc.nextLine();
		System.out.println(Pattern.matches("[A-Z][a-z]{2,}", lastName));
	}

	public void validEmailId() {
		System.out.println("Enter your Email ID : ");
		String email = sc.nextLine();
		System.out.println(
				Pattern.matches("\"^([a][b][c])([\\\\.][a-z]+)[@][b][l][\\\\.][c][o]([\\\\.][i][n])\"", email));

	}

	public static void main(String[] args) {
		UserRegistration object = new UserRegistration();
		object.validFirstName();
		object.validLastName();
		object.validEmailId();
	}
}