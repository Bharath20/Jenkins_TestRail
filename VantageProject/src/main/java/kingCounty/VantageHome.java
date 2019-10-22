package kingCounty;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.CommonLib;

public class VantageHome extends CommonLib {
	
	By vantageHomeMenu = By.xpath(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_MENU_XP"));
	By vantageHomeMenuFacility = By.xpath(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_MENU_FACILITY_XP"));
	public void home() {
		
		WebDriverWait wait = CommonLib.getWait();
		wait.until(ExpectedConditions.presenceOfElementLocated(vantageHomeMenu));
		driver.findElement(vantageHomeMenu).click();
		wait.until(ExpectedConditions.elementToBeClickable(vantageHomeMenuFacility));
		driver.findElement(vantageHomeMenuFacility).click();
	}

}
