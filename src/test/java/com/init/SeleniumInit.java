package com.init;


import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.IResultMap;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.internal.Utils;
import com.indexpage.AccountInformationScenario_GeneralindexPage;
import com.indexpage.Add_To_Cart_GeneralIndexpage;
import com.indexpage.AddtoCartDeleteIncreaseDecreaseProduct_GeneralIndexpage;
import com.indexpage.AddtoWishlist_GeneralindexPage;
import com.indexpage.CheckOutandCreateAccount_GeneralIndexPage;
import com.indexpage.Checkout_as_Guest_GeneralIndexpage;
import com.indexpage.Checkoutexceptionprocesses_GeneralIndexpage;
import com.indexpage.Checkoutloggedin_GeneralIndexpage;
import com.indexpage.MyPaymentData_GeneralindexPage;
import com.indexpage.MyordersScenario_GeneralIndexpage;
import com.indexpage.ValidatePaymentMethod_GeneralindexPage;
import com.indexpage.ValidateTax_GeneralindexPage;
import com.verification.AccountInformationScenario_GeneralVerification;
import com.verification.AddToCart_GeneralVerification;
import com.verification.AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification;
import com.verification.AddtoWishlist_GeneralVerification;
import com.verification.CheckOutandCreateAccount_GeneralVerification;
import com.verification.Checkout_as_Guest_GeneralVerification;
import com.verification.Checkoutexceptionprocesses_GeneralVerification;
import com.verification.Checkoutloggedin_GeneralVerification;
import com.verification.MyPaymentData_GeneralVerification;
import com.verification.MyordersScenario_GeneralVerification;
import com.verification.ValidatePaymentMethod_GeneralVerification;
import com.verification.ValidateTax_GeneralVerification;;

	public class SeleniumInit {

		public String suiteName = "";
		public String testName = "";
		/* Minimum requirement for test configur ation */
		protected String testUrl; // Test url
		protected String seleniumHub; // Selenium hub IP
		protected String seleniumHubPort; // Selenium hub port
		protected String targetBrowser; // Target browser
		protected static String test_data_folder_path = null;
		public static String currentWindowHandle = ""; // Get Current Window handle
		public static String browserName = "";
		public static String osName = "";
		public static String browserVersion = "";
		public static String browsernm = "";
		
		public static final String USERNAME = "vishal524";
		public static final String AUTOMATE_KEY = "sqLpZKG3syEvbJoeBwEn";
		public static final String URL1 = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

		public Add_To_Cart_GeneralIndexpage addtocartgeneralIndexpage;
		public AddToCart_GeneralVerification addtocartgeneralVerification;
		
		public Checkout_as_Guest_GeneralIndexpage checkoutasguestgeneralIndexpage;
		public Checkout_as_Guest_GeneralVerification checkoutasguestgeneralVerification;

		public Checkoutloggedin_GeneralIndexpage checkoutloggedingeneralindexpage;
		public Checkoutloggedin_GeneralVerification checkoutloggedingeneralVerication;
		
		public CheckOutandCreateAccount_GeneralIndexPage checkoutandcreateaccountgeneralindexpage;
		public CheckOutandCreateAccount_GeneralVerification checkoutandcreateaccountgeneralVerification;
		
		public Checkoutexceptionprocesses_GeneralIndexpage checkoutexceptionprocessesgeneralindexpage;
		public Checkoutexceptionprocesses_GeneralVerification checkoutexceptionprocessesgeneralVerification;
		
		
		public MyordersScenario_GeneralIndexpage myorderscenariogeneralindexpage;
		public MyordersScenario_GeneralVerification myorderscenariogeneralVerification;
		
		public AddtoCartDeleteIncreaseDecreaseProduct_GeneralIndexpage addtocartdeleteincreasedecreaseproductindexpage;
		public AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification addtocartdeleteincreasedecreaseproductgeneralVerification;
		
		
		public AccountInformationScenario_GeneralindexPage accountinformationscenarioindexpage;
		public AccountInformationScenario_GeneralVerification accountinformationscenariogeneralVerification;
		
		public MyPaymentData_GeneralindexPage mypaymentdatageneralindexpage;
		public MyPaymentData_GeneralVerification mypaymentdatageneralverification;
		
		public AddtoWishlist_GeneralindexPage addtowishlistgeneralindexpage;
		public AddtoWishlist_GeneralVerification addtowishlistgeneralverification;
		
		
		public ValidatePaymentMethod_GeneralindexPage validatepaymentmethodgeneralindexpage;
		public ValidatePaymentMethod_GeneralVerification validatepaymentmethodgeneralverification;
		
		public ValidateTax_GeneralindexPage validatetaxgeneralindexpage;
		public ValidateTax_GeneralVerification validatetaxgeneralverification;
		
		
		public String email = "test+66723@clearfunds.com";
		public String password = "nirav@$56789";

		protected static String screenshot_folder_path = null;
		public static String currentTest; // current running test

		protected static Logger logger = Logger.getLogger("testing");
		protected WebDriver driver;

		// Common Common = new Common(driver);

		/* Page's declaration */

		/**
		 * Fetches suite-configuration from XML suite file.
		 * 
		 * @param testContext
		 * @throws IOException 
		 */

		@BeforeTest(alwaysRun = true)
		public void fetchSuiteConfiguration(ITestContext testContext) throws IOException {
			//testUrl = testContext.getCurrentXmlTest().getParameter("selenium.url");
			// testUrl = TestData.getURL();
			/* System.out.println("======" + testUrl + "========="); */
			seleniumHub = testContext.getCurrentXmlTest().getParameter("selenium.host");
			seleniumHubPort = testContext.getCurrentXmlTest().getParameter("selenium.port");
			targetBrowser = Common.getValueFromConfig("config.properties","Browser");
			testUrl= Common.getValueFromConfig("config.properties","URL");
			//testContext.getCurrentXmlTest().getParameter("selenium.browser");
			browsernm = targetBrowser;
		}

		/**
		 * WebDriver initialization
		 * 
		 * @return WebDriver object
		 * @throws IOException
		 * @throws InterruptedException
		 */
		@SuppressWarnings({ "static-access", "deprecation" })
		@BeforeMethod(alwaysRun = true)
		public void setUp(Method method, ITestContext testContext) throws IOException, InterruptedException {

			currentTest = method.getName(); // get Name of current test.
			URL remote_grid = new URL("http://" + seleniumHub + ":" + seleniumHubPort + "/wd/hub");

			String SCREENSHOT_FOLDER_NAME = "screenshots";
			String TESTDATA_FOLDER_NAME = "test_data";

			test_data_folder_path = new File(TESTDATA_FOLDER_NAME).getAbsolutePath();
			screenshot_folder_path = new File(SCREENSHOT_FOLDER_NAME).getAbsolutePath();
			
			 
			  

			DesiredCapabilities capability = null;
			if (targetBrowser == null || targetBrowser.contains("firefox")) {
				FirefoxProfile profile = new FirefoxProfile();
				if (System.getProperty("os.name").equalsIgnoreCase("Mac OS X")) {
					// path = "/Users/Jignesh/developer/test-automation";
				} else {
					// path = "c:\\Downloads_new";
				}

				profile.setPreference("dom.max_chrome_script_run_time", "999");
				profile.setPreference("dom.max_script_run_time", "999");
				profile.setPreference("browser.download.folderList", 2);
				// profile.setPreference("browser.download.dir", path);
				profile.setPreference("browser.helperApps.neverAsk.openFile",
						"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
				profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
						"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
				profile.setPreference("browser.download.manager.showWhenStarting", false);
				profile.setPreference("browser.download,manager.focusWhenStarting", false);
				// profile.setPreference("browser.download.useDownloadDir",true);
				profile.setPreference("browser.helperApps.alwaysAsk.force", false);
				profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
				profile.setPreference("browser.download.manager.closeWhenDone", false);
				profile.setPreference("browser.download.manager.showAlertOnComplete", false);
				profile.setPreference("browser.download.manager.useWindow", false);
				profile.setPreference("browser.download.manager.showWhenStarting", false);

				profile.setPreference("services.sync.prefs.sync.browser.download.manager.showWhenStarting", false);
				profile.setPreference("pdfjs.disabled", true);
				profile.setAcceptUntrustedCertificates(true);
				profile.setPreference("security.OCSP.enabled", 0);
			//	profile.setEnableNativeEvents(false);
				profile.setPreference("network.http.use-cache", false);

				// added Dependancy to disable hardware acceleration.

				/*
				 * profile.setPreference("gfx.direct2d.disabled",true);
				 * profile.setPreference("layers.acceleration.disabled", true);
				 */

				profile.setPreference("gfx.direct2d.disabled", true);
				profile.setPreference("layers.acceleration.disabled", true);
				// profile.setPreference("webgl.force-enabled", true);
				// Proxy proxy = new Proxy().setHttpProxy("localhost:3129");

				// cap.setCapability(CapabilityType.PROXY, proxy);
				
				
				
				capability = DesiredCapabilities.firefox();
				
				// proxy code
				// capability.setCapability(CapabilityType.PROXY,proxy);
				capability.setJavascriptEnabled(true);
				capability.setCapability(FirefoxDriver.PROFILE, profile);
				browserName = capability.getBrowserName();
				osName = System.getProperty("os.name");
				browserVersion = capability.getVersion().toString();
				
	
				
				System.out.println("=========" + "firefox Driver " + "==========");
				
				
				driver = new RemoteWebDriver(remote_grid, capability);

			} else if (targetBrowser.contains("ie11")) {
				capability = DesiredCapabilities.internetExplorer();
				System.setProperty("webdriver.ie.driver",
						"/IEDriverServer.exe");

				capability.setBrowserName("internet explorer");
				capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				capability.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
				capability.setJavascriptEnabled(true);
				browserName = capability.getVersion();
				osName = capability.getPlatform().getCurrent().name();
				browserVersion = capability.getVersion();

				driver = new RemoteWebDriver(remote_grid, capability);

			} else if (targetBrowser.contains("opera")) {
				capability = DesiredCapabilities.opera();
				System.setProperty("webdriver.opera.driver",
						"/operadriver.exe");

				capability.setJavascriptEnabled(true);
				browserName = capability.getVersion();
				osName = capability.getPlatform().getCurrent().name();
				browserVersion = capability.getVersion();

				driver = new OperaDriver(capability);

			} else if (targetBrowser.contains("chrome")) {
				ChromeOptions options = new ChromeOptions();
				//options.setCapability("addCustomRequestHeaders", "authorization: Basic c2NyaXBjbzphY2Nvcmlu");
			
				//capability = DesiredCapabilities.chrome();
				//System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
				
				
				
				DesiredCapabilities caps = new DesiredCapabilities();
				  caps.setCapability("browser", "Chrome");
				  caps.setCapability("browser_version", "61.0");
				  caps.setCapability("os", "Windows");
				  caps.setCapability("os_version", "8");
				  caps.setCapability("resolution", "1024x768");
				  caps.setCapability("browserstack.selenium_version", "2.53.1");
				  caps.setCapability("browserstack.debug", "true");
				  caps.setCapability("project", "Accorin");
				  caps.setCapability("build","");
				  caps.setCapability("browserstack.local", "false");
				  caps.setCapability("browserstack.console", "info");
				  caps.setCapability("browserstack.timezone", "US");
			      caps.setCapability("name", testContext.getName());
			      
			      
			      
				  
				  driver = new RemoteWebDriver(new URL(URL1), caps);
				  driver.get(testUrl);
				  
				  ((RemoteWebDriver)driver).getSessionId().toString();
				
				  
				
			//	@SuppressWarnings("unused")
				File chromeDriver;
				
				if (System.getProperty("os.name").equalsIgnoreCase("Mac OS X")) {
					 chromeDriver = new File("/lib/chromedriver");
				} else {
					 chromeDriver = new File("/lib/chromedriver.exe");
				}
				
			/*	System.setProperty("webdriver.chrome.driver",
					     chromeDriver.getAbsolutePath());
				options.addArguments("disable-geolocation");
				capability.setCapability(ChromeOptions.CAPABILITY, options);
				capability.setBrowserName("chrome");
				capability.setJavascriptEnabled(true);*/
			/*	browserName = caps.getVersion();
				osName = caps.getPlatform().name();
				browserVersion = caps.getVersion();*/
				
			    
				//driver = new ChromeDriver();
				
				//driver = new RemoteWebDriver(remote_grid, capability);
				
				
				
				
				
				
			} else if (targetBrowser.contains("safari")) {

				// System.setProperty("webdriver.safari.driver","/Users/jesus/Desktop/SafariDriver.safariextz");
				// driver = new SafariDriver();
				@SuppressWarnings("unused")
				SafariDriver profile = new SafariDriver();

				capability = DesiredCapabilities.safari();
				capability.setJavascriptEnabled(true);
				capability.setBrowserName("safari");
				browserName = capability.getBrowserName();
				osName = capability.getPlatform().name();
				browserVersion = capability.getVersion();
				// capability.setCapability(SafariDriver.CLEAN_SESSION_CAPABILITY,
				// profile);
				this.driver = new SafariDriver(capability);
			}

			suiteName = testContext.getSuite().getName();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(testUrl);
			System.out.println("TestData URL :: " + testUrl);
			driver.manage().window().maximize();

			currentWindowHandle = driver.getWindowHandle();
			System.out.println("Current Window Handle ID : --->>" + currentWindowHandle);

			suiteName = testContext.getSuite().getName();
			System.out.println("Current Xml Suite is:---->" + suiteName);
			
			
			
			addtocartgeneralIndexpage = new Add_To_Cart_GeneralIndexpage(driver);
			addtocartgeneralVerification = new AddToCart_GeneralVerification(driver);
			
			checkoutasguestgeneralIndexpage =new Checkout_as_Guest_GeneralIndexpage(driver);
			checkoutasguestgeneralVerification = new Checkout_as_Guest_GeneralVerification(driver);
			
			checkoutloggedingeneralindexpage=new Checkoutloggedin_GeneralIndexpage(driver);
			checkoutloggedingeneralVerication=new Checkoutloggedin_GeneralVerification(driver);
			
			checkoutandcreateaccountgeneralindexpage=new CheckOutandCreateAccount_GeneralIndexPage(driver);
			checkoutandcreateaccountgeneralVerification=new CheckOutandCreateAccount_GeneralVerification(driver);
			
			checkoutexceptionprocessesgeneralindexpage=new Checkoutexceptionprocesses_GeneralIndexpage(driver);
			checkoutexceptionprocessesgeneralVerification=new Checkoutexceptionprocesses_GeneralVerification(driver);
			
			myorderscenariogeneralindexpage=new MyordersScenario_GeneralIndexpage(driver);
			myorderscenariogeneralVerification=new MyordersScenario_GeneralVerification(driver);
			
			addtocartdeleteincreasedecreaseproductindexpage=new AddtoCartDeleteIncreaseDecreaseProduct_GeneralIndexpage(driver);
			addtocartdeleteincreasedecreaseproductgeneralVerification=new AddtoCartDeleteIncreaseDecreaseProduct_GeneralVerification(driver);
			
			accountinformationscenarioindexpage=new AccountInformationScenario_GeneralindexPage(driver);
		    accountinformationscenariogeneralVerification=new AccountInformationScenario_GeneralVerification(driver);
		    
		    mypaymentdatageneralindexpage=new MyPaymentData_GeneralindexPage(driver);
		    mypaymentdatageneralverification=new MyPaymentData_GeneralVerification(driver);
		    		
		    addtowishlistgeneralindexpage=new AddtoWishlist_GeneralindexPage(driver);	
		    addtowishlistgeneralverification=new AddtoWishlist_GeneralVerification(driver);		
		    
		    
		    validatepaymentmethodgeneralindexpage=new ValidatePaymentMethod_GeneralindexPage(driver);
		    validatepaymentmethodgeneralverification =new ValidatePaymentMethod_GeneralVerification(driver);	
		    
		    
		    validatetaxgeneralindexpage=new ValidateTax_GeneralindexPage(driver);
		    validatetaxgeneralverification=new  ValidateTax_GeneralVerification(driver);   		
		}

		/**
		 * Log For Failure Test Exception.
		 * 
		 * @param tests
		 */
		private void getShortException(IResultMap tests) {

			for (ITestResult result : tests.getAllResults()) {

				Throwable exception = result.getThrowable();
				List<String> msgs = Reporter.getOutput(result);
				boolean hasReporterOutput = msgs.size() > 0;
				boolean hasThrowable = exception != null;
				if (hasThrowable) {
					boolean wantsMinimalOutput = result.getStatus() == ITestResult.SUCCESS;
					if (hasReporterOutput) {
						log("<h3>" + (wantsMinimalOutput ? "Expected Exception" : "Failure Reason:") + "</h3>");
					}

					// Getting first line of the stack trace
					@SuppressWarnings("deprecation")
					String str = Utils.stackTrace(exception, true)[0];
					@SuppressWarnings("resource")
					Scanner scanner = new Scanner(str);
					String firstLine = scanner.nextLine();
					log(firstLine);
				}
			}
		}

		/**
		 * After Method
		 * 
		 * @param testResult
		 */

		@AfterMethod(alwaysRun = true)
		public void tearDown(ITestResult testResult) {

			ITestContext ex = testResult.getTestContext();

			try {
				testName = testResult.getName();
				if (!testResult.isSuccess()) {

					/* Print test result to Jenkins Console */
					System.out.println();
					System.out.println("TEST FAILED - " + testName);
					System.out.println();
					System.out.println("ERROR MESSAGE: " + testResult.getThrowable());
					System.out.println("\n");
					Reporter.setCurrentTestResult(testResult);

					/* Make a screenshot for test that failed */
					String screenshotName = Common.getCurrentTimeStampString() + testName;
					Reporter.log("<br> <b>Please look to the screenshot - </b>");
					Common.makeScreenshot(driver, screenshotName);
					// Reporter.log(testResult.getThrowable().getMessage());
					getShortException(ex.getFailedTests());
				} else {
					try {
						Common.pause(5);
						/*
						 * driver.findElement(
						 * By.xpath("//div[@class='container']//a[contains(.,'Logout')]" )) .click();
						 */
						Common.pause(5);
					} catch (Exception e) {
						log("<br></br> Not able to perform logout");
					}

					System.out.println("TEST PASSED - " + testName + "\n"); // Print
					// test
					// resule
					// to
					// Jenkins
					// Console
				}

				/*
				 * final File folder = new File("C:/Downloads_new"); File files[] =
				 * folder.listFiles();
				 * 
				 * if (files.length > 0) { for (File f : files) { if (f.delete()) { System.out
				 * .println("file deleted From Downloads_new folder"); } }
				 * 
				 * }
				 */

				System.out.println("here is test status--------------------" + testResult.getStatus());

				driver.manage().deleteAllCookies();

				driver.close();
				driver.quit();

			} catch (Throwable throwable) {
				System.out.println("message from tear down" + throwable.getMessage());
			}
		}

		/**
		 * Log given message to Reporter output.
		 * 
		 * @param msg
		 *            Message/Log to be reported.
		 */
		public static void log(String msg) {
			System.out.println(msg);
			Reporter.log("<br></br>" + msg);
		}

		public static void logList(ArrayList<String> msg) {
			System.out.println(msg);
			Reporter.log("<br></br>" + msg);
		}

		public static void testDescription(String msg) {
			System.out.println(msg);
			Reporter.log("<strong> <h4 style=\"color:DarkViolet\"> " + "Testcase Description: " + msg + "</h4> </strong>");
		}

		public static void testcaseId(String msg) {
			System.out.println(msg);
			Reporter.log("<strong> <h4 style=\"color:DarkViolet\"> " + "Test Case ID: " + msg + "</h4> </strong>");
		}

		public static void logverification(int i, String msg) {
			System.out.println(msg);
			Reporter.log("<br></br><b style=\"color:OrangeRed \"> Expected Result-" + i + ": </b><b>" + msg + "</b>");
		}
		
		public void logStatus(String Status) throws UnsupportedEncodingException, URISyntaxException, IOException {
	        System.out.println(Status);  
	        
			if (Status.equalsIgnoreCase("Pass")) {
				log(" <Strong><font color=#008000><b> &#10004 PASS</b></font></strong>");		
				/*if(browsernm.contains("browserstack")){
				markPass();
				}*/
			} else if (Status.equalsIgnoreCase("Fail")) {
				log("<br><Strong><font color=#FF0000><b>&#10008 FAIL</b></font></strong></br>");
				/*if(browsernm.contains("browserstack")){
				markFail();
				}*/
				 /*Make a screenshot for test that failed */
			    String screenshotName = Common.getCurrentTimeStampString()
			      + currentTest;
			    Reporter.log("<br> <b>Please look to the screenshot - </b>");
			    Common.makeScreenshot(driver, screenshotName);
			}
		}

		public static void mark() throws URISyntaxException, UnsupportedEncodingException, IOException {
			
			 URI uri = new URI("https://vishal524:sqLpZKG3syEvbJoeBwEn@api.browserstack.com/automate/sessions/<session-id>.json");
			HttpPut putRequest = new HttpPut(uri);

			ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
			try {
				nameValuePairs.add((new BasicNameValuePair("status", "Pass")));
				nameValuePairs.add((new BasicNameValuePair("reason", "Test Case Executed Successfully")));
				putRequest.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			} catch (Exception e) {
				nameValuePairs.add((new BasicNameValuePair("status", "Fail")));
				nameValuePairs.add((new BasicNameValuePair("reason", "Test Case Failed")));
				putRequest.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			}

			HttpClientBuilder.create().build().execute(putRequest);
			}		
	}

	

