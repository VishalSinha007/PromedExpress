package com.indexpage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.init.AbstractPage;
import com.init.Common;
import com.verification.ValidatePaymentMethod_GeneralVerification;

public class ValidatePaymentMethod_GeneralindexPage extends AbstractPage{
	
	static Random rand = new Random();
	static int  n = rand.nextInt(1000000) + 1000;
	
	public static String randomEmail="";
	public static String staticEmail="prashantp+"+n+"@accorin.com";
	public static String EmailId="";
	public static String staticpassword="baps@200";
	public static String ramdomfname=null;
	public static String randomlname=null;
	public static String randomcompanyname=null;
	public static String streetaddress=null;
	public static String city=null;
	public static String zipcode=null;
	public static String randomphonenumber=null;
	public static String creditCardNumber=null;
	public static String expirationDate=null;
	public static String cvvNumber=null;

	public ValidatePaymentMethod_GeneralindexPage(WebDriver driver) {
		super(driver);
		
	}
	
	/*
	 * @Test Scenario : Validate Payment Method====>Credit Card
	 */
	
	/*
	 * Choose Orthopedic under Home Page
	 */

	@FindBy (xpath="//span[text()='Orthopedic']")
		private WebElement Orthopedic;
	
	public ValidatePaymentMethod_GeneralVerification clickonOrthopedic() {
		
		Common.logcaseorange("Credit Card Validation");
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Orthopedic']")));
		
		Common.pause(1);
		
		Common.mouseHover(driver, Orthopedic);
		
		return new ValidatePaymentMethod_GeneralVerification(driver);
	}
	
	/*
	 * Choose Positioning under Orthopedic
	 */
	
	public ValidatePaymentMethod_GeneralVerification Positioning() {
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")));
		
		Common.pause(2);
		Common.mouseHover(driver, driver.findElement(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")));
		
		Common.pause(2);
		driver.findElement(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")).click();
		
		return new ValidatePaymentMethod_GeneralVerification(driver);
	}
	
	/*
	 * Click on Foam Leg Elevating Splint, 8" - Elevated Wedge Cushion Add to Cart and Add the Product to the Cart
	 */
	
	
	public ValidatePaymentMethod_GeneralVerification Add_To_Cart() {
		
		WebDriverWait addtocart=new WebDriverWait(driver, 100);
		addtocart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]")));
		
		Common.pause(2);
		List<WebElement> Add_To_Cart = driver.findElements(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]"));
		
		Add_To_Cart.get(0).click();
		
		return new ValidatePaymentMethod_GeneralVerification(driver);
	}
	
	/*
	 * Click on My Cart Option
	 */
	
	public ValidatePaymentMethod_GeneralVerification My_Cart() {
		
		WebDriverWait mycart=new WebDriverWait(driver, 100);
		mycart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='action showcart']")));
		
		Common.pause(2);
		
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		
		return new ValidatePaymentMethod_GeneralVerification(driver);
	}
	
	
	/*
	 * Checkout From My Cart as Guest User
	 */
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	private WebElement Checkout;
	
	public ValidatePaymentMethod_GeneralVerification Checkout() {
		
		
		WebDriverWait checkout=new WebDriverWait(driver, 100);
		checkout.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='top-cart-btn-checkout']")));
		
		Common.pause(2);
		
		Checkout.click();
		
		return new ValidatePaymentMethod_GeneralVerification(driver);
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
	
	WebDriverWait wait=new WebDriverWait(driver, 150);
	
	public ValidatePaymentMethod_GeneralVerification Shipping_Information() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		Common.pause(2);
		
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='shipping-address-item selected-item']")));
	
	Common.pause(2);
	
	//driver.findElement(By.xpath("//div[@class='shipping-address-item selected-item']")).click();
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer-email']")));
		randomEmail=Common.getRandomEmail();
		email_id.sendKeys(randomEmail);
		Common.log("Enter Email Id of Customer====>: "+randomEmail+ "</br>");
		System.err.println("Enter Email Id of Customer: "+randomEmail);
		
