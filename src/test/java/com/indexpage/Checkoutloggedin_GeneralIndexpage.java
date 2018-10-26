package com.indexpage;

import java.io.IOException;
import java.util.List;
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
import com.verification.Checkoutloggedin_GeneralVerification;

public class Checkoutloggedin_GeneralIndexpage extends AbstractPage{
	


	static Random rand = new Random();
	static int  n = rand.nextInt(1000) + 10;
	
	public static String staticEmail="";
	public static String staticpassword="baps@200";
	public static String fname=null;
	public static String lname=null;
	public static String companyname=null;
	public static String streetaddress=null;
	public static String city=null;
	public static String zipcode=null;
	public static String phonenumber=null;
	public static String creditCardNumber=null;
	public static String expirationDate=null;
	public static String cvvNumber=null;
	

	
	public Checkoutloggedin_GeneralIndexpage(WebDriver driver) {
		super(driver);
		
	}
	
	
	/*
	 * Click on I User Logo
	 */
	
	@FindBy(xpath="//div[@class='header-top-links']//ul//li//span//i")
	private WebElement isuerLogo;
	
	public Checkoutloggedin_GeneralVerification isuerLogo(){
		
		WebDriverWait logo=new WebDriverWait(driver, 100);
		logo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header-top-links']//ul//li//span//i")));
		
		Common.pause(2);
		isuerLogo.click();
		
		return new Checkoutloggedin_GeneralVerification(driver);
	}
	
	
	/*
	 * Click on Create Account
	 */
	
	public Checkoutloggedin_GeneralVerification CreateNewAccount(){
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='header links']//li[2]//a")));
		
		Common.pause(2);
		List<WebElement> clickoncreatenewaccount = driver.findElements(By.xpath("//ul[@class='header links']//li[2]//a"));
		clickoncreatenewaccount.get(1).click();
		
