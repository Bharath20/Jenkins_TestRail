package kingCounty;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.service.DriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.CommonLib;

public class Facility extends CommonLib {
	
	By vantagePointHomeFacilityTableName = By.xpath(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_FACILITY_TABLE_NAME_XP"));
	By vantagePointHomeFacilityTableLast = By.xpath(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_FACILITY_TABLE_LAST_XP"));
	By vantagePointHomeFacilityTableSearch = By.id(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_FACILITY_TABLE_SEARCH_ID"));
	By vantagePointHomeFacilityTableSearchResult = By.xpath(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_FACILITY_TABLE_SEARCH_RESULT_XP"));
	By vantagePointHomeFacilityTableEditButton = By.xpath(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_FACILITY_TABLE_EDIT_BUTTON_XP"));
	By vantagePointHomeFacilityTableEditDescription = By.id(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_FACILITY_TABLE_EDIT_DESCRIPTION_ID"));
	By vantagePointHomeFacilityTableEditCancelButton = By.xpath(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_FACILITY_TABLE_EDIT_CANCEL_BUTTON_XP"));
	By vantagePointHomeFacilityTableEditSaveButton = By.xpath(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_FACILITY_TABLE_EDIT_SAVE_BUTTON_XP"));
	By vantagePointHomeFacilityTableAddButton = By.xpath(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_FACILITY_TABLE_ADD_BUTTON_XP"));
	By vantagePointHomeFacilityTableAddList = By.xpath(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_FACILITY_TABLE_ADD_DETAILS_LIST_XP"));
	By vantagePointHomeFacilityTableAddDescription = By.id(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_FACILITY_TABLE_ADD_DESCRIPTION_ID"));
	By vantagePointHomeFacilityTableAddCode = By.xpath(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_FACILITY_TABLE_ADD_CODE_XP"));
	By vantagePointHomeFacilityTableAddSelect = By.id(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_FACILITY_TABLE_ADD_SELECT_ID"));
	By vantagePointHomeFacilityTableAddPostalCode = By.id(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_FACILITY_TABLE_ADD_POSTALCODE_ID"));
	By vantagePointHomeFacilityTableAddMobile = By.id(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_FACILITY_TABLE_ADD_MOBILE_ID"));
	By vantagePointHomeFacilityTableAddSaveButton = By.xpath(CommonLib.readElementPropertyFile("VANTAGEPOINT_HOME_FACILITY_TABLE_ADD_SAVE_BUTTON_XP"));
	
	public void facility() throws Exception {
		
		WebDriverWait wait = CommonLib.getWait();
		wait.until(ExpectedConditions.presenceOfElementLocated(vantagePointHomeFacilityTableName));
		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();",vantagePointHomeFacilityTableLast);
		CommonLib.scrollMethod(driver, driver.findElement(vantagePointHomeFacilityTableLast));
		CommonLib.highLighterMethod(driver, driver.findElement(vantagePointHomeFacilityTableLast));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		js.executeScript("arguments[0].scrollIntoView();",vantagePointHomeFacilityTableName);
		CommonLib.scrollMethod(driver, driver.findElement(vantagePointHomeFacilityTableName));
		Thread.sleep(5000);
		driver.findElement(vantagePointHomeFacilityTableSearch).sendKeys(CommonLib.readDataPropertyFile("vantagePointHomeFacilitySearch"));
		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		CommonLib.assertEqualsFn(driver.findElement(vantagePointHomeFacilityTableSearchResult).getText(), CommonLib.readDataPropertyFile("vantagePointHomeFacilitySearchResult"));
		driver.findElement(vantagePointHomeFacilityTableSearch).clear();
		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(vantagePointHomeFacilityTableEditButton).click();
//		wait.until(ExpectedConditions.presenceOfElementLocated(vantagePointHomeFacilityTableEditDescription));
		Thread.sleep(5000);
		driver.findElement(vantagePointHomeFacilityTableEditDescription).sendKeys(CommonLib.randomWords(6));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(vantagePointHomeFacilityTableEditCancelButton).click();
//		wait.until(ExpectedConditions.presenceOfElementLocated(vantagePointHomeFacilityTableEditButton));
		Thread.sleep(5000);
		driver.findElement(vantagePointHomeFacilityTableEditButton).click();
//		wait.until(ExpectedConditions.presenceOfElementLocated(vantagePointHomeFacilityTableEditDescription));
		Thread.sleep(5000);
		driver.findElement(vantagePointHomeFacilityTableEditDescription).sendKeys(CommonLib.randomWords(6));
		driver.findElement(vantagePointHomeFacilityTableEditSaveButton).click();
//		wait.until(ExpectedConditions.presenceOfElementLocated(vantagePointHomeFacilityTableAddButton));
		Thread.sleep(5000);
		driver.findElement(vantagePointHomeFacilityTableAddButton).click();
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(vantagePointHomeFacilityTableAddList));
		Thread.sleep(5000);
		List<WebElement> addDetailsList = CommonLib.getList(vantagePointHomeFacilityTableAddList);
		for (int i = 0; i < addDetailsList.size(); i++) {
			
			addDetailsList.get(i).sendKeys(CommonLib.randomWords(6));
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		}
		
		driver.findElement(vantagePointHomeFacilityTableAddCode).sendKeys(""+CommonLib.randomNumber(4));
//		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(vantagePointHomeFacilityTableAddDescription).sendKeys(CommonLib.randomWords(8));
//		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		Thread.sleep(5000);
		Select select = new Select(driver.findElement(vantagePointHomeFacilityTableAddSelect));
		select.selectByVisibleText(CommonLib.readDataPropertyFile("vantagePointHomeFacilityAddState"));
//		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(vantagePointHomeFacilityTableAddPostalCode).sendKeys(""+CommonLib.randomNumber(9));
//		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		Thread.sleep(5000);
		String postalcode = "";
		for (int i = 0; i < 9; i++) {
			postalcode = postalcode+""+CommonLib.randomNumber(9);
		}
		System.out.println(postalcode);
		driver.findElement(vantagePointHomeFacilityTableAddMobile).sendKeys(postalcode);
		System.out.println(""+CommonLib.randomNumber(10));
//		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(vantagePointHomeFacilityTableAddSaveButton).click();
	}
}
