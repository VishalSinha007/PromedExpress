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
import com.verification.CheckOutandCreateAccount_GeneralVerification;

public class CheckOutandCreateAccount_GeneralIndexPage extends AbstractPage{
	
	static Random rand = new Random();
	static int  n = rand.nextInt(50000) + 500;
	
	public static String randomEmail="";
	public static String randomEmailnew="";
	public static String staticpassword="";
	public static String randomfname=null;
	public static String randomlname=null;
	public static String randomcompanyname=null;
	public static String streetaddress=null;
	public static String city=null;
	public static String zipcode=null;
	public static String randomphonenumber=null;
	public static String creditCardNumber=null;
	public static String expirationDate=null;
	public static String cvvNumber=null;
	

	public CheckOutandCreateAccount_GeneralIndexPage(WebDriver driver) {
		super(driver);
		
	}

	
	
	/*
	 * @Test Scenario : Add Simple Product to Cart
	 */
	
	/*
	 * Choose Orthopedic under Home Page
	 */

	@FindBy (xpath="//span[text()='Mobility']")
	private WebElement Mobility;

public CheckOutandCreateAccount_GeneralVerification clickonMobility() {
	
	WebDriverWait wait=new WebDriverWait(driver, 150);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Mobility']")));
	
	Common.pause(2);
	
	Common.mouseHover(driver, Mobility);
	
	return new CheckOutandCreateAccount_GeneralVerification(driver);
}

/*
 * Choose Geri Chairs under Mobility
 */
@FindBy(xpath="//div[4]//span[contains(text(),'Geri Chairs')]")
private WebElement Geri_Chairs;

public CheckOutandCreateAccount_GeneralVerification Geri_Chairs() {
	
	WebDriverWait wait=new WebDriverWait(driver, 150);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[4]//span[contains(text(),'Geri Chairs')]")));
	
	Common.pause(2);
	Geri_Chairs.click();
	
	return new CheckOutandCreateAccount_GeneralVerification(driver);
}

/*
 * Click on Foam Leg Elevating Splint, 8" - Elevated Wedge Cushion Add to Cart and Add the Product to the Cart
 */


public CheckOutandCreateAccount_GeneralVerification Add_To_Cart() {
	
	WebDriverWait wait=new WebDriverWait(driver, 150);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]")));
	
	WebElement Add_To_Cart = driver.findElement(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]"));
	Common.pause(2);
	Add_To_Cart.click();
	
	return new CheckOutandCreateAccount_GeneralVerification(driver);
}

/*
 * Click on My Cart Option
 */
@FindBy(xpath="//a[@class='action showcart']")
private WebElement My_Cart;

public CheckOutandCreateAccount_GeneralVerification My_Cart() {
	
	WebDriverWait wait=new WebDriverWait(driver, 150);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='action showcart']")));
	
	Common.pause(2);
	My_Cart.click();
	
	return new CheckOutandCreateAccount_GeneralVerification(driver);
}


/*
 * Checkout From My Cart as Guest User
 */

@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
private WebElement Checkout;

public CheckOutandCreateAccount_GeneralVerification Checkout() {
	
	WebDriverWait wait=new WebDriverWait(driver, 150);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='top-cart-btn-checkout']")));
	
	Common.pause(2);
	
	Checkout.click();
	
	return new CheckOutandCreateAccount_GeneralVerification(driver);
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

@FindBy(xpath="//button[@class='button action continue primary']")
private WebElement Click_On_Next;

WebDriverWait wait=new WebDriverWait(driver, 200);

