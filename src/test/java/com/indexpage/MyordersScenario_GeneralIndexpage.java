package com.indexpage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.init.AbstractPage;
import com.init.Common;
import com.verification.MyordersScenario_GeneralVerification;

public class MyordersScenario_GeneralIndexpage extends AbstractPage{
	
	
	public static String Email="prashantp+"+2+"@accorin.com";
	public static String password="baps@200";
	public static String fname="Daniel";
	public static String lname="rollins";
	public static String companyname="TCS";
	public static String streetaddress=" 360 VETERANS PKWY";
	public static String city="BOLINGBROOK";
	public static String zipcode="60440-4609";
	public static String phonenumber="123456789";
	public static String creditCardNumber=null;
	public static String expirationDate=null;
	public static String cvvNumber=null;

	public MyordersScenario_GeneralIndexpage(WebDriver driver) {
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
	
	public MyordersScenario_GeneralVerification clickonOrthopedic() {
		
		WebDriverWait orthopedic=new WebDriverWait(driver, 100);
		orthopedic.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Orthopedic']")));
		
		Common.pause(2);
		
		Common.mouseHover(driver, Orthopedic);
		
		return new MyordersScenario_GeneralVerification(driver);
	}
	
	/*
	 * Choose Positioning under Orthopedic
	 */
	
	public MyordersScenario_GeneralVerification Positioning() {
		
		WebDriverWait positioning=new WebDriverWait(driver, 100);
		positioning.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")));
		
		Common.pause(2);
		
		Common.mouseHover(driver, driver.findElement(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")));
		
		driver.findElement(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")).click();
		
		return new MyordersScenario_GeneralVerification(driver);
	}
	
	/*
	 * Click on Foam Leg Elevating Splint, 8" - Elevated Wedge Cushion Add to Cart and Add the Product to the Cart
	 */
	
	
	public MyordersScenario_GeneralVerification Add_To_Cart() {
		
		Common.pause(2);
		
		WebDriverWait addtocart=new WebDriverWait(driver, 100);
		addtocart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]")));
		
		Common.pause(2);
		List<WebElement> Add_To_Cart = driver.findElements(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]"));
		Add_To_Cart.get(0).click();
		
		return new MyordersScenario_GeneralVerification(driver);
	}
	
	/*
	 * Click on My Cart Option
	 */
	
	public MyordersScenario_GeneralVerification My_Cart() {
		
		WebDriverWait showcart=new WebDriverWait(driver, 100);
		showcart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='action showcart']")));
		
		Common.pause(2);
		
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		
		return new MyordersScenario_GeneralVerification(driver);
	}
	
	
	/*
	 * Checkout From My Cart as Guest User
	 */
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	private WebElement Checkout;
	
	public MyordersScenario_GeneralVerification Checkout() {
		
		
		WebDriverWait checkout=new WebDriverWait(driver, 100);
		checkout.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='top-cart-btn-checkout']")));
		
		Common.pause(2);
		
		Checkout.click();
		
		return new MyordersScenario_GeneralVerification(driver);
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
	
	public MyordersScenario_GeneralVerification Shipping_Information() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		Common.pause(2);
		
		email_id.sendKeys(Email);
		Common.log("Enter Email Id of Customer====>: "+Email+ "</br>");
		System.err.println("Enter Email Id of Customer: "+Email);
		
		
		Common.pause(5);
		customerpassword.sendKeys(password);
		Common.log("Password of Customer====>: "+password+ "</br>");
		System.err.println("Password of Customer: "+password);
		
		Common.pause(5);
		LoginButton.click();
		Common.log("Click on Login Button After entering email id and password</br>");
		System.err.println("Click on Login Button After entering email id and password");
		
		Common.pause(5);
		Common.waitForElement(driver, By.xpath("//div[@class='shipping-address-item not-selected-item']//span[contains(.,'Ship Here')]"));
		
		Common.pause(5);
		Common.mouseHover(driver, driver.findElement(By.xpath("//div[@class='shipping-address-item not-selected-item']//span[contains(.,'Ship Here')]")));
		
		Common.pause(5);
		driver.findElement(By.xpath("//div[@class='shipping-address-item not-selected-item']//span[contains(.,'Ship Here')]")).click();

		Common.log("Click on Second Shipping Address</br>");
		System.err.println("Click on Second Shipping Address");
		
	/*	Common.pause(1);
		Company_Name.sendKeys(companyname);
		Common.log("Enter Company Name====>: "+companyname+ "</br>");
		System.err.println("Enter Company Name: "+companyname);
		
		Common.pause(1);
		Street_Address.sendKeys(streetaddress);
		Common.log("Enter Street Address====>: "+streetaddress+ "</br>");
		System.err.println("Enter Street Address: "+streetaddress);
		
		Common.pause(1);
		City.sendKeys(city);
		Common.log("Enter City name====>:"+city+ "</br>");
		System.err.println("Enter City name: "+city);
		
		Common.pause(1);
		Select state_province=new Select(driver.findElement(By.xpath("//select[@name='region_id' and @class='select']")));
		state_province.selectByVisibleText("Illinois");
		Common.log("Select the State from the Drop Down :==> Illinois </br>");
		System.err.println("Select the State from the Drop Down :==> Illinois");
		
		Common.pause(1);
		PinCode.sendKeys(zipcode);
		Common.log("Enter the Pin Code of the State: "+zipcode+ "</br>");
		System.err.println("Enter the Pin Code of the State : "+zipcode);
		
		Common.pause(1);
		Select Country=new Select(driver.findElement(By.xpath("//select[@name='country_id' and @class='select']")));
		Country.selectByVisibleText("United States");
		Common.log("Select the Country from the Drop Down :==> United States </br>");
		System.err.println("Select the Country from the Drop Down :==> United States");
		
		Common.pause(2);
		Contact_Number.sendKeys(phonenumber);
		Common.log("Enter the Phone Number of Customer: "+phonenumber+ "</br>");
		System.err.println("Enter the Phone Number of Customer : "+phonenumber);*/
	
		
		return new MyordersScenario_GeneralVerification(driver);
	}
	
	
	
	/*
	 * Shipping Customer 
	 */
	
	public MyordersScenario_GeneralVerification Shipping_Customer(){
		
		
		WebDriverWait checkout=new WebDriverWait(driver, 100);
		checkout.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='s_method_amstrates_amstrates21']")));
		
		Common.pause(5);
		
		WebElement choose_a_shipping_option = driver.findElement(By.xpath("//input[@id='s_method_amstrates_amstrates21']"));
		Common.mouseOver(driver, choose_a_shipping_option);
		Common.pause(8);
		
		checkout.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='s_method_amstrates_amstrates21']"))).click();
		