		return new Checkoutloggedin_GeneralVerification(driver);
	}
	
	
	
	/*
	 * Click on Logout
	 */
	
	public Checkoutloggedin_GeneralVerification Logout(){
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='header links']//li[2]//a")));
		
		Common.pause(2);
		List<WebElement> logout = driver.findElements(By.xpath("//ul[@class='header links']//li[2]//a"));
		logout.get(0).click();
		
		return new Checkoutloggedin_GeneralVerification(driver);
	}
	
	
	/*
	 * Enter the Details under Create New Account
	 */
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//div[@class='field choice newsletter']//input")
	private WebElement clickoncheckbox;
	
	@FindBy(xpath="//div[@class='control customer-dob']//input")
	private WebElement graduationdate;
	
	@FindBy(xpath="//input[@id='email_address']")
	private WebElement emailId;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='password-confirmation']")
	private WebElement confirmpassword;
	
	@FindBy(xpath="//button[@type='submit']//span[contains(.,'Create an Account')]")
	private WebElement CreateaAccount;
	
	WebDriverWait details=new WebDriverWait(driver, 100);
	
	public Checkoutloggedin_GeneralVerification CreateNewAccountDetails() throws IOException{
		
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='prefix']")));
		Select nameprefix=new Select(driver.findElement(By.xpath("//select[@id='prefix']")));
		Common.pause(2);
		nameprefix.selectByVisibleText("Mr");
		
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='firstname']")));
		Common.pause(2);
		firstname.sendKeys("daniel");
		Common.logstep("Enter First Name :===> daniel");
		System.err.println("Enter First Name :===> daniel");
		
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='lastname']")));
		Common.pause(2);
		lastname.sendKeys("rollins");
		Common.logstep("Enter Last Name :===> rollins");
		System.err.println("Enter Last Name :===> rollins");
		
		/*details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='field choice newsletter']//input")));
		Common.pause(1);
		clickoncheckbox.click();
		Common.logstep("Click on Sign Up For Newsletter Check Box");
		System.err.println("Click on Sign Up For Newsletter Check Box");*/
		
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='control customer-dob']//input")));
		Common.pause(2);
		graduationdate.sendKeys("09/11/2015");
		Common.logstep("Type the graudation date===>09/11/2015");
		System.err.println("Type the graudation date===>09/11/2015");
		
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email_address']")));
		staticEmail=Common.getRandomEmail();
		Common.pause(2);
		emailId.sendKeys(staticEmail);
		Common.logstep("Type the email id ===>"+staticEmail+"</br>");
		System.err.println("Type the email id ===>"+staticEmail);
		
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
		staticpassword=Common.getValueFromConfig("config.properties","Password");
		Common.pause(2);
		password.sendKeys(staticpassword);
		Common.logstep("Type the password ===>"+staticpassword+"</br>");
		System.err.println("Type the password ===>"+staticpassword);
		
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password-confirmation']")));
		staticpassword=Common.getValueFromConfig("config.properties","Password");
		Common.pause(2);
		confirmpassword.sendKeys(staticpassword);
		Common.logstep("Type the same password under confirm password ===>"+staticpassword+"</br>");
		System.err.println("Type the same password under confirm password ===>"+staticpassword);
		
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']//span[contains(.,'Create an Account')]")));
		Common.pause(2);
		CreateaAccount.click();
		Common.logstep("After filling all the details click on Create A Account");
		System.err.println("After filling all the details click on Create A Account");
		
		return new Checkoutloggedin_GeneralVerification(driver);
	}
	
	
	
	
	/*
	 * Choose Mobility under Home Page
	 */

	@FindBy (xpath="//span[text()='Mobility']")
	private WebElement Mobility;

	public Checkoutloggedin_GeneralVerification Mobility() {
		
		Common.pause(3);
		
		WebDriverWait wait=new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Mobility']")));
	
		Common.pause(2);
	
		Common.mouseHover(driver, Mobility);
	
	return new Checkoutloggedin_GeneralVerification(driver);
}

	/*
	 * Choose Geri Chairs under Mobility
 	*/
	@FindBy(xpath="//div[4]//span[contains(text(),'Geri Chairs')]")
	private WebElement Geri_Chairs;

	public Checkoutloggedin_GeneralVerification Geri_Chairs() {
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[4]//span[contains(text(),'Geri Chairs')]")));
		
	Common.pause(3);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[4]//span[contains(text(),'Geri Chairs')]"))).click();
	
	Common.pause(3);
	
	return new Checkoutloggedin_GeneralVerification(driver);
	}

/*
 * Click on Foam Leg Elevating Splint, 8" - Elevated Wedge Cushion Add to Cart and Add the Product to the Cart
 */


public Checkoutloggedin_GeneralVerification Add_To_Cart() {
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]")));
	
	WebElement Add_To_Cart = driver.findElement(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]"));
	Common.pause(2);
	Add_To_Cart.click();
	
	return new Checkoutloggedin_GeneralVerification(driver);
}

/*
 * Click on My Cart Option
 */
@FindBy(xpath="//a[@class='action showcart']")
private WebElement My_Cart;

public Checkoutloggedin_GeneralVerification My_Cart() {
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='action showcart']")));
	
	Common.pause(2);
	My_Cart.click();
	
	return new Checkoutloggedin_GeneralVerification(driver);
}


/*
 * Checkout From My Cart as Guest User
 */

@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
private WebElement Checkout;

public Checkoutloggedin_GeneralVerification Checkout() {
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='top-cart-btn-checkout']")));
	
	Common.pause(2);
	Checkout.click();
	
	return new Checkoutloggedin_GeneralVerification(driver);
}

	
/*
 * Shipping Information as Guest User
 */

@FindBy(xpath="//input[@id='customer-email']")
private WebElement email_id;

@FindBy(xpath="//input[@id='customer-password']")
private WebElement customerpassword;

@FindBy(xpath="//span[text()='Login']")
private WebElement LoginButton;


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

WebDriverWait information=new WebDriverWait(driver, 100);

