package com.verification;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.init.AbstractPage;
import com.init.Common;

public class ValidateTax_GeneralVerification extends AbstractPage{

	public ValidateTax_GeneralVerification(WebDriver driver) {
		super(driver);
		
	}
	
	/* Home Page Verification(Logo Verification of the Page)
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
	
	
	public boolean TaxAmountValidation(){
		
		Common.pause(5);
		
		List<WebElement> ordersummary = driver.findElements(By.xpath("//table[@class='data table table-totals']/tbody/tr/td"));
		
			
			String cartsubtotal = ordersummary.get(0).getText();
			Common.log("Cart subtotal amount===>"+cartsubtotal+"</br>");
			System.err.println("Cart subtotal amount===>"+cartsubtotal+"</br>");
			
			WebElement cartsubtotalprice = driver.findElement(By.xpath("//table[@class='data table table-totals']/tbody/tr/td//span[contains(.,'$1,681.69')]"));
			String product_price = cartsubtotalprice.getText();
			
			System.out.println();
			String remove_dollar = product_price.replace("$" , "").trim();
			String removecomma=remove_dollar.replace(",", "").trim();
			System.err.println("Converting String to Int of Original Price : "+removecomma);
			Common.log("Converting String to Int of Original Price : "+removecomma+"</br>");
			
			/*
			 * Converting Double to Integer
			 */
			
			Common.logstep("=========>Converting Double to Integer");
			System.out.println("=========>Converting Double to Integer<=======");
			double price = new Double(removecomma);
			System.err.println("Change in Price :"+price);
			
			if(price < 0){
				Common.log("Cart sub Total Price is Negative and Test Fail");
				System.err.println("Cart sub Total Price is Negative and Test Fail");
			}else if(price == 0){
				Common.log("Cart sub Total Price is  Zero and  Test Fail");
				System.err.println("Cart sub Total Price is  Zero and  Test Fail");
			}
				
			
			String shippingcharges = ordersummary.get(1).getText();
			Common.log("Shipping Charges amount===>"+shippingcharges+"</br>");
			System.err.println("Shipping Charges amount===>"+shippingcharges+"</br>");
			
			
			WebElement shippingchargesprice = driver.findElement(By.xpath("//table[@class='data table table-totals']/tbody/tr/td//span[contains(.,'$30.00')]"));
			String productprice = shippingchargesprice.getText();
			
			System.out.println();
			String removedollar = productprice.replace("$" , "").trim();
			String removecomma2=removedollar.replace(",", "").trim();
			System.err.println("Converting String to Int of Original Price : "+removecomma2);
			Common.log("Converting String to Int of Original Price : "+removecomma2+"</br>");
			
			/*
			 * Converting Double to Integer
			 */
			
			Common.logstep("=========>Converting Double to Integer");
			System.out.println("=========>Converting Double to Integer<=======");
			double price1 = new Double(removecomma2);
			System.err.println("Change in Price :"+price1);
			
			
			if(price1 < 0){
				Common.log("Cart sub Total Price is Negative and Test Fail</br>");
				System.err.println("Cart sub Total Price is Negative and Test Fail");
			}else if(price1 == 0){
				Common.log("Cart sub Total Price is  Zero and  Test Fail</br>");
				System.err.println("Cart sub Total Price is  Zero and  Test Fail");
			}
			
			
			String shippinggroundstandard = ordersummary.get(2).getText();
			Common.log("Shipping ground standard amount===>"+shippinggroundstandard+"</br>");
			System.err.println("Shipping ground standard amount===>"+shippinggroundstandard+"</br>");
			
			
			WebElement shippinggroundstandardprice = driver.findElement(By.xpath("//table[@class='data table table-totals']/tbody/tr/td//span[contains(.,'$15.99')]"));
			String productprice1 = shippinggroundstandardprice.getText();
			
