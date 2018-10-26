package com.index;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.testng.annotations.Test;
import com.init.Common;
import com.init.SeleniumInit;

public class ValidatePaymentMethod_Index extends SeleniumInit{
	
@Test(priority=1)
	
	/*
	 * Tc_:11 Validate Payment Method
	 * @Credit Card
	 * @Paypal
	 * @Open Account
	 */
	public void ValidatePaymentMethod() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		int step =1;
		
		/*
		 * Home Page URL and Logo Verification
		 * 
		 */
		
		Common.logcaseorange("Test Scenario 11: Validate Payment Method[Credit Card, Paypal & Open Account]");
		
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(Calendar.getInstance().getTime());
		
		Common.logcasered("Time and Date of Test Execution" +timeStamp);
		System.err.println("Time and Date of Test Execution" +timeStamp);
	/*	
		Common.logcasered("Validate Payment Method======>Credit Card</br>");
		
		Common.logcase("Step " + +step+++  " : Open URL is: " + testUrl + "</a>");
		Common.logstep("===============>Page URL is Open </br>");
		
		
		Common.logstep("To Verify that Home Page is Displayed</br>");
		
		Common.logstep("Step :"+step+++" Open the Application</br>");
		
		boolean verify_logo = validatepaymentmethodgeneralverification.homepageverification();
		
		if(verify_logo)
			Common.log("===>Home page is opened and Logo is Matched</br>");
		else
			Common.log("Home page is Not Open and Logo Is Not Matched</br></br>");
		
		 
		 
		  *  Mouse Over to Orthopedic in Home Page
		  
		  
		 
		Common.logstep("===============>Menu will Appear with Product list</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.clickonOrthopedic();
		
		
		  
		   
		    *    Click on Positioning under Orthopedic
		    
		   
		  
		 
		
		Common.logstep("Step :"+step+++" Click on Positioning under Orthopedic </br>");
		Common.logstep("===============>Orthopedic option will Appear under Positioning</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Positioning();
		
		
		
		 
		  
		  
		   *    Add the Product to the Cart
		   
		   
		  
		 
		
		
		Common.logstep("Step :"+step+++" Click on Add to Cart Button </br>");
		Common.logstep("===============>Product will be Added to Cart</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Add_To_Cart();
		
		  
		   
		    *    Click on My Cart Option
		    
		   
		
		Common.logstep("Step :"+step+++" Click on My Cart Option </br>");
		Common.logstep("===============>User should see the Product Under My Cart</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.My_Cart();
		
		  
		  
		   *    Verify the Item in My Cart
		   
		   
		  
		 
		
		boolean verify_item = validatepaymentmethodgeneralverification.My_Cart_Verification();
		
		if(verify_item)
			Common.log("===>Product and Price Verified in My Cart</br>");
		else
			Common.log("====>Product and Price does not Verified in My Cart</br>");
		
		
		  
		  
		   *    Item Quantity Verified
		   
		   
		
		boolean item_quantity = validatepaymentmethodgeneralverification.Verify_Item_Quantity();
		
		if(item_quantity)
			Common.log("===>Product Item is Same as Selected</br>");
		else
			Common.log("====>Product Item is not Same as Selected</br>");
		
		 
		  
		   
		    *    Click on CheckOut Option under My cart
		    
		   
		
		Common.logstep("Step :"+step+++" Click on CheckOut Option under My Cart </br>");
		Common.logstep("===============>User should be Redirected to Shipping Address Page</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Checkout();
		
		
		  
		  
		   *    Fill all the Details Under Shipping Address
		   
		   
		
		Common.logcase("Filling the Shipping Information of the Customer</br></br>");
		Common.logstep("Step :"+step+++" Type the Shipping Address where the Customer want to Send his Order </br>");
		Common.logstep("===============>User should fill the Address</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Shipping_Information();
		
		  
		   
		    *    Address_Valiation_PopUp
		    
		   
		  
		Common.logcase("Address_Valiation_PopUp</br></br>");
		Common.logstep("Step :"+step+++" Address_Valiation_PopUp </br>");
		Common.logstep("===============>Address Validation Pop Up Should Appear</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Address_Valiation_PopUp();
		
		  
		   
		    *    Shipping Customer Details
		    
		   
		Common.logcase("Select Shipping Customer</br></br>");
		Common.logstep("Step :"+step+++" Select Shipping Customer </br>");
		Common.logstep("===============>User should Select the Shipping Customer</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Shipping_Customer();
		
		
		
		 *   Go to Payment mode and Click on Credit Card option
		 
		   
		
		Common.logstep("Step :"+step+++" Go to Payment mode and Click on Credit Card radio button </br>");
		Common.logstep("===============>Credit Card option Should Appear</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.credit_card_radiobutton();
		
		  
		  
		   *   Fill the Credit Card Details and Click on Place Order
		   
		   
		
		Common.logcase("Filling the Credit Card Details of the Customer</br></br>");
		Common.logstep("Step :"+step+++" Fill the Credit Card Details and Click on Place Order </br>");
		Common.logstep("===============>User should fill the Credit Cart Details</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Credit_Card_Details();
		
		  
		  
		   *    Order Confirmation of Simple Product
		   
		   
		
		boolean order_confirmation = validatepaymentmethodgeneralverification.Order_Confirmation();
		
		if(order_confirmation)
			Common.log("===>Item is Placed and Shown in the Place</br>");
		else
			Common.log("====>Item is not Placed and not Shown in the Place</br>");	*/

//====================================================================================================================================================================================


 
  /*
   *   Paypal payment Method
   */
  
 
		  /*
		   *   Home Page URL and Logo Verification
		   */
		  
