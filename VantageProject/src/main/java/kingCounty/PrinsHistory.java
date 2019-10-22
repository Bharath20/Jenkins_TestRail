package kingCounty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.CommonLib;

public class PrinsHistory extends CommonLib{
	
	//Assign objass= new Assign(driver);
	
	By Action = By.xpath(CommonLib.readElementPropertyFile("BUTTON_ACTION_XP"));
	By history = By.xpath(CommonLib.readElementPropertyFile("LINK_HISTORY_XP"));
	By Assigned= By.xpath(CommonLib.readElementPropertyFile("LABEL_ASSIGNED_XP"));
	By Compledted= By.xpath(CommonLib.readElementPropertyFile("LABEL_COMPLETED_XP"));
	By close= By.xpath(CommonLib.readElementPropertyFile("BUTTON_CLOSE_XP"));
	By historyClose= By.xpath(CommonLib.readElementPropertyFile("HISTORY_CLOSE_BUTTON_XP"));
	By completedPrinsActionDropdown = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_DROPDOWN_XP"));
	By completedPrinsActionHistoryOption = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_HISTORY_OPTION_XP"));
	
	//function for hovering on Action
	public void HoveronAction() {
		WebElement Actionhover= driver.findElement(Action);
		CommonLib.mouseHoverMethod(driver, Actionhover);
	}
	
	//function for click history
	public void ClickonHitory() throws Exception {
//		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(completedPrinsActionDropdown).click();
		Thread.sleep(5000);
		driver.findElement(completedPrinsActionHistoryOption).click();
	}
	
	//Function for Highlighting Assigned and completed in Assessment History
	public void HighlightAssignedandCompleted() throws Exception {
		CommonLib.highLighterMethod(driver, driver.findElement(Assigned));
		Thread.sleep(3000); 
		CommonLib.highLighterMethod(driver, driver.findElement(Compledted));
		driver.findElement(historyClose).click();
	}

	//Function for click on close
	public void closeButton() {
		driver.findElement(close).click();
	}

}
