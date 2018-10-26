package com.indexpage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
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
import com.verification.ValidateTax_GeneralVerification;

public class ValidateTax_GeneralindexPage extends AbstractPage{
	
	
	static Random rand = new Random();
	static int  n = rand.nextInt(1000) + 10;
	
	public static String randomEmail="prashantp+"+n+"@accorin.com";
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

	public ValidateTax_GeneralindexPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy (xpath="//span[contains(.,'Treatment Furniture')]")
	private WebElement treatmentfurniture;

	public ValidateTax_GeneralVerification treatmentfurniture() {
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Treatment Furniture')]")));
	
	Common.pause(2);
	
	Common.mouseHover(driver, treatmentfurniture);
	
	return new ValidateTax_GeneralVerification(driver);
}



	@FindBy(xpath="//strong[contains(.,'Massage & Chiropractic')]")
	private WebElement massageandchiropractic;

	public ValidateTax_GeneralVerification massageandchiropractic() {
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(.,'Massage & Chiropractic')]")));
	
	Common.mouseHover(driver, driver.findElement(By.xpath("//strong[contains(.,'Massage & Chiropractic')]")));
	
	List<WebElement> ele = driver.findElements(By.xpath("//strong[contains(.,'Massage & Chiropractic')]"));
	Common.pause(2);
	ele.get(0).click();
	
	return new ValidateTax_GeneralVerification(driver);
}
	
	
	@FindBy(xpath="//div[@class='info']/h4//a[contains(.,'Chiropractic Tables')]")
	private WebElement chiropratictables;
	
	public ValidateTax_GeneralVerification chiropratictables(){
		
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='info']/h4//a[contains(.,'Chiropractic Tables')]")));
		
		Common.pause(2);
		Common.clickOn(driver, chiropratictables);
		
		
		return new ValidateTax_GeneralVerification(driver);
	}
	
	
	
	@FindBy(xpath="//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]")
	private WebElement AddtoCart;
	
	public ValidateTax_GeneralVerification AddtoCart(){
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]")));
		
		List<WebElement> cart = driver.findElements(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]"));
		Common.pause(2);
		cart.get(0).click();
		
		return new ValidateTax_GeneralVerification(driver);
	}
	
	
	
	public ValidateTax_GeneralVerification My_Cart() {
		
		WebDriverWait mycart=new WebDriverWait(driver, 100);
		mycart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='action showcart']")));
		
		Common.pause(2);
		
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		
		return new ValidateTax_GeneralVerification(driver);
	}
	
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	private WebElement Checkout;
	
	public ValidateTax_GeneralVerification Checkout() {
		
		Common.pause(5);
		
		WebDriverWait checkout=new WebDriverWait(driver, 100);
		checkout.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='top-cart-btn-checkout']")));
		
		Common.pause(2);
		
		Checkout.click();
		
		return new ValidateTax_GeneralVerification(driver);
	}
	
	
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
	
	public ValidateTax_GeneralVerification Shipping_Information() throws UnsupportedEncodingException, URISyntaxException, IOException {
		
		Common.pause(2);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer-email']")));
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
	
		
		return new ValidateTax_GeneralVerification(driver);
	}
	
	/*
	 * Address Validation Pop Up
	 */
	
	public ValidateTax_GeneralVerification Address_Valiation_PopUp() throws IOException{
		
		
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
		
		return new ValidateTax_GeneralVerification(driver);
	}
	
	
	/* Popup handling methods
	 * 
	*/
	public ValidateTax_GeneralVerification Address_Validation(){
		
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
		return new ValidateTax_GeneralVerification(driver);
	}
	

	
	WebDriverWait wait1=new WebDriverWait(driver, 100);
	
	public ValidateTax_GeneralVerification Shipping_Customer(){
		
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
		
		
		return new ValidateTax_GeneralVerification(driver);
	}
	
//====================================================================================================================================================================//
	
	/*
	 * Without Taxes
	 */
	
	
	/*
	 * Choose Orthopedic under Home Page
	 */

	@FindBy (xpath="//span[text()='Mobility']")
	private WebElement Mobility;

public ValidateTax_GeneralVerification clickonMobility() {
	
	driver.navigate().to("https://promed-dev-scripco-refapp.accorin.us/");
	
	Common.pause(3);
	
	Common.logcasered("Without Taxes");
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Mobility']")));
	
	Common.pause(2);
	
	Common.mouseHover(driver, Mobility);
	
	return new ValidateTax_GeneralVerification(driver);
}



/*
 * Choose Geri Chairs under Mobility
 */
@FindBy(xpath="//a[@title='Canes & Crutches']//strong[contains(.,'Canes & Crutches')]")
private WebElement canescrutches;

public ValidateTax_GeneralVerification canescrutches() {
	
	Common.pause(2);
	
	WebDriverWait wait=new WebDriverWait(driver, 150);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Canes & Crutches']//strong[contains(.,'Canes & Crutches')]")));
	
	List<WebElement> caneandcrutches = driver.findElements(By.xpath("//a[@title='Canes & Crutches']//strong[contains(.,'Canes & Crutches')]"));
	Common.pause(2);
	caneandcrutches.get(0).click();
	
	return new ValidateTax_GeneralVerification(driver);
}


public ValidateTax_GeneralVerification Add_To_Cart() {
	
	WebDriverWait addtocart=new WebDriverWait(driver, 100);
	addtocart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]")));
	
	List<WebElement> Add_To_Cart = driver.findElements(By.xpath("//div[@class=\"products wrapper grid products-grid\"]//span[contains(.,'Add to Cart')]"));

	Common.pause(2);
	
	Add_To_Cart.get(2).click();
	
	return new ValidateTax_GeneralVerification(driver);
}


public ValidateTax_GeneralVerification ViewCart() {
	
	WebDriverWait addtocart=new WebDriverWait(driver, 100);
	addtocart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='action viewcart']//span//span[contains(.,'View cart')]")));
	
	WebElement viewcart = driver.findElement(By.xpath("//a[@class='action viewcart']//span//span[contains(.,'View cart')]"));

	Common.pause(2);
	
	Common.clickOn(driver, viewcart);
	
	return new ValidateTax_GeneralVerification(driver);
}



public ValidateTax_GeneralVerification TaxAmountValidation(){
	
	Common.pause(5);
	
		
		List<WebElement> taxamount = driver.findElements(By.xpath("//td[@class='amount']//span[text()='$0.00']"));
		String product_price=taxamount.get(0).getText();
		
		System.out.println();
		String remove_dollar = product_price.replace("$" , "").trim();
		System.err.println("Converting String to Int of Original Price : "+remove_dollar);
		Common.log("Converting String to Int of Original Price : "+remove_dollar+"</br>");
		
		/*
		 * Converting Double to Integer
		 */
		
		Common.logstep("=========>Converting Double to Integer");
		System.out.println("=========>Converting Double to Integer<=======");
		double price = new Double(remove_dollar);
		System.err.println("Change in Price :"+price);
		
		if(price < 0){
			Common.log("TAX Amount is Less Than Zero");
			System.err.println("TAX Amount is Less Than Zero");
		}else if(price == 0){
			Common.log("TAX Amount is  Zero");
			System.err.println("TAX Amount is  Zero");
		}
		
	return new ValidateTax_GeneralVerification(driver);
}


}
