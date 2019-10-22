package kingCounty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import core.CommonLib;

public class CaseLoadPersonICon extends CommonLib {
	
	By RightPerson =By.xpath(CommonLib.readElementPropertyFile("ICON_SUBJECTTILE_RIGHTPERSON_XP"));
	By LeftPerson =By.xpath(CommonLib.readElementPropertyFile("ICON_SUBJECTTILE_LEFTPERSON_XP"));
	By MycaseLoad =By.xpath(CommonLib.readElementPropertyFile("HEADER_CREATEUSER_XP"));
	
	//********************************************************************************
	// Function	Name	  : ClickonSubjectTilePerson                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	// Summary	          : Function to click person icon on subject's tile					
	//********************************************************************************
	
	public void ClickonSubjectTilePerson() throws Exception {
		
		SubjectProfile objSubj = new SubjectProfile();
		driver.findElement(RightPerson).click();
		objSubj.homeButtonClick();
		Thread.sleep(8000);
		CommonLib.assertTrueFn(MycaseLoad);
		driver.findElement(LeftPerson).click();
		Thread.sleep(4000);
		objSubj.homeButtonClick();
		Thread.sleep(4000);
		CommonLib.assertTrueFn(MycaseLoad);  
	} 
	
	
		  
}
