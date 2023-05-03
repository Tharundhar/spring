package com.flipkart;


@org.springframework.stereotype.Controller
public class Controller {

	public void flipkart() {

		Shopping shop = new Shopping();
		shop.cart();
		
	}
}