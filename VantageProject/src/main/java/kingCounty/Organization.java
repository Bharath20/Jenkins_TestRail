package kingCounty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import core.CommonLib;

public class Organization extends CommonLib{
  
	//WebDriver driver;
	By Organization =By.xpath(CommonLib.readElementPropertyFile("LINK_ORGANIZATION_XP"));
	By HeaderOrgan =By.xpath(CommonLib.readElementPropertyFile("HEADER_CREATEUSER_XP"));
	By CompanyName =By.xpath(CommonLib.readElementPropertyFile("ORGANIZATION_COMPANYNAEM_XP"));
	
	//********************************************************************************
	// Function	Name	  : Organization
	// Summary	          : Function to click on Organization under menu				
	//********************************************************************************
	public void ClickonOrganization() throws Exception {
		
		MenuOption objmenu = new MenuOption();
		SubjectProfile objSubj = new SubjectProfile();
		objmenu.ClickonMenu();
		driver.findElement(Organization).click();
		Thread.sleep(4000);
		CommonLib.highLighterMethod(driver, driver.findElement(HeaderOrgan));
		Thread.sleep(3000);
		CommonLib.highLighterMethod(driver, driver.findElement(CompanyName));
		CommonLib.assertTrueFn(HeaderOrgan);
		CommonLib.assertTrueFn(CompanyName);
		objSubj.homeButtonClick();
		
	} 
	 
}
