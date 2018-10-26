package com.indexpage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.init.AbstractPage;
import com.init.Common;
import com.verification.AddToCart_GeneralVerification;


/**
 * @author Vishal
 *
 */
public class Add_To_Cart_GeneralIndexpage  extends AbstractPage{
	
	static Random rand = new Random();
	static int  n = rand.nextInt(1000) + 10;
	
	public static String randomEmail="";
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
	
		
	public Add_To_Cart_GeneralIndexpage(WebDriver driver) {
		super(driver);
	}
	
	
//============================================================================================================================//

	/*
	 * @Test Scenario : Add Simple Product to Cart
	 */
	
	/*
	 * Choose Orthopedic under Home Page
	 */

	@FindBy (xpath="//span[text()='Orthopedic']")
		private WebElement Orthopedic;
	
	public AddToCart_GeneralVerification clickonOrthopedic() {
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Orthopedic']")));
		
		Common.pause(2);
		
		Common.mouseHover(driver, Orthopedic);
		
		return new AddToCart_GeneralVerification(driver);
	}
	
	/*
	 * Choose Positioning under Orthopedic
	 */
	
	public AddToCart_GeneralVerification Positioning() {
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")));
		
		Common.pause(2);
		
		Common.mouseHover(driver, driver.findElement(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")));
		Common.pause(2);
		
		driver.findElement(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")).click();
		
		return new AddToCart_GeneralVerification(driver);
	}
	
	/*
	 * Click on Foam Leg Elevating Splint, 8" - Elevated Wedge Cushion Add to Cart and Add the Product to the Cart
	 */
	
	
	public AddToCart_GeneralVerification Add_To_Cart() {
		
		WebDriverWait addtocart=new WebDriverWait(driver, 100);
		addtocart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]")));
		
		List<WebElement> Add_To_Cart = driver.findElements(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]"));

		Common.pause(2);
		
		Add_To_Cart.get(0).click();
		
		return new AddToCart_GeneralVerification(driver);
	}
	
	/*
	 * Click on My Cart Option
	 */
	
	public AddToCart_GeneralVerification My_Cart() {
		
		WebDriverWait mycart=new WebDriverWait(driver, 100);
		mycart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='action showcart']")));
		
		Common.pause(2);
		
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		
		return new AddToCart_GeneralVerification(driver);
	}
	
	
	/*
	 * Checkout From My Cart as Guest User
	 */
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	private WebElement Checkout;
	
	public AddToCart_GeneralVerification Checkout() {
		
		Common.pause(5);
		
		WebDriverWait checkout=new WebDriverWait(driver, 100);
		checkout.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='top-cart-btn-checkout']")));
		
		Common.pause(2);
		
		Checkout.click();
		
		return new AddToCart_GeneralVerification(driver);
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
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	
	public AddToCart_GeneralVerification Shipping_Information() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		Common.pause(2);
		
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
	
		
		return new AddToCart_GeneralVerification(driver);
	}
	
	
	
	/*
	 * Address Validation Pop Up
	 */
	
	public AddToCart_GeneralVerification Address_Valiation_PopUp() throws IOException{
		
		
					WebDriverWait wait=new WebDriverWait(driver, 100);
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
		
		return new AddToCart_GeneralVerification(driver);
	}
	
	
	/* Popup handling methods
	 * 
	*/
	public AddToCart_GeneralVerification Address_Validation(){
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Continue']")));
		
		
		
		List<WebElement> continue_button = driver.findElements(By.xpath("//span[text()='Continue']"));
		
		if(continue_button.size()>0){
			Common.pause(2);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']//ul[1]/li/input")));
			
			Common.pause(2);
			driver.findElement(By.xpath("//div[@class='modal-content']//ul[1]/li/input")).click();
			Common.logstep("Clicked on : "+driver.findElement(By.xpath("//div[@class='modal-content']//ul[1]/li/input")).getAttribute("id"));
			Common.pause(2);
			
			driver.findElement(By.xpath("//span[text()='Continue']")).click();
			Common.logstep("Click on Continue Button");
			Common.pause(2);
			
			Common.logstep("Address Pop Up Is Displayed");
			System.err.println("Address Pop Up Is Displayed");
			
		}
		else{
			
			Common.logstep("Address Pop Up Is Not Displayed");
			System.err.println("Address Pop Up Is Not Displayed");
			
		}
		return new AddToCart_GeneralVerification(driver);
	}
	
	
	
	
	
