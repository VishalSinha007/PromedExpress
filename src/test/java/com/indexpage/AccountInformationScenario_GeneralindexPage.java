package com.indexpage;

import java.io.IOException;
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
import com.verification.AccountInformationScenario_GeneralVerification;
import com.verification.CheckOutandCreateAccount_GeneralVerification;

public class AccountInformationScenario_GeneralindexPage extends AbstractPage{
	
	static Random rand = new Random();
	static int  n = rand.nextInt(1000) + 10;
	
	public static String Email="";
	public static String password="qwerty@007";
	public static String fname="Ammy";
	public static String lname="Raley";
	public static String companyname="TCS";
	public static String streetaddress=" 360 VETERANS PKWY";
	public static String city="BOLINGBROOK";
	public static String zipcode="60440-4609";
	public static String phonenumber="123456789";
	public static String creditCardNumber=null;
	public static String expirationDate=null;
	public static String cvvNumber=null;

	public AccountInformationScenario_GeneralindexPage(WebDriver driver) {
		super(driver);
	}

	
	/*
	 * @Test Scenario : Account information scenarios 
				Change email id.
				Change password.
	 * 
	 */
	
	
	
	/*
	 * Click on I User Logo
	 */
	
	@FindBy(xpath="//div[@class='header-top-links']//ul//li//span//i")	//li[@class='customer-welcome']//span[@class='customer-name']//i
	private WebElement isuerLogo;
	
	public AccountInformationScenario_GeneralVerification isuerLogo(){
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header-top-links']//ul//li//span//i")));
		
		Common.pause(2);
		isuerLogo.click();
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}
	
	
	
	 /*
	  * Click on Create Account
	  */
	 
	
	public AccountInformationScenario_GeneralVerification CreateNewAccount(){
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='header links']//li[2]//a")));
		
