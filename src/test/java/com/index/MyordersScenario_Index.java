package com.index;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.Test;

import com.init.Common;
import com.init.SeleniumInit;

public class MyordersScenario_Index extends SeleniumInit{
	
	
	@Test(priority=1)
	
	/*
	 * Tc_:6 My orders Scenario
	 */
	public void MyordersScenario() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		int step =1;
		
		/*
		 * Home Page URL and Logo Verification
		 * 
		 */
		
		
		Common.logcaseorange("Test Scenario 6: My orders Scenario");
		
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(Calendar.getInstance().getTime());
		
		Common.logcasered("Time and Date of Test Execution" +timeStamp);
		System.err.println("Time and Date of Test Execution" +timeStamp);
		
		Common.logcase("Step " + +step+++  " : Open URL is: " + testUrl + "</a>");
		Common.logstep("===============>Page URL is Open</br>");
		
		Common.logcase("To Verify that Home Page is Displayed</br>");
		
		Common.logstep("Step :"+step+++" Open the Application</br>");
		
		boolean verify_logo = myorderscenariogeneralVerification.homepageverification();
		
		if(verify_logo)
			Common.log("===>Home page is opened and Logo is Matched</br>");
		else
			Common.log("Home page is Not Open and Logo Is Not Matched</br>");
		
		
		/*
		 * Mouse Over to Orthopedic in Home Page
		 */
	
		Common.logstep("Step :"+step+++" Mouse Over to Orthopedic in Home Page </br>");
		Common.logstep("===============>Menu will Appear with Product list</br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.clickonOrthopedic();
		
		
		/*
		 * Click on Positioning under Orthopedic
		 */
		
		Common.logstep("Step :"+step+++" Click on Positioning under Orthopedic </br>");
		Common.logstep("===============>Orthopedic option will Appear under Positioning</br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.Positioning();
		
		
		/*
		 * Add the Product to the Cart
		 */
		
		
		Common.logstep("Step :"+step+++" Click on Add to Cart Button</br>");
		Common.logstep("===============>Product will be Added to Cart</br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.Add_To_Cart();
		
		/*
		 * Click on My Cart Option
		 */
		
		Common.logstep("Step :"+step+++" Click on My Cart Option</br>");
		Common.logstep("===============>User should see the Product Under My Cart</br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.My_Cart();
		
		
		
		/*
		 * Verify the Item in My Cart
		 */
		
		boolean verify_item = myorderscenariogeneralVerification.My_Cart_Verification();
		
		if(verify_item)
			Common.log("===>Product and Price Verified in My Cart</br>");
		else
			Common.log("====>Product and Price does not Verified in My Cart</br>");
		
		
		/*
		 * Item Quantity Verified
		 */
		
		boolean item_quantity = myorderscenariogeneralVerification.Verify_Item_Quantity();
		
		if(item_quantity)
			Common.log("===>Product Item is Same as Selected</br>");
		else
			Common.log("====>Product Item is not Same as Selected</br>");
		
		
		/*
		 * Click on CheckOut Option under My cart
		 */
		
		Common.logstep("Step :"+step+++" Click on CheckOut Option under My Cart </br>");
		Common.logstep("===============>User should be Redirected to Shipping Address Page</br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.Checkout();
		
		
		/*
		 * Fill all the Details Under Shipping Address
		 */
		
		Common.logcaseorange("Filling the Shipping Information of the Customer</br>");
		Common.logstep("Step :"+step+++" Type the Shipping Address where the Customer want to Send his Order </br>");
		Common.logstep("===============>User should fill the Address<=============== </br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.Shipping_Information();
		
		
		/*
		 * Shipping Customer Details
		 */
	
		
		Common.logstep("Step :"+step+++" Select Shipping Customer </br>");
		Common.logstep("===============>User should Select the Shipping Customer</br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.Shipping_Customer();
		
		
		/*
		 * Go to Payment mode and Click on Credit Card option
		 */
		
		
		Common.logstep("Step :"+step+++" Go to Payment mode and Click on Credit Card radio button </br>");
		Common.logstep("===============>Credit Card option Should Appear</br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.credit_card_radiobutton();
		
		/*
		 * Fill the Credit Card Details and Click on Place Order
		 */
		
	
		Common.logstep("Step :"+step+++" Fill the Credit Card Details and Click on Place Order </br>");
		Common.logstep("===============>User should fill the Credit Cart Details</br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.Credit_Card_Details();
		
		
		/*
		 * Order Confirmation of Simple Product
		 */
		
		boolean order_confirmation = myorderscenariogeneralVerification.Order_Confirmation();
		
		if(order_confirmation)
			Common.log("===>Item is Placed and Shown in the Place</br>");
		else
			Common.log("====>Item is not Placed and not Shown in the Place</br>");
		
		
		/*
		 *Click on Icon  
		 */
		
		Common.logstep("Step :"+step+++"Click on the Icon in Home Page </br>");
		Common.logstep("===============>User should click on the Icon and Value should Appear</br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.isuerLogo();
		
		
		/*
		 * Click on My Order Option
		 */
		
		Common.logstep("Step :"+step+++"Click on My Order Option under Icon </br>");
		Common.logstep("===============>User should click on My Order</br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.MyOrder();
		
		
		/*
		 * Click on My Order Option
		 */
		
		/*Common.logstep("Step :"+step+++"Click on My Order Option under Account Dashboard</br>");
		Common.logstep("===============>User should click on My Order Page</br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.myorder();*/
		
		
		/*
		 * Click on View Order under My Order
		 */
		
		Common.logstep("Step :"+step+++"Click on View Order under My Order </br>");
		Common.logstep("===============>User should be Redirected to Order Page</br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.vieworder();
		
		
		/*
		
		 * Show the Order Number and Compare the Order Number
		 
		Common.logcase("Verifying the Order Number of the Item In My Cart and In My Order");
		
		boolean ordernumbercompare = myorderscenariogeneralVerification.MyOrdernumberConfirmation();
		
		if(ordernumbercompare)
			Common.log("===>Order Number is Displayed and Matches</br></br>");
		else
			Common.log("====>Order Number is not Displayed</br></br>");*/
		
		/*
		
		 * Click on Print out option
		 
		
		Common.logstep("Step :"+step+++"Click on Print out Option </br></br>");
		Common.logstep("===============>User should be Redirected to Print Page where they can print My Order Invoice<=============== </br></br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.printorder();*/
		
		
/*	
	 * Click on Account Dashboard
	 
		
		Common.logstep("Step :"+step+++"Click on Account Dashboard </br></br>");
		Common.logstep("===============>User should click on Account Dashboard<=============== </br></br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.accountdashboard();*/
		
		
		
		/*
		 * Click on My Order Option
		 */
		
		Common.logstep("Step :"+step+++"Click on My Order Option under Account Dashboard</br>");
		Common.logstep("===============>User should click on My Order Page</br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.myorder();
		
		
		
		/*
		 * Click on ReOrder
		 */
		
		Common.logstep("Step :"+step+++"Click on Reorder under My Order </br>");
		Common.logstep("===============>User should click on My Order Page</br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.reorder();
		
		
		/*
		 * Click on Proceed to Checkout
		 */
		
		
		Common.logstep("Step :"+step+++"Click on Proceed to check out Button under Shopping Cart Page </br>");
		Common.logstep("===============>User should be check out from the Page</br>");
		
		myorderscenariogeneralVerification = myorderscenariogeneralindexpage.proceedtocheckout();
		
		
		
	}	

}