public Checkoutloggedin_GeneralVerification Shipping_Information() throws IOException {
	
	information.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer-email']")));
	//staticEmail=Common.getRandomEmail();
	Common.pause(2);
	email_id.sendKeys(staticEmail);
	Common.log("Enter Email Id of Customer====>: "+staticEmail+ "</br>");
	System.err.println("Enter Email Id of Customer: "+staticEmail);
	
	information.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer-password']")));
	staticpassword=Common.getValueFromConfig("config.properties","Password");
	Common.pause(2);
	customerpassword.sendKeys(staticpassword);
	Common.log("Enter Email Id of Customer====>: "+staticpassword+ "</br>");
	System.err.println("Enter Email Id of Customer: "+staticpassword);
	
	information.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']")));
	Common.pause(3);
	LoginButton.click();
	Common.log("Click on Login Button After entering email id and password</br>");
	System.err.println("Click on Login Button After entering email id and password");
	
	Common.pause(8);
	
	companyname=Common.getValueFromConfig("config.properties","Companyname");
	information.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='company']")));
	Common.pause(2);
	Company_Name.sendKeys(companyname);
	Common.log("Enter Company Name====>: "+companyname+ "</br>");
	System.err.println("Enter Company Name: "+companyname);
	
	
	streetaddress=Common.getValueFromConfig("config.properties","Streetaddress2");
	information.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='street[0]']")));
	Common.pause(2);
	Street_Address.sendKeys(streetaddress);
	Common.log("Enter Street Address====>: "+streetaddress+ "</br>");
	System.err.println("Enter Street Address: "+streetaddress);
	
	
	city=Common.getValueFromConfig("config.properties","City2");
	information.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='city']")));
	Common.pause(2);
	City.sendKeys(city);
	Common.log("Enter City name====>:"+city+ "</br>");
	System.err.println("Enter City name: "+city);
	
	Common.pause(2);
	Select state_province=new Select(driver.findElement(By.xpath("//select[@name='region_id' and @class='select']")));
	state_province.selectByVisibleText("Illinois");
	Common.log("Select the State from the Drop Down :==> Illinois </br>");
	System.err.println("Select the State from the Drop Down :==> Illinois");
	
	
	zipcode=Common.getValueFromConfig("config.properties","Zipcode2");
	information.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='postcode']")));
	Common.pause(2);
	PinCode.sendKeys(zipcode);
	Common.log("Enter the Pin Code of the State: "+zipcode+ "</br>");
	System.err.println("Enter the Pin Code of the State : "+zipcode);
	
	Common.pause(2);
	Select Country=new Select(driver.findElement(By.xpath("//select[@name='country_id' and @class='select']")));
	Country.selectByVisibleText("United States");
	Common.log("Select the Country from the Drop Down :==> United States </br>");
	System.err.println("Select the Country from the Drop Down :==> United States");
	
	return new Checkoutloggedin_GeneralVerification(driver);
}



/*
 * Address Validation Pop Up
 */

public Checkoutloggedin_GeneralVerification Address_Validation_PopUp() throws IOException{
	
	
				phonenumber=Common.getValueFromConfig("config.properties","PhoneNumber");
				information.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='telephone']")));
				Common.pause(2);
				Contact_Number.sendKeys(phonenumber);
				Common.log("Enter the Phone Number of Customer: "+phonenumber+ "</br>");
				System.err.println("Enter the Phone Number of Customer : "+phonenumber);
				
				Common.logcase("Address Validation PopUp</br>");
				System.err.println("Address Validation PopUp");
				
				Common.pause(2);
				Address_Validation();
				
				Common.log("Click on Address Validation Pop Up Window</br>");
				System.err.println("Click on Address Validation Pop Up Window");
	
				return new Checkoutloggedin_GeneralVerification(driver);
	}


	/* Popup handling methods
	 * 
	 */
