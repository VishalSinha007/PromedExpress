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
import com.verification.AddtoWishlist_GeneralVerification;


public class AddtoWishlist_GeneralindexPage extends AbstractPage{
	
	static Random rand = new Random();
	static int  n = rand.nextInt(10000) + 100;
	
	public static String Email="";
	public static String staticpassword="";
	public static String fname="Verculas"+n+"";
	public static String lname="Xavier"+n+"";
	public static String companyname="TCS";
	public static String streetaddress=" 360 VETERANS PKWY";
	public static String city="BOLINGBROOK";
	public static String zipcode="60440-4609";
	public static String phonenumber="123456789";
	public static String creditCardNumber=null;
	public static String expirationDate=null;
	public static String cvvNumber=null;


	public AddtoWishlist_GeneralindexPage(WebDriver driver) {
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
	
	public AddtoWishlist_GeneralVerification isuerLogo1(){
		
		WebDriverWait logo=new WebDriverWait(driver, 100);
		logo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header-top-links']//ul//li//span//i")));
		
		Common.pause(2);
		isuerLogo1.click();
		
		return new AddtoWishlist_GeneralVerification(driver);
	}
	
	
	/*
	 * Click on Create Account
	 */
	
	public AddtoWishlist_GeneralVerification CreateNewAccount(){
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='header links']//li[2]//a")));
		
		List<WebElement> clickoncreatenewaccount = driver.findElements(By.xpath("//ul[@class='header links']//li[2]//a"));
		Common.pause(2);
		clickoncreatenewaccount.get(1).click();
		
		return new AddtoWishlist_GeneralVerification(driver);
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
	
	public AddtoWishlist_GeneralVerification CreateNewAccountDetails() throws IOException{
		
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
		
		
		/*details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='field choice newsletter']//input")));
		Common.pause(1);
		clickoncheckbox.click();
		Common.logstep("Click on Sign Up For Newsletter Check Box");
		System.err.println("Click on Sign Up For Newsletter Check Box");*/
		
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
		staticpassword=Common.getValueFromConfig("config.properties","Password");
		Common.pause(2);
		password.sendKeys(staticpassword);
		Common.logstep("Type the password ===>"+staticpassword+"</br>");
		System.err.println("Type the password ===>"+staticpassword);
		
		details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password-confirmation']")));
		staticpassword=Common.getValueFromConfig("config.properties","Password");
		Common.pause(2);
		confirmpassword.sendKeys(staticpassword);
		Common.logstep("Type the same password under confirm password ===>"+staticpassword+"</br>");
		System.err.println("Type the same password under confirm password ===>"+staticpassword);
		
		details1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']//span[contains(.,'Create an Account')]")));
		Common.pause(2);
		CreateaAccount.click();
		Common.logstep("After filling all the details click on Create A Account");
		System.err.println("After filling all the details click on Create A Account");
		
		return new AddtoWishlist_GeneralVerification(driver);
	}
	
	
	
	/*
	 * Choose Orthopedic under Home Page
	 */

	@FindBy (xpath="//span[text()='Orthopedic']")
		private WebElement Orthopedic;
	
	public AddtoWishlist_GeneralVerification clickonOrthopedic() {
		Common.pause(4);
		
		driver.navigate().to("https://promed-dev-scripco-refapp.accorin.us/");
		
		WebDriverWait orthopedic=new WebDriverWait(driver, 100);
		orthopedic.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Orthopedic']")));
		
		Common.pause(2);
		
		Common.mouseHover(driver, Orthopedic);
		
		return new AddtoWishlist_GeneralVerification(driver);
	}
	
	/*
	 * Choose Positioning under Orthopedic
	 */
	
	public AddtoWishlist_GeneralVerification Positioning() {
		
		WebDriverWait positioning=new WebDriverWait(driver, 100);
		positioning.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")));
		
		Common.mouseHover(driver, driver.findElement(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")));
		
		Common.pause(2);
		driver.findElement(By.xpath("//div[4]//span//strong[contains(text(),'Positioning')]")).click();
		
		return new AddtoWishlist_GeneralVerification(driver);
	}
	
	
	/*
	 * Add item to wishlist and remove it
	 */
	
	
	public AddtoWishlist_GeneralVerification addtowishlist(){
		
		Common.logcase("===>ITEM REMOVED FROM WHISLIST");
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='label action split']")));
		
		List<WebElement> wishlist = driver.findElements(By.xpath("//button[@class='label action split']"));
		
		Random rand = new Random();
		int countsize = wishlist.size();
		System.out.println("Element inside the Page====>"+countsize);
		
		int linkNo1=rand.nextInt(countsize);
		WebElement link1=wishlist.get(linkNo1);
		Common.log("Product Selected====>"+link1.getText());
		System.err.println("Product Selected====>"+link1.getText());
		Common.pause(2);
		link1.click();

		
		WebElement removefromwishlist = driver.findElement(By.xpath("//div[@class='products-grid wishlist']/ol/li[1]"));
		
		Common.windowhorizontalscroll(driver);
		Common.mouseHover(driver,removefromwishlist);
		
		Common.pause(2);
		
		WebDriverWait wait2=new WebDriverWait(driver, 100);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='product-item-actions']//a[2]/span")));
		
		List<WebElement> removebutton = driver.findElements(By.xpath("//div[@class='product-item-actions']//a[2]/span"));
		Common.pause(2);
		removebutton.get(0).click();
	
		
		return new AddtoWishlist_GeneralVerification(driver);
	}

	
	
	/*
	 * Add Item to Cart
	 */
	
	@FindBy(xpath="//button[@title='Add All to Cart']//span[contains(.,'Add All to Cart')]")
	private WebElement addalltocart;
	
	@FindBy(xpath="//div[@class='wishlist-toolbar-select']//input")
	private WebElement selectallbutton;
	
	public AddtoWishlist_GeneralVerification addtocartfromwishlist(){
		
		Common.logcase("===>ITEM ADDED TO MY CART");
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='label action split']")));
		
		List<WebElement> wishlist = driver.findElements(By.xpath("//button[@class='label action split']"));
		Common.pause(2);
		wishlist.get(0).click();
		Common.pause(3);
		
		driver.navigate().back();
		Common.pause(3);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='label action split']")));
		List<WebElement> wishlist1 = driver.findElements(By.xpath("//button[@class='label action split']"));
		wishlist1.get(2).click();
		Common.pause(3);
		
		
		WebElement firstelementinpage = driver.findElement(By.xpath("//div[@class='products-grid wishlist']/ol/li[1]"));
		
