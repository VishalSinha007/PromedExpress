package com.indexpage;

import java.io.IOException;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.init.AbstractPage;
import com.init.Common;
import com.verification.Checkoutexceptionprocesses_GeneralVerification;

public class Checkoutexceptionprocesses_GeneralIndexpage extends AbstractPage{
	
	static Random rand = new Random();
	static int  n = rand.nextInt(1000) + 10;
	
	public static String randomEmail="";
	public static String fname="test";
	public static String lname="test";
	public static String companyname="TCS";
	public static String streetaddress="360 VETERANS PKWY";
	public static String city="BOLINGBROOK";
	public static String zipcode="60440-4609";
	public static String phonenumber="123456789";
	public static String invalidcreditCardNumber="1234 5678 9012 3658";
	public static String invalidexpirationDate="02 / 18";
	public static String invalidcvvNumber="050";

	public Checkoutexceptionprocesses_GeneralIndexpage(WebDriver driver) {
		super(driver);
		
	}
	
	
	/*
	 * @Test Scenario 5: Checkoutexceptionprocesses
	 */
	
	/*
	 * Choose Orthopedic under Home Page
	 */

	@FindBy (xpath="//span[text()='Mobility']")
	private WebElement Mobility;

public Checkoutexceptionprocesses_GeneralVerification clickonMobility() {
	
	WebDriverWait wait=new WebDriverWait(driver, 150);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Mobility']")));
	
	Common.pause(2);
	
	Common.mouseHover(driver, Mobility);
	
	return new Checkoutexceptionprocesses_GeneralVerification(driver);
}

/*
 * Choose Geri Chairs under Mobility
 */
@FindBy(xpath="//div[4]//span[contains(text(),'Geri Chairs')]")
private WebElement Geri_Chairs;

public Checkoutexceptionprocesses_GeneralVerification Geri_Chairs() {
	
	WebDriverWait wait=new WebDriverWait(driver, 150);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[4]//span[contains(text(),'Geri Chairs')]")));
	
	Common.pause(2);
	Geri_Chairs.click();
	
	return new Checkoutexceptionprocesses_GeneralVerification(driver);
}

/*
 * Click on Foam Leg Elevating Splint, 8" - Elevated Wedge Cushion Add to Cart and Add the Product to the Cart
 */


public Checkoutexceptionprocesses_GeneralVerification Add_To_Cart() {
	
	WebDriverWait wait=new WebDriverWait(driver, 150);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]")));
	
	WebElement Add_To_Cart = driver.findElement(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]"));
	
	Common.pause(2);
	Add_To_Cart.click();
	
	return new Checkoutexceptionprocesses_GeneralVerification(driver);
}

/*
 * Click on My Cart Option
 */
@FindBy(xpath="//a[@class='action showcart']")
private WebElement My_Cart;

public Checkoutexceptionprocesses_GeneralVerification My_Cart() {
	
	WebDriverWait wait=new WebDriverWait(driver, 150);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='action showcart']")));
	
	Common.pause(2);
	My_Cart.click();
	
	return new Checkoutexceptionprocesses_GeneralVerification(driver);
}


/*
 * Checkout From My Cart as Guest User
 */

@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
private WebElement Checkout;

public Checkoutexceptionprocesses_GeneralVerification Checkout() {
	
	WebDriverWait wait=new WebDriverWait(driver, 150);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='top-cart-btn-checkout']")));
	
	Common.pause(2);
	Checkout.click();
	
	return new Checkoutexceptionprocesses_GeneralVerification(driver);
}

	
/*
 * Shipping Information as Guest User
 */

@FindBy(xpath="//input[@id='customer-email']")
private WebElement email_id;

@FindBy(xpath="//input[@type='text' and @name='firstname']")
private WebElement First_Name;

@FindBy(xpath="//input[@type='text' and @name='lastname']")
private WebElement Last_Name;

