package core;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class Base {

	public static WebDriver driver;
	public static WebDriverWait wait;
	
	//*****************************************************************************
	// Function	Name	  : init
	// Summary	          : Initialization of Chrome driver
	
	//*****************************************************************************
	
	@BeforeTest
	public void init() {
		
			System.setProperty("webdriver.chrome.driver", "E:\\amal\\VantageProject\\chrome\\chromedriver.exe");
	        ChromeOptions options=new ChromeOptions();
	        options.addArguments("--disable-infobars");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://dev.pathback.org/");
	
		}
}
