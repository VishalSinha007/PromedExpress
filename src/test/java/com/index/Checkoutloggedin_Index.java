package com.index;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.Test;
import com.init.Common;
import com.init.SeleniumInit;

public class Checkoutloggedin_Index extends SeleniumInit{
	
	
	@Test(priority=1)
	
	/*
	 * Test Scenario 3:Checkout logged in
	 */
	
	public void CheckoutloggedIn() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		int step =1;
		
		/*
		 * Home Page URL and Logo Verification
		 * 
		 */
		
		
		Common.logcaseorange("Test Scenario 3:Checkout logged in");
		
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(Calendar.getInstance().getTime());
		
		Common.logcasered("Time and Date of Test Execution" +timeStamp);
		System.err.println("Time and Date of Test Execution" +timeStamp);
		
		Common.logcase("Step " + +step+++  " : Open URL is: " + testUrl + "</a>");
		
		Common.logcase("To Verify that Home Page is Displayed</br>");
		
		Common.logstep("Step :"+step+++" Open the Application</br>");
		
		boolean verify_logo = checkoutloggedingeneralVerication.homepageverification();
		
		if(verify_logo)
			Common.log("===>Home page is opened and Logo is Matched</br>");
		else
			Common.log("Home page is Not Open and Logo Is Not Matched</br>");
		
		
		/*
		 * Click on I User Logo
		 */
		
		Common.logstep("Step :"+step+++" Click on I Uer Logo </br>");
		
		checkoutloggedingeneralVerication = checkoutloggedingeneralindexpage.isuerLogo();
		
		
		/*
		 *Click on Create New Account 
		 */
		
		Common.logstep("Step :"+step+++" Click on Create New Account </br>");
		
		checkoutloggedingeneralVerication = checkoutloggedingeneralindexpage.CreateNewAccount();
		
		/*
		 * Create New Account
		 */
		
		
		boolean verifyCreateNewAccountPage = checkoutloggedingeneralVerication.CreateNewCustomerAccountPage();
		
		if(verifyCreateNewAccountPage)
			Common.log("===>User Cannot Create a Account without entering a Details</br>");
		else
			Common.log("===>User is able to create a Account without entering a details and it is a BUG</br>");
		
		
		
		/*
		 * Click on I User Logo
		 */
		
		Common.logstep("Step :"+step+++" Click on I Uer Logo </br>");
		
		checkoutloggedingeneralVerication = checkoutloggedingeneralindexpage.isuerLogo();
		
		
		/*
		 *Click on Create New Account 
		 */
		
		Common.logstep("Step :"+step+++" Click on Create New Account </br>");
		
		checkoutloggedingeneralVerication = checkoutloggedingeneralindexpage.CreateNewAccount();
		
		
		/*
		 * Create New Account Details
		 */
		
		Common.logstep("Step :"+step+++" Enter the Details under Create New Account and click on create new Account </br>");
		
		checkoutloggedingeneralVerication = checkoutloggedingeneralindexpage.CreateNewAccountDetails();
		
		
		
		/*
		 * Confirmation Message
		 */
		
		
		boolean RegistrationMessage = checkoutloggedingeneralVerication.CreateNewAccountRegistrationMessage();
		
		if(RegistrationMessage)
			Common.log("===>Confirmation Message is Displayed</br>");
		else
			Common.log("===>Confirmation Message is  not Displayed</br>");
		
		
		/*
		 * User Name Should Appear on the Page
		 */
		
		boolean username = checkoutloggedingeneralVerication.UserHomePage();
		
		if(username)
			Common.log("===>User Home Page is Appeared with the Welcome Message</br>");
		else
			Common.log("===>User Home Page is not Appeared with the Welcome Message</br>");
		
		
		
		/*
		 * Click on I User Logo
		 */
		
		Common.logstep("Step :"+step+++" Click on I Uer Logo </br>");
		
		checkoutloggedingeneralVerication = checkoutloggedingeneralindexpage.isuerLogo();
		
		
		

		/*
		 * Click on Logout option
		 */
		
		Common.logstep("Step :"+step+++" Click on Logout option </br>");
		