public Checkoutloggedin_GeneralVerification Address_Validation(){
	
	Common.pause(3);
	
	List<WebElement> continue_button = driver.findElements(By.xpath("//span[text()='Continue']"));
	
	if(continue_button.size()>0){
		
		driver.findElement(By.xpath("//div[@class='modal-content']//ul[2]/li/input")).click();
		Common.logstep("Clicked on : "+driver.findElement(By.xpath("//div[@class='modal-content']//ul[2]/li/input")).getAttribute("id"));
		Common.pause(2);
		
		driver.findElement(By.xpath("//aside[@role='dialog']//footer/button/span")).click();
		
		Common.logstep("Address Pop Up Is Displayed");
		System.err.println("Address Pop Up Is Displayed");
		
	}
	else{
		
		Common.logstep("Address Pop Up Is Not Displayed");
		System.err.println("Address Pop Up Is Not Displayed");
		
	}
	return new Checkoutloggedin_GeneralVerification(driver);
}





/*
 * Shipping Customer 
 */

public Checkoutloggedin_GeneralVerification Shipping_Customer(){
	
	
	WebDriverWait shippping=new WebDriverWait(driver, 100);
	shippping.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='s_method_amstrates_amstrates21']")));
	
	Common.pause(5);
	WebElement choose_a_shipping_option = driver.findElement(By.xpath("//input[@id='s_method_amstrates_amstrates21']"));
	Common.mouseOver(driver, choose_a_shipping_option);
	
	Common.pause(5);
	Common.clickOn(driver, choose_a_shipping_option);
	Common.log("Click on Ground Standard under Choose a Shipping Option</br></br>");
	System.err.println("Click on Ground Standard under Choose a Shipping Option");
	
	Common.pause(5);
	Click_On_Next.click();
	Common.log("After Filling all the detail Click on Next Button</br></br>");
	System.err.println("After Filling all the detail Click on Next Button");
	
	
	return new Checkoutloggedin_GeneralVerification(driver);
}



/*
 * Payment Method As Guest User
 */

@FindBy(xpath="//input[@id='braintree' and @type='radio']")
private WebElement credit_card_radiobutton;

public Checkoutloggedin_GeneralVerification credit_card_radiobutton() {
	
	WebDriverWait creditcard=new WebDriverWait(driver, 100);
	creditcard.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='braintree' and @type='radio']")));
	
	Common.pause(2);
	
	Common.clickOn(driver, credit_card_radiobutton);
	
	return new Checkoutloggedin_GeneralVerification(driver);
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

WebDriverWait details1=new WebDriverWait(driver, 100);

public Checkoutloggedin_GeneralVerification Credit_Card_Details() throws IOException {
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-number']")));
	
	creditCardNumber=Common.getValueFromConfig("config.properties","CreditCardNumber");
	details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='credit-card-number']")));
	Common.pause(2);
	credit_card_number.sendKeys(creditCardNumber);
	
	Common.log("Credit Card Number===>"+creditCardNumber+"</br>");
	System.err.println("Credit Card Number===>"+creditCardNumber+"</br>");
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-expirationDate']")));
	details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='expiration']")));
	expirationDate=Common.getValueFromConfig("config.properties","ExpirationDate");
	Common.pause(2);
	expiration_date.sendKeys(expirationDate);
	
	Common.log("Expiry Date===>"+expirationDate+"</br>");
	System.err.println("Expiry Date===>"+expirationDate+"</br>");
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-cvv']")));
	details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='cvv']")));
	cvvNumber=Common.getValueFromConfig("config.properties","CvvNumber");
	Common.pause(2);
	cvv_number.sendKeys(cvvNumber);
	
	Common.log("Cvv Number===>"+cvvNumber+"</br>");
	System.err.println("Cvv Number===>"+cvvNumber+"</br>");
	
	driver.switchTo().defaultContent();
	
	details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='primary']//button[contains(.,@data-role) and contains(.,'Place Order')]")));
	Common.pause(2);
	Place_order.click();
	
	return new Checkoutloggedin_GeneralVerification(driver);
}

}


