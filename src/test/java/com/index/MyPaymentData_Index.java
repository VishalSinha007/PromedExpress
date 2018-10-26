package com.index;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.Test;
import com.init.Common;
import com.init.SeleniumInit;

public class MyPaymentData_Index extends SeleniumInit{
	
	
	
@Test(priority=1)
	
	/*
	 * Test Scenario 9 :My Payment Data' scenarios  
	 *		@Adding all relevant details and save.
	 *		@Verify it should retain saved data as entered in 'Stored payment methods'.
	 */
	public void MyPaymentData() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		int step =1;
		
		/*
		 * Home Page URL and Logo Verification
		 * 
		 */
		
		Common.logcaseorange("Test Scenario 9: My Payment Data[Add Data and Verify Data]");
		
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(Calendar.getInstance().getTime());
		
		Common.logcasered("Time and Date of Test Execution" +timeStamp);
		System.err.println("Time and Date of Test Execution" +timeStamp);
		
		Common.logcase("Step " + +step+++  " : Open URL is: " + testUrl + "</a>");
		Common.logstep("===============>Page URL is Open</br>");
		
		Common.logcase("To Verify that Home Page is Displayed</br>");
		
		Common.logstep("Step :"+step+++" Open the Application</br>");
		
		boolean verify_logo = mypaymentdatageneralverification.homepageverification();
		
		if(verify_logo)
			Common.log("===>Home page is opened and Logo is Matched</br>");
		else
			Common.log("Home page is Not Open and Logo Is Not Matched</br>");
		
		
		
		/*
		 * Click on I User Logo
		 */
		
		Common.logstep("Step :"+step+++" Click on I Uer Logo </br>");
		
		mypaymentdatageneralverification = mypaymentdatageneralindexpage.isuerLogo1();
		
		
		/*
		 *Click on Create New Account 
		 */
		
		Common.logstep("Step :"+step+++" Click on Create New Account </br>");
		
		mypaymentdatageneralverification = mypaymentdatageneralindexpage.CreateNewAccount();
		
		/*
		 * Create New Account Details
		 */
		
		Common.logstep("Step :"+step+++" Enter the Details under Create New Account and click on create new Account </br>");
		
		mypaymentdatageneralverification = mypaymentdatageneralindexpage.CreateNewAccountDetails();
		
		
		
		
		/*
		 * Mouse Over to Orthopedic in Home Page
		 */
	
		Common.logstep("Step :"+step+++" Mouse Over to Orthopedic in Home Page </br>");
		Common.logstep("===============>Menu will Appear with Product list</br>");
		
		mypaymentdatageneralverification = mypaymentdatageneralindexpage.clickonOrthopedic();
		
		
		/*
		 * Click on Positioning under Orthopedic
		 */
		
		Common.logstep("Step :"+step+++" Click on Positioning under Orthopedic </br>");
		Common.logstep("===============>Orthopedic option will Appear under Positioning</br>");
		
		mypaymentdatageneralverification = mypaymentdatageneralindexpage.Positioning();
		
		
		/*
		 * Add the Product to the Cart
		 */
		
		
		Common.logstep("Step :"+step+++" Click on Add to Cart Button </br>");
		Common.logstep("===============>Product will be Added to Cart</br>");
		
		mypaymentdatageneralverification = mypaymentdatageneralindexpage.Add_To_Cart();
		
		/*
		 * Click on My Cart Option
		 */
		
		Common.logstep("Step :"+step+++" Click on My Cart Option </br>");
		Common.logstep("===============>User should see the Product Under My Cart</br>");
		
		mypaymentdatageneralverification = mypaymentdatageneralindexpage.My_Cart();
		
		
		
		/*
		 * Verify the Item in My Cart
		 */
		
		boolean verify_item = mypaymentdatageneralverification.My_Cart_Verification();
		
