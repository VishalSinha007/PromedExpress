package com.indexpage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.init.AbstractPage;
import com.init.Common;
import com.verification.AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification;

public class AddtoCartDeleteIncreaseDecreaseProduct_GeneralIndexpage extends AbstractPage{

	public AddtoCartDeleteIncreaseDecreaseProduct_GeneralIndexpage(WebDriver driver) {
		super(driver);
		
	}
	
	
	/*
	 * @Test Scenario : Add Simple Product to Cart
	 */
	
	/*
	 * Choose Orthopedic under Home Page
	 */

	@FindBy (xpath="//span[text()='Orthopedic']")
		private WebElement Orthopedic;
	
	public AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification clickonOrthopedic() {
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Orthopedic']")));
		
		Common.pause(2);
		
		Common.mouseHover(driver, Orthopedic);
		
		return new AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification(driver);
	}
	
	/*
	 * Choose Positioning under Orthopedic
	 */
	
	public AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification Positioning() {
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")));
		
		Common.mouseHover(driver, driver.findElement(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")));
		
		Common.pause(2);
		driver.findElement(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")).click();
		
		return new AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification(driver);
	}
	
	/*
	 * Click on Foam Leg Elevating Splint, 8" - Elevated Wedge Cushion Add to Cart and Add the Product to the Cart
	 */
	
	
	public AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification Add_To_Cart() {
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]")));
		
		List<WebElement> Add_To_Cart = driver.findElements(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]"));
		Common.pause(2);
		Add_To_Cart.get(0).click();
		
		return new AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification(driver);
	}
	
	/*
	 * Click on My Cart Option
	 */
	
	public AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification My_Cart() {
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='action showcart']")));
		
		Common.pause(2);
		
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		
		return new AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification(driver);
	}
	
	
	/*
	 * Increase Decrease Product Under My Cart
	 */
	
	@FindBy(xpath=".//input[@class='item-qty cart-item-qty']")
	private WebElement productQuantity;
	
	@FindBy(xpath="//button[@title='Update']/span")
	private WebElement update;
	
	public AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification productQuantity(){
		
		Common.pause(3);
		
		productQuantity.clear();
		productQuantity.sendKeys("3");
		
		
		Common.pause(4);
		update.click();
		
		Common.log("Product Quantity ===>"+productQuantity.getAttribute("data-item-qty"));
		System.err.println("Product Quantity ===>"+productQuantity.getAttribute("data-item-qty"));
		
		Common.log("Click on Update");
		System.out.println("Click on Update");
		
		
		return new AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification(driver);
	}

	
	/*
	 * Decrease the Quantity of the Product
	 */
	
	

	@FindBy(xpath=".//input[@class='item-qty cart-item-qty']")
	private WebElement decreaseproductQuantity;
	
	@FindBy(xpath="//button[@title='Update']/span")
	private WebElement update2;
	
	
	public AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification decreaseproductQuantity(){
		
		Common.pause(3);
		
		decreaseproductQuantity.clear();
		decreaseproductQuantity.sendKeys("4");
		
		Common.pause(4);
		update2.click();
		
		Common.log("Product Quantity ===>"+decreaseproductQuantity.getAttribute("data-item-qty"));
		System.err.println("Product Quantity ===>"+decreaseproductQuantity.getAttribute("data-item-qty"));
		
		
		Common.log("Click on Update");
		System.out.println("Click on Update");
		
		return new AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification(driver);
	}
	
	/*
	 * Remove Product
	 */
	
	@FindBy(xpath="//a[@title='Remove']/span")
	private WebElement remove;
	
	public AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification remove(){
		
		Common.pause(3);
		
		remove.click();
		
		Common.pause(2);
		
		driver.findElement(By.xpath("//button[@class='action-primary action-accept']/span")).click();
		
		Common.pause(2);
		
		return new AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification(driver);
	}
	
}
