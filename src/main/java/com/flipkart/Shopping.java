package com.flipkart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Shopping {

	public void cart() {

		String msg;
		Map<String, Products> productsBucket = new HashMap<String, Products>();
		Scanner sc = new Scanner(System.in);
		Products jbl = new Products();
		Products sony = new Products();
		Products nike = new Products();
		Products puma = new Products();
		Products price = new Products();
		do {
			
		System.out.println("Select the category: 1.Headset 2.Shoe");
		int choice = sc.nextInt();

		switch(choice) {
		case 1 :
			System.out.println("select the brand: 1.JBL - Rs.2000, 2.SONY - Rs.3000 ");
			int headsetChoice = sc.nextInt();
			switch(headsetChoice) {
			case 1:
				System.out.println("Enter the quantity:");
				int quantity = sc.nextInt();
//				Products jbl = new Products();
				jbl.setProductName("JBL");
				jbl.setPrice(2000 * quantity);
				jbl.setQuantity(quantity);
				
				productsBucket.put("headset", jbl);
			
			break;
				
			case 2:
				System.out.println("Enter the quantity:");
				int sonyQuantity = sc.nextInt();
//				Products sony = new Products();
				sony.setProductName("SONY");
				sony.setPrice(3000 * sonyQuantity);
				sony.setQuantity(sonyQuantity);
				
				productsBucket.put("headset", sony);
			break;
			}
			
		break;
		
		case 2 :
			System.out.println("select the brand: 1.Nike - Rs.3000, 2.Puma - Rs.2000 ");
			int shoeChoice = sc.nextInt();
			switch(shoeChoice) {
			case 1:
				System.out.println("Enter the quantity:");
				int quantity = sc.nextInt();
//				Products nike = new Products();
				nike.setProductName("Nike");
				nike.setPrice(3000 * quantity);
				nike.setQuantity(quantity);
				
				productsBucket.put("shoe", nike);
			break;
				
			case 2:
				System.out.println("Enter the quantity:");
				int pumaQuantity = sc.nextInt();
//				Products puma = new Products();
				puma.setProductName("Puma");
				puma.setPrice(2000 * pumaQuantity);
				puma.setQuantity(pumaQuantity);
				
				productsBucket.put("shoe", puma);
			break;
			}
		break;
		
		}System.out.println("Do you want to continue shopping? YES|NO");
		msg = sc.next();

		}while(msg.equalsIgnoreCase("yes"));
		
		price.setTotalPrice(jbl.getPrice() + sony.getPrice() + nike.getPrice() + puma.getPrice());
		System.out.println("do you want to proceed to checkout? YES|NO");
		String checkoutMsg;
		checkoutMsg = sc.next();
		if(checkoutMsg.equalsIgnoreCase("yes")) {
		Address address = new Address();
		address.getAddress();
		
		Iterator<Entry<String, Products>> itr = productsBucket.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println("Your order: " + itr.next().getValue());
		}

		System.out.println("Total Price : " + price.getTotalPrice());
		}
		else {
			System.out.println("Order cancelled, visit us again!");
		}

		
	}
			

}