		Common.pause(2);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='firstname']")));
		ramdomfname="aa"+n+Common.getValueFromConfig("config.properties","Fname");
		First_Name.sendKeys(ramdomfname);
		Common.log("Enter First Name of Customer====>: "+ramdomfname+ "</br>");
		System.err.println("Enter First Name of Customer: "+ramdomfname);
		
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='region_id' and @class='select']")));
		Select state_province=new Select(driver.findElement(By.xpath("//select[@name='region_id' and @class='select']")));
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='country_id' and @class='select']")));
		Select Country=new Select(driver.findElement(By.xpath("//select[@name='country_id' and @class='select']")));
		Country.selectByVisibleText("United States");
		Common.log("Select the Country from the Drop Down :==> United States </br></br>");
		System.err.println("Select the Country from the Drop Down :==> United States");
	
		return new ValidatePaymentMethod_GeneralVerification(driver);
	}
	
	
	
	/*
	 * Address Validation Pop Up
	 */
	
	public ValidatePaymentMethod_GeneralVerification Address_Valiation_PopUp() throws IOException{
		
		
					WebDriverWait wait=new WebDriverWait(driver, 150);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='telephone']")));
					
					Common.pause(2);
					randomphonenumber=Common.getValueFromConfig("config.properties","PhoneNumber");
					Contact_Number.sendKeys(randomphonenumber);
					Common.log("Enter the Phone Number of Customer: "+randomphonenumber+ "</br></br>");
					System.err.println("Enter the Phone Number of Customer : "+randomphonenumber);
					
					Common.log("Show the Pop Up Window</br></br>");
					System.err.println("Show the Pop Up Window");
					
					Common.pause(2);
					
					Address_Validation();
					
					Common.log("Click on Address Validation Pop Up Window</br></br>");
					System.err.println("Click on Address Validation Pop Up Window");
		
		return new ValidatePaymentMethod_GeneralVerification(driver);
	}
	
	
	/* Popup handling methods
	 * 
	*/
	public ValidatePaymentMethod_GeneralVerification Address_Validation(){
		
		Common.pause(2);
		
		List<WebElement> continue_button = driver.findElements(By.xpath("//span[text()='Continue']"));
		
		if(continue_button.size()>0){

			
			driver.findElement(By.xpath("//div[@class='modal-content']//ul[1]/li/input")).click();
			Common.logstep("Clicked on : "+driver.findElement(By.xpath("//div[@class='modal-content']//ul[1]/li/input")).getAttribute("id"));
			Common.pause(2);
			
			driver.findElement(By.xpath("//span[text()='Continue']")).click();
			Common.logstep("Click on Continue Button");
			
			Common.logstep("Address Pop Up Is Displayed");
			System.err.println("Address Pop Up Is Displayed");
			
		}
		else{
			
			Common.logstep("Address Pop Up Is Not Displayed");
			System.err.println("Address Pop Up Is Not Displayed");
			
		}
		return new ValidatePaymentMethod_GeneralVerification(driver);
	}
	
	
	
	
	
	/*
	 * Shipping Customer 
	 */
	
	WebDriverWait wait2=new WebDriverWait(driver, 150);
	
	public ValidatePaymentMethod_GeneralVerification Shipping_Customer(){
		
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='s_method_amstrates_amstrates21']")));
		
		WebElement choose_a_shipping_option = driver.findElement(By.xpath("//input[@id='s_method_amstrates_amstrates21']"));
		Common.mouseOver(driver, choose_a_shipping_option);
		Common.pause(7);
		
		Common.jsClick(driver, choose_a_shipping_option);
		Common.log("Click on Ground Standard under Choose a Shipping Option</br></br>");
		System.err.println("Click on Ground Standard under Choose a Shipping Option");
		
		Common.pause(7);
		Click_On_Next.click();
		Common.log("After Filling all the detail Click on Next Button</br></br>");
		System.err.println("After Filling all the detail Click on Next Button");
		
		
		return new ValidatePaymentMethod_GeneralVerification(driver);
	}
	
	
	
	/*
	 * Payment Method As Guest User
	 */
	
	@FindBy(xpath="//input[@id='braintree' and @type='radio']")
	private WebElement credit_card_radiobutton;
	
	public ValidatePaymentMethod_GeneralVerification credit_card_radiobutton() {
		
		WebDriverWait creditcard=new WebDriverWait(driver, 150);
		creditcard.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='braintree' and @type='radio']")));
		
		Common.pause(2);
		
		Common.clickOn(driver, credit_card_radiobutton);
		
		return new ValidatePaymentMethod_GeneralVerification(driver);
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
	
	public ValidatePaymentMethod_GeneralVerification Credit_Card_Details() throws IOException {
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-number']")));
		
		creditCardNumber=Common.getValueFromConfig("config.properties","CreditCardNumber");
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='credit-card-number']")));
		Common.pause(2);
		credit_card_number.sendKeys(creditCardNumber);
		
		Common.log("Credit Card Number===>"+creditCardNumber+"</br>");
		System.out.println("Credit Card Number===>"+creditCardNumber+"</br>");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-expirationDate']")));
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='expiration']")));
		expirationDate=Common.getValueFromConfig("config.properties","ExpirationDate");
		Common.pause(2);
		expiration_date.sendKeys(expirationDate);
		
		Common.log("Credit Card Expiry Date===>"+expirationDate+"</br>");
		System.out.println("Credit Card Expiry Date===>"+expirationDate+"</br>");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-cvv']")));
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='cvv']")));
		cvvNumber=Common.getValueFromConfig("config.properties","CvvNumber");
		Common.pause(2);
		cvv_number.sendKeys(cvvNumber);
		
		
		Common.log("Credit Card Cvv Number===>"+cvvNumber+"</br>");
		System.out.println("Credit Card Cvv Number===>"+cvvNumber+"</br>");
		
		driver.switchTo().defaultContent();
		
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='primary']//button[contains(.,@data-role) and contains(.,'Place Order')]")));
		Common.pause(2);
		Place_order.click();
		
		return new ValidatePaymentMethod_GeneralVerification(driver);
	}
	
