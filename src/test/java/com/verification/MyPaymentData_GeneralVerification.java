package com.verification;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.init.AbstractPage;
import com.init.Common;

public class MyPaymentData_GeneralVerification extends AbstractPage{

	public MyPaymentData_GeneralVerification(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	/*
	 * Home Page Verification(Logo Verification of the Page)
	 * @Exception:UnsupportedEncodingException
	 * @Exception:URISyntaxException
	 * @Exception:IOException
	 * 
	 */
	public boolean homepageverification() throws UnsupportedEncodingException, URISyntaxException, IOException {

		Common.pause(10);
		WebElement welcome_msg = driver.findElement(By.xpath("//div[@class='free-shipping']"));

		if (welcome_msg.isDisplayed()) {
			
			Common.logcase("Welcome Msg is Displayed ====>: " +welcome_msg.getText());
			System.err.println("Welcome Msg is Displayed ====>: " +welcome_msg.getText());
			logStatus("Pass");
			
			return true;
		}else {
			
			Common.logcase("Welcome Msg is Not Displayed");
			System.err.println("Welcome Msg is Not Displayed");
			logStatus("fail");
			return false;
	}
	}
	
	
	/*
	 * Verify that the Product which has been Selected is 
	 *  showing under My Cart Option
	 */
	
	public boolean My_Cart_Verification() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		Common.logcase(" Verify that the Product which has been Selected is showing under My Cart Option");
		
		Common.pause(10);
		
		WebElement element_shown_inMyCart = driver.findElement(By.xpath("//a[contains(.,'Foam Leg Elevating Splint, 8\" - Elevated Wedge Cushion')]"));

		Common.logstep("Item Selected in the Page Matches Item in the Cart : "+element_shown_inMyCart.getText()+"</br></br>");
		System.out.println();
		System.err.println("Item Selected in the Page Matches Item in the Cart : "+element_shown_inMyCart.getText());
	
		Common.pause(3);
		
		WebElement original_priceofProduct = driver.findElement(By.xpath("//div[@class='price-box price-final_price']//span[text()='$70.59']"));
		String product_price = original_priceofProduct.getText();
		
		System.out.println();
		String remove_dollar = product_price.replace("$" , "").trim();
		System.err.println("Converting String to Int of Original Price : "+remove_dollar);
		Common.log("Converting String to Int of Original Price : "+remove_dollar);
		
		/*
		 * Converting Double to Integer
		 */
		
		Common.logstep("=========>Converting Double to Integer<=======");
		System.out.println("=========>Converting Double to Integer<=======");
		double price = new Double(remove_dollar);
		System.err.println("Change in Price :"+price);
			
		
		/*
		 * Checking same Product in My Cart
		 */
		
		
		WebElement Item_Selected1 = driver.findElement(By.xpath("//a[contains(.,'Foam Leg Elevating Splint, 8\" - Elevated Wedge Cushion')]"));
		
		Common.pause(3);
		
		Common.logstep("Item Selected in the Page : "+Item_Selected1.getText());
		System.err.println("Item Selected in the Page : "+Item_Selected1.getText());
		
		Common.pause(3);
		
		WebElement original_priceofProduct1 = driver.findElement(By.xpath("//div[@class='price-box price-final_price']//span[text()='$70.59']"));
		String product_price1 = original_priceofProduct1.getText();
		
		System.out.println();
		String remove_dollar1 = product_price1.replace("$" , "").trim();
		System.err.println("Converting String to Int of Original Price : "+remove_dollar1);
		Common.log("Converting String to Int of Original Price : "+remove_dollar1);
		
		/*
		 * Converting Double to Integer
		 */
		
		System.out.println("=========>Converting Double to Integer<=======");
		double price1 = new Double(remove_dollar);
		System.err.println("Change in Price :"+price1);
		
		/*
		 * Comparing the two Items
		 */
		
		Common.logcase("Comparing the two Items");
		
		if(element_shown_inMyCart.equals(Item_Selected1)) {
			
			Common.logstep("Item Selected and Item in My Cart Matches");
			System.err.println("Item Selected and Item in My Cart Matches");
			logStatus("Pass");
		}else {
			
			Common.logstep("Item Selected and Item in My Cart does not Matches");
			System.err.println("Item Selected and Item in My Cart does not Matches");
			logStatus("fail");
		}
		
		/*
		 * Price Comparing
		 */
		
		Common.logcase("Price Comparing");
		
		if(price==price1) {
			
			Common.logstep("Item Selected and Item in My Cart Price Matches");
			System.err.println("Item Selected and Item in My Cart Price Matches");
			logStatus("Pass");
			return true;
		}
		else {
			
			Common.logstep("Item Selected and Item in My Cart price does not Matches");
			System.err.println("Item Selected and Item in My Cart price does not Matches");
			logStatus("fail");
			return false;	
		}
	}
	
