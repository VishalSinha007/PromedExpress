package com.index;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.Test;

import com.init.Common;
import com.init.SeleniumInit;

public class Checkoutexceptionprocesses_Index extends SeleniumInit{
	
	@Test(priority=1)
	
	/*
	 * Test Scenario 5 : Checkout exception processes [Good Email Id Invalid Credit card]
	 */
	
	public void Checkoutexceptionprocesses() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		int step =1;
		
		/*
		 * Home Page URL and Logo Verification
		 * 
		 */
		
		Common.logcaseorange("Test Scenario 5 : Checkout exception processes [Good Email Id Invalid Credit card]");
		
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(Calendar.getInstance().getTime());
		
		Common.logcasered("Time and Date of Test Execution" +timeStamp);
		System.err.println("Time and Date of Test Execution" +timeStamp);
		
		Common.logcase("Step " + +step+++  " : Open URL is: " + testUrl + "</a>");
		
		Common.logcase("To Verify that Home Page is Displayed</br>");
		
		Common.logstep("Step :"+step+++" Open the Application</br>");
		
		boolean verify_logo = checkoutexceptionprocessesgeneralVerification.homepageverification();
		
		if(verify_logo)
			Common.log("===>Home page is opened and Logo is Matched</br>");
		else
			Common.log("Home page is Not Open and Logo Is Not Matched</br>");
		
		
		/*
		 * Mouse Over to Mobility in Home Page
		 */
	
		Common.logstep("Step :"+step+++" Mouse Over to Mobility in Home Page </br>");
		
		checkoutexceptionprocessesgeneralVerification = checkoutexceptionprocessesgeneralindexpage.clickonMobility();
		
		
		/*
		 * Click on Positioning under Orthopedic
		 */
		
		Common.logstep("Step :"+step+++" Click on Geri_Chairs under Mobility </br>");
		
		checkoutexceptionprocessesgeneralVerification = checkoutexceptionprocessesgeneralindexpage.Geri_Chairs();
		
		
		/*
		 * Add the Product to the Cart
		 */
		
		
		Common.logstep("Step :"+step+++" Click on Add to Cart Button </br>");
		
		checkoutexceptionprocessesgeneralVerification = checkoutexceptionprocessesgeneralindexpage.Add_To_Cart();
		
		/*
		 * Click on My Cart Option
		 */
		
		Common.logstep("Step :"+step+++" Click on My Cart Option </br>");
		
		checkoutexceptionprocessesgeneralVerification = checkoutexceptionprocessesgeneralindexpage.My_Cart();
		
		
		
		/*
		 * Verify the Item in My Cart
		 */
		
		boolean verify_item = checkoutexceptionprocessesgeneralVerification.My_Cart_Verification();
		
		if(verify_item)
			Common.log("===>Product and Price Verified in My Cart</br>");
		else
			Common.log("====>Product and Price does not Verified in My Cart</br></br>");
		
		
		/*
		 * Item Quantity Verified
		 */
		
		boolean item_quantity = checkoutexceptionprocessesgeneralVerification.Verify_Item_Quantity();
		
		if(item_quantity)
			Common.log("===>Product Item is Same as Selected</br>");
		else
			Common.log("====>Product Item is not Same as Selected</br></br>");
		
		
		/*
		 * Click on CheckOut Option under My cart
		 */
		
		Common.logstep("Step :"+step+++" Click on CheckOut Option under My Cart </br>");
		
		checkoutexceptionprocessesgeneralVerification = checkoutexceptionprocessesgeneralindexpage.Checkout();
		
		
		/*
		 * Fill all the Details Under Shipping Address
		 */
		
		Common.logcaseorange("Filling the Shipping Information of the Customer</br>");
		Common.logstep("Step :"+step+++" Type the Shipping Address where the Customer want to Send his Order </br></br>");
		
		checkoutexceptionprocessesgeneralVerification = checkoutexceptionprocessesgeneralindexpage.Shipping_Information();
		
		
/*		
		 * Address_Valiation_PopUp
		 
		
		
		
		Common.logcase("Address_Validation_PopUp</br></br>");
		Common.logstep("Step :"+step+++" Address_Validation_PopUp </br></br>");
		
		checkoutexceptionprocessesgeneralVerification = checkoutexceptionprocessesgeneralindexpage.Address_Validation_PopUp();
		*/
		
		/*
		 * Shipping Customer Details
		 */
	
		
		Common.logstep("Step :"+step+++" Select Shipping Customer </br>");
		
		checkoutexceptionprocessesgeneralVerification = checkoutexceptionprocessesgeneralindexpage.Shipping_Customer();
		

		/*
		 * Go to Payment mode and Click on Credit Card option
		 */
		
		
		Common.logstep("Step :"+step+++" Go to Payment mode and Click on Credit Card radio button </br>");
		Common.logstep("===============>Credit Card option Should Appear</br>");
		
		checkoutexceptionprocessesgeneralVerification = checkoutexceptionprocessesgeneralindexpage.credit_card_radiobutton();
		
		/*
		 * Fill the Credit Card Details and Click on Place Order
		 */
		
		Common.logcasered("Filling the Credit Card Details of the Customer</br>");
		Common.logstep("Step :"+step+++" Fill the Credit Card Details and Click on Place Order </br>");
		Common.logstep("===============>User should fill the Credit Cart Details</br>");
		
		checkoutexceptionprocessesgeneralVerification = checkoutexceptionprocessesgeneralindexpage.Credit_Card_Details();
		
		
		/*
		 * Credit Card Error message display
		 */
		
		boolean Errormessage = checkoutexceptionprocessesgeneralVerification.CreditcardDetails();
		
		if(Errormessage)
			Common.log("===>Error message is display</br>");
		else
			Common.log("====>Error message is not display</br>");
		
	}
}