public CheckOutandCreateAccount_GeneralVerification Shipping_Information() throws IOException {
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer-email']")));
	randomEmailnew=Common.getRandomEmail();
	Common.pause(2);
	email_id.sendKeys(randomEmailnew);
	Common.log("Enter Email Id of Customer====>: "+randomEmailnew+ "</br>");
	System.err.println("Enter Email Id of Customer: "+randomEmailnew);
	
	Common.pause(3);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='firstname']")));
	randomfname="aa"+n+Common.getValueFromConfig("config.properties","Fname");
	First_Name.sendKeys(randomfname);
	Common.log("Enter First Name of Customer====>: "+randomfname+ "</br>");
	System.err.println("Enter First Name of Customer: "+randomfname);
	
	Common.pause(2);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='lastname']")));
	randomlname="aa"+n+Common.getValueFromConfig("config.properties","Lname");
	Last_Name.sendKeys(randomlname);
	Common.log("Enter Last Name of Customer====>: "+randomlname+ "</br>");
	System.err.println("Enter Last Name of Customer: "+randomlname);
	
	Common.pause(2);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='company']")));
	randomcompanyname="aa"+n+Common.getValueFromConfig("config.properties","Companyname");
	Company_Name.sendKeys(randomcompanyname);
	Common.log("Enter Company Name====>: "+randomcompanyname+ "</br>");
	System.err.println("Enter Company Name: "+randomcompanyname);
	
	Common.pause(2);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='street[0]']")));
	streetaddress=Common.getValueFromConfig("config.properties","Streetaddress1");
	Street_Address.sendKeys(streetaddress);
	Common.log("Enter Street Address====>: "+streetaddress+ "</br>");
	System.err.println("Enter Street Address: "+streetaddress);
	
	Common.pause(2);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='city']")));
	city=Common.getValueFromConfig("config.properties","City1");
	City.sendKeys(city);
	Common.log("Enter City name====>:"+city+ "</br>");
	System.err.println("Enter City name: "+city);
	
	Common.pause(2);
	Select state_province=new Select(driver.findElement(By.xpath("//select[@name='region_id' and @class='select']")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='region_id' and @class='select']")));
	state_province.selectByVisibleText("Illinois");
	Common.log("Select the State from the Drop Down :==> Illinois </br></br>");
	System.err.println("Select the State from the Drop Down :==> Illinois");
	
	Common.pause(2);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='postcode']")));
	zipcode=Common.getValueFromConfig("config.properties","Zipcode1");
	PinCode.sendKeys(zipcode);
	Common.log("Enter the Pin Code of the State: "+zipcode+ "</br>");
	System.err.println("Enter the Pin Code of the State : "+zipcode);
	
	Common.pause(2);
	Select Country=new Select(driver.findElement(By.xpath("//select[@name='country_id' and @class='select']")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='country_id' and @class='select']")));
	Country.selectByVisibleText("United States");
	Common.log("Select the Country from the Drop Down :==> United States </br></br>");
	System.err.println("Select the Country from the Drop Down :==> United States");
	
	return new CheckOutandCreateAccount_GeneralVerification(driver);
}



/*
 * Address Validation Pop Up
 */

public CheckOutandCreateAccount_GeneralVerification Address_Validation_PopUp() throws IOException{
	
	
				randomphonenumber=Common.getValueFromConfig("config.properties","PhoneNumber");
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='telephone']")));
				Contact_Number.sendKeys(randomphonenumber);
				Common.log("Enter the Phone Number of Customer: "+randomphonenumber+ "</br>");
				System.err.println("Enter the Phone Number of Customer : "+randomphonenumber);
				
				Common.logcase("Address Validation PopUp</br></br>");
				System.err.println("Address Validation PopUp");
				
				Common.pause(2);
				Address_Validation();
				
				Common.log("Click on Address Validation Pop Up Window</br></br>");
				System.err.println("Click on Address Validation Pop Up Window");
	
				return new CheckOutandCreateAccount_GeneralVerification(driver);
	}


	/* Popup handling methods
	 * 
	 */
public CheckOutandCreateAccount_GeneralVerification Address_Validation(){
	
	Common.pause(3);
	
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
	return new CheckOutandCreateAccount_GeneralVerification(driver);
}





/*
 * Shipping Customer 
 */

public CheckOutandCreateAccount_GeneralVerification Shipping_Customer(){
	
	WebDriverWait wait=new WebDriverWait(driver, 200);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='s_method_amstrates_amstrates21']")));
	
	Common.pause(5);
	WebElement choose_a_shipping_option = driver.findElement(By.xpath("//input[@id='s_method_amstrates_amstrates21']"));
	Common.mouseOver(driver, choose_a_shipping_option);
	Common.pause(5);
	
	Common.clickOn(driver, choose_a_shipping_option);
	Common.log("Click on Ground Standard under Choose a Shipping Option</br></br>");
	System.err.println("Click on Ground Standard under Choose a Shipping Option");
	
	Common.pause(3);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button action continue primary']")));
	Common.pause(2);
	Click_On_Next.click();
	Common.log("After Filling all the detail Click on Next Button</br></br>");
	System.err.println("After Filling all the detail Click on Next Button");
	
	
	return new CheckOutandCreateAccount_GeneralVerification(driver);
}