	/*
	 * Shipping Customer 
	 */
	
	WebDriverWait wait1=new WebDriverWait(driver, 200);
	
	public AddToCart_GeneralVerification Shipping_Customer(){
		
		Common.pause(5);
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='s_method_amstrates_amstrates21']")));
		
		WebElement choose_a_shipping_option = driver.findElement(By.xpath("//input[@id='s_method_amstrates_amstrates21']"));
		Common.mouseOver(driver, choose_a_shipping_option);
		Common.pause(5);
		
		Common.clickOn(driver, choose_a_shipping_option);
		Common.log("Click on Ground Standard under Choose a Shipping Option</br></br>");
		System.err.println("Click on Ground Standard under Choose a Shipping Option");
		
		Common.pause(4);
		Click_On_Next.click();
		Common.log("After Filling all the detail Click on Next Button</br></br>");
		System.err.println("After Filling all the detail Click on Next Button");
		
		
		return new AddToCart_GeneralVerification(driver);
	}
	
	
	
	/*
	 * Payment Method As Guest User
	 */
	
	@FindBy(xpath="//input[@id='braintree' and @type='radio']")
	private WebElement credit_card_radiobutton;
	
	public AddToCart_GeneralVerification credit_card_radiobutton() {
		
		WebDriverWait creditcard=new WebDriverWait(driver, 100);
		creditcard.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='braintree' and @type='radio']")));
		
		Common.pause(2);
		
		Common.clickOn(driver, credit_card_radiobutton);
		
		return new AddToCart_GeneralVerification(driver);
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
	
	public AddToCart_GeneralVerification Credit_Card_Details() throws IOException {
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-number']")));
		
		creditCardNumber=Common.getValueFromConfig("config.properties","CreditCardNumber");
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='credit-card-number']")));
		Common.pause(2);
		credit_card_number.sendKeys(creditCardNumber);
		
		Common.log("Credit Card Number===>"+creditCardNumber+"</br>");
		System.err.println("Credit Card Number===>"+creditCardNumber+"</br>");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-expirationDate']")));
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='expiration']")));
		expirationDate=Common.getValueFromConfig("config.properties","ExpirationDate");
		Common.pause(2);
		expiration_date.sendKeys(expirationDate);
		
		Common.log("Expiry Date===>"+expirationDate+"</br>");
		System.err.println("Expiry Date===>"+expirationDate+"</br>");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='braintree-hosted-field-cvv']")));
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='cvv']")));
		cvvNumber=Common.getValueFromConfig("config.properties","CvvNumber");
		Common.pause(2);
		cvv_number.sendKeys(cvvNumber);
		
		Common.log("Cvv Number===>"+cvvNumber+"</br>");
		System.err.println("Cvv Number===>"+cvvNumber+"</br>");
		
		driver.switchTo().defaultContent();
		
		details.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='primary']//button[contains(.,@data-role) and contains(.,'Place Order')]")));
		Common.pause(2);
		Place_order.click();
		
		return new AddToCart_GeneralVerification(driver);
	}
	
	