//========================================================================================================================================================================//
	
	/*
	 *@Test Scenario : Validate Payment Method===> Paypal Payment Method
	 */
	
	
	/*
	 * Click on I User Logo
	 */
	
	@FindBy(xpath="//div[@class='header-top-links']//ul//li//span//i")
	private WebElement isuerLogo;
	
	public ValidatePaymentMethod_GeneralVerification isuerLogo(){
		
		Common.pause(5);
		
		driver.navigate().to("https://promed-dev-scripco-refapp.accorin.us/");
		
		Common.pause(3);
		
		WebDriverWait logo=new WebDriverWait(driver, 150);
		logo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header-top-links']//ul//li//span//i")));
		
		Common.pause(2);
		isuerLogo.click();
		
		return new ValidatePaymentMethod_GeneralVerification(driver);
	}
	
	
	/*
	 * Click on Create Account
	 */
	
	public ValidatePaymentMethod_GeneralVerification CreateNewAccount(){
		
		WebDriverWait wait=new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='header links']//li[2]//a")));
		
		List<WebElement> clickoncreatenewaccount = driver.findElements(By.xpath("//ul[@class='header links']//li[2]//a"));
		Common.pause(2);
		clickoncreatenewaccount.get(1).click();
		
		return new ValidatePaymentMethod_GeneralVerification(driver);
	}
	
	
	
	/*
	 * Click on Logout
	 */
	
	public ValidatePaymentMethod_GeneralVerification Logout(){
		
		WebDriverWait wait=new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='header links']//li[2]//a")));
		
		List<WebElement> logout = driver.findElements(By.xpath("//ul[@class='header links']//li[2]//a"));
		Common.pause(2);
		logout.get(0).click();
		
		return new ValidatePaymentMethod_GeneralVerification(driver);
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
	
	/*static Random rand1 = new Random();
	static int  n1 = rand1.nextInt(5000000) + 5000;
	
	public static String randomEmailnew="prashantp+"+n1+"@accorin.com";*/
	
	static String rnd1 = RandomStringUtils.randomNumeric(8);
	  
	
	public static String randomEmailnew="";		//="prashantp+"+rnd1+"@accorin.com";
	
	WebDriverWait details1=new WebDriverWait(driver, 200);
	
	public ValidatePaymentMethod_GeneralVerification CreateNewAccountDetails(){
		
		details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='prefix']")));
		Select nameprefix=new Select(driver.findElement(By.xpath("//select[@id='prefix']")));
		Common.pause(2);
		nameprefix.selectByVisibleText("Mr");
		
		details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='firstname']")));
		Common.pause(2);
		firstname.sendKeys("Paul");
		Common.logstep("Enter First Name :===> Paul");
		System.err.println("Enter First Name :===> Paul");
		
		details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='lastname']")));
		Common.pause(2);
		lastname.sendKeys("williams");
		Common.logstep("Enter Last Name :===> williams");
		System.err.println("Enter Last Name :===> williams");
		
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
		
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email_address']")));
		Common.pause(2);
		randomEmailnew=Common.getRandomEmail();
		emailId.sendKeys(randomEmailnew);
		Common.logstep("Type the email id ===>"+randomEmailnew+"</br>");
		System.err.println("Type the email id ===>"+randomEmailnew);
		
		details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
		Common.pause(2);
		password.sendKeys("baps@200");
		Common.logstep("Type the password ===>baps@200");
		System.err.println("Type the password ===>baps@200");
		
		details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password-confirmation']")));
		Common.pause(2);
		confirmpassword.sendKeys("baps@200");
		Common.logstep("Type the same password under confirm password ===>baps@200");
		System.err.println("Type the same password under confirm password ===>baps@200");
		
		details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']//span[contains(.,'Create an Account')]")));
		Common.pause(2);
		CreateaAccount.click();
		Common.logstep("After filling all the details click on Create A Account");
		System.err.println("After filling all the details click on Create A Account");
		
		return new ValidatePaymentMethod_GeneralVerification(driver);
	}
	
	
	
	/*
	 * @Test Scenario : Checkout logged in
	 */
	
	/*
	 * Choose Mobility under Home Page
	 */

	@FindBy (xpath="//span[text()='Mobility']")
	private WebElement Mobility;

	public ValidatePaymentMethod_GeneralVerification Mobility() {
		
	Common.pause(5);	
		
	WebDriverWait mobility=new WebDriverWait(driver, 100);
	mobility.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Mobility']")));
	
	Common.pause(2);
	
	Common.mouseHover(driver, Mobility);
	
	return new ValidatePaymentMethod_GeneralVerification(driver);
}

	/*
	 * Choose Geri Chairs under Mobility
 	*/
	@FindBy(xpath="//div[4]//span[contains(text(),'Geri Chairs')]")
	private WebElement Geri_Chairs;

	public ValidatePaymentMethod_GeneralVerification Geri_Chairs() {
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[4]//span[contains(text(),'Geri Chairs')]")));
		
	Common.pause(2);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[4]//span[contains(text(),'Geri Chairs')]")));
	
	Common.pause(1);
	Geri_Chairs.click();
	
	return new ValidatePaymentMethod_GeneralVerification(driver);
	}



	
