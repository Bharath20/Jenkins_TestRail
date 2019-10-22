package kingCounty;

import org.openqa.selenium.By;

import core.CommonLib;

public class CareGroup extends CommonLib {

	
	By Caregrup= By.xpath(CommonLib.readElementPropertyFile("LINK_CAREGROUP_XP"));
	By CareStatus=By.id(CommonLib.readElementPropertyFile("SELECT_CARE_STATUS_ID"));
	By Reason=By.id(CommonLib.readElementPropertyFile("TEXT_REASON_ID"));
	By date=By.xpath(CommonLib.readElementPropertyFile("CARE_DATE_XP")); 
	//By dateToday=By.xpath(CommonLib.readElementPropertyFile("CARE_DATE_TODAY_XP"));
	By Close=By.xpath(CommonLib.readElementPropertyFile("CARE_CLOSE_XP"));
	
	//********************************************************************************
  	// Function	Name	  : clickonCaregroupFucntionality
  	// Summary	          : Function for click care group and select status as Custom					
  	//********************************************************************************
	public void clickonCaregroupFucntionality() throws Exception {
		SubjectProfile objsub = new SubjectProfile();
        objsub.subjectProfileClick();
        Thread.sleep(3000);
        driver.findElement(Caregrup).click();
        driver.findElement(CareStatus).click();
        CommonLib.SelectByValue(CareStatus, CommonLib.readDataPropertyFile("CARE_STATUS"));
        driver.findElement(Reason).sendKeys("For test");
        Thread.sleep(7000);
        driver.findElement(date).sendKeys("1/22/2022");
        driver.findElement(Close).click();
	}
}