		if(verify_item)
			Common.log("===>Product and Price Verified in My Cart</br>");
		else
			Common.log("====>Product and Price does not Verified in My Cart</br>");
		
		
		/*
		 * Item Quantity Verified
		 */
		
		boolean item_quantity = mypaymentdatageneralverification.Verify_Item_Quantity();
		
		if(item_quantity)
			Common.log("===>Product Item is Same as Selected</br>");
		else
			Common.log("====>Product Item is not Same as Selected</br>");
		
		
		/*
		 * Click on CheckOut Option under My cart
		 */
		
		Common.logstep("Step :"+step+++" Click on CheckOut Option under My Cart </br>");
		Common.logstep("===============>User should be Redirected to Shipping Address Page</br>");
		
		mypaymentdatageneralverification = mypaymentdatageneralindexpage.Checkout();
		
		
		/*
		 * Fill all the Details Under Shipping Address
		 */
		
		Common.logcaseorange("Filling the Shipping Information of the Customer</br>");
		Common.logstep("Step :"+step+++" Type the Shipping Address where the Customer want to Send his Order </br>");
		Common.logstep("===============>User should fill the Address</br>");
		
		mypaymentdatageneralverification = mypaymentdatageneralindexpage.Shipping_Information();
		
		
		/*
		 * Shipping Customer Details
		 */
	
		
		Common.logstep("Step :"+step+++" Select Shipping Customer</br>");
		Common.logstep("===============>User should Select the Shipping Custome</br>");
		
		mypaymentdatageneralverification = mypaymentdatageneralindexpage.Shipping_Customer();
		
		
		/*
		 * Go to Payment mode and Click on Credit Card option
		 */
		
		
		Common.logstep("Step :"+step+++" Go to Payment mode and Click on Credit Card radio button </br>");
		Common.logstep("===============>Credit Card option Should Appear</br>");
		
		mypaymentdatageneralverification = mypaymentdatageneralindexpage.credit_card_radiobutton();
		
		/*
		 * Fill the Credit Card Details and Click on Place Order
		 */
		
		Common.logstep("Step :"+step+++" Fill the Credit Card Details and Click on Place Order </br>");
		Common.logstep("===============>User should fill the Credit Cart Details</br>");
		
		mypaymentdatageneralverification = mypaymentdatageneralindexpage.Credit_Card_Details();
		
		
		
		/*
		 * Order Confirmation of Simple Product
		 */
		
		boolean order_confirmation = mypaymentdatageneralverification.Order_Confirmation();
		
		if(order_confirmation)
			Common.log("===>Item is Placed and Shown in the Place</br>");
		else
			Common.log("====>Item is not Placed and not Shown in the Place</br>");
		
		
		/*
		 *Click on Icon  
		 */
		
		Common.logstep("Step :"+step+++"Click on the Icon in Home Page </br>");
		Common.logstep("===============>User should click on the Icon and Value should Appear</br>");
		
		mypaymentdatageneralverification = mypaymentdatageneralindexpage.isuerLogo();
		
		
		/*
		 * Click on My Order Option
		 */
		
		Common.logstep("Step :"+step+++"Click on My Order Option under Icon </br>");
		Common.logstep("===============>User should click on My Order</br>");
		
		mypaymentdatageneralverification = mypaymentdatageneralindexpage.MyOrder();

		
		/*
		 * Click on Store Payment method
		 */
		
		Common.logstep("Step :"+step+++"Click on Store Payment method under Account Dashboard</br>");
		Common.logstep("===============>User should be redirected to there Payment Method</br>");
		
		mypaymentdatageneralverification = mypaymentdatageneralindexpage.storepaymentmethod();
		
		
		
		/*
		 * Verify Card details
		 */
		
		boolean carddetails = mypaymentdatageneralverification.verifycreditcard();
		
		if(carddetails)
			Common.log("===>Card selected is saved and details are matches under store payment method</br>");
		else
			Common.log("====>Card saved does not matches under store payment method</br>");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
