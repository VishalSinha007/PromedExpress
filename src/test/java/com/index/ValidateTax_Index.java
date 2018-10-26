package com.index;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.testng.annotations.Test;
import com.init.Common;
import com.init.SeleniumInit;

public class ValidateTax_Index extends SeleniumInit{
	
	
	
@Test(priority=1)
	
	/*
	 * Tc_:12 "Validate Tax Amount
	 */
	public void ValidateTax() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		int step =1;
		
		/*
		 * Home Page URL and Logo Verification
		 * 
		 */
		
		Common.logcaseorange("Test Scenario 12: Validate Tax Amount");
		
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(Calendar.getInstance().getTime());
		
		Common.logcasered("Time and Date of Test Execution" +timeStamp);
		System.err.println("Time and Date of Test Execution" +timeStamp);
		
		Common.logcase("Step " + +step+++  " : Open URL is: " + testUrl + "</a>");
		Common.logstep("===============>Page URL is Open</br>");
		
		Common.logcase("To Verify that Home Page is Displayed</br>");
		
		Common.logstep("Step :"+step+++" Open the Application</br>");
		
		boolean verify_logo = validatetaxgeneralverification.homepageverification();
		
		if(verify_logo)
			Common.log("===>Home page is opened and Logo is Matched</br>");
		else
			Common.log("Home page is Not Open and Logo Is Not Matched</br>");
		
		
		
	
		Common.logstep("Step :"+step+++" Mouse Over to Treatment Furniture in Home Page </br>");
		Common.logstep("===============>Menu will Appear with Product list</br>");
		
		validatetaxgeneralverification = validatetaxgeneralindexpage.treatmentfurniture();
		
		
		
		
		Common.logstep("Step :"+step+++" Click on massageand chiropractic under Treatment</br>");
		Common.logstep("===============>massageand chiropractic option will Appear under Treatment</br>");
		
		validatetaxgeneralverification = validatetaxgeneralindexpage.massageandchiropractic();
		
		
		
		Common.logstep("Step :"+step+++" Click on chiropratic tables</br>");
		Common.logstep("===============>Chiropratic Tables option will Appear under massageand chiropractic</br>");
		
		validatetaxgeneralverification = validatetaxgeneralindexpage.chiropratictables();
		
		
		
		Common.logstep("Step :"+step+++" Click on Add to Cart Button</br>");
		Common.logstep("===============>Product will be Added to Cart</br>");
		
		validatetaxgeneralverification = validatetaxgeneralindexpage.AddtoCart();
		
		
		Common.logstep("Step :"+step+++" Click on My Cart Option </br>");
		Common.logstep("===============>User should see the Product Under My Cart</br>");
		
		validatetaxgeneralverification = validatetaxgeneralindexpage.My_Cart();
		
		
		Common.logstep("Step :"+step+++" Click on CheckOut Option under My Cart </br>");
		Common.logstep("===============>User should be Redirected to Shipping Address Page</br>");
		
		validatetaxgeneralverification = validatetaxgeneralindexpage.Checkout();
		
		
		Common.logstep("Step :"+step+++" Go to Shippinf information Page </br>");
		Common.logstep("===============>User should fill all the shipping information details/br>");
		
		validatetaxgeneralverification = validatetaxgeneralindexpage.Shipping_Information();
		
		

		Common.logstep("Step :"+step+++" Address_Valiation_PopUp </br>");
		Common.logstep("===============>Address Validation Pop Up Should Appear</br>");
		
		validatetaxgeneralverification = validatetaxgeneralindexpage.Address_Valiation_PopUp();
		
		
	
		Common.logstep("Step :"+step+++" Select Shipping Customer </br>");
		Common.logstep("===============>User should Select the Shipping Customer</br>");
		
		validatetaxgeneralverification = validatetaxgeneralindexpage.Shipping_Customer();
		
		
		
		boolean amount = validatetaxgeneralverification.TaxAmountValidation();
		
		if(amount)
			Common.log("===>Total amount verified with Tax amount</br>");
		else
			Common.log("Total amount verified with Tax amount</br>");
		
		
		

//=================================================================================================================================================================//

			/*
			 * Without Tax Amount
			 * 
			 */


			Common.logstep("Step :"+step+++" Click on Mobility </br>");
			Common.logstep("===============>User should Select canes and crutches</br>");

			validatetaxgeneralverification = validatetaxgeneralindexpage.clickonMobility();
			
			
			Common.logstep("Step :"+step+++" Click on canes and crutches </br>");
			Common.logstep("===============>User should Go to Add to Cart Page</br>");

			validatetaxgeneralverification = validatetaxgeneralindexpage.canescrutches();
			
			
			
			Common.logstep("Step :"+step+++" Click on Add to Cart Button</br>");
			Common.logstep("===============>Product will be Added to Cart</br>");
			
			validatetaxgeneralverification = validatetaxgeneralindexpage.Add_To_Cart();
			
			
			Common.logstep("Step :"+step+++" Click on My Cart Option </br>");
			Common.logstep("===============>User should see the Product Under My Cart</br>");
			
			validatetaxgeneralverification = validatetaxgeneralindexpage.My_Cart();
			
			
			Common.logstep("Step :"+step+++" Click on My Cart Option </br>");
			Common.logstep("===============>User should see the Product Under My Cart</br>");
			
			validatetaxgeneralverification = validatetaxgeneralindexpage.ViewCart();

		
			Common.logstep("Step :"+step+++" View the Amount without Tax </br>");
			Common.logstep("===============>User should see the Amount without Tax</br>");
			
			validatetaxgeneralverification = validatetaxgeneralindexpage.TaxAmountValidation();

}
}
