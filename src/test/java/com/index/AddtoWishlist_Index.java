package com.index;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.Test;
import com.init.Common;
import com.init.SeleniumInit;

public class AddtoWishlist_Index extends SeleniumInit{
	
	
@Test(priority=1)
	
	/*
	 * Tc_:10 Add to Wishlist scenario 
	 *			@ Delete the item from wishlist.
	 *			@ Add all item into add to cart and verify product is moved and product quantity is added into 'add to cart' subpanel.
	 */
	public void AddtoWishlist() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		int step =1;
		
		/*
		 * Home Page URL and Logo Verification
		 * 
		 */
		
		Common.logcaseorange("Test Scenario 10: Add to Wishlist scenario [Delete the Item  and  Add To Cart]");
		
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(Calendar.getInstance().getTime());
		
		Common.logcasered("Time and Date of Test Execution" +timeStamp);
		System.err.println("Time and Date of Test Execution" +timeStamp);
		
		Common.logcase("Step " + +step+++  " : Open URL is: " + testUrl + "</a>");
		Common.logstep("===============>Page URL is Open</br>");
		
		Common.logcase("To Verify that Home Page is Displayed</br>");
		
		Common.logstep("Step :"+step+++" Open the Application</br>");
		
		boolean verify_logo = addtowishlistgeneralverification.homepageverification();
		
		if(verify_logo)
			Common.log("===>Home page is opened and Logo is Matched</br>");
		else
			Common.log("Home page is Not Open and Logo Is Not Matched</br>");
		
		
		
		/*
		 * Click on I User Logo
		 */
		
		Common.logstep("Step :"+step+++" Click on I Uer Logo </br>");
		
		addtowishlistgeneralverification = addtowishlistgeneralindexpage.isuerLogo1();
		
		
		/*
		 *Click on Create New Account 
		 */
		
		Common.logstep("Step :"+step+++" Click on Create New Account </br>");
		
		addtowishlistgeneralverification = addtowishlistgeneralindexpage.CreateNewAccount();
		
		/*
		 * Create New Account Details
		 */
		
		Common.logstep("Step :"+step+++" Enter the Details under Create New Account and click on create new Account </br>");
		
		addtowishlistgeneralverification = addtowishlistgeneralindexpage.CreateNewAccountDetails();
		
		
		
		
		/*
		 * Mouse Over to Orthopedic in Home Page
		 */
	
		Common.logstep("Step :"+step+++" Mouse Over to Orthopedic in Home Page </br>");
		Common.logstep("===============>Menu will Appear with Product list</br>");
		
		addtowishlistgeneralverification = addtowishlistgeneralindexpage.clickonOrthopedic();
		
		
		/*
		 * Click on Positioning under Orthopedic
		 */
		
		Common.logstep("Step :"+step+++" Click on Positioning under Orthopedic </br>");
		Common.logstep("===============>Orthopedic option will Appear under Positioning</br>");
		
		addtowishlistgeneralverification = addtowishlistgeneralindexpage.Positioning();
		
		
		/*
		 * Click on Wishlist
		 */
		
		Common.logstep("Step :"+step+++" Click on Wishlist icon option under Product </br>");
		Common.logstep("===============>User should be able to click on Wishlist icon</br>");
		
		addtowishlistgeneralverification = addtowishlistgeneralindexpage.addtowishlist();
		
		
		
		/*
		 * Mouse Over to Orthopedic in Home Page
		 */
	
		Common.logstep("Step :"+step+++" Mouse Over to Orthopedic in Home Page </br>");
		Common.logstep("===============>Menu will Appear with Product list</br>");
		
		addtowishlistgeneralverification = addtowishlistgeneralindexpage.clickonOrthopedic();
		
		
		/*
		 * Click on Positioning under Orthopedic
		 */
		
		Common.logstep("Step :"+step+++" Click on Positioning under Orthopedic </br>");
		Common.logstep("===============>Orthopedic option will Appear under Positioning</br>");
		
		addtowishlistgeneralverification = addtowishlistgeneralindexpage.Positioning();
		
		
		
		/*
		 * Add to Cart from Wishlist
		 */
		
		Common.logstep("Step :"+step+++" Click on Add to Cart from Wishlist</br>");
		Common.logstep("===============>User should be able to Add to Cart from Wishlist</br>");
		
		addtowishlistgeneralverification = addtowishlistgeneralindexpage.addtocartfromwishlist();
		
		
		
		/*
		 * Item moved to My Cart and Quantity Verified
		 */
		
		
		boolean quantityverify = addtowishlistgeneralverification.verifyproductquantity();
		
		if(quantityverify)
			Common.log("===>Item Moved to My Cart from wishlist and Quantity Verified</br>");
		else
			Common.log("===>Item not Moved to My Cart from wishlist and Quantity not Verified</br>");
		
		
		
		/*
		 * Click on View Cart
		 */
		
		Common.logstep("Step :"+step+++" Item viewed inside My Cart</br>");
		Common.logstep("===============>USer can see all item inside My Cart and Quantity of products</br>");
		
		addtowishlistgeneralverification = addtowishlistgeneralindexpage.viewcart();
		
		
		
}
}