		Common.pause(2);
		List<WebElement> clickoncreatenewaccount = driver.findElements(By.xpath("//ul[@class='header links']//li[2]//a"));
		clickoncreatenewaccount.get(1).click();
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}
	
	
	
	
	 /*
	  *  Click on Logout
	  */
	 
	
	public AccountInformationScenario_GeneralVerification Logout(){
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='header links']//li[2]//a")));
		
		Common.pause(2);
		List<WebElement> logout = driver.findElements(By.xpath("//ul[@class='header links']//li[2]//a"));
		logout.get(0).click();
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}
	
	
	
	 /*
	  *  Enter the Details under Create New Account
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
	private WebElement password2;
	
	@FindBy(xpath="//input[@id='password-confirmation']")
	private WebElement confirmpassword;
	
	@FindBy(xpath="//button[@type='submit']//span[contains(.,'Create an Account')]")
	private WebElement CreateaAccount;
	
	WebDriverWait details=new WebDriverWait(driver, 100);
	
	public AccountInformationScenario_GeneralVerification CreateNewAccountDetails(){
		
		Common.pause(2);
		
		Select nameprefix=new Select(driver.findElement(By.xpath("//select[@id='prefix']")));
		nameprefix.selectByVisibleText("Mr");
		
		
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='firstname']")));
		Common.pause(2);
		firstname.sendKeys(fname);
		Common.logstep("Enter First Name :===> "+fname+"</br>");
		System.err.println("Enter First Name :===> "+fname);
		
		
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='lastname']")));
		Common.pause(2);
		lastname.sendKeys(lname);
		Common.logstep("Enter Last Name :===> "+lname+"</br>");
		System.err.println("Enter Last Name :===> "+lname);
		
		
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
		Common.pause(2);
		Email=Common.getRandomEmail();
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys(Email);
		//emailId.sendKeys(Email);
		Common.logstep("Type the email id ===>"+Email+"</br>");
		System.err.println("Type the email id ===>"+Email);
		
		
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
		Common.pause(2);
		password2.sendKeys(password);
		Common.logstep("Type the password ===>"+password+"</br>");
		System.err.println("Type the password ===>"+password);
		
		
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password-confirmation']")));
		Common.pause(2);
		confirmpassword.sendKeys(password);
		Common.logstep("Type the same password under confirm password ===>"+password+"</br>");
		System.err.println("Type the same password under confirm password ===>"+password);
		
		
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']//span[contains(.,'Create an Account')]")));
		Common.pause(2);
		CreateaAccount.click();
		Common.logstep("After filling all the details click on Create A Account");
		System.err.println("After filling all the details click on Create A Account");
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}
	
	
	
	
	
	
	/*
	 * Choose Orthopedic under Home Page
	 */

	@FindBy (xpath="//span[text()='Orthopedic']")
		private WebElement Orthopedic;
	
	public AccountInformationScenario_GeneralVerification clickonOrthopedic() {
		
		WebDriverWait orthopedic=new WebDriverWait(driver, 100);
		orthopedic.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Orthopedic']")));
		
		Common.pause(2);
		
		Common.mouseHover(driver, Orthopedic);
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}
	
	/*
	 * Choose Positioning under Orthopedic
	 */
	
	public AccountInformationScenario_GeneralVerification Positioning() {
		
		WebDriverWait positioning=new WebDriverWait(driver, 100);
		positioning.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")));
		
		Common.pause(2);
		
		Common.mouseHover(driver, driver.findElement(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")));
		
		driver.findElement(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")).click();
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}
	
	/*
	 * Click on Foam Leg Elevating Splint, 8" - Elevated Wedge Cushion Add to Cart and Add the Product to the Cart
	 */
	
	
	public AccountInformationScenario_GeneralVerification Add_To_Cart() {
		
		Common.pause(2);
		
		WebDriverWait addtocart=new WebDriverWait(driver, 100);
		addtocart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]")));
		
		Common.pause(2);
		List<WebElement> Add_To_Cart = driver.findElements(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]"));
		Add_To_Cart.get(0).click();
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}
	
	/*
	 * Click on My Cart Option
	 */
	
	public AccountInformationScenario_GeneralVerification My_Cart() {
		
		WebDriverWait showcart=new WebDriverWait(driver, 100);
		showcart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='action showcart']")));
		
		Common.pause(2);
		
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}
	
	
	/*
	 * Checkout From My Cart as Guest User
	 */
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	private WebElement Checkout;
	
	public AccountInformationScenario_GeneralVerification Checkout() {
		
		
		WebDriverWait checkout=new WebDriverWait(driver, 100);
		checkout.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='top-cart-btn-checkout']")));
		
		Common.pause(2);
		
		Checkout.click();
		
		return new AccountInformationScenario_GeneralVerification(driver);
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
	
	public AccountInformationScenario_GeneralVerification Shipping_Information()  {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer-email']")));
		
		Common.pause(2);
		email_id.sendKeys(Email);
		Common.log("Enter Email Id of Customer====>: "+Email+ "</br>");
		System.err.println("Enter Email Id of Customer: "+Email);
		
		Common.pause(2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer-password']")));
		Common.pause(2);
		customerpassword.sendKeys(password);
		Common.log("Password of Customer====>: "+password+ "</br>");
		System.err.println("Password of Customer: "+password);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']")));
		Common.pause(2);
		Common.jsClick(driver, LoginButton);
		//LoginButton.click();
		Common.log("Click on Login Button After entering email id and password</br>");
		System.err.println("Click on Login Button After entering email id and password");
	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='company']")));
		Common.pause(3);
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
	
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}
	
	
	
	/*
	 * Shipping Customer 
	 */
	
	public AccountInformationScenario_GeneralVerification Shipping_Customer(){
		
		Common.pause(5);
		
		WebDriverWait checkout=new WebDriverWait(driver, 100);
		checkout.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='s_method_amstrates_amstrates21']")));
		
		Common.pause(8);
		
		WebElement choose_a_shipping_option = driver.findElement(By.xpath("//input[@id='s_method_amstrates_amstrates21']"));
		Common.mouseOver(driver, choose_a_shipping_option);
		Common.pause(3);
		
		Common.clickOn(driver, choose_a_shipping_option);
		Common.log("Click on Ground Standard under Choose a Shipping Option</br>");
		System.err.println("Click on Ground Standard under Choose a Shipping Option");
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Next']")));
		Common.pause(4);
		Click_On_Next.click();
		Common.log("After Filling all the detail Click on Next Button</br>");
		System.err.println("After Filling all the detail Click on Next Button");
		
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}
	
	
	
	/*
	 * Payment Method As Guest User
	 */
	
	@FindBy(xpath="//input[@id='braintree' and @type='radio']")
	private WebElement credit_card_radiobutton;
	
	public AccountInformationScenario_GeneralVerification credit_card_radiobutton() {
		
		WebDriverWait checkout=new WebDriverWait(driver, 100);
		checkout.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='braintree' and @type='radio']")));
		Common.pause(2);
		
		Common.clickOn(driver, credit_card_radiobutton);
		
		return new AccountInformationScenario_GeneralVerification(driver);
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

