package com.index;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.Test;

import com.init.Common;
import com.init.SeleniumInit;

public class AccountInformationScenario_Index extends SeleniumInit{
	

@Test(priority=1)
	
	/*
	 * Tc_:8 My Account Information Scenario
	 */
	public void AccountInformationScenario() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		int step =1;
		
		/*
		 * Home Page URL and Logo Verification
		 * 
		 */
		
		Common.logcaseorange("Test Scenario 8: Account Information Scenarios[Change email id and Change Password]");
		
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(Calendar.getInstance().getTime());
		
		Common.logcasered("Time and Date of Test Execution" +timeStamp);
		System.err.println("Time and Date of Test Execution" +timeStamp);
		
		Common.logcase("Step " + +step+++  " : Open URL is: " + testUrl + "</a>");
		Common.logstep("===============>Page URL is Open</br>");
		
		Common.logstep("To Verify that Home Page is Displayed</br>");
		
		Common.logstep("Step :"+step+++" Open the Application</br>");
		
		boolean verify_logo = accountinformationscenariogeneralVerification.homepageverification();
		
		if(verify_logo)
			Common.log("===>Home page is opened and Logo is Matched</br>");
		else
			Common.log("Home page is Not Open and Logo Is Not Matched</br>");
		
		
		/*
		 * Click on I User Logo
		 */
		
