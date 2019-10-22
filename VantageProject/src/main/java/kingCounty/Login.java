package kingCounty;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.CommonLib;

public class Login extends CommonLib{
	
	By UserName = By.name(CommonLib.readElementPropertyFile("TEXT_USERNAME_NAME"));
	By Password = By.name(CommonLib.readElementPropertyFile("TEXT_PASSWORD_NAME"));
	By LoginButton =By.xpath(CommonLib.readElementPropertyFile("BUTTON_LOGN_XP"));
	By LoginSuccessTest =By.xpath(CommonLib.readElementPropertyFile("LOGIN_SUCCESS_TEST_XP"));
	By WarningAcceptBtn =By.xpath(CommonLib.readElementPropertyFile("LOGIN_WARNING_ACCEPT_BTN_XP"));
	
	
	//********************************************************************************
	// Function	Name	  : appLogin
	// Summary	          : Function to perform Application Login					
	//********************************************************************************
	public void appLogin(String userName,String pass) throws Exception {
		driver.findElement(UserName).sendKeys(userName);
		driver.findElement(Password).sendKeys(pass);
		driver.findElement(LoginButton).click();
		WebDriverWait wait = CommonLib.getWait();
		wait.until(ExpectedConditions.presenceOfElementLocated(WarningAcceptBtn));
		driver.findElement(WarningAcceptBtn).click();
		Thread.sleep(4000);
		CommonLib.assertTrueFn(LoginSuccessTest);
			
	}

}