/*
 * Shipping Information as Guest User
 */

@FindBy(xpath="//input[@id='customer-email']")
private WebElement email_id1;

@FindBy(xpath="//input[@id='customer-password']")
private WebElement customerpassword;

@FindBy(xpath="//span[text()='Login']")
private WebElement LoginButton;


@FindBy(xpath="//input[@type='text' and @name='company']")
private WebElement Company_Name1;

@FindBy(xpath="//input[@type='text' and @name='street[0]']")
private WebElement Street_Address1;

@FindBy(xpath="//input[@type='text' and @name='city']")
private WebElement City1;

@FindBy(xpath="//input[@type='text' and @name='postcode']")
private WebElement PinCode1;

@FindBy(xpath="//input[@type='text' and @name='telephone']")
private WebElement Contact_Number1;

@FindBy(xpath="//span[text()='Continue']")
private WebElement Continue1;

@FindBy(xpath="//span[text()='Next']")
private WebElement Click_On_Next1;

WebDriverWait information=new WebDriverWait(driver, 200);

public ValidatePaymentMethod_GeneralVerification ShippingInformation1() throws IOException {
	
	information.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer-email']")));
	Common.pause(2);
	email_id1.sendKeys(randomEmailnew);
	Common.log("Enter Email Id of Customer====>: "+randomEmailnew+ "</br>");
	System.err.println("Enter Email Id of Customer: "+randomEmailnew);
	
	information.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer-password']")));
	Common.pause(4);
	customerpassword.sendKeys(staticpassword);
	Common.log("Enter Email Id of Customer====>: "+staticpassword+ "</br>");
	System.err.println("Enter Email Id of Customer: "+staticpassword);
	
	information.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']")));
	Common.pause(2);
	LoginButton.click();
	Common.log("Click on Login Button After entering email id and password</br>");
	System.err.println("Click on Login Button After entering email id and password");
	
	Common.pause(7);
	
	randomcompanyname=Common.getValueFromConfig("config.properties","Companyname");
	information.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='company']")));
	Common.pause(2);
	Company_Name.sendKeys(randomcompanyname);
	Common.log("Enter Company Name====>: "+randomcompanyname+ "</br>");
	System.err.println("Enter Company Name: "+randomcompanyname);
	
	
	streetaddress=Common.getValueFromConfig("config.properties","Streetaddress1");
	information.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='street[0]']")));
	Common.pause(2);
	Street_Address.sendKeys(streetaddress);
	Common.log("Enter Street Address====>: "+streetaddress+ "</br>");
	System.err.println("Enter Street Address: "+streetaddress);
	
	
	city=Common.getValueFromConfig("config.properties","City1");
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
	
	
	zipcode=Common.getValueFromConfig("config.properties","Zipcode1");
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
	
	
	
	return new ValidatePaymentMethod_GeneralVerification(driver);
}



