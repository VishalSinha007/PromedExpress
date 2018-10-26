package com.indexpage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.init.AbstractPage;
import com.init.Common;
import com.verification.MyPaymentData_GeneralVerification;

public class MyPaymentData_GeneralindexPage extends AbstractPage{
	
	static Random rand = new Random();
	static int  n = rand.nextInt(1000) + 10;
	
	public static String Email="";
	public static String staticpassword="baps@200";
	public static String fname="Vercu"+n+"las";
	public static String lname="Xav"+n+"ier";
	public static String companyname="TCS";
	public static String streetaddress=" 360 VETERANS PKWY";
	public static String city="BOLINGBROOK";
	public static String zipcode="60440-4609";
	public static String phonenumber="123456789";
	public static String creditCardNumber=null;
	public static String expirationDate=null;
	public static String cvvNumber=null;


	public MyPaymentData_GeneralindexPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	/*
	 * @Test Scenario : Add Simple Product to Cart
	 * 
	 */
	
	
	
	
	/*
	 * Click on I User Logo
	 */
	
	@FindBy(xpath="//div[@class='header-top-links']//ul//li//span//i")
	private WebElement isuerLogo1;
	
	public MyPaymentData_GeneralVerification isuerLogo1(){
		
		WebDriverWait logo=new WebDriverWait(driver, 100);
		logo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header-top-links']//ul//li//span//i")));
		
		Common.pause(2);
		isuerLogo1.click();
		
		return new MyPaymentData_GeneralVerification(driver);
	}
	
	
	/*
	 * Click on Create Account
	 */
	
	public MyPaymentData_GeneralVerification CreateNewAccount(){
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='header links']//li[2]//a")));
		
		Common.pause(2);
		List<WebElement> clickoncreatenewaccount = driver.findElements(By.xpath("//ul[@class='header links']//li[2]//a"));
		clickoncreatenewaccount.get(1).click();
		
		return new MyPaymentData_GeneralVerification(driver);
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
	
	WebDriverWait details1=new WebDriverWait(driver, 150);
	