		checkoutloggedingeneralVerication = checkoutloggedingeneralindexpage.Logout();
		
	
		
		
		
		/*
		 * Mouse Over to Mobility in Home Page
		 */
	
		Common.logstep("Step :"+step+++" Mouse Over to Mobility in Home Page </br>");
		
		checkoutloggedingeneralVerication = checkoutloggedingeneralindexpage.Mobility();
		
		
		/*
		 * Click on Positioning under Orthopedic
		 */
		
		Common.logstep("Step :"+step+++" Click on Geri_Chairs under Mobility </br>");
		
		checkoutloggedingeneralVerication = checkoutloggedingeneralindexpage.Geri_Chairs();
		
		
		/*
		 * Add the Product to the Cart
		 */
		
		
		Common.logstep("Step :"+step+++" Click on Add to Cart Button </br>");
		
		checkoutloggedingeneralVerication = checkoutloggedingeneralindexpage.Add_To_Cart();
		
		/*
		 * Click on My Cart Option
		 */
		
		Common.logstep("Step :"+step+++" Click on My Cart Option </br>");
		
		checkoutloggedingeneralVerication = checkoutloggedingeneralindexpage.My_Cart();
		
		
		
		/*
		 * Verify the Item in My Cart
		 */
		
		boolean verify_item = checkoutloggedingeneralVerication.My_Cart_Verification();
		
		if(verify_item)
			Common.log("===>Product and Price Verified in My Cart</br>");
		else
			Common.log("====>Product and Price does not Verified in My Cart</br>");
		
		
		/*
		 * Item Quantity Verified
		 */
		
		boolean item_quantity = checkoutloggedingeneralVerication.Verify_Item_Quantity();
		
		if(item_quantity)
			Common.log("===>Product Item is Same as Selected</br>");
		else
			Common.log("====>Product Item is not Same as Selected</br>");
		
		
		/*
		 * Click on CheckOut Option under My cart
		 */
		
		Common.logstep("Step :"+step+++" Click on CheckOut Option under My Cart </br>");
		
		checkoutloggedingeneralVerication = checkoutloggedingeneralindexpage.Checkout();
		
		
		/*
		 * Fill all the Details Under Shipping Address
		 */
		
		Common.logcaseorange("Filling the Shipping Information of the Customer</br>");
		Common.logstep("Step :"+step+++" Type the Shipping Address where the Customer want to Send his Order </br>");
		
		checkoutloggedingeneralVerication = checkoutloggedingeneralindexpage.Shipping_Information();
		
		
		/*
		 * Address_Valiation_PopUp
		 */
		
		
		Common.logstep("Step :"+step+++" Address_Validation_PopUp </br>");
		
		checkoutloggedingeneralVerication = checkoutloggedingeneralindexpage.Address_Validation_PopUp();
		
		
		/*
		 * Shipping Customer Details
		 */
	
		
		Common.logstep("Step :"+step+++" Select Shipping Customer </br>");
		
		checkoutloggedingeneralVerication = checkoutloggedingeneralindexpage.Shipping_Customer();
		
		
	
		
		/*
		 * Go to Payment mode and Click on Credit Card option
		 */
		
		
		Common.logstep("Step :"+step+++" Go to Payment mode and Click on Credit Card radio button </br>");
		Common.logstep("===============>Credit Card option Should Appear</br>");
		
		checkoutloggedingeneralVerication = checkoutloggedingeneralindexpage.credit_card_radiobutton();
		
		/*
		 * Fill the Credit Card Details and Click on Place Order
		 */
		
		Common.logstep("Step :"+step+++" Fill the Credit Card Details and Click on Place Order </br>");
		Common.logstep("===============>User should fill the Credit Cart Details</br>");
		
		checkoutloggedingeneralVerication = checkoutloggedingeneralindexpage.Credit_Card_Details();
		
		
		/*
		 * Order Confirmation of Simple Product
		 */
		
		boolean order_confirmation = checkoutloggedingeneralVerication.Order_Confirmation();
		
		if(order_confirmation)
			Common.log("===>Item is Placed and Shown in the Place</br>");
		else
			Common.log("====>Item is not Placed and not Shown in the Place</br>");
	
	
	
}

}
