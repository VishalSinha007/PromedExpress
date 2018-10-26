package com.index;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.Test;
import com.init.Common;
import com.init.SeleniumInit;

public class Add_To_Cart_Index extends SeleniumInit{
	
	@Test(priority=1)
	
	/*
	 * Tc_:1 Add Simple Product To Cart and CheckOut [A CONFIGURABLE PRODUCT AND BUNDLED PRODUCT ADDED AS WELL]
	 */
	public void Add_To_Cart() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		int step =1;
		
		/*
		 * Home Page URL and Logo Verification
		 * 
		 */
		
		Common.logcaseorange("Test Scenario 1: Add Simple Product To Cart and CheckOut [CONFIGURABLE PRODUCT AND BUNDLED PRODUCT]");
		
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(Calendar.getInstance().getTime());
		
		Common.logcasered("Time and Date of Test Execution" +timeStamp);
		System.err.println("Time and Date of Test Execution" +timeStamp);
		
		Common.logcase("Step " + +step+++  " : Open URL is: " + testUrl + "</a>");
		Common.logstep("===============>Page URL is Open<=============== </br>");
		
		Common.logcase("To Verify that Home Page is Displayed</br>");
		
		Common.logstep("Step :"+step+++" Open the Application</br>");
		
		boolean verify_logo = addtocartgeneralVerification.homepageverification();
		
		if(verify_logo)
			Common.log("===>Home page is opened and Logo is Matched</br>");
		else
			Common.log("Home page is Not Open and Logo Is Not Matched</br>");
		
		
		/*
		 * Mouse Over to Orthopedic in Home Page
		 */
	