		Common.logstep("Step :"+step+++" Click on Isuer Logo </br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.isuerLogo();
		
		
		/*
		 *Click on Create New Account 
		 */
		
		Common.logstep("Step :"+step+++" Click on Create New Account </br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.CreateNewAccount();
		
		
		/*
		 * Create New Account Details
		 */
		
		Common.logstep("Step :"+step+++" Enter the Details under Create New Account and click on create new Account </br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.CreateNewAccountDetails();
		

		/*
		 * Click on I User Logo
		 */
		
		Common.logstep("Step :"+step+++" Click on I Uer Logo </br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.isuerLogo();
		
		
		

		/*
		 * Click on Logout option
		 */
		
		Common.logstep("Step :"+step+++" Click on Logout option </br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.Logout();
		
		
		
		
		/*
		 * Mouse Over to Orthopedic in Home Page
		 */
	
		Common.logstep("Step :"+step+++" Mouse Over to Orthopedic in Home Page </br>");
		Common.logstep("===============>Menu will Appear with Product list</br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.clickonOrthopedic();
		
		
		/*
		 * Click on Positioning under Orthopedic
		 */
		
		Common.logstep("Step :"+step+++" Click on Positioning under Orthopedic </br>");
		Common.logstep("===============>Orthopedic option will Appear under Positioning</br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.Positioning();
		
		
		/*
		 * Add the Product to the Cart
		 */
		
		
		Common.logstep("Step :"+step+++" Click on Add to Cart Button </br>");
		Common.logstep("===============>Product will be Added to Cart</br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.Add_To_Cart();
		
		/*
		 * Click on My Cart Option
		 */
		
		Common.logstep("Step :"+step+++" Click on My Cart Option </br>");
		Common.logstep("===============>User should see the Product Under My Cart</br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.My_Cart();
		
		
		
		/*
		 * Verify the Item in My Cart
		 */
		
		boolean verify_item = accountinformationscenariogeneralVerification.My_Cart_Verification();
		
		if(verify_item)
			Common.log("===>Product and Price Verified in My Cart</br>");
		else
			Common.log("====>Product and Price does not Verified in My Cart</br>");
		
		
		/*
		 * Item Quantity Verified
		 */
		
		boolean item_quantity = accountinformationscenariogeneralVerification.Verify_Item_Quantity();
		
		if(item_quantity)
			Common.log("===>Product Item is Same as Selected</br>");
		else
			Common.log("====>Product Item is not Same as Selected</br>");
		
		
		/*
		 * Click on CheckOut Option under My cart
		 */
		
		Common.logstep("Step :"+step+++" Click on CheckOut Option under My Cart </br>");
		Common.logstep("===============>User should be Redirected to Shipping Address Page</br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.Checkout();
		
		
		/*
		 * Fill all the Details Under Shipping Address
		 */
		
		Common.logstep("Filling the Shipping Information of the Customer</br>");
		Common.logstep("Step :"+step+++" Type the Shipping Address where the Customer want to Send his Order </br>");
		Common.logstep("===============>User should fill the Address</br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.Shipping_Information();
		
		
		/*
		 * Shipping Customer Details
		 */
	
		
		Common.logstep("Step :"+step+++" Select Shipping Customer </br>");
		Common.logstep("===============>User should Select the Shipping Customer</br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.Shipping_Customer();
		
		
		/*
		 * Go to Payment mode and Click on Credit Card option
		 */
		
		
		Common.logstep("Step :"+step+++" Go to Payment mode and Click on Credit Card radio button </br>");
		Common.logstep("===============>Credit Card option Should Appear</br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.credit_card_radiobutton();
		
		
		
		/*
		 * Fill the Credit Card Details and Click on Place Order
		 */
		
		Common.logstep("Step :"+step+++" Fill the Credit Card Details and Click on Place Order </br>");
		Common.logstep("Credit card details should be filled");
		
		checkoutandcreateaccountgeneralVerification = checkoutandcreateaccountgeneralindexpage.Credit_Card_Details();
		
		
		/*
		 * Order Confirmation of Simple Product
		 */
		
		boolean order_confirmation = accountinformationscenariogeneralVerification.Order_Confirmation();
		
		if(order_confirmation)
			Common.log("===>Item is Placed and Shown in the Place</br>");
		else
			Common.log("====>Item is not Placed and not Shown in the Place</br>");
		
		
		/*
		 *Click on Icon  
		 */
		
		Common.logstep("Step :"+step+++"Click on the Icon in Home Page </br>");
		Common.logstep("===============>User should click on the Icon and Value should Appear</br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.isuerLogo1();
		
		
		/*
		 * Click on My Order Option
		 */
		
		Common.logstep("Step :"+step+++"Click on My Order Option under Icon </br>");
		Common.logstep("===============>User should click on My Order</br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.MyOrder();
		
		
		
		/*
		 * Click on Account Information
		 */
		
		Common.logstep("Step :"+step+++"Click on Account Information under Account Dashboard</br>");
		Common.logstep("===============>User should be redirected to Edit Account Information</br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.accountinformation();
		
		
		

		/*
		 * Click on Change Email Check Box
		 */
		
		Common.logstep("Step :"+step+++"Click on Change email check box under Edit Account Information</br>");
		Common.logstep("===============>User should be asked for email and Password option</br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.emailcheckbox();
		
		

		/*
		 * Change Email ID
		 */
		
		Common.logstep("Step :"+step+++"Change the Email ID of Customer</br>");
		Common.logstep("===============>User should be able to change the email ID of Customer</br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.changeemail();
		
		
		/*
		 * Change Email Confirmation
		 */
		
		boolean changeemail = accountinformationscenariogeneralVerification.changeemailconfirmation();
		
		if(changeemail)
			Common.log("===>Email Changed Confirmation message is Displayed</br>");
		else
			Common.log("====>Email Changed Confirmation message is not Displayed</br>");
		
		
		
		
		/*
		 * Change Password of Customer
		 */
		
		Common.logstep("Step :"+step+++"Change the Password of Customer</br>");
		Common.logstep("===============>User should be able to change the password of Customer</br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.changepassword();
		
		
		
		/*
		 * Login with New Username and Password
		 */
		
		Common.logstep("Step :"+step+++"Login with Change User Name and Password</br>");
		Common.logstep("===============>User should be able to Login into his Accountr</br>");
		
		accountinformationscenariogeneralVerification = accountinformationscenarioindexpage.loginwithnewusrnpswrd();
		
		
		
		
		/*
		 * New User Account
		 */
		
		boolean dashboard = accountinformationscenariogeneralVerification.loginintonewAccount();
		
		if(dashboard)
			Common.log("===>User is redirected to there new account</br>");
		else
			Common.log("====>User is not redirected to there new account</br>");
		
		
		
		
		
		
		
		
}
}
