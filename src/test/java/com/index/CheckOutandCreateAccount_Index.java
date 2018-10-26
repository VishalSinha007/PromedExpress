package com.index;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.testng.annotations.Test;
import com.init.Common;
import com.init.SeleniumInit;

public class CheckOutandCreateAccount_Index extends SeleniumInit{
	
	
	@Test(priority=1)
	
	/*
	 * Test Scenario 4: Check out and Create Account
	 */
	
	public void CheckOutandCreateAccount() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		int step =1;
		
		/*
		 * Home Page URL and Logo Verification
		 * 
		 */
		
		Common.logcaseorange("Test Scenario 4: Check out and Create Account");
		
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(Calendar.getInstance().getTime());
		
		Common.logcasered("Time and Date of Test Execution" +timeStamp);
		System.err.println("Time and Date of Test Execution" +timeStamp);
		
		Common.logcase("Step " + +step+++  " : Open URL is: " + testUrl + "</a>");
		
		Common.logcase("To Verify that Home Page is Displayed</br>");
		
		Common.logstep("Step :"+step+++" Open the Application</br>");
		
		boolean verify_logo = checkoutasguestgeneralVerification.homepageverification();
		
		if(verify_logo)
			Common.log("===>Home page is opened and Logo is Matched</br>");
		else
			Common.log("Home page is Not Open and Logo Is Not Matched</br>");
		
		
		/*
		 * Mouse Over to Mobility in Home Page
		 */
	
		Common.logstep("Step :"+step+++" Mouse Over to Mobility in Home Page </br>");
		
		checkoutandcreateaccountgeneralVerification = checkoutandcreateaccountgeneralindexpage.clickonMobility();
		
		
		/*
		 * Click on Positioning under Orthopedic
		 */
		
		Common.logstep("Step :"+step+++" Click on Geri_Chairs under Mobility </br>");
		
		checkoutandcreateaccountgeneralVerification = checkoutandcreateaccountgeneralindexpage.Geri_Chairs();
		
		
		/*
		 * Add the Product to the Cart
		 */
		
		
		Common.logstep("Step :"+step+++" Click on Add to Cart Button </br>");
		
		checkoutandcreateaccountgeneralVerification = checkoutandcreateaccountgeneralindexpage.Add_To_Cart();
		
		/*
		 * Click on My Cart Option
		 */
		
		Common.logstep("Step :"+step+++" Click on My Cart Option </br>");
		
		checkoutandcreateaccountgeneralVerification = checkoutandcreateaccountgeneralindexpage.My_Cart();
		
		
		
		/*
		 * Verify the Item in My Cart
		 */
		
		boolean verify_item = checkoutandcreateaccountgeneralVerification.My_Cart_Verification();
		
		if(verify_item)
			Common.log("===>Product and Price Verified in My Cart</br>");
		else
			Common.log("====>Product and Price does not Verified in My Cart</br>");
		
		
		/*
		 * Item Quantity Verified
		 */
		
		boolean item_quantity = checkoutandcreateaccountgeneralVerification.Verify_Item_Quantity();
		
		if(item_quantity)
			Common.log("===>Product Item is Same as Selected</br>");
		else
			Common.log("====>Product Item is not Same as Selected</br>");
		
		
		/*
		 * Click on CheckOut Option under My cart
		 */
		
		Common.logstep("Step :"+step+++" Click on CheckOut Option under My Cart </br>");
		
		checkoutandcreateaccountgeneralVerification = checkoutandcreateaccountgeneralindexpage.Checkout();
		
		
		/*
		 * Fill all the Details Under Shipping Address
		 */
		
		Common.logcase("Filling the Shipping Information of the Customer</br>");
		Common.logstep("Step :"+step+++" Type the Shipping Address where the Customer want to Send his Order </br>");
		
		checkoutandcreateaccountgeneralVerification = checkoutandcreateaccountgeneralindexpage.Shipping_Information();
		
		
		/*
		 * Address_Valiation_PopUp
		 */
		
		
		
		Common.logstep("Step :"+step+++" Address_Validation_PopUp</br>");
		
		checkoutandcreateaccountgeneralVerification = checkoutandcreateaccountgeneralindexpage.Address_Validation_PopUp();
		
		
		/*
		 * Shipping Customer Details
		 */
	
		
		Common.logcaseorange("Select Shipping Customer</br>");
		Common.logstep("Step :"+step+++" Select Shipping Customer </br>");
		
		checkoutandcreateaccountgeneralVerification = checkoutandcreateaccountgeneralindexpage.Shipping_Customer();
		
		
		
		
		/*
		 * Go to Payment mode and Click on Credit Card option
		 */
		
		
		Common.logstep("Step :"+step+++" Go to Payment mode and Click on Credit Card radio button </br>");
		
		checkoutandcreateaccountgeneralVerification = checkoutandcreateaccountgeneralindexpage.credit_card_radiobutton();
		
		/*
		 * Fill the Credit Card Details and Click on Place Order
		 */
		
		Common.logstep("Step :"+step+++" Fill the Credit Card Details and Click on Place Order </br>");
		
		checkoutandcreateaccountgeneralVerification = checkoutandcreateaccountgeneralindexpage.Credit_Card_Details();
		
		
		/*
		 * Order Confirmation of Simple Product
		 */
		
		boolean order_confirmation = checkoutandcreateaccountgeneralVerification.Order_Confirmation();
		
		if(order_confirmation)
			Common.log("===>Item is Placed and Shown in the Place</br>");
		else
			Common.log("====>Item is not Placed and not Shown in the Place</br>");
		
	
	/*
	 * Login to Gmail Account
	 */
		
		Common.pause(2);
		
		driver.navigate().to("https://www.gmail.com");
		

		Common.logstep("Search for the mail in Your Personal Email Id and Click on here</br>");
		Common.logstep("Step :"+step+++" Search for the mail in Your Personal Email Id and Click on here </br>");
		
		checkoutandcreateaccountgeneralVerification = checkoutandcreateaccountgeneralindexpage.LogintoGmail();
		
		
		/*
		 *Verify New Email 
		 */
		

		Common.logstep("Search for the mail in Your Personal Email Id and Click on here</br>");
		Common.logstep("Step :"+step+++" Search for the mail in Your Personal Email Id and Click on here </br>");
		
		checkoutandcreateaccountgeneralVerification = checkoutandcreateaccountgeneralindexpage.CreateAccount();
	
}

}