		Common.logstep("Step :"+step+++" Mouse Over to Orthopedic in Home Page </br>");
		Common.logstep("===============>Menu will Appear with Product list</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.clickonOrthopedic();
		
		
		/*
		 * Click on Positioning under Orthopedic
		 */
		
		Common.logstep("Step :"+step+++" Click on Positioning under Orthopedic </br>");
		Common.logstep("===============>Orthopedic option will Appear under Positioning</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Positioning();
		
		
		/*
		 * Add the Product to the Cart
		 */
		
		
		Common.logstep("Step :"+step+++" Click on Add to Cart Button </br>");
		Common.logstep("===============>Product will be Added to Cart</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Add_To_Cart();
		
		/*
		 * Click on My Cart Option
		 */
		
		Common.logstep("Step :"+step+++" Click on My Cart Option </br>");
		Common.logstep("===============>User should see the Product Under My Cart</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.My_Cart();
		
		
		
		/*
		 * Verify the Item in My Cart
		 */
		
		boolean verify_item = addtocartgeneralVerification.My_Cart_Verification();
		
		if(verify_item)
			Common.log("===>Product and Price Verified in My Cart</br>");
		else
			Common.log("====>Product and Price does not Verified in My Cart</br>");
		
		
		/*
		 * Item Quantity Verified
		 */
		
		boolean item_quantity = addtocartgeneralVerification.Verify_Item_Quantity();
		
		if(item_quantity)
			Common.log("===>Product Item is Same as Selected</br>");
		else
			Common.log("====>Product Item is not Same as Selected</br>");
		
		
		/*
		 * Click on CheckOut Option under My cart
		 */
		
		Common.logstep("Step :"+step+++" Click on CheckOut Option under My Cart </br>");
		Common.logstep("===============>User should be Redirected to Shipping Address Page</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Checkout();
		
		
		/*
		 * Fill all the Details Under Shipping Address
		 */
		
		Common.logcase("Filling the Shipping Information of the Customer</br>");
		Common.logstep("Step :"+step+++" Type the Shipping Address where the Customer want to Send his Order </br>");
		Common.logstep("===============>User should fill the Address</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Shipping_Information();
		
		
		/*
		 * Address_Valiation_PopUp
		 */
		
		
		Common.logstep("Step :"+step+++" Address_Valiation_PopUp </br>");
		Common.logstep("===============>Address Validation Pop Up Should Appear</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Address_Valiation_PopUp();
		
		
		
		/*
		 * Shipping Customer Details
		 */
	
		Common.logstep("Step :"+step+++" Select Shipping Customer </br>");
		Common.logstep("===============>User should Select the Shipping Customer</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Shipping_Customer();
		
		
		/*
		 * Go to Payment mode and Click on Credit Card option
		 */
		
		
		Common.logstep("Step :"+step+++" Go to Payment mode and Click on Credit Card radio button </br>");
		Common.logstep("===============>Credit Card option Should Appear</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.credit_card_radiobutton();
		
		/*
		 * Fill the Credit Card Details and Click on Place Order
		 */
		
		Common.logstep("Step :"+step+++" Fill the Credit Card Details and Click on Place Order </br>");
		Common.logstep("===============>User should fill the Credit Cart Details</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Credit_Card_Details();
		
		
		/*
		 * Order Confirmation of Simple Product
		 */
		
		boolean order_confirmation = addtocartgeneralVerification.Order_Confirmation();
		
		if(order_confirmation)
			Common.log("===>Item is Placed and Shown in the Place</br>");
		else
			Common.log("====>Item is not Placed and not Shown in the Place</br>");
		
		
		
		
//============================================================================================================================//

	/*
	 * @Add CONFIGURABLE PRODUCT to Cart
	 */		
		
		Common.logcaseorange("Add to Cart CONFIGURABLE PRODUCT </br></br>");
		Common.logstep("Step :"+step+++" Click on BioFreeze Professional Configurable Product </br>");
		Common.logstep("===============>User is Redirected to Configurable Product Page</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.BioFreeze_Professional();
		
		/*
		 * Select the Product 
		 */
		
		Common.logstep("Step :"+step+++" Click on Choose Option the BioFreeze Professional Product </br>");
		Common.logstep("===============>User will choose Configurable Product</br>");
		addtocartgeneralVerification = addtocartgeneralIndexpage.Choose_Option();
		
		
		/*
		 * Select the Color of the Product 
		 */
		
		Common.logstep("Step :"+step+++" Click on Type and Choose the Green Color </br>");
		Common.logstep("===============>User will choose Color type for the Product</br>");
		addtocartgeneralVerification = addtocartgeneralIndexpage.Type_Color();
		
		/*
		 * Select the Size of the Product
		 */
		
		Common.logstep("Step :"+step+++" Click on Size and Choose 16 OZ GEL PUMP </br>");
		Common.logstep("===============>User will choose Size for the Product</br>");
		addtocartgeneralVerification = addtocartgeneralIndexpage.product_size();
		
		
		/*
		 * Click on Add to Cart Button To Add the Product to Cart
		 */
		
		Common.logstep("Step :"+step+++" Click on Add to Cart Button To Add the Product to Cart</br>");
		Common.logstep("===============>Product will be added to Cart</br>");
		addtocartgeneralVerification = addtocartgeneralIndexpage.Add_To_Cart_Button();
		
		
		/*
		 * Click on My Cart Option
		 */
		
		Common.logstep("Step :"+step+++" Click on My Cart Option </br>");
		Common.logstep("===============>Product will be shown under My Cart Option</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.My_Cart();
		
		
		/*
		 * Click on CheckOut Option under My cart
		 */
		
		Common.logstep("Step :"+step+++" Click on CheckOut Option under My Cart </br>");
		Common.logstep("===============>User will be redirected to Shipping Page </br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Checkout();
		

		/*
		 * Fill all the Details Under Shipping Address
		 */
		
		Common.logcasered("Filling the Shipping Information of the Customer</br>");
		Common.logstep("Step :"+step+++" Type the Shipping Address where the Customer want to Send his Order</br>");
		Common.logstep("===============>User will fill the Address Details<=============== </br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Shipping_Information();
		
		
		/*
		 * Address_Valiation_PopUp
		 */
		
		
		Common.logstep("Step :"+step+++" Address_Valiation_PopUp </br>");
		Common.logstep("===============>Address Validation Pop up should Appear<=============== </br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Address_Valiation_PopUp();
		
		
		
		/*
		 * Shipping Customer Details
		 */
	
		
		Common.logstep("Step :"+step+++" Select Shipping Customer </br>");
		Common.logstep("===============>Shipping Customer should be selected</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Shipping_Customer();
		
		
		
		/*
		 * Go to Payment mode and Click on Credit Card option
		 */
		
		
		Common.logstep("Step :"+step+++" Go to Payment mode and Click on Credit Card radio button </br>");
		Common.logstep("===============>Credit Card Payment Option will Apppear</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.credit_card_radiobutton();
		
		/*
		 * Fill the Credit Card Details and Click on Place Order
		 */
		
		Common.logcasered("Filling the Credit Card Details of the Customer</br>");
		Common.logstep("Step :"+step+++" Fill the Credit Card Details and Click on Place Order </br>");
		Common.logstep("===============>User will Fill the Credit Card Details and Click on Next</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Credit_Card_Details();
		
		
		/*
		 * Order Confirmation of Simple Product
		 */
		
		boolean order_confirmation_new = addtocartgeneralVerification.Order_Confirmation();
		
		if(order_confirmation_new)
			Common.log("===>Item is Placed and Shown in the Place</br>");
		else
			Common.log("====>Item is not Placed and not Shown in the Place</br>");
		
		
//=====================================================================================================================//
		
		/*
		 * @ Add Bundled Product to Cart
		 */
		
		
		/*
		 * Click on Search Box and Type the Bundled Product In It and Search it.
		 */
		Common.logcaseorange("Bundle product Scenario </br>");
		Common.logstep("Step :"+step+++" Click on Search Box and Find the Bundled Product in It</br>");
		Common.logstep("===============>User will be redirected to Bundle Product Page</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Search_Box();
		
		
		/*
		 * Click on the Bundled Product In It 
		 */
		
		Common.logstep("Step :"+step+++" Click on Bundle Product </br>");
		Common.logstep("===============>User will be redirected to Bundle Product Page</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Bundle_Product();
		
		
		/*
		 * Choose the Color for Bundle Product
		 */
		
	
		Common.logstep("Step :"+step+++" Click on the color for Bundle Product </br>");
		Common.logstep("===============>User will choose different color under bundle product</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Choose_Color();
		
		
		/*
		 * Click on Add to Cart Button To Add the Product to Cart
		 */
		
		Common.logstep("Step :"+step+++" Click on Add to Cart Button To Add the Product to Cart</br>");
		Common.logstep("===============>User will See the Product has been Added under My Cart</br>");
		addtocartgeneralVerification = addtocartgeneralIndexpage.Add_To_Cart_Button();
		
		
		
		/*
		 * Click on My Cart Option
		 */
		
		Common.logstep("Step :"+step+++" Click on My Cart Option</br>");
		Common.logstep("===============>User will see the Same Product under My Cart</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.My_Cart();
		
		
		
		/*
		 * Click on CheckOut Option under My cart
		 */
		
		Common.logstep("Step :"+step+++" Click on CheckOut Option under My Cart </br>");
		Common.logstep("===============>User will be redirected to Shipping Address Page</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Checkout();
		

		/*
		 * Fill all the Details Under Shipping Address
		 */
		
		Common.logcasered("Filling the Shipping Information of the Customer</br>");
		Common.logstep("Step :"+step+++" Type the Shipping Address where the Customer want to Send his Order </br>");
		Common.logstep("===============>User should fill the Shipping Address where they want to send the Product</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Shipping_Information();
		
		
		/*
		 * Address_Valiation_PopUp
		 */
		
		
		
		Common.logstep("Step :"+step+++" Address_Valiation_PopUp </br>");
		Common.logstep("===============>Address Validation Pop Up should Appear</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Address_Valiation_PopUp();
		
		
		
		/*
		 * Shipping Customer Details
		 */
	
		
		Common.logcaseorange("Select Shipping Customer</br>");
		Common.logstep("Step :"+step+++" Select Shipping Customer </br>");
		Common.logstep("===============>User should select Shipping Customer</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Shipping_Customer();
		
		
		
		/*
		 * Go to Payment mode and Click on Credit Card option
		 */
		
		
		Common.logstep("Step :"+step+++" Go to Payment mode and Click on Credit Card radio button </br>");
		Common.logstep("===============>User will see credit Card menu</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.credit_card_radiobutton();
		
		/*
		 * Fill the Credit Card Details and Click on Place Order
		 */
		
		Common.logcaseorange("Filling the Credit Card Details of the Customer</br>");
		Common.logstep("Step :"+step+++" Fill the Credit Card Details and Click on Place Order </br>");
		Common.logstep("===============>User will fill the Credit Card Details</br>");
		
		addtocartgeneralVerification = addtocartgeneralIndexpage.Credit_Card_Details();
		
		
		/*
		 * Order Confirmation of Simple Product
		 */
		
		boolean order_confirmation_new1 = addtocartgeneralVerification.Order_Confirmation();
		
		if(order_confirmation_new1)
			Common.log("===>Item is Placed and Shown in the Place</br>");
		else
			Common.log("====>Item is not Placed and not Shown in the Place</br>");
		
		
		
		
		
		
		
		
		
		
	}	
}