public CheckOutandCreateAccount_GeneralVerification Credit_Card_Details() throws IOException {
	
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-number']")));
	creditCardNumber=Common.getValueFromConfig("config.properties","CreditCardNumber");
	
	details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='credit-card-number']")));
	Common.pause(2);
	credit_card_number.sendKeys(creditCardNumber);
	Common.log("Credit Card Number===>"+creditCardNumber+"</br>");
	System.err.println("Credit Card Number===>"+creditCardNumber+"</br>");
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-expirationDate']")));
	expirationDate=Common.getValueFromConfig("config.properties","ExpirationDate");
	
	details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='expiration']")));
	Common.pause(2);
	expiration_date.sendKeys(expirationDate);
	Common.log("Expiry Date===>"+expirationDate+"</br>");
	System.err.println("Expiry Date===>"+expirationDate+"</br>");
	
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-cvv']")));
	cvvNumber=Common.getValueFromConfig("config.properties","CvvNumber");
	details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='cvv']")));
	Common.pause(2);
	cvv_number.sendKeys(cvvNumber);
	Common.log("Cvv Number===>"+cvvNumber+"</br>");
	System.err.println("Cvv Number===>"+cvvNumber+"</br>");
	
	
	driver.switchTo().defaultContent();
	
	details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='primary']//button[contains(.,@data-role) and contains(.,'Place Order')]")));
	Common.pause(2);
	Place_order.click();
	
	return new CheckOutandCreateAccount_GeneralVerification(driver);
}
	
	
	
	/*
	 * Click on I User Logo
	 */
	
	@FindBy(xpath="//span[@class='customer-name active']//i[@class='i-user']")	// //div[@class='header-top-links']//ul//li//span//i
	private WebElement isuerLogo1;
	
	public AccountInformationScenario_GeneralVerification isuerLogo1(){
		
		//   //li[@class='customer-welcome']//span[@class='customer-name']//i
		
		Common.pause(3);
		
		driver.navigate().to("https://promed-dev-scripco-refapp.accorin.us/");
		
		try {
			WebDriverWait logo1=new WebDriverWait(driver, 2);
			logo1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='customer-welcome active']//span[@class='customer-name active']//i")));
			
			Actions action=new Actions(driver);
			WebElement logo=driver.findElement(By.xpath("//li[@class='customer-welcome active']//span[@class='customer-name active']//i"));
			action.moveToElement(logo).click().build().perform();
			
			System.err.println("Try Block Executed");
		} 
			catch (Exception e) {
			
			WebDriverWait logo2=new WebDriverWait(driver, 5);
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
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}
	
	
	/*
	 * Click on My Order
	 */
	
	public AccountInformationScenario_GeneralVerification MyOrder(){
		
		WebDriverWait logo=new WebDriverWait(driver, 100);
		logo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='header links']//li[@class='nav item']//a[contains(.,'My Orders')]")));
		
		Common.pause(2);
		List<WebElement> clickoncreatenewaccount = driver.findElements(By.xpath("//ul[@class='header links']//li[@class='nav item']//a[contains(.,'My Orders')]"));
		Common.pause(2);
		clickoncreatenewaccount.get(0).click();
		
		/*Common.pause(1);
		driver.findElement(By.xpath("//li[@class='nav item current']//strong")).click();*/
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}
	
	
	/*
	 * Click on My Order Option
	 */
	
	/*@FindBy(xpath="//strong[contains(.,'My Orders')]")
	private WebElement myorder;
	
	public AccountInformationScenario_GeneralVerification myorder(){
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(.,'My Orders')]")));
		
		Common.pause(1);
		myorder.click();
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}*/
	
	
	
	
	/*
	 * Click on Account Information
	 */
	@FindBy(xpath="//ul//li[@class='nav item']//a[contains(.,'Account Information')]")
	private WebElement accountinformation;
	
	public AccountInformationScenario_GeneralVerification accountinformation(){
		
		WebDriverWait accountinfo=new WebDriverWait(driver, 100);
		accountinfo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul//li[@class='nav item']//a[contains(.,'Account Information')]")));
		
		Common.pause(2);
		Common.clickOn(driver, accountinformation);
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}
	
	
	/*
	 * Click on Change Email Checkbox
	 */
	
	
	@FindBy(xpath="//div[@class='field choice']//input[@id='change-email']")
	private WebElement emailcheckbox;
	
	public AccountInformationScenario_GeneralVerification emailcheckbox(){
		
		WebDriverWait accountinfo=new WebDriverWait(driver, 150);
		accountinfo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='field choice']//input[@id='change-email']")));
		
		Common.pause(2);
		Common.clickOn(driver, emailcheckbox);
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}
	
	
	/*
	 * Change Email ID 
	 */
	
	
	static Random rand1 = new Random();
	static int  n1 = rand1.nextInt(10000) + 100;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement changeemail;
	
	@FindBy(xpath="//input[@id='current-password']")
	private WebElement currentpassword;
	
	String changeemailid="prashantp+"+n1+"@accorin.com";
	
	public AccountInformationScenario_GeneralVerification changeemail(){
		
		WebDriverWait email=new WebDriverWait(driver, 100);
		email.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
		
		Common.pause(2);
		changeemail.clear();
		Common.pause(2);
		changeemail.sendKeys(changeemailid);
		Common.log("Change Email Id===>"+changeemailid+"</br>");
		System.err.println("Change Email Id===>"+changeemailid+"</br>");
		
		WebDriverWait password=new WebDriverWait(driver, 100);
		password.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='current-password']")));
		
		Common.pause(2);
		currentpassword.sendKeys("qwerty@007");
		Common.log("Change Password===> qwerty@007 </br>");
		System.err.println("Change Passowrd===>qwerty@007</br>");
		
		driver.findElement(By.xpath("//button[@title='Save']//span")).click();
		Common.log("Click on Save buttton");
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}
	
	
	/*
	 * Click on Change Password
	 */
	
	@FindBy(xpath="//div[@class='box-actions']//a[contains(.,'Change Password')]")
	private WebElement changepassword;
	
	@FindBy(xpath="//input[@id='current-password']")
	private WebElement currentpassword1;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement newpassword;
	
	@FindBy(xpath="//input[@id='password-confirmation']")
	private WebElement passwordconformation;
	
	@FindBy(xpath="//button[@title='Save']//span")
	private WebElement savebutton;
	
	public AccountInformationScenario_GeneralVerification changepassword(){
		
		WebDriverWait password=new WebDriverWait(driver, 100);
		password.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='box-actions']//a[contains(.,'Change Password')]")));
		
		Common.pause(2);
		changepassword.click();
		
		
		WebDriverWait crntpswrd=new WebDriverWait(driver, 100);
		crntpswrd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='current-password']")));
		Common.pause(2);
		currentpassword1.sendKeys("qwerty@007");
		Common.log("Current Password===> qwerty@007 </br>");
		System.err.println("Current Passowrd===>qwerty@007</br>");
		
		WebDriverWait password1=new WebDriverWait(driver, 100);
		password1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
		
		Common.pause(2);
		newpassword.sendKeys("abcdef@007");
		Common.log("New Password===> abcdef@007 </br>");
		System.err.println("New Passowrd===>abcdef@007</br>");
		
		WebDriverWait pswrdcnfrm=new WebDriverWait(driver, 100);
		pswrdcnfrm.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password-confirmation']")));
		Common.pause(2);
		passwordconformation.sendKeys("abcdef@007");
		Common.log("Confirm Password===> abcdef@007 </br>");
		System.err.println("Confirm Passowrd===>abcdef@007</br>");
		
		
		WebDriverWait save=new WebDriverWait(driver, 100);
		save.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Save']//span")));
		Common.pause(2);
		savebutton.click();
		
		Common.log("Click on Save Button");
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}
	
	
	
	/*
	 * Verify that Email Id and Password of the User has Changed
	 */
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement newemailid;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement newpassword1;
	
	@FindBy(xpath="//button[@id='send2']/span")
	private WebElement SignIn;
	
	WebDriverWait confirmation=new WebDriverWait(driver, 100);
	
	public AccountInformationScenario_GeneralVerification loginwithnewusrnpswrd(){
		
		
		confirmation.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
		Common.pause(2);
		newemailid.sendKeys(changeemailid);
		Common.log("New User Name ===>"+changeemailid+"</br>");
		
		confirmation.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pass']")));
		Common.pause(2);
		newpassword1.sendKeys("abcdef@007");
		Common.log("New Password ===>abcdef@007");
		
		confirmation.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='send2']/span")));
		Common.pause(2);
		SignIn.click();
		
		return new AccountInformationScenario_GeneralVerification(driver);
	}
	
	

	
}
