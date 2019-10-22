package kingCounty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import core.CommonLib;

public class LogOut extends CommonLib {
	
	By logoutUserIcon =By.xpath(CommonLib.readElementPropertyFile("LINK_LOGOUTUSERICON_XP"));
	By LogoutUserContent =By.xpath(CommonLib.readElementPropertyFile("LABEL_LOGOUTUSER_XP"));
	By Logout =By.xpath(CommonLib.readElementPropertyFile("BUTTON_LOGOUT_XP"));
	
	//********************************************************************************
	// Function	Name	  : ClickonLogouticon
	// Summary	          : Function for click logout icon				
	//********************************************************************************
	public void ClickonLogouticon() throws Exception {
		
		driver.findElement(logoutUserIcon).click();
		CommonLib.highLighterMethod(driver, driver.findElement(LogoutUserContent));
		CommonLib.assertTrueFn(LogoutUserContent);
		CommonLib.highLighterMethod(driver, driver.findElement(Logout));
		Thread.sleep(3000);
		driver.findElement(Logout).click();
	}

}
  