/*
 * Payment Method As Guest User
 */

@FindBy(xpath="//input[@id='braintree' and @type='radio']")
private WebElement credit_card_radiobutton;

public CheckOutandCreateAccount_GeneralVerification credit_card_radiobutton() {
	
	WebDriverWait wait=new WebDriverWait(driver, 200);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='braintree' and @type='radio']")));
	
	Common.pause(2);
	
	Common.clickOn(driver, credit_card_radiobutton);
	
	return new CheckOutandCreateAccount_GeneralVerification(driver);
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

public CheckOutandCreateAccount_GeneralVerification Credit_Card_Details() throws IOException {
	
	WebDriverWait wait=new WebDriverWait(driver, 150);
	
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-number']")));
	creditCardNumber=Common.getValueFromConfig("config.properties","CreditCardNumber");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='credit-card-number']")));
	Common.pause(2);
	credit_card_number.sendKeys(creditCardNumber);
	
	Common.log("Credit Card Number===>"+creditCardNumber+"</br>");
	System.out.println("Credit Card Number===>"+creditCardNumber+"</br>");
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-expirationDate']")));
	expirationDate=Common.getValueFromConfig("config.properties","ExpirationDate");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='expiration']")));
	Common.pause(2);
	expiration_date.sendKeys(expirationDate);
	
	Common.log("Credit Card Expiry Date===>"+expirationDate+"</br>");
	System.out.println("Credit Card Expiry dater===>"+expirationDate+"</br>");
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-cvv']")));
	cvvNumber=Common.getValueFromConfig("config.properties","CvvNumber");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='cvv']")));
	Common.pause(2);
	cvv_number.sendKeys(cvvNumber);
	
	Common.log("Credit Card Cvv Number===>"+cvvNumber+"</br>");
	System.out.println("Credit Card Cvv Number===>"+cvvNumber+"</br>");
	
	driver.switchTo().defaultContent();
	
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='primary']//button[contains(.,@data-role) and contains(.,'Place Order')]")));
	Common.pause(2);
	Place_order.click();
	
	return new CheckOutandCreateAccount_GeneralVerification(driver);
}
	
	/*
	 * Verify Email In Gmail
	 */

public CheckOutandCreateAccount_GeneralVerification LogintoGmail() throws IOException{
	
Common.pause(3);
	
	WebElement emailid = driver.findElement(By.xpath("//input[@id='identifierId']"));	
	randomEmail=Common.getValueFromConfig("config.properties","Email");
	Common.pause(2);
	emailid.sendKeys(randomEmail);
	
	
	Common.pause(2);
	driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
	
	Common.pause(2);
	WebElement password1 = driver.findElement(By.xpath("//input[@type='password' and @name='password']"));
	password=Common.getValueFromConfig("config.properties","Password");
	password1.sendKeys(password);
	
	Common.pause(2);
	driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
	
	/*Common.pause(8);
	Common.refresh(driver);
	
	Common.pause(8);
	driver.findElement(By.xpath("//span[@role='button']//span[text()]")).click();
	
	Common.pause(3);
	driver.findElement(By.xpath("//a[text()='Spam']")).click();
	
	
	List<WebElement> clickoncheckboxinspam = driver.findElements(By.xpath("//div[@class='ae4 UI']//table//tbody//td[2]"));
	WebDriverWait wait=new WebDriverWait(driver, 150);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ae4 UI']//table//tbody//td[2]")));
	
	Common.pause(2);
	clickoncheckboxinspam.get(0).click();
	
	Common.pause(2);
	clickoncheckboxinspam.get(1).click();
	
	Common.pause(2);
	clickoncheckboxinspam.get(2).click();
	
	Common.pause(2);
	clickoncheckboxinspam.get(3).click();
	
	Common.pause(2);
	clickoncheckboxinspam.get(4).click();
	
	WebDriverWait wait3=new WebDriverWait(driver, 150);
	wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='button']//div[contains(.,'Not spam')]")));
	
	Common.pause(2);
	driver.findElement(By.xpath("//div[@role='button']//div[contains(.,'Not spam')]")).click();
	
	
	Common.refresh(driver);
	
	Common.pause(5);
	
	driver.findElement(By.xpath("//span[@class='nU n1']//a[text()='Inbox']")).click();*/
	
	
	
	
	WebDriverWait wait2=new WebDriverWait(driver, 150);
	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='aDP']//table[@class='F cf zt']//tr[contains(.,'Welcome to ProMed Xpress Products')]")));
	Common.pause(3);
	driver.findElement(By.xpath("//div[@class='aDP']//table[@class='F cf zt']//tr[contains(.,'Welcome to ProMed Xpress Products')]")).click();
	
	