		Common.logcasered("Validate Payment Method======>Paypal</br>");
		
		
		Common.logcase("Step " + +step+++  " : Open URL is: " + testUrl + "</a>");
		
		Common.logcase("To Verify that Home Page is Displayed</br>");
		
		Common.logstep("Step :"+step+++" Open the Application</br>");
		
		boolean verify_logo1 = validatepaymentmethodgeneralverification.homepageverification();
		
		if(verify_logo1)
			Common.log("===>Home page is opened and Logo is Matched</br>");
		else
			Common.log("Home page is Not Open and Logo Is Not Matched</br>");
		
		 
		  
		   /*
		    *   Click on I User Logo
		    */
		   
		  
		Common.logstep("Step :"+step+++" Click on I User Logo </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.isuerLogo();
		
		
		  
		   /*
		    *   Click on Create New Account 
		    */
		   
		  
		Common.logstep("Step :"+step+++" Click on Create New Account </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.CreateNewAccount();
		
		  
		   /*
		    *    Create New Account
		    */
		   
		 
		Common.logcase("Verify that without filling details and click on Create New Account a Error Message Appeared</br>");
		boolean verifyCreateNewAccountPage = validatepaymentmethodgeneralverification.CreateNewCustomerAccountPage();
		
		if(verifyCreateNewAccountPage)
			Common.log("===>User Cannot Create a Account without entering a Details</br>");
		else
			Common.log("===>User is able to create a Account without entering a details and it is a BUG</br>");
		
		
		  
		   /*
		    *   Click on I User Logo
		    */
		   
		  
		Common.logstep("Step :"+step+++" Click on I Uer Logo </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.isuerLogo();
		
		 
		  
		   /*
		    *   Click on Create New Account 
		    */
		   
		  
		
		Common.logstep("Step :"+step+++" Click on Create New Account </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.CreateNewAccount();
		
		 
		  
		   /*
		    *    Create New Account Details
		    */
		   
		  
		
		Common.logstep("Step :"+step+++" Enter the Details under Create New Account and click on create new Account </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.CreateNewAccountDetails();
		
		
		  
		   /*
		    *    Confirmation Message
		    */
		   
		  
		
		Common.logcase("Show the Confirmation Message after Formed is Filled</br>");
		boolean RegistrationMessage = validatepaymentmethodgeneralverification.CreateNewAccountRegistrationMessage();
		
		if(RegistrationMessage)
			Common.log("===>Confirmation Message is Displayed</br>");
		else
			Common.log("===>Confirmation Message is  not Displayed</br>");
		
		 
		  
		   /*
		    *    User Name Should Appear on the Page
		    */
		   
		  
		
		boolean username = validatepaymentmethodgeneralverification.UserHomePage();
		
		if(username)
			Common.log("===>User Home Page is Appeared with the Welcome Message</br>");
		else
			Common.log("===>User Home Page is not Appeared with the Welcome Message</br>");
		
		
		 
		  
		   /*
		    *    Click on I User Logo
		    */
		   
		  
		 
		Common.logstep("Step :"+step+++" Click on I Uer Logo </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.isuerLogo();
		
		 
		  
		   /*
		    *    Click on Logout option
		    */
		   
		  
		 
		
		Common.logstep("Step :"+step+++" Click on Logout option </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Logout();
		
		 
		  
		   /*
		    *    Mouse Over to Mobility in Home Page
		    */
		   
		  
		 
	
		Common.logstep("Step :"+step+++" Mouse Over to Mobility in Home Page </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Mobility();
		
		
		
		 
		  
		   /*
		    *    Click on Positioning under Orthopedic
		    */
		   
		  
		 
		
		Common.logstep("Step :"+step+++" Click on Geri_Chairs under Mobility </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Geri_Chairs();
		
		
		
		 
		  
		   /*
		    *    Add the Product to the Cart
		    */
		   
		  
		 
		
		
		Common.logstep("Step :"+step+++" Click on Add to Cart Button </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Add_To_Cart();
		
		
		 
		  
		   /*
		    *    Click on My Cart Option
		    */
		   
		  
		 
		
		Common.logstep("Step :"+step+++" Click on My Cart Option </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.My_Cart();
		
		  
		  /*
		   *    Verify the Item in My Cart
		   */
		   
		
		boolean verify_item1 = validatepaymentmethodgeneralverification.My_Cart_Verification1();
		
		if(verify_item1)
			Common.log("===>Product and Price Verified in My Cart</br>");
		else
			Common.log("====>Product and Price does not Verified in My Cart</br>");
		
		
		   /*
		    *    Item Quantity Verified
		    */
		  
		
		boolean item_quantity1 = validatepaymentmethodgeneralverification.Verify_Item_Quantity1();
		
		if(item_quantity1)
			Common.log("===>Product Item is Same as Selected</br>");
		else
			Common.log("====>Product Item is not Same as Selected</br>");
		
		  
		   /*
		    *    Click on CheckOut Option under My cart
		    */
		   
		  
		
		Common.logstep("Step :"+step+++" Click on CheckOut Option under My Cart</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Checkout();
		
		  
		   /*
		    *    Fill all the Details Under Shipping Address
		    */
		   
		
		Common.logcaseorange("Filling the Shipping Information of the Customer</br>");
		Common.logstep("Step :"+step+++" Type the Shipping Address where the Customer want to Send his Order </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.ShippingInformation1();
		
		  
		  /*
		   *   Address_Valiation_PopUp
		   */
		   
		
		Common.logstep("Step :"+step+++" Address_Validation_PopUp </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Address_Validation_PopUp();
		
		
		  
		   /*
		    *    Shipping Customer Details
		    */
		   
		
		Common.logstep("Step :"+step+++" Select Shipping Customer </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Shipping_Customer();
		
		  
		   /*
		    *   Fill the Pay Pal Details
		    */
		   
		  
		Common.logcasered("Select the PayPal Payment Mode and Enter Valid Credentials</br>");
		Common.logstep("Step :"+step+++" Select Valid Credentials in PayPal </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.PayPalpaymentMode();
		
		
		   /*
		    *    Check payment made through Pay Pal
		    */
		 
		
		boolean paypal_confirmation = validatepaymentmethodgeneralverification.PaypalExpressCheckout();
		
		if(paypal_confirmation)
			Common.log("===>Item is Placed and Payment is made through PayPal</br>");
		else
			Common.log("====>Item is Placed and Payment is not made through PayPal</br>");
		
		  
		   /*
		    *    Order Confirmation of Simple Product
		    */
		   
		
		boolean order_confirmation1 = validatepaymentmethodgeneralverification.Order_Confirmation();
		
		if(order_confirmation1)
			Common.log("===>Item is Placed and Shown in the Place</br>");
		else
			Common.log("====>Item is not Placed and not Shown in the Place</br>");
		
		
//========================================================================================================================================================================
		
		
		/*
		 * Open Account
		 */
		
		
	
		/*
		 * Home Page URL and Logo Verification
		 * 
		 */
		
		Common.logcaseorange("Open Account Payment Method");
		
		Common.logcase("Step " + +step+++  " : Open URL is: " + testUrl + "</a>");
		
		Common.logstep("To Verify that Home Page is Displayed</br>");
		
		Common.logstep("Step :"+step+++" Open the Application</br>");
		
		boolean verify_logo2 = validatepaymentmethodgeneralverification.homepageverification();
		
		if(verify_logo2)
			Common.log("===>Home page is opened and Logo is Matched</br>");
		else
			Common.log("Home page is Not Open and Logo Is Not Matched</br>");
		
		
		/*
		 * Click on I User Logo
		 */
		
		Common.logstep("Step :"+step+++" Click on I User Logo </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.isuerLogo();
		
		
		/*
		 * Click on Logout option
		 */
		
		Common.logstep("Step :"+step+++" Click on Logout option </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Logout();
		
		
		
		/*
		 * Click on I User Logo
		 */
		
		Common.logstep("Step :"+step+++" Click on I User Logo </br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.isuerLogo();
		
		
		
		/*
		 * Click on Login button
		 */
		
		Common.logstep("Step :"+step+++" Click on Login button under I user Icon</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Loginbuttonclick();
		
		
		

		/*
		 * Customer Login
		 */
		
		Common.logstep("Step :"+step+++" User will be redirected to customer Login page</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.CustomerLogin();
		
		
		
		
		/*
		 * Check Customer Credit balance
		 */
		
		//Common.logstep("Step :"+step+++" Click on Customer Credit under My Dashboard</br>");
		
	//	validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.verifyaccountbalance();
		
		
		
		/*
		 * Click on Promed Logo to go back to Home Page
		 */
		
		
		Common.logstep("Step :"+step+++" Click on Pro Med Express Logo</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.clickonlogo();
		
		
		
		/*
		 * Mouse Over to Mobility in Home Page
		 */
	
		Common.logstep("Step :"+step+++" Mouse Over to Mobility in Home Page </br></br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.clickonOrthopedic();
		
		
		/*
		 * Click on Positioning under Orthopedic
		 */
		
		Common.logstep("Step :"+step+++" Click on Positioning under Orthopedic </br>");
		Common.logstep("===============>Orthopedic option will Appear under Positioning</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Positioning();
		
		

		/*
		 * Click on Add TO Cart Button
		 */
		
		Common.logstep("Step :"+step+++" Click on Add to Cart Button </br>");
		Common.logstep("===============>Product will be added to cart</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.AddToCartButton();	
		
		
		
		/*
		 * Click on My Cart Option
		 */
		
		Common.logstep("Step :"+step+++" Click on My Cart Option </br>");
		Common.logstep("===============>User should see the Product Under My Cart</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.My_Cart();
		
		
		
		/*
		 * Click on CheckOut Option under My cart
		 */
		
		Common.logstep("Step :"+step+++" Click on CheckOut Option under My Cart </br>");
		Common.logstep("===============>User should be Redirected to Shipping Address Page</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Checkout();	
		
		
		/*
		 * Click on Shipping Information button
		 */
		
		
		/*Common.logstep("Step :"+step+++" Fill the Shipping Information Details </br>");
		Common.logstep("===============>User should be able to fill the details</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.ShippingInformationNew();	
		*/
		
		/*
		 * Address_Valiation_PopUp
		 
		
		Common.logstep("Step :"+step+++" Address_Valiation_PopUp </br>");
		Common.logstep("===============>Address Validation Pop Up Should Appear</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Address_Valiation_PopUp();
		*/
		
		
		/*
		 * Shipping Customer Details
		 */
	
		Common.logstep("Step :"+step+++" Select Shipping Customer </br>");
		Common.logstep("===============>User should Select the Shipping Customer</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Shipping_Customernew();
		
		
		/*
		 * Address_Valiation_PopUp
		 
		
		Common.logstep("Step :"+step+++" Address_Valiation_PopUp </br>");
		Common.logstep("===============>Address Validation Pop Up Should Appear</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Address_Validation();*/
		
		/*
		 * Address_Valiation_PopUp
		 */
		
		Common.logstep("Step :"+step+++" Address_Valiation_PopUp </br>");
		Common.logstep("===============>Address Validation Pop Up Should Appear</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.Address_Validation();
		
		
		/*
		 * Click on Open Account Radio Button
		 */
		
		
		Common.logstep("Step :"+step+++" Select Open Account Radio Button </br>");
		Common.logstep("===============>User should be asked to click on Place Order</br>");
		
		validatepaymentmethodgeneralverification = validatepaymentmethodgeneralindexpage.clickonopenaccountradiobutton();
		
		
		
		/*
		 * Order Confirmation of Simple Product
		 */
		
		boolean order_confirmation2 = validatepaymentmethodgeneralverification.Order_Confirmation();
		
		if(order_confirmation2)
			Common.log("===>Item is Placed and Shown in the Place</br>");
		else
			Common.log("====>Item is not Placed and not Shown in the Place</br>");	
		
	

}
}


