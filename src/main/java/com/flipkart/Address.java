package com.flipkart;

import java.util.Scanner;

public class Address {

	public void getAddress() {
	// TODO Auto-generated method stub
		System.out.println("Enter your address:");
		Scanner sc = new Scanner(System.in);
		String address = sc.nextLine();
		
		System.out.println("Your address : " + address);
	}

}