/*	driver.findElement(By.xpath("//div[@class='ae4 UI']//div/table/tbody//tr[1]")).click();
	
	Common.pause(2);
	
	Common.waitForElement(driver, By.xpath("//div[@class='yW']/span//span[contains(.,'ProMed Products Xpr.')]"));
	*/
	
	
	WebDriverWait gmail=new WebDriverWait(driver, 150);
	gmail.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'To sign in to our site and set a password, click on the')]//a[text()='link']")));
	
	Common.pause(3);
	gmail.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(.,'To sign in to our site and set a password, click on the')]//a[text()='link']")));
	
	Common.pause(3);
	driver.findElement(By.xpath("//p[contains(.,'To sign in to our site and set a password, click on the')]//a[text()='link']")).click();
	
	Common.pause(2);
	String currWin=driver.getWindowHandle();
	Common.pause(2);
	
	Common.pause(3);
	
	for (String handle : driver.getWindowHandles()) {
		 
		driver.switchTo().window(handle);
		
		System.err.println("----"+handle+"-----");
		
	}
	
	WebElement password2=driver.findElement(By.xpath("//input[@id='password']"));
	staticpassword=Common.getValueFromConfig("config.properties","Password");
	password2.sendKeys(staticpassword);
	
	
	WebElement pwsrd = driver.findElement(By.xpath("//input[@id='password-confirmation']"));
	staticpassword=Common.getValueFromConfig("config.properties","Password");
	pwsrd.sendKeys(staticpassword);
	
	driver.findElement(By.xpath("//button[@class='action submit primary']//span")).click();
	
	driver.switchTo().window(currWin);
	
	return new CheckOutandCreateAccount_GeneralVerification(driver);
}
	
	/*
	 * Create Account
	 */

public CheckOutandCreateAccount_GeneralVerification CreateAccount() throws IOException{
	
	Common.pause(5);
	
	driver.navigate().to("https://promed-dev-scripco-refapp.accorin.us/");
	Common.log("Go to the Home Page");
	
	Common.pause(3);
	driver.findElement(By.xpath("//div[@class='header-top-links']//ul//li//span//i")).click();
	Common.log("Click on the Icon");
	
	Common.pause(2);
	List<WebElement> login = driver.findElements(By.xpath("//ul[@class='header links']//li[2]//a"));
	login.get(0).click();
	Common.log("Click on the Login Button");
	
	Common.pause(2);
	
	driver.findElement(By.xpath("//input[@name='login[username]' and @id='email']")).sendKeys(randomEmailnew);
	Common.log("Enter the Username ====>"+randomEmailnew+"</br>");
	
	Common.pause(2);
	WebElement ps = driver.findElement(By.xpath("//input[@name='login[password]' and @id='pass']"));
	staticpassword=Common.getValueFromConfig("config.properties","Password");
	ps.sendKeys(staticpassword);
	Common.log("Enter the Password ====>"+staticpassword+"</br>");
	
	Common.pause(2);
	driver.findElement(By.xpath("//span[text()='Sign In']")).click();
	Common.log("Click on Sign In Button");
	
	return new CheckOutandCreateAccount_GeneralVerification(driver);
}
	
}
