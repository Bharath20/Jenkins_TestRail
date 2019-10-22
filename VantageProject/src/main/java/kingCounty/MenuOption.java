package kingCounty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import core.Base;
import core.CommonLib;

public class MenuOption extends CommonLib{
	
	//WebDriver driver;
	
	By Menu = By.xpath(CommonLib.readElementPropertyFile("LINK_MENU_XP"));
	By MenuAdd = By.xpath(CommonLib.readElementPropertyFile("LINK_MENUADD_XP"));
	By AddUser = By.xpath(CommonLib.readElementPropertyFile("LINK_ADD_XP"));
	By MenuCaseLoad =By.xpath(CommonLib.readElementPropertyFile("LINK_MENUMYCASELOAD_XP"));
	By MenuAccount =By.xpath(CommonLib.readElementPropertyFile("LINK_MENUMYACCOUNT_XP"));
	By MenuBiPlat =By.xpath(CommonLib.readElementPropertyFile("LINK_MENUBIPLATFOEM_XP"));
	By MenuSettings =By.xpath(CommonLib.readElementPropertyFile("LINK_MENUSETTINGS_XP"));
	By MenuManagUser= By.xpath(CommonLib.readElementPropertyFile("LINK_MANAGEUSER_XP"));
	By MenuFacility = By.xpath(CommonLib.readElementPropertyFile("LINK_FACILITY_XP"));
	By MenuOrganization= By.xpath(CommonLib.readElementPropertyFile("LINK_ORGANIZATION_XP"));
	
	
	//********************************************************************************
	// Function	Name	  : ClickonMenu
	// Summary	          : Fucntion for click on Menu				
	//********************************************************************************
	public void ClickonMenu() {
		try {
  			Thread.sleep(4000);
			driver.findElement(Menu).click(); 

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//CommonLib.executescriptclick(driver.findElement(Menu));
	}
	
	//********************************************************************************
	// Function	Name	  : HighlightAllMenuOptions
	// Summary	          : Function for highlighting All sections under Menu				
	//********************************************************************************
	public void HighlightAllMenuOptions() throws Exception {
		
		CommonLib.highLighterMethod(driver, driver.findElement(Menu));
		CommonLib.highLighterMethod(driver, driver.findElement(MenuAdd));
		CommonLib.highLighterMethod(driver, driver.findElement(AddUser));
		CommonLib.highLighterMethod(driver, driver.findElement(MenuCaseLoad));
		CommonLib.highLighterMethod(driver, driver.findElement(MenuAccount));
		CommonLib.highLighterMethod(driver, driver.findElement(MenuBiPlat));
		CommonLib.highLighterMethod(driver, driver.findElement(MenuSettings));
		CommonLib.highLighterMethod(driver, driver.findElement(MenuManagUser));
		CommonLib.highLighterMethod(driver, driver.findElement(MenuFacility));
		CommonLib.highLighterMethod(driver, driver.findElement(MenuOrganization));
		
	}
	
	//********************************************************************************
	// Function	Name	  : HighlightingMajorOptions
	// Summary	          : Function for highlighting major sections under Menu				
	//********************************************************************************
	public void HighlightingMajorOptions() throws Exception {
		
		CommonLib.highLighterMethod(driver, driver.findElement(MenuAdd));
		CommonLib.highLighterMethod(driver, driver.findElement(MenuCaseLoad));
		CommonLib.highLighterMethod(driver, driver.findElement(MenuAccount));
		CommonLib.highLighterMethod(driver, driver.findElement(MenuManagUser));
		CommonLib.highLighterMethod(driver, driver.findElement(MenuFacility));
		CommonLib.highLighterMethod(driver, driver.findElement(MenuOrganization));
	}
}
