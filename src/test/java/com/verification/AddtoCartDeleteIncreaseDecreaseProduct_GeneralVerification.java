package com.verification;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.init.AbstractPage;
import com.init.Common;

public class AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification extends AbstractPage{

	public AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification(WebDriver driver) {
		super(driver);
		
	}
	
	/*
	 * Home Page Verification(Logo Verification of the Page)
	 * @Exception:UnsupportedEncodingException
	 * @Exception:URISyntaxException
	 * @Exception:IOException
	 * 
	 */
	public boolean homepageverification() throws UnsupportedEncodingException, URISyntaxException, IOException {

		Common.pause(10);
		WebElement welcome_msg = driver.findElement(By.xpath("//div[@class='free-shipping']"));

		if (welcome_msg.isDisplayed()) {
			
			Common.logcase("Welcome Msg is Displayed ====>: " +welcome_msg.getText());
			System.err.println("Welcome Msg is Displayed ====>: " +welcome_msg.getText());
			logStatus("Pass");
			
			return true;
		}else {
			
			Common.logcase("Welcome Msg is Not Displayed");
			System.err.println("Welcome Msg is Not Displayed");
			logStatus("fail");
			return false;
	}
	}
	
	
	/*
	 * Verify that the Product which has been Selected is 
	 *  showing under My Cart Option
	 */
	
	public boolean My_Cart_Verification() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		Common.logcase(" Verify that the Product which has been Selected is showing under My Cart Option");
		
		Common.pause(10);
		
		WebElement element_shown_inMyCart = driver.findElement(By.xpath("//a[contains(.,'Foam Leg Elevating Splint, 8\" - Elevated Wedge Cushion')]"));

		Common.logstep("Item Selected in the Page Matches Item in the Cart : "+element_shown_inMyCart.getText()+"</br></br>");
		System.out.println();
		System.err.println("Item Selected in the Page Matches Item in the Cart : "+element_shown_inMyCart.getText());
	
		Common.pause(3);
		
		WebElement original_priceofProduct = driver.findElement(By.xpath("//div[@class='price-box price-final_price']//span[text()='$70.59']"));
		String product_price = original_priceofProduct.getText();
		
		System.out.println();
		String remove_dollar = product_price.replace("$" , "").trim();
		System.err.println("Converting String to Int of Original Price : "+remove_dollar);
		Common.log("Converting String to Int of Original Price : "+remove_dollar);
		
		/*
		 * Converting Double to Integer
		 */
		
		Common.logstep("=========>Converting Double to Integer<=======");
		System.out.println("=========>Converting Double to Integer<=======");
		double price = new Double(remove_dollar);
		System.err.println("Change in Price :"+price);
			
		
		/*
		 * Checking same Product in My Cart
		 */
		
		
		WebElement Item_Selected1 = driver.findElement(By.xpath("//a[contains(.,'Foam Leg Elevating Splint, 8\" - Elevated Wedge Cushion')]"));
		
		Common.pause(3);
		
		Common.logstep("Item Selected in the Page : "+Item_Selected1.getText());
		System.err.println("Item Selected in the Page : "+Item_Selected1.getText());
		
		Common.pause(3);
		
		WebElement original_priceofProduct1 = driver.findElement(By.xpath("//div[@class='price-box price-final_price']//span[text()='$70.59']"));
		String product_price1 = original_priceofProduct1.getText();
		
		System.out.println();
		String remove_dollar1 = product_price1.replace("$" , "").trim();
		System.err.println("Converting String to Int of Original Price : "+remove_dollar1);
		Common.log("Converting String to Int of Original Price : "+remove_dollar1);
		
		/*
		 * Converting Double to Integer
		 */
		
		System.out.println("=========>Converting Double to Integer<=======");
		double price1 = new Double(remove_dollar);
		System.err.println("Change in Price :"+price1);
		
		/*
		 * Comparing the two Items
		 */
		
		Common.logcase("Comparing the two Items");
		
		if(element_shown_inMyCart.equals(Item_Selected1)) {
			
			Common.logstep("Item Selected and Item in My Cart Matches");
			System.err.println("Item Selected and Item in My Cart Matches");
			logStatus("Pass");
		}else {
			
			Common.logstep("Item Selected and Item in My Cart does not Matches");
			System.err.println("Item Selected and Item in My Cart does not Matches");
			logStatus("fail");
		}
		
		/*
		 * Price Comparing
		 */
		
		Common.logcase("Price Comparing");
		
		if(price==price1) {
			
			Common.logstep("Item Selected and Item in My Cart Price Matches");
			System.err.println("Item Selected and Item in My Cart Price Matches");
			logStatus("Pass");
			return true;
		}
		else {
			
			Common.logstep("Item Selected and Item in My Cart price does not Matches");
			System.err.println("Item Selected and Item in My Cart price does not Matches");
			logStatus("fail");
			return false;	
		}
	}
	
	/*
	 * Item Quantity Verified
	 */
	
	public boolean Verify_Item_Quantity() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		Common.pause(3);
		
		Common.logcase("Item Quantity Verified");
		
		WebElement product_quantity = driver.findElement(By.xpath(".//input[@class='item-qty cart-item-qty']"));
		
		if(product_quantity.isDisplayed()) {
			
			Common.logstep("Total Quantity of Product is Displayed ====>: "+product_quantity.getAttribute("data-item-qty"));
			System.err.println("Total Quantity of Product is Displayed ====>: "+product_quantity.getAttribute("data-item-qty"));
			logStatus("Pass");
			return true;
		}else {
			Common.logstep("Total Quantity of Product is Not Displayed ");
			System.err.println("Total Quantity of Product is Not Displayed ");
			logStatus("fail");
			return false;	
		}
		
	}		

}
