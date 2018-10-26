package com.verification;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.init.AbstractPage;
import com.init.Common;

public class Checkoutloggedin_GeneralVerification extends AbstractPage{

	public Checkoutloggedin_GeneralVerification(WebDriver driver) {
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

		Common.pause(8);
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
	 *Create New Customer Account 
	 */
	
	public boolean CreateNewCustomerAccountPage() throws UnsupportedEncodingException, URISyntaxException, IOException{
		
		Common.pause(5);
		
		WebElement clickoncreateaccount = driver.findElement(By.xpath("//button[@type='submit']//span[contains(.,'Create an Account')]"));
		clickoncreateaccount.click();
		
		WebElement errormsg = driver.findElement(By.xpath("//div[@class='control']//div[@class='mage-error']"));

		
		if(errormsg.isDisplayed()){
			Common.logstep("Without Entering Details and Click on Create New Account Button===>" +errormsg.getText());
			System.err.println("Without Entering Details and Click on Create New Account Button===>" +errormsg.getText());
			logStatus("Pass");
			
			return true;
		}
		else
		{
			Common.logstep("No Error Message is Displayed and there is a Bug in Create New Account");
			System.err.println("No Error Message is Displayed and there is a Bug in Create New Account");
			logStatus("fail");
			
			return false;
		}
	
	}
	
	
	/*
	 * User Home Page
	 */
	
	public boolean UserHomePage() throws UnsupportedEncodingException, URISyntaxException, IOException{
		
		Common.pause(5);
		
		WebElement welcomemsg = driver.findElement(By.xpath("//div[@class='panel header']//li[@class='greet welcome']//span"));
		
		if(welcomemsg.isDisplayed()){
			
			Common.logstep("User Name Shoud Display===>" +welcomemsg.getText());
			System.err.println("User Name Shoud Display===>" +welcomemsg.getText());
			logStatus("Pass");
			
			return true;
			
		}else{
			
			Common.logstep("User Name Shoud Not Display===>");
			System.err.println("User Name Shoud Not Display" );
			logStatus("Fail");
		
		return false;
	}
	}
	
	
	/*
	 * Confirmation Message is Displayed
	 */
	
	public boolean CreateNewAccountRegistrationMessage() throws UnsupportedEncodingException, URISyntaxException, IOException{
		
		WebElement confirmationmessage = driver.findElement(By.xpath("//div[@class='message-success success message']//div[contains(.,'Thank you for registering with ProMed Xpress Products.')]"));
		
		Common.pause(8);
		
		if(confirmationmessage.isDisplayed()){
			Common.logstep("Confirmation Message is Displayed===>"+confirmationmessage);
			System.err.println("Confirmation Message is Displayed===>"+confirmationmessage);
			logStatus("Pass");
			
			return true;
		}
			else{
		
			Common.logstep("Confirmation Message is not Displayed");
			System.err.println("Confirmation Message is not Displayed");
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
		
		Common.pause(8);
		
		WebElement element_shown_inMyCart = driver.findElement(By.xpath("//strong[@class='product-item-name']//a[contains(.,'Double Sided Security Bed Rails 18\"X20\"')]"));

		Common.logstep("Item Selected in the Page Matches Item in the Cart : "+element_shown_inMyCart.getText());
		System.err.println("Item Selected in the Page Matches Item in the Cart : "+element_shown_inMyCart.getText());
	
		Common.pause(3);
		
		WebElement original_priceofProduct = driver.findElement(By.xpath("//div[@class='price-box price-final_price']//span[text()='$132.28']"));
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
		
		
		WebElement Item_Selected1 = driver.findElement(By.xpath("//strong[@class='product-item-name']//a[contains(.,'Double Sided Security Bed Rails 18\"X20\"')]"));
		
		Common.pause(3);
		
		Common.logstep("Item Selected in the Page : "+Item_Selected1.getText());
		System.err.println("Item Selected in the Page : "+Item_Selected1.getText());
		
		Common.pause(3);
		
		WebElement original_priceofProduct1 = driver.findElement(By.xpath("//span[@class='minicart-price']//span[text()='$132.28']"));
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
			
			Common.logstep("Total Quantity of Product is Displayed : "+product_quantity.getAttribute("data-item-qty"));
			System.err.println("Total Quantity of Product is Displayed : "+product_quantity.getAttribute("data-item-qty"));
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
	
	public boolean Order_Confirmation() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		Common.pause(8);
		
		Common.logcase("Verify that Order has been Confirmed and A message has been Displayed");
		
		WebElement confirmation_message = driver.findElement(By.xpath("//span[text()='YOUR ORDER HAS BEEN PLACED']"));
		if(confirmation_message.isDisplayed()) {
			Common.logstep("Confirmation Message is Displayed :"+confirmation_message.getText());
		    System.err.println("Confirmation Message is Displayed :"+confirmation_message.getText());
		    logStatus("Pass");
			
		    Common.pause(8);
		    
		WebElement email_confirmation = driver.findElement(By.xpath("//p[contains(.,'An email confirmation is on its way to ')]"));
		    if(email_confirmation.isDisplayed()) {
		    	Common.logstep("Email Confirmation has Been Sent :"+email_confirmation.getText());
			    System.err.println("Email Confirmation has Been Sent :"+email_confirmation.getText());
			    logStatus("Pass");
		    
			    Common.pause(8);
			    
		WebElement order_number = driver.findElement(By.xpath("//p[contains(.,'Order #')]"));
		if(order_number.isDisplayed())
			Common.logstep("Order Number is Displayed :"+order_number.getText());
	        System.err.println("Order Number is Displayed :"+order_number.getText());
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
		return false;
	}
	
	
	/*
	 * Address Pop Up Validation
	 */
	
	public boolean Address_Validation(){
		
		Common.pause(8);
		
		List<WebElement> continue_button = driver.findElements(By.xpath("//span[text()='Continue']"));
		
		if(continue_button.size()>0){
			
			driver.findElement(By.xpath("//label[contains(.,'160 BROADWAY, NEW YORK, New York, 10038-4201, United States')]")).click();
			
			((WebElement) continue_button).click();
			
			Common.logstep("Address Pop Up Is Displayed");
			System.err.println("Address Pop Up Is Displayed");
			
			return true;
		}
		else{
			
			Common.logstep("Address Pop Up Is Not Displayed");
			System.err.println("Address Pop Up Is Not Displayed");
			
			return false;
			
		}
	}
	
	
	
	/*
	 * Paypal Express Checkout
	 */
	
	public boolean PaypalExpressCheckout(){
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//dt[contains(.,'PayPal Express Checkout')]")));
		
		Common.pause(4);
		WebElement payaplcheckout = driver.findElement(By.xpath("//dt[contains(.,'PayPal Express Checkout')]"));
		
		if(payaplcheckout.isDisplayed()){
			
			Common.logstep("Show the Payment Method===>"+payaplcheckout.getText());
			System.err.println("Show the Payment Method===>"+payaplcheckout.getText());
			
			return true;
		}else{
			
			Common.logstep("Payment method not shown");
			System.err.println("Payment method not shown");
			
			return false;
		}
		
	}
	
	

}
