package com.verification;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.init.AbstractPage;
import com.init.Common;

public class AddtoWishlist_GeneralVerification extends AbstractPage{

	public AddtoWishlist_GeneralVerification(WebDriver driver) {
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
	 * Verify that Product is moved into My Cart and Product Quantity is Added
	 */
	
	WebDriverWait mycart=new WebDriverWait(driver, 100);
	
	public boolean verifyproductquantity() throws UnsupportedEncodingException, URISyntaxException, IOException{
	
		Common.pause(5);;

		mycart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='action showcart']")));
		
		Common.pause(1);
		
		WebElement mycartclick = driver.findElement(By.xpath("//a[@class='action showcart']"));
		mycartclick.click();
		
		if(mycartclick.isDisplayed()){
		
			Common.log("Going inside My Cart and Checking the Quantity and Item in it");
			System.err.println("Going inside My Cart and Checking the Quantity and Item in it");
		
		mycart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@class='item-qty cart-item-qty']")));
		
		Common.pause(1);
		WebElement product_quantity = driver.findElement(By.xpath(".//input[@class='item-qty cart-item-qty']"));
		
		if(product_quantity.isDisplayed()) {
			
			Common.logstep("Total Quantity of Product is Displayed and item is visible====>: "+product_quantity.getAttribute("data-item-qty"));
			System.err.println("Total Quantity of Product is Displayed and item is visible====>: "+product_quantity.getAttribute("data-item-qty"));
			logStatus("Pass");
			return true;
	
		}else {
			Common.logstep("Total Quantity of Product is Not Displayed and item is not visible");
			System.err.println("Total Quantity of Product is Not Displayed and item is not visible");
			logStatus("fail");
				
		}

}
		return false;
	}
	
}