	/*
	 * Item Quantity Verified
	 */
	
	public boolean Verify_Item_Quantity() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		Common.pause(3);
		
		Common.logcase("Item Quantity Verified");
		
		WebElement product_quantity = driver.findElement(By.xpath(".//input[@class='item-qty cart-item-qty']"));
		
		if(product_quantity.isDisplayed()) {
			
			Common.logstep("Total Quantity of Product is Displayed ====>: "+product_quantity.getAttribute("data-item-qty"));
			System.err.println("Total Quantity of Product is Displayed ====>: "+product_quantity.getAttribute("data-item-qty"));
			logStatus("Pass");
			return true;
		}else {
			Common.logstep("Total Quantity of Product is Not Displayed ");
			System.err.println("Total Quantity of Product is Not Displayed ");
			logStatus("fail");
			return false;	
		}
		
	}		
		
/*
 * Verify that Order has been Confirmed and A message has been Displayed
 */
	String orderNum = "";
	public boolean Order_Confirmation() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		Common.pause(12);
		
		Common.logcase("Verify that Order has been Confirmed and A message has been Displayed");
		
		WebElement confirmation_message = driver.findElement(By.xpath("//span[text()='YOUR ORDER HAS BEEN PLACED']"));
		if(confirmation_message.isDisplayed()) {
			Common.logstep("Confirmation Message is Displayed :"+confirmation_message.getText());
		    System.err.println("Confirmation Message is Displayed :"+confirmation_message.getText());
		    logStatus("Pass");
			
		    
		WebElement email_confirmation = driver.findElement(By.xpath("//p[contains(.,'An email confirmation is on its way to ')]"));
		    if(email_confirmation.isDisplayed()) {
		    	Common.logstep("Email Confirmation has Been Sent :"+email_confirmation.getText());
			    System.err.println("Email Confirmation has Been Sent :"+email_confirmation.getText());
			    logStatus("Pass");
			    
			    WebElement  order_number1= driver.findElement(By.xpath("//p[contains(.,'Order #')]"));
				 orderNum = order_number1.getText();
				if(order_number1.isDisplayed()){
					Common.logstep("Order Number is Displayed :"+order_number1.getText());
			        System.err.println("Order Number is Displayed :"+order_number1.getText());
			        logStatus("Pass");    
		
		return true;
	}
		else {
			
			Common.logstep("No Confirmation has been Displayed");
	        System.err.println("No Confirmation has been Displayed");
	        logStatus("fail");
	        
	        Common.logstep("No Email Confirmation has been send");
	        System.err.println("No Email Confirmation has been send");
	        logStatus("fail");
	        
	        Common.logstep("No Order Number is Displayed");
	        System.err.println("No Order Number is Displayed");
	        logStatus("fail");
		
	}
	}
	}
		return false;
	}
	
	
	
	
	/*
	 * Verify that Card details
	 */
	
	WebDriverWait wait=new WebDriverWait(driver, 150);
	
	public boolean verifycreditcard(){
		
		Common.logcase("Verify Card Details");
		
		Common.pause(8);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='table-wrapper my-credit-cards']/table/tbody/tr/td[1]")));
		
		WebElement cardnumber=driver.findElement(By.xpath("//div[@class='table-wrapper my-credit-cards']/table/tbody/tr/td[1]"));
		
		if(cardnumber.isDisplayed()){
			
			Common.log("Card Number is Dispalyed===>"+cardnumber.getText());
			System.err.println("Card Number is Dispalyed===>"+cardnumber.getText());
			
			
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='table-wrapper my-credit-cards']/table/tbody/tr/td[2]")));
		
		WebElement expirationdate=driver.findElement(By.xpath("//div[@class='table-wrapper my-credit-cards']/table/tbody/tr/td[2]"));
		
		if(expirationdate.isDisplayed()){
			
			Common.log("Enter Expiry Date===>"+expirationdate.getText());
			System.err.println("Enter Expiry Date===>"+expirationdate.getText());
			
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='table-wrapper my-credit-cards']/table/tbody/tr/td[3]/img")));	
		
		WebElement type=driver.findElement(By.xpath("//div[@class='table-wrapper my-credit-cards']/table/tbody/tr/td[3]/img"));
		
		if(type.isDisplayed()){
			
			Common.log("Type of Card===>"+type.getText());
			System.err.println("Type of Card===>"+type.getText());
			
			return true;
		}
			
		}
		
		}else{
			
			Common.log("Card Number is Not Dispalyed");
			System.err.println("Card Number is Not Dispalyed");
			
			Common.log("Card expiry date is Not Dispalyed");
			System.err.println("Card expiry date is Not Dispalyed");
			
			Common.log("Card type is Not Dispalyed");
			System.err.println("Card type is Not Dispalyed");
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
