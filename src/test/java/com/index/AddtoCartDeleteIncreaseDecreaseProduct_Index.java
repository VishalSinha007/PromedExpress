package com.index;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.Test;
import com.init.Common;
import com.init.SeleniumInit;

public class AddtoCartDeleteIncreaseDecreaseProduct_Index extends SeleniumInit{
	
	
@Test(priority=1)
	
	/*
	 * Tc_:7 "Add to cart" subpanel scenario 
	*		@ Delete the product.
	*		@ Increase / Decrease product quantity.
	 */
	public void AddtoCartDeleteIncreaseDecreaseProduct() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		int step =1;
		
		/*
		 * Home Page URL and Logo Verification
		 * 
		 */
		
		Common.logcaseorange("Test Scenario 7: Add to Cart Delete Increase Decrease Product");
		
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(Calendar.getInstance().getTime());
		
		Common.logcasered("Time and Date of Test Execution" +timeStamp);
		System.err.println("Time and Date of Test Execution" +timeStamp);
		
		Common.logcase("Step " + +step+++  " : Open URL is: " + testUrl + "</a>");
		Common.logstep("===============>Page URL is Open</br>");
		
		Common.logcase("To Verify that Home Page is Displayed</br>");
		
		Common.logstep("Step :"+step+++" Open the Application</br>");
		
		boolean verify_logo = addtocartdeleteincreasedecreaseproductgeneralVerification.homepageverification();
		
		if(verify_logo)
			Common.log("===>Home page is opened and Logo is Matched</br>");
		else
			Common.log("Home page is Not Open and Logo Is Not Matched</br>");
		
		
		/*
		 * Mouse Over to Orthopedic in Home Page
		 */
	
		Common.logstep("Step :"+step+++" Mouse Over to Orthopedic in Home Page </br>");
		Common.logstep("===============>Menu will Appear with Product list</br>");
		
		addtocartdeleteincreasedecreaseproductgeneralVerification = addtocartdeleteincreasedecreaseproductindexpage.clickonOrthopedic();
		
		
		/*
		 * Click on Positioning under Orthopedic
		 */
		
		Common.logstep("Step :"+step+++" Click on Positioning under Orthopedic </br>");
		Common.logstep("===============>Orthopedic option will Appear under Positioning</br>");
		
		addtocartdeleteincreasedecreaseproductgeneralVerification = addtocartdeleteincreasedecreaseproductindexpage.Positioning();
		
		
		/*
		 * Add the Product to the Cart
		 */
		
		
		Common.logstep("Step :"+step+++" Click on Add to Cart Button </br>");
		Common.logstep("===============>Product will be Added to Cart</br>");
		
		addtocartdeleteincreasedecreaseproductgeneralVerification = addtocartdeleteincreasedecreaseproductindexpage.Add_To_Cart();
		
		/*
		 * Click on My Cart Option
		 */
		
		Common.logstep("Step :"+step+++" Click on My Cart Option </br>");
		Common.logstep("===============>User should see the Product Under My Cart</br>");
		
		addtocartdeleteincreasedecreaseproductgeneralVerification = addtocartdeleteincreasedecreaseproductindexpage.My_Cart();
		
		
		
		/*
		 * Verify the Item in My Cart
		 */
		
		boolean verify_item = addtocartdeleteincreasedecreaseproductgeneralVerification.My_Cart_Verification();
		
		if(verify_item)
			Common.log("===>Product and Price Verified in My Cart</br>");
		else
			Common.log("====>Product and Price does not Verified in My Cart</br>");
		
		
		/*
		 * Item Quantity Verified
		 */
		
		boolean item_quantity = addtocartdeleteincreasedecreaseproductgeneralVerification.Verify_Item_Quantity();
		
		if(item_quantity)
			Common.log("===>Product Item is Same as Selected</br>");
		else
			Common.log("====>Product Item is not Same as Selected</br>");
		
		

		/*
		 * Increase the Product Quantity
		 */
		
		Common.logstep("Step :"+step+++" Increase the Product Quantity  </br>");
		Common.logstep("===============>Product Quantity Should Increase</br>");
		
		addtocartdeleteincreasedecreaseproductgeneralVerification = addtocartdeleteincreasedecreaseproductindexpage.productQuantity();
		
		
		
		/*
		 * Decrease the Product Quantity
		 */
		
		Common.logstep("Step :"+step+++" Decrease the Product Quantity  </br>");
		Common.logstep("===============>Product Quantity Should Decrease</br>");
		
		addtocartdeleteincreasedecreaseproductgeneralVerification = addtocartdeleteincreasedecreaseproductindexpage.decreaseproductQuantity();
		
		
		
		/*
		 * Decrease the Product Quantity
		 */
		
		Common.logstep("Step :"+step+++" Remove the Product  </br>");
		Common.logstep("===============>Product is removed</br>");
		
		addtocartdeleteincreasedecreaseproductgeneralVerification = addtocartdeleteincreasedecreaseproductindexpage.remove();
		
}
}