			System.out.println();
			String removedollar2 = productprice1.replace("$" , "").trim();
			String removecomma3=removedollar2.replace(",", "").trim();
			System.err.println("Converting String to Int of Original Price : "+removecomma3);
			Common.log("Converting String to Int of Original Price : "+removecomma3+"</br>");
			
			/*
			 * Converting Double to Integer
			 */
			
			Common.logstep("=========>Converting Double to Integer");
			System.out.println("=========>Converting Double to Integer<=======");
			double price2 = new Double(removecomma3);
			System.err.println("Change in Price :"+price2);
			
			
			if(price2 < 0){
				Common.log("Cart sub Total Price is Negative and Test Fail</br>");
				System.err.println("Cart sub Total Price is Negative and Test Fail");
			}else if(price2 == 0){
				Common.log("Cart sub Total Price is  Zero and  Test Fail</br>");
				System.err.println("Cart sub Total Price is  Zero and  Test Fail");
			}
			
			
			
			String taxamount = ordersummary.get(3).getText();
			Common.log("Total Tax amount===>"+taxamount+"</br>");
			System.err.println("Total Tax amount===>"+taxamount+"</br>");
			
			
			
			WebElement taxamountprice = driver.findElement(By.xpath("//table[@class='data table table-totals']/tbody/tr/td//span[contains(.,'$15.99')]"));
			String taxamountprice1 = taxamountprice.getText();
			
			System.out.println();
			String removedollar3 = taxamountprice1.replace("$" , "").trim();
			String removecomma4=removedollar3.replace(",", "").trim();
			System.err.println("Converting String to Int of Original Price : "+removecomma4);
			Common.log("Converting String to Int of Original Price : "+removecomma4+"</br>");
			
			/*
			 * Converting Double to Integer
			 */
			
			Common.logstep("=========>Converting Double to Integer");
			System.out.println("=========>Converting Double to Integer<=======");
			double price3 = new Double(removecomma4);
			System.err.println("Change in Price :"+price3);
			
			
			if(price3 < 0){
				Common.log("Cart sub Total Price is Negative and Test Fail</br>");
				System.err.println("Cart sub Total Price is Negative and Test Fail");
			}else if(price3 == 0){
				Common.log("Cart sub Total Price is  Zero and  Test Fail</br>");
				System.err.println("Cart sub Total Price is  Zero and  Test Fail");
			}
			
			
			
			String ordertotal = ordersummary.get(4).getText();
			Common.log("Total Amount===>"+ordertotal+"</br>");
			System.err.println("Total Amount===>"+ordertotal+"</br>");
			
			
			
			WebElement ordertotalprice = driver.findElement(By.xpath("//table[@class='data table table-totals']/tbody/tr/td//span[contains(.,'$15.99')]"));
			String totalAmount = ordertotalprice.getText();
			
			System.out.println();
			String removedollar4 = totalAmount.replace("$" , "").trim();
			String removecomma5=removedollar4.replace(",", "").trim();
			System.err.println("Converting String to Int of Original Price : "+removecomma5);
			Common.log("Converting String to Int of Original Price : "+removecomma5+"</br>");
			
			/*
			 * Converting Double to Integer
			 */
			
			Common.logstep("=========>Converting Double to Integer");
			System.out.println("=========>Converting Double to Integer<=======");
			double price4 = new Double(removecomma5);
			System.err.println("Change in Price :"+price4);
			
	
			if(price4 < 0){
				Common.log("Cart sub Total Price is Negative and Test Fail</br>");
				System.err.println("Cart sub Total Price is Negative and Test Fail");
			}else if(price4 == 0){
				Common.log("Cart sub Total Price is  Zero and  Test Fail</br>");
				System.err.println("Cart sub Total Price is  Zero and  Test Fail");
			}
			
			Common.logcasered("Price of the Product is Not Zero or Less than Zero");
			System.err.println("Price of the Product is Not Zero or Less than Zero");
			
			
		return true;
	}

	
}