		Common.windowhorizontalscroll(driver);
		Common.mouseHover(driver,firstelementinpage);
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//div[@class='products-grid wishlist']//div[@class='product-item-info']//input"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='products-grid wishlist']//div[@class='product-item-info']//input")));
		Common.pause(2);
		checkbox.get(0).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='products-grid wishlist']//div[@class='product-item-info']//input")));
		Common.pause(1);
		Common.log("Value of Items First===>"+checkbox.get(1).getAttribute("value")+"</br>");
		System.err.println("Value of Items First===>"+checkbox.get(1).getAttribute("value"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='products-grid wishlist']//div[@class='product-item-info']//input")));
		Common.pause(2);
		checkbox.get(2).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='products-grid wishlist']//div[@class='product-item-info']//input")));
		Common.pause(2);
		Common.log("Value of Items Second===>"+checkbox.get(3).getAttribute("value")+"</br>");
		System.err.println("Value of Items Second===>"+checkbox.get(1).getAttribute("value"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='wishlist-toolbar-select']//input")));
		Common.pause(2);
		selectallbutton.click();
		
		driver.findElement(By.xpath("//div[@class='wishlist-toolbar-select']//input")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Add All to Cart']/span")));
		Common.pause(2);
		addalltocart.click();
		
		
		return new AddtoWishlist_GeneralVerification(driver);
	}
	
	
	/*
	 * View Cart
	 */
	
	@FindBy(xpath="//div[@class='items-total']/a/span/span")
	private WebElement clickviewcart;
	
	public AddtoWishlist_GeneralVerification viewcart(){
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='items-total']/a/span/span")));
		
		Common.pause(2);
		clickviewcart.click();
		
		return new AddtoWishlist_GeneralVerification(driver);
	}
	
	
	
	
	
	
	
	
}