		//driver.findElement(By.xpath("//input[@id='s_method_amstrates_amstrates21']")).click();
		
		Common.log("Click on Ground Standard under Choose a Shipping Option</br>");
		System.err.println("Click on Ground Standard under Choose a Shipping Option");
		
		Common.pause(5);
		
		Click_On_Next.click();
		Common.log("After Filling all the detail Click on Next Button</br>");
		System.err.println("After Filling all the detail Click on Next Button");
		
		
		return new MyordersScenario_GeneralVerification(driver);
	}
	
	
	
	/*
	 * Payment Method As Guest User
	 */
	
	@FindBy(xpath="//span[text()='ending']/../../input")
	private WebElement credit_card_radiobutton;
	
	public MyordersScenario_GeneralVerification credit_card_radiobutton() {
		
		WebDriverWait checkout=new WebDriverWait(driver, 100);
		checkout.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='ending']/../../input")));
		
		Common.pause(3);
		
		Common.clickOn(driver, credit_card_radiobutton);
		
		return new MyordersScenario_GeneralVerification(driver);
	}
	
	
	/*
	 * CLick on Place Order
	 */
	
	
	@FindBy(xpath="//div[@class='primary']//button[contains(.,@data-role) and contains(.,'Place Order')]")
	private WebElement Place_order;
	
	public MyordersScenario_GeneralVerification Credit_Card_Details() throws IOException {
		
		
		WebDriverWait checkout=new WebDriverWait(driver, 100);
		checkout.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='primary']//button[contains(.,@data-role) and contains(.,'Place Order')]")));
		
		Common.pause(2);
		Place_order.click();
		
		return new MyordersScenario_GeneralVerification(driver);
	}
	
	/*
	 * Click on I User Logo
	 */
	
	@FindBy(xpath="//span[@class='customer-name active']//i[@class='i-user']")	// //div[@class='header-top-links']//ul//li//span//i
	private WebElement isuerLogo;
	
	public MyordersScenario_GeneralVerification isuerLogo(){
	
		
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
		
		return new MyordersScenario_GeneralVerification(driver);
	}
	
	
	/*
	 * Click on My Order
	 */
	
	public MyordersScenario_GeneralVerification MyOrder(){
		
		WebDriverWait logo=new WebDriverWait(driver, 100);
		logo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='header links']//li[@class='nav item']//a[contains(.,'My Orders')]")));
		
		List<WebElement> clickoncreatenewaccount = driver.findElements(By.xpath("//ul[@class='header links']//li[@class='nav item']//a[contains(.,'My Orders')]"));
		Common.pause(1);
		clickoncreatenewaccount.get(0).click();
		
		driver.findElement(By.xpath("//li[@class='nav item current']//strong")).click();
		
		return new MyordersScenario_GeneralVerification(driver);
	}
	
	
	/*
	 * Click on My Order Option
	 */
	
	@FindBy(xpath="//div[@class='content block-collapsible-nav-content']/ul//li//a[contains(.,'My Orders')]")
	private WebElement myorder;
	
	public MyordersScenario_GeneralVerification myorder(){
		
		WebDriverWait wait=new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='content block-collapsible-nav-content']/ul//li//a[contains(.,'My Orders')]")));
		
		Common.pause(2);
		myorder.click();
		
		return new MyordersScenario_GeneralVerification(driver);
	}
	
	
	/*
	 * Click on View Order under My Order
	 */
	
	public MyordersScenario_GeneralVerification vieworder(){
		
		WebDriverWait wait=new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'View Order')]")));
		
		List<WebElement> vieworder = driver.findElements(By.xpath("//span[contains(.,'View Order')]"));
		Common.pause(2);
		vieworder.get(0).click();
		
		return new MyordersScenario_GeneralVerification(driver);
	}
	
	/*
	 * Click on Print Button Under My Order
	 
	
	public MyordersScenario_GeneralVerification printorder(){
		
		Common.pause(2);
		
		String parentHandle = driver.getWindowHandle(); 
		
		Common.pause(2);
		WebElement printorder = driver.findElement(By.xpath("//a[@class='action print']//span"));
		printorder.click();
		
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle);
		}
		
		
		
		Common.pause(2);
		driver.switchTo().window(parentHandle);
		
		return new MyordersScenario_GeneralVerification(driver);
	}
	*/
	
	
	
	
	/*
	 * Click on Account Dashboard
	 
	
	public MyordersScenario_GeneralVerification accountdashboard(){
		
		WebDriverWait accountdashoard=new WebDriverWait(driver, 100);
		accountdashoard.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='nav items']/li[1]/a")));
		
		Common.pause(1);
		driver.findElement(By.xpath("//ul[@class='nav items']/li[1]/a")).click();
		
		return new MyordersScenario_GeneralVerification(driver);
	}
	*/
	
	
	
	/*
	 * Click on Reorder under My Order
	 */
	
	@FindBy(xpath="//span[text()='Reorder']")
	private WebElement reorder;
	
	@FindBy(xpath="//span[text()='Merge']")
	private WebElement merge;
	
	public MyordersScenario_GeneralVerification reorder(){
		
		WebDriverWait reorder1=new WebDriverWait(driver, 100);
		reorder1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Reorder']")));
		
		Common.pause(2);
		
		reorder.click();
		
		return new MyordersScenario_GeneralVerification(driver);
	}
	
	
	/*
	 * Go to Procedd to CheckOut Page
	 */
	
	
	public MyordersScenario_GeneralVerification proceedtocheckout(){
		
		Common.pause(3);
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Proceed to Checkout']")));
		
		List<WebElement> checkout = driver.findElements(By.xpath("//span[text()='Proceed to Checkout']"));
		Common.pause(2);
		checkout.get(1).click();
		
		
		return new MyordersScenario_GeneralVerification(driver);
	}
	

}