/*
 * Address Validation Pop Up
 */

public ValidatePaymentMethod_GeneralVerification Address_Validation_PopUp() throws IOException{
	
	
				randomphonenumber=Common.getValueFromConfig("config.properties","PhoneNumber");
				information.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='telephone']")));
				Common.pause(2);
				Contact_Number.sendKeys(randomphonenumber);
				Common.log("Enter the Phone Number of Customer: "+randomphonenumber+ "</br>");
				System.err.println("Enter the Phone Number of Customer : "+randomphonenumber);
				
				Common.logcase("Address Validation PopUp</br>");
				System.err.println("Address Validation PopUp");
				
				Common.pause(3);
				Address_Validation();
				
				Common.log("Click on Address Validation Pop Up Window</br>");
				System.err.println("Click on Address Validation Pop Up Window");
	
				return new ValidatePaymentMethod_GeneralVerification(driver);
	}



/*
 * Enter Pay Pal Details
 */

@FindBy(xpath="//input[@value='paypal_express' and @type='radio']")
private WebElement paypalradiobutton;

 WebDriverWait wait1=new WebDriverWait(driver, 200);

public ValidatePaymentMethod_GeneralVerification PayPalpaymentMode(){
	
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='paypal_express' and @type='radio']")));
	Common.pause(2);
	Common.clickOn(driver, paypalradiobutton);
	Common.log("Click on Pay Pal Radio Button</br>");
	System.err.println("Click on Pay Pal Radio Button");
	
	
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='paypal-express-in-context-button']//span")));
	WebElement continuetopaypal = driver.findElement(By.xpath("//button[@id='paypal-express-in-context-button']//span"));
	Common.pause(2);
	Common.clickOn(driver, continuetopaypal);
	//continuetopaypal.click();
	Common.log("Click on continue to paypal option</br>");
	System.err.println("Click on continue to paypal option");
	Common.pause(8);
	
	String currWin=driver.getWindowHandle();
	System.err.println("--------------------------------------------------"+currWin+"---------------------------------------------");

	
	
	Common.pause(2);
	
	for (String handle : driver.getWindowHandles()) {
 
		driver.switchTo().window(handle);
		
		System.err.println("----"+handle+"-----");
		
	}
	Common.pause(10);
	
	try {
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Log In']")));
		Common.pause(2);
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		Common.log("Login Button Found And Clicked");
		System.err.println("Login Button Found And Clicked");
	} 
		catch (Exception e) 
	{
		Common.log("Login Button Not Found And go to Email id and Password Page");
		System.err.println("Login Button Not Found And go to Email id and Password Page");
	}
	
	Common.pause(5);
	
	WebElement validemailidforpayal = driver.findElement(By.xpath("//input[@id='email']"));
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
	validemailidforpayal.clear();
	Common.pause(2);
	validemailidforpayal.sendKeys(" 31julymm@mailinator.com");
	Common.log("Enter the Valid Paypal email id===> 31julymm@mailinator.com</br>");
	System.err.println("Enter the Valid Paypal email id===> 31julymm@mailinator.com</br>");
	
	
	WebElement validpasswordforpayal = driver.findElement(By.xpath("//input[@id='password']"));
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
	validpasswordforpayal.sendKeys("Baps@123");
	Common.log("Enter the Valid Paypal Password===>Baps@123</br>");
	System.err.println("Enter the Valid Paypal Password===>Baps@123</br>");
	
	Common.pause(12);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btnLogin']")));
	
	Common.pause(2);
	driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
	
	Common.log("After entering Valid Email ID and Password Click on Login Button");
	System.err.println("After entering Valid Email ID and Password Click on Login Button");
	
	
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='confirmButtonTop']")));
	Common.pause(3);
	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,1000)");
	
	driver.findElement(By.xpath("//input[@id='confirmButtonTop']")).click();
	
	Common.log("Click on Continue Button");
	System.err.println("Click on Continue Button");
	

	driver.switchTo().window(currWin);
	
	Common.pause(2);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='comment-code']")));
	driver.findElement(By.xpath("//textarea[@id='comment-code']")).sendKeys("ASAP");
	
	Common.pause(2);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='review-button']")));
	driver.findElement(By.xpath("//button[@id='review-button']")).click();
	Common.pause(5);
	
	
	return new ValidatePaymentMethod_GeneralVerification(driver);
}