	public MyPaymentData_GeneralVerification CreateNewAccountDetails() throws IOException{
		
		details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='prefix']")));
		Select nameprefix=new Select(driver.findElement(By.xpath("//select[@id='prefix']")));
		Common.pause(2);
		nameprefix.selectByVisibleText("Mr");
		
		
		details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='firstname']")));
		firstname.sendKeys(fname);
		Common.log("Enter First Name of Customer====>: "+fname+ "</br>");
		System.err.println("Enter First Name of Customer: "+fname);
		
		Common.pause(2);
		details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='lastname']")));
		lastname.sendKeys(lname);
		Common.log("Enter Last Name of Customer====>: "+lname+ "</br>");
		System.err.println("Enter Last Name of Customer: "+lname);
		
		
		details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='field choice newsletter']//input")));
		Common.pause(2);
		clickoncheckbox.click();
		Common.logstep("Click on Sign Up For Newsletter Check Box");
		System.err.println("Click on Sign Up For Newsletter Check Box");
		
		details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='control customer-dob']//input")));
		Common.pause(2);
		graduationdate.sendKeys("09/11/2015");
		Common.logstep("Type the graudation date===>09/11/2015");
		System.err.println("Type the graudation date===>09/11/2015");
		
		details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email_address']")));
		Email=Common.getRandomEmail();
		Common.pause(2);
		emailId.sendKeys(Email);
		Common.logstep("Type the email id ===>"+Email+"</br>");
		System.err.println("Type the email id ===>"+Email);
		
		details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
		Common.pause(2);
		password.sendKeys(staticpassword);
		Common.logstep("Type the password ===>"+staticpassword+"</br>");
		System.err.println("Type the password ===>"+staticpassword);
		
		details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password-confirmation']")));
		Common.pause(2);
		confirmpassword.sendKeys(staticpassword);
		Common.logstep("Type the same password under confirm password ===>"+staticpassword+"</br>");
		System.err.println("Type the same password under confirm password ===>"+staticpassword);
		
		details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']//span[contains(.,'Create an Account')]")));
		Common.pause(2);
		CreateaAccount.click();
		Common.logstep("After filling all the details click on Create A Account");
		System.err.println("After filling all the details click on Create A Account");
		
		return new MyPaymentData_GeneralVerification(driver);
	}
	
	
	
	/*
	 * Choose Orthopedic under Home Page
	 */

	@FindBy (xpath="//span[text()='Orthopedic']")
		private WebElement Orthopedic;
	
	public MyPaymentData_GeneralVerification clickonOrthopedic() {
		
		driver.navigate().to("https://promed-dev-scripco-refapp.accorin.us/");
		Common.pause(3);
		
		WebDriverWait orthopedic=new WebDriverWait(driver, 100);
		orthopedic.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Orthopedic']")));
		
		Common.pause(2);
		
		Common.mouseHover(driver, Orthopedic);
		
		return new MyPaymentData_GeneralVerification(driver);
	}
	
	/*
	 * Choose Positioning under Orthopedic
	 */
	
	public MyPaymentData_GeneralVerification Positioning() {
		
		WebDriverWait positioning=new WebDriverWait(driver, 100);
		positioning.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")));
		
		Common.pause(2);
		positioning.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")));
		
		Common.pause(2);
		driver.findElement(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")).click();
		
		return new MyPaymentData_GeneralVerification(driver);
	}
	
	/*
	 * Click on Foam Leg Elevating Splint, 8" - Elevated Wedge Cushion Add to Cart and Add the Product to the Cart
	 */
	
	
	public MyPaymentData_GeneralVerification Add_To_Cart() {
		
		
		WebDriverWait addtocart=new WebDriverWait(driver, 100);
		addtocart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]")));
		
		List<WebElement> Add_To_Cart = driver.findElements(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]"));
		Common.pause(2);
		Add_To_Cart.get(0).click();
		
		return new MyPaymentData_GeneralVerification(driver);
	}
	
	/*
	 * Click on My Cart Option
	 */
	
	public MyPaymentData_GeneralVerification My_Cart() {
		
		WebDriverWait showcart=new WebDriverWait(driver, 100);
		showcart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='action showcart']")));
		
		Common.pause(2);
		
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		
		return new MyPaymentData_GeneralVerification(driver);
	}
	
	
	/*
	 * Checkout From My Cart as Guest User
	 */
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	private WebElement Checkout;
	
	public MyPaymentData_GeneralVerification Checkout() {
		
		
		WebDriverWait checkout=new WebDriverWait(driver, 100);
		checkout.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='top-cart-btn-checkout']")));
		
		Common.pause(2);
		
		Checkout.click();
		
		return new MyPaymentData_GeneralVerification(driver);
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
	
	WebDriverWait wait=new WebDriverWait(driver, 150);
	
	public MyPaymentData_GeneralVerification Shipping_Information() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		/*wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer-email']")));
		Common.pause(1);
		email_id.sendKeys(Email);
		Common.log("Enter Email Id of Customer====>: "+Email+ "</br>");
		System.err.println("Enter Email Id of Customer===>: "+Email);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer-password']")));
		Common.pause(1);
		customerpassword.sendKeys(staticpassword);
		Common.log("Password of Customer====>: "+staticpassword+ "</br>");
		System.err.println("Password of Customer===>: "+staticpassword);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']")));
		Common.pause(1);
		LoginButton.click();
		Common.log("Click on Login Button After entering email id and password</br>");
		System.err.println("Click on Login Button After entering email id and password");*/
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='company']")));
		Common.pause(2);
		Company_Name.sendKeys(companyname);
		Common.log("Enter Company Name====>: "+companyname+ "</br>");
		System.err.println("Enter Company Name: "+companyname);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='street[0]']")));
		Common.pause(2);
		Street_Address.sendKeys(streetaddress);
		Common.log("Enter Street Address====>: "+streetaddress+ "</br>");
		System.err.println("Enter Street Address: "+streetaddress);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='city']")));
		Common.pause(2);
		City.sendKeys(city);
		Common.log("Enter City name====>:"+city+ "</br>");
		System.err.println("Enter City name: "+city);
		
		
		Common.pause(2);
		Select state_province=new Select(driver.findElement(By.xpath("//select[@name='region_id' and @class='select']")));
		state_province.selectByVisibleText("Illinois");
		Common.log("Select the State from the Drop Down :==> Illinois </br>");
		System.err.println("Select the State from the Drop Down :==> Illinois");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='postcode']")));
		Common.pause(2);
		PinCode.sendKeys(zipcode);
		Common.log("Enter the Pin Code of the State: "+zipcode+ "</br>");
		System.err.println("Enter the Pin Code of the State : "+zipcode);
		
		Common.pause(2);
		Select Country=new Select(driver.findElement(By.xpath("//select[@name='country_id' and @class='select']")));
		Country.selectByVisibleText("United States");
		Common.log("Select the Country from the Drop Down :==> United States </br>");
		System.err.println("Select the Country from the Drop Down :==> United States");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='telephone']")));
		Common.pause(2);
		Contact_Number.sendKeys(phonenumber);
		Common.log("Enter the Phone Number of Customer: "+phonenumber+ "</br>");
		System.err.println("Enter the Phone Number of Customer : "+phonenumber);
	
		
		return new MyPaymentData_GeneralVerification(driver);
	}
	
	
	
	/*
	 * Shipping Customer 
	 */
	
	public MyPaymentData_GeneralVerification Shipping_Customer(){
		
		
		WebDriverWait checkout=new WebDriverWait(driver, 100);
		checkout.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='s_method_amstrates_amstrates21']")));
		
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
		
		
		return new MyPaymentData_GeneralVerification(driver);
	}
	
	
	
	/*
	 * Payment Method As Guest User
	 */
	
	@FindBy(xpath="//input[@id='braintree' and @type='radio']")
	private WebElement credit_card_radiobutton;
	
	public MyPaymentData_GeneralVerification credit_card_radiobutton() {
		
		WebDriverWait creditcard=new WebDriverWait(driver, 100);
		creditcard.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='braintree' and @type='radio']")));
		
		Common.pause(2);
		
		Common.clickOn(driver, credit_card_radiobutton);
		
		return new MyPaymentData_GeneralVerification(driver);
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
	
	WebDriverWait details=new WebDriverWait(driver, 100);
	
	public MyPaymentData_GeneralVerification Credit_Card_Details() throws IOException {
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-number']")));
		
		creditCardNumber=Common.getValueFromConfig("config.properties","CreditCardNumber");
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='credit-card-number']")));
		Common.pause(2);
		credit_card_number.sendKeys(creditCardNumber);
		
		Common.log("Enter the Credit Card Number====>"+creditCardNumber+"</br>");
		System.out.println("Enter the Credit Card Number====>"+creditCardNumber+"</br>");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-expirationDate']")));
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='expiration']")));
		expirationDate=Common.getValueFromConfig("config.properties","ExpirationDate");
		Common.pause(2);
		expiration_date.sendKeys(expirationDate);
		
		Common.log("Enter the Credit Card Expiry Dater====>"+expirationDate+"</br>");
		System.out.println("Enter the Credit Card Expiry Date====>"+expirationDate+"</br>");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-cvv']")));
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='cvv']")));
		cvvNumber=Common.getValueFromConfig("config.properties","CvvNumber");
		Common.pause(2);
		cvv_number.sendKeys(cvvNumber);
		
		Common.log("Enter the Credit Card Cvv Number====>"+cvvNumber+"</br>");
		System.out.println("Enter the Credit Card Cvv Number====>"+cvvNumber+"</br>");
		
		driver.switchTo().defaultContent();
		
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='primary']//button[contains(.,@data-role) and contains(.,'Place Order')]")));
		Common.pause(2);
		Place_order.click();
		
		return new MyPaymentData_GeneralVerification(driver);
	}
	
	

	
	/*
	 * Click on I User Logo
	 */
	
	@FindBy(xpath="//span[@class='customer-name active']//i[@class='i-user']")	// //div[@class='header-top-links']//ul//li//span//i
	private WebElement isuerLogo;
	
	public MyPaymentData_GeneralVerification isuerLogo(){
		
		
		
		driver.navigate().to("https://promed-dev-scripco-refapp.accorin.us/");
		
		Common.pause(3);
		
		try {
			WebDriverWait logo1=new WebDriverWait(driver, 2);
			logo1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='customer-welcome active']//span[@class='customer-name active']//i")));
			
			Actions action=new Actions(driver);
			WebElement logo=driver.findElement(By.xpath("//li[@class='customer-welcome active']//span[@class='customer-name active']//i"));
			action.moveToElement(logo).click().build().perform();
			
			System.err.println("Try Block Executed");
		} 
			catch (Exception e) {
			
			WebDriverWait logo2=new WebDriverWait(driver, 3);
			logo2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='customer-welcome']//span[@class='customer-name']//i")));
			
			Common.pause(2);
			List<WebElement> clicklogo1 = driver.findElements(By.xpath("//li[@class='customer-welcome']//span[@class='customer-name']//i"));
			clicklogo1.get(0).click();
			System.err.println("Catch Block Executed");
			
		}
		
		
		
	/*	
		WebDriverWait logo=new WebDriverWait(driver, 30);
		logo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='customer-name active']//i[@class='i-user']")));
		
		Common.pause(3);
		Common.mouseHover(driver, driver.findElement(By.xpath("//span[@class='customer-name active']//i[@class='i-user']")));
		
		Common.pause(3);
		Common.clickOn(driver, isuerLogo);*/
		
		return new MyPaymentData_GeneralVerification(driver);
	}
	
	
	/*
	 * Click on My Order
	 */
	
	public MyPaymentData_GeneralVerification MyOrder(){
		
		WebDriverWait logo=new WebDriverWait(driver, 100);
		logo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='header links']//li[@class='nav item']//a[contains(.,'My Orders')]")));
		
		List<WebElement> clickoncreatenewaccount = driver.findElements(By.xpath("//ul[@class='header links']//li[@class='nav item']//a[contains(.,'My Orders')]"));
		Common.pause(2);
		clickoncreatenewaccount.get(0).click();
		
		Common.pause(1);
		driver.findElement(By.xpath("//li[@class='nav item current']//strong")).click();
		
		
		return new MyPaymentData_GeneralVerification(driver);
	}
	
	
	
	
	/*
	 * Click on Store Payment Method
	 */
	
	@FindBy(xpath="//div[@id='block-collapsible-nav']//li[9]//a")
	private WebElement storepaymentmethod;
	
	public MyPaymentData_GeneralVerification storepaymentmethod(){
		
		WebDriverWait store=new WebDriverWait(driver, 100);
		store.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='block-collapsible-nav']//li[9]//a")));
		
		Common.pause(2);
		storepaymentmethod.click();
		
		return new MyPaymentData_GeneralVerification(driver);
	}
	


}