//============================================================================================================================//

		/*
		 * @Add CONFIGURABLE PRODUCT to CART
		 */
			
	
	@FindBy(xpath="//div[1]/div[@class='widget block block-static-block']/p/a/img")
	private WebElement BioFreeze_Professional;
	
	public AddToCart_GeneralVerification BioFreeze_Professional() {
		
		Common.logcase("Add Configurable Products to Cart");
		
		driver.navigate().to("https://promed-dev-scripco-refapp.accorin.us/");
		
		Common.pause(2);
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[1]/div[@class='widget block block-static-block']/p/a/img")));
		
		Common.pause(2);
		BioFreeze_Professional.click();
		
		return new AddToCart_GeneralVerification(driver);
	}
	
	
	/*
	 * Click on Choose Option of the Product
	 */
	
	public AddToCart_GeneralVerification Choose_Option() {
		
		
		WebDriverWait chooseproduct=new WebDriverWait(driver, 100);
		chooseproduct.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[contains(.,'  Biofreeze Professional Pain Relieving Gel')]")));
		
		Common.pause(2);
		WebElement choose_product = driver.findElement(By.xpath("//a[contains(.,'  Biofreeze Professional Pain Relieving Gel')]"));
		choose_product.click();
		
		return new AddToCart_GeneralVerification(driver);
	}
	
	
	/*
	 * Click on the Type of Product Color and Choose the Green Option
	 */
	
	@FindBy(xpath="//div[@class='fieldset']//div[text()='GREEN']")
	private WebElement Type;
	
	public AddToCart_GeneralVerification Type_Color() {
		
		
		WebDriverWait wait=new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='swatch-attribute-options clearfix']//div[text()='GREEN']")));
		
		Common.pause(2);
		Common.jsClick(driver, Type);
		
		return new AddToCart_GeneralVerification(driver);
	}
	
	/*
	 * Click on the Size of the Product
	 */
	
	@FindBy(xpath="//div[@class='swatch-attribute-options clearfix']//div[contains(text(),'16 OZ GEL PUMP')]")
	private WebElement product_size;
	
	public AddToCart_GeneralVerification product_size() {
		
		WebDriverWait wait=new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='swatch-attribute-options clearfix']//div[contains(text(),'16 OZ GEL PUMP')]")));
		
		Common.pause(2);
		Common.jsClick(driver, product_size);
		
		Common.pause(5);
		
		return new AddToCart_GeneralVerification(driver);
	}
	
	
	/*
	 * Click on Add To Cart Option After Selecting Type and Size of Product
	 */
	
	@FindBy(xpath="//button[@id='product-addtocart-button']")
	private WebElement Add_To_Cart_Button;
	
	public AddToCart_GeneralVerification Add_To_Cart_Button() {
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='product-addtocart-button']/span")));
		
		Common.pause(2);
		Add_To_Cart_Button.click();
		
		return new AddToCart_GeneralVerification(driver);
	}
	
	
//============================================================================================================================//

	/*
	 * @ Add BUNDLED PRODUCT to Cart
	 */
	

	/*
	 * Click on Search Option and Find the Bundle Product in It
	 */
	
	@FindBy(xpath="//input[@id='search' and @type='text']")
	private WebElement Search_Box;
	
	public AddToCart_GeneralVerification Search_Box() {
		
		Common.logcase("Add Bundled Products in Cart");
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header[@class='page-header']//a[@class='logo']/img")));
		
		WebElement click_on_logo = driver.findElement(By.xpath("//header[@class='page-header']//a[@class='logo']/img"));
		Common.pause(2);
		Common.clickOn(driver, click_on_logo);
		
		WebDriverWait wait1=new WebDriverWait(driver, 100);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search' and @type='text']")));
		
		Common.pause(2);
		Search_Box.sendKeys("bundle");
		Search_Box.sendKeys(Keys.ENTER);
		
		return new AddToCart_GeneralVerification(driver);
	}

	
	/*
	 * Click on Bundled Product
	 */
	
	
	public AddToCart_GeneralVerification Bundle_Product() {
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(.,'Professional Massage Bundle - Rolling Stool, Bolster, Sheets, Table Shelf & More')]")));
		
		WebElement bundled_product_search = driver.findElement(By.xpath("//a[contains(.,'Professional Massage Bundle - Rolling Stool, Bolster, Sheets, Table Shelf & More')]"));
		Common.pause(2);
		bundled_product_search.click();
		
		return new AddToCart_GeneralVerification(driver);
	}
	
	
	/*
	 * Choose Color for NRG  Rolling Stool with Removable Backrest and Full Round Bolster 
	 */
	
	
	public AddToCart_GeneralVerification Choose_Color() {
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dropdown-option-bundle-image-bss']/div//img")));
		
		List<WebElement> choose_color = driver.findElements(By.xpath("//div[@class='dropdown-option-bundle-image-bss']/div//img"));
		Common.pause(2);
		choose_color.get(2).click();
		
		Common.pause(2);
		choose_color.get(6).click();
		
		return new AddToCart_GeneralVerification(driver);
		}
	
	
	
}
	
	