//========================================================================================================================================================================

	/*
	 * Open Account
	 */

 	public ValidatePaymentMethod_GeneralVerification Loginbuttonclick(){
 		
 		Common.logcaseorange("Open Account Validation");
 		Common.pause(3);
	 
	 WebDriverWait clicklogin=new WebDriverWait(driver, 150);
	 clicklogin.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='header links']//li[2]//a")));
	 
	List<WebElement> loginclick = driver.findElements(By.xpath("//ul[@class='header links']//li[2]//a"));
	Common.pause(2);
	loginclick.get(0).click();
	Common.log("User should be redirected to Login Page and asked for Username and Password"); 
	
	 return new ValidatePaymentMethod_GeneralVerification(driver);
 }


 	@FindBy(xpath="//input[@id='email']")
 	private WebElement customeremailid;
 
 	@FindBy(xpath="//input[@id='pass']")
 	private WebElement customerpassword1;

 	@FindBy(xpath="//button[@type='submit']//span[contains(.,'Sign In')]")
 	private WebElement SignIn;
 	
 	
 	WebDriverWait login=new WebDriverWait(driver, 150);
 	
 	public ValidatePaymentMethod_GeneralVerification CustomerLogin() throws IOException{
 		
 		login.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
 		EmailId=Common.getValueFromConfig("config.properties","Email");
 		Common.pause(2);
 		customeremailid.sendKeys(EmailId);
 		Common.log("Enter the UserName=====>"+EmailId+"</br>");
 		
 		login.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pass']")));
 		staticpassword=Common.getValueFromConfig("config.properties","Password");
 		Common.pause(2);
 		customerpassword1.sendKeys(staticpassword);
 		Common.log("Enter the Password=====>"+staticpassword+"</br>");
 		
 		login.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']//span[contains(.,'Sign In')]")));
 		Common.pause(2);
 		SignIn.click();
 		Common.log("Click on Sign In Button");
 		
 		return new ValidatePaymentMethod_GeneralVerification(driver);
 	}

 	
 	@FindBy(xpath="//ul[@class='nav items']/li[9]//a")
 	private WebElement customercredit;
 	
 	public ValidatePaymentMethod_GeneralVerification customercredit(){
 		
 		WebDriverWait customercdrd=new WebDriverWait(driver, 150);
 		customercdrd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='nav items']/li[9]//a")));
 		
 		Common.pause(2);
 		customercredit.click();
 		
 		return new ValidatePaymentMethod_GeneralVerification(driver);
 	}


 	/*
	 * My Account Account Balance Verification
	 */
	
	public ValidatePaymentMethod_GeneralVerification verifyaccountbalance(){
		
		
		Common.logcase(" Check Credit Balance of Customer");
		
		Common.pause(3);
		
		driver.findElement(By.xpath("//li//a[contains(.,'Customer Credit')]")).click();
		
		Common.pause(2);
		
		WebElement original_priceofProduct = driver.findElement(By.xpath("//div[@class='block block-balance']//div//span[2][text()='$1,000.00']"));
		String product_price = original_priceofProduct.getText();
		
		System.out.println();
		String remove_dollar = product_price.replace("$" , "").trim();
		String totalamount =remove_dollar.replace(",", "").trim();
		System.err.println("Converting String to Int of Original Price : "+totalamount);
		Common.log("Converting String to Int of Original Price : "+totalamount);
		
		/*
		 * Converting Double to Integer
		 */
		
		Common.logstep("=========>Converting Double to Integer<=======");
		System.out.println("=========>Converting Double to Integer<=======");
		double price = new Double(totalamount);
		System.err.println("Change in Price :"+price);
			
		
		return new ValidatePaymentMethod_GeneralVerification(driver);
		}


	/*
	 * Click on Promed Logo to go back to Home Page
	 */
	
	
	@FindBy(xpath="//a[@class='logo']/img")
	private WebElement clickonlogo;
	
	 public ValidatePaymentMethod_GeneralVerification clickonlogo(){
		 
		 WebDriverWait logo=new WebDriverWait(driver, 150);
		 logo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='logo']/img")));
		 
		 Common.pause(2);
		 clickonlogo.click();
		 
		 Common.pause(3);
		 
		 return new ValidatePaymentMethod_GeneralVerification(driver);
	 }
	 
	 
	 
	 /*
	  * Click on Add to Cart  button 
	  */
	 
	 
	 @FindBy(xpath="//div[@id='amasty-shopby-product-list']//button//span[contains(.,'Add to Cart')]")
	 private WebElement AddToCartButton;
	 
	 public ValidatePaymentMethod_GeneralVerification AddToCartButton(){
		 
		 WebDriverWait wait=new WebDriverWait(driver, 150);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='amasty-shopby-product-list']//button//span[contains(.,'Add to Cart')]")));
		 
		List<WebElement> tocart = driver.findElements(By.xpath("//div[@id='amasty-shopby-product-list']//button//span[contains(.,'Add to Cart')]"));
		 
		 	Random rand = new Random();
			int countsize = tocart.size();
			System.out.println("Element inside the Page====>"+countsize);
			
			int linkNo1=rand.nextInt(countsize);
			WebElement link1=tocart.get(linkNo1);
			Common.log("Product Selected====>"+link1.getText()+"</br>");
			System.err.println("Product Selected====>"+link1.getText());
			Common.pause(2);
			link1.click();
		 
		 return new ValidatePaymentMethod_GeneralVerification(driver);
	 }


	 
	 /*
	  * Shipping Address
	  */

	    @FindBy(xpath="//input[@type='text' and @name='company']")
		private WebElement CompanyName;
		
		@FindBy(xpath="//input[@type='text' and @name='street[0]']")
		private WebElement StreetAddress;
		
		@FindBy(xpath="//input[@type='text' and @name='city']")
		private WebElement cityname;
		
		@FindBy(xpath="//input[@type='text' and @name='postcode']")
		private WebElement pinCode;
		
		@FindBy(xpath="//input[@type='text' and @name='telephone']")
		private WebElement ContactNumber;
		
		@FindBy(xpath="//span[text()='Continue']")
		private WebElement Continuebutton;
		
		@FindBy(xpath="//span[text()='Next']")
		private WebElement ClickOnNext;
		
		WebDriverWait waitnew=new WebDriverWait(driver, 150);
		
		public ValidatePaymentMethod_GeneralVerification ShippingInformationNew() throws UnsupportedEncodingException, URISyntaxException, IOException {
			
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='shipping-address-item selected-item']")));
			
			Common.pause(3);
			driver.findElement(By.xpath("//div[@class='shipping-address-item selected-item']")).click();
	
			/*Common.pause(2);
			waitnew.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='company']")));
			randomcompanyname="aa"+n+Common.getValueFromConfig("config.properties","Companyname");
			Company_Name.sendKeys(randomcompanyname);
			Common.log("Enter Company Name====>: "+randomcompanyname+ "</br>");
			System.err.println("Enter Company Name: "+randomcompanyname);
			
			Common.pause(2);
			waitnew.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='street[0]']")));
			streetaddress=Common.getValueFromConfig("config.properties","Streetaddress1");
			Street_Address.sendKeys(streetaddress);
			Common.log("Enter Street Address====>: "+streetaddress+ "</br>");
			System.err.println("Enter Street Address: "+streetaddress);
			
			Common.pause(2);
			waitnew.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='city']")));
			city=Common.getValueFromConfig("config.properties","City1");
			City.sendKeys(city);
			Common.log("Enter City name====>:"+city+ "</br>");
			System.err.println("Enter City name: "+city);
			
			Common.pause(2);
			waitnew.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='region_id' and @class='select']")));
			Select state_province=new Select(driver.findElement(By.xpath("//select[@name='region_id' and @class='select']")));
			state_province.selectByVisibleText("Illinois");
			Common.log("Select the State from the Drop Down :==> Illinois </br>");
			System.err.println("Select the State from the Drop Down :==> Illinois");
			
			Common.pause(2);
			waitnew.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='postcode']")));
			zipcode=Common.getValueFromConfig("config.properties","Zipcode1");
			PinCode.sendKeys(zipcode);
			Common.log("Enter the Pin Code of the State: "+zipcode+ "</br>");
			System.err.println("Enter the Pin Code of the State : "+zipcode);
			
			Common.pause(2);
			waitnew.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='country_id' and @class='select']")));
			Select Country=new Select(driver.findElement(By.xpath("//select[@name='country_id' and @class='select']")));
			Country.selectByVisibleText("United States");
			Common.log("Select the Country from the Drop Down :==> United States </br>");
			System.err.println("Select the Country from the Drop Down :==> United States");
		*/
			return new ValidatePaymentMethod_GeneralVerification(driver);
		}
		
		


		/*
		 * Click on Open Account Radio Button
		 */
		
		@FindBy(xpath="//input[@id='customercredit' and @type='radio']")
		private WebElement clickonopenaccountradiobutton;
		
		@FindBy(xpath="//div[@id='review-buttons-container']//button//span[text()='Place Order']")
		private WebElement Placeorder;
		
		public ValidatePaymentMethod_GeneralVerification clickonopenaccountradiobutton(){
			
			WebDriverWait wait=new WebDriverWait(driver, 150);
			
			WebElement BalanceinAccount = driver.findElement(By.xpath("//div[@class='available-credit']//span"));
			Common.log("--Total Balance in Account===>"+BalanceinAccount.getText());
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customercredit' and @type='radio']")));
			
			Common.pause(2);
			clickonopenaccountradiobutton.click();
			
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Place Order']")));
			Common.pause(2);
			Placeorder.click();
			
			Common.pause(8);
			
			return new ValidatePaymentMethod_GeneralVerification(driver);
		}


		public ValidatePaymentMethod_GeneralVerification Shipping_Customernew(){
			
			
			Common.pause(4);
			Common.refresh(driver);
			
			Common.pause(7);
			
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='s_method_amstrates_amstrates20']")));
			
			WebElement choose_a_shipping_option = driver.findElement(By.xpath("//input[@id='s_method_amstrates_amstrates20']"));
			Common.mouseOver(driver, choose_a_shipping_option);
			Common.pause(3);
			
			Common.jsClick(driver, choose_a_shipping_option);
			Common.log("Click on Ground Standard under Choose a Shipping Option</br></br>");
			System.err.println("Click on Ground Standard under Choose a Shipping Option");
			
			
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button action continue primary']")));
			WebElement ele = driver.findElement(By.xpath("//button[@class='button action continue primary']"));
			Common.jsClick(driver, ele);
			Common.log("After Filling all the detail Click on Next Button</br></br>");
			System.err.println("After Filling all the detail Click on Next Button");
			
			Address_Validation();
			

			Common.pause(4);
			Click_On_Next.click();
			
			return new ValidatePaymentMethod_GeneralVerification(driver);
		}
		

}