@FindBy(xpath="//input[@type='text' and @name='company']")
private WebElement Company_Name;

@FindBy(xpath="//input[@type='text' and @name='street[0]']")
private WebElement Street_Address;

@FindBy(xpath="//input[@type='text' and @name='city']")
private WebElement City;

@FindBy(xpath="//input[@type='text' and @name='postcode']")
private WebElement PinCode;

@FindBy(xpath="//input[@type='text' and @name='telephone']")
private WebElement Contact_Number;

@FindBy(xpath="//span[text()='Continue']")
private WebElement Continue;

@FindBy(xpath="//span[text()='Next']")
private WebElement Click_On_Next;

public Checkoutexceptionprocesses_GeneralVerification Shipping_Information() throws IOException {
	
	Common.logcase("Entering Valid Address and No Validation Pop Is Appearing");
	
	randomEmail=Common.getRandomEmail();
	Common.pause(5);
	email_id.sendKeys(randomEmail);
	Common.log("Enter Email Id of Customer====>: "+randomEmail+ "</br>");
	System.err.println("Enter Email Id of Customer: "+randomEmail);
	
	Common.pause(3);
	First_Name.sendKeys(fname);
	Common.log("Enter First Name of Customer====>: "+fname+ "</br>");
	System.err.println("Enter First Name of Customer: "+fname);
	
	Common.pause(2);
	Last_Name.sendKeys(lname);
	Common.log("Enter Last Name of Customer====>: "+lname+ "</br>");
	System.err.println("Enter Last Name of Customer: "+lname);
	
	Common.pause(2);
	Company_Name.sendKeys(companyname);
	Common.log("Enter Company Name====>: "+companyname+ "</br>");
	System.err.println("Enter Company Name: "+companyname);
	
	Common.pause(2);
	Street_Address.sendKeys(streetaddress);
	Common.log("Enter Street Address====>: "+streetaddress+ "</br>");
	System.err.println("Enter Street Address: "+streetaddress);
	
	Common.pause(2);
	City.sendKeys(city);
	Common.log("Enter City name====>:"+city+ "</br>");
	System.err.println("Enter City name: "+city);
	
	Common.pause(2);
	Select state_province=new Select(driver.findElement(By.xpath("//select[@name='region_id' and @class='select']")));
	state_province.selectByVisibleText("Illinois");
	Common.log("Select the State from the Drop Down :==> Illinois </br></br>");
	System.err.println("Select the State from the Drop Down :==> Illinois");
	
	Common.pause(2);
	PinCode.sendKeys(zipcode);
	Common.log("Enter the Pin Code of the State: "+zipcode+ "</br>");
	System.err.println("Enter the Pin Code of the State : "+zipcode);
	
	Common.pause(2);
	Select Country=new Select(driver.findElement(By.xpath("//select[@name='country_id' and @class='select']")));
	Country.selectByVisibleText("United States");
	Common.log("Select the Country from the Drop Down :==> United States </br></br>");
	System.err.println("Select the Country from the Drop Down :==> United States");
	
	Contact_Number.sendKeys(phonenumber);
	Common.log("Enter the Phone Number of Customer: "+phonenumber+ "</br>");
	System.err.println("Enter the Phone Number of Customer : "+phonenumber);
	
	return new Checkoutexceptionprocesses_GeneralVerification(driver);
}



/*
 * Address Validation Pop Up
 

public Checkoutexceptionprocesses_GeneralVerification Address_Validation_PopUp() throws IOException{
	
				Common.pause(2);
				Contact_Number.sendKeys(phonenumber);
				Common.log("Enter the Phone Number of Customer: "+phonenumber+ "</br>");
				System.err.println("Enter the Phone Number of Customer : "+phonenumber);
	
				return new Checkoutexceptionprocesses_GeneralVerification(driver);
	}


	 Popup handling methods
	 * 
	 
public Checkoutexceptionprocesses_GeneralVerification Address_Validation(){
	
	Common.pause(5);
	
	List<WebElement> continue_button = driver.findElements(By.xpath("//span[text()='Continue']"));
	
	if(continue_button.size()>0){
		Common.pause(2);
		
		driver.findElement(By.xpath("//div[@class='modal-content']//ul[2]/li/input")).click();
		Common.logstep("Clicked on : "+driver.findElement(By.xpath("//div[@class='modal-content']//ul[2]/li/input")).getAttribute("id"));
		Common.pause(2);
		
		driver.findElement(By.xpath("//aside[@role='dialog']//footer/button/span")).click();
		Common.pause(2);
		
		Common.logstep("Address Pop Up Is Displayed");
		System.err.println("Address Pop Up Is Displayed");
		
	}
	else{
		
		Common.logstep("Address Pop Up Is Not Displayed");
		System.err.println("Address Pop Up Is Not Displayed");
		
	}
	return new Checkoutexceptionprocesses_GeneralVerification(driver);
}


*/


/*
 * Shipping Customer 
 */

public Checkoutexceptionprocesses_GeneralVerification Shipping_Customer(){
	
	WebDriverWait wait=new WebDriverWait(driver, 150);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='s_method_amstrates_amstrates21']")));
	
	Common.pause(5);
	
	WebElement choose_a_shipping_option = driver.findElement(By.xpath("//input[@id='s_method_amstrates_amstrates21']"));
	Common.mouseOver(driver, choose_a_shipping_option);
	Common.pause(5);
	
	Common.clickOn(driver, choose_a_shipping_option);
	Common.log("Click on Ground Standard under Choose a Shipping Option</br>");
	System.err.println("Click on Ground Standard under Choose a Shipping Option");
	
	Common.pause(5);
	Click_On_Next.click();
	Common.log("After Filling all the detail Click on Next Button</br>");
	System.err.println("After Filling all the detail Click on Next Button");
	
	
	return new Checkoutexceptionprocesses_GeneralVerification(driver);
}



/*
 * Payment Method As Guest User
 */

@FindBy(xpath="//input[@id='braintree' and @type='radio']")
private WebElement credit_card_radiobutton;

public Checkoutexceptionprocesses_GeneralVerification credit_card_radiobutton() {
	
	WebDriverWait wait=new WebDriverWait(driver, 150);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='braintree' and @type='radio']")));
	
	Common.pause(1);
	Common.clickOn(driver, credit_card_radiobutton);
	
	return new Checkoutexceptionprocesses_GeneralVerification(driver);
}



/*
 * Enter Credit Card Details
 */

@FindBy(xpath="//input[@id='credit-card-number']")
private WebElement credit_card_number;

@FindBy(xpath="//input[@id='expiration']")
private WebElement expiration_date;

@FindBy(xpath="//input[@id='cvv']")
private WebElement cvv_number;

@FindBy(xpath="//div[@class='primary']//button[contains(.,@data-role) and contains(.,'Place Order')]")
private WebElement Place_order;

public Checkoutexceptionprocesses_GeneralVerification Credit_Card_Details() throws IOException {
	
	Common.logcasered("Entering Invalid Credit Card Details");
	
	Common.pause(2);
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-number']")));
	credit_card_number.sendKeys(invalidcreditCardNumber);
	Common.log("Wrong Credit Card Number====>"+invalidcreditCardNumber+"</br>");
	Common.pause(2);
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-expirationDate']")));
	expiration_date.sendKeys(invalidexpirationDate);
	Common.log("Wrong Expiration Date====>"+invalidexpirationDate+"</br>");
	Common.pause(2);
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-cvv']")));
	cvv_number.sendKeys(invalidcvvNumber);
	Common.log("Wrong Cvv Number====>"+invalidcvvNumber+"</br>");
	Common.pause(2);
	driver.switchTo().defaultContent();
	
	Place_order.click();
	
	return new Checkoutexceptionprocesses_GeneralVerification(driver);
}
	


}
