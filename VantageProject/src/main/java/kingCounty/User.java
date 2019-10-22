 package kingCounty;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import core.CommonLib;

public class User extends CommonLib {

	//WebDriver driver;
	By User=By.xpath(CommonLib.readElementPropertyFile("LINK_MENU_USER_XP")); 
	By HeaderCreateUser = By.xpath(CommonLib.readElementPropertyFile("HEADER_CREATEUSER_XP"));
	By Firstname =By.name(CommonLib.readElementPropertyFile("TEXT_FIRSTNAME_NAME"));
	By middlename =By.name(CommonLib.readElementPropertyFile("TEXT_MIDDLENAME_NAME"));
	By lastname =By.name(CommonLib.readElementPropertyFile("TEXT_LASTNAME_NAME"));
	By phone =By.id(CommonLib.readElementPropertyFile("TEXT_PHONE_ID"));
	By mobile =By.id(CommonLib.readElementPropertyFile("TEXT_MOBILE_ID"));
	By mail= By.id(CommonLib.readElementPropertyFile("TEXT_EMAIL_ID"));
	By secondemail =By.id(CommonLib.readElementPropertyFile("TEXT_SECOEMAIL_ID"));
	By titleId =By.id(CommonLib.readElementPropertyFile("TEXT_TITLE_ID"));
	By IdNum =By.xpath(CommonLib.readElementPropertyFile("TEXT_CCN_XP"));
	By username =By.id(CommonLib.readElementPropertyFile("TEXT_CREATEUSERNAME_ID"));
	By password =By.id(CommonLib.readElementPropertyFile("TEXT_CREATEPASS_ID"));
	By Confirmpass =By.id(CommonLib.readElementPropertyFile("TEXT_CONFIRMPASS_ID"));
	By AssigntoGroup =By.xpath(CommonLib.readElementPropertyFile("SELECT_ASSIGNTOGROUP_XP"));
	By gender =By.id(CommonLib.readElementPropertyFile("SELECT_GENDER_ID"));
	By race =By.id(CommonLib.readElementPropertyFile("SELECT_RACE_ID"));
	By UserSAve =By.xpath(CommonLib.readElementPropertyFile("BUTTON_CREATESAVE_XP"));
	By Datepick =By.xpath(CommonLib.readElementPropertyFile("TEXT_DATE_XP"));
	By facility =By.xpath(CommonLib.readElementPropertyFile("TEXT_FACILITY_XP"));
	By ViewProf =By.xpath(CommonLib.readElementPropertyFile("BUTTON_VIEWPROFILE_XP"));
	By ProfileData =By.xpath(CommonLib.readElementPropertyFile("LABEL_PROFILEDETAILS_XP"));
	By AddtocareYes =By.xpath(CommonLib.readElementPropertyFile("BUTTON_ADDTOCAREGROUP_YES_XP"));
	By TodayDate=By.xpath(CommonLib.readElementPropertyFile("TEXT_TODAY_XP"));
	By FaciNo=By.xpath(CommonLib.readElementPropertyFile("TEXT_FACINO_XP"));
	
	//********************************************************************************
	// Function	Name	  : HighlightHeaderCreateUser
	// Summary	          : Function to highlight header of create user				
	//********************************************************************************
	public void HighlightHeaderCreateUser() throws Exception {
		Thread.sleep(4000); 
		driver.findElement(User).click();
		Thread.sleep(4000);
		CommonLib.highLighterMethod(driver, driver.findElement(HeaderCreateUser));
	}
		
	//********************************************************************************
	// Function	Name	  : Fillfields
	// Summary	          : Function to fill all the fields in create user					
	//********************************************************************************
	public void Fillfields() throws Exception {
		
		 
		driver.findElement(Firstname).sendKeys(CommonLib.randomWords(5));
		driver.findElement(phone).sendKeys(CommonLib.readDataPropertyFile("TEXT_PHONE"));
		CommonLib.SelectByValue(AssigntoGroup, CommonLib.readDataPropertyFile("SELECT_ASSIGNEDGROUP_SUBJECT"));
		//driver.findElement(middlename).sendKeys(CommonLib.generateAlpha(5));				
		driver.findElement(mobile).sendKeys(CommonLib.readDataPropertyFile("TEXT_MOBILE"));
		driver.findElement(facility).click();
		driver.findElement(facility).sendKeys(CommonLib.readDataPropertyFile("TEXT_FACILITYNO"));
		driver.findElement(FaciNo).click();
		Thread.sleep(3000);
		driver.findElement(lastname).sendKeys(CommonLib.randomWords(2));
		
		driver.findElement(mail).sendKeys(CommonLib.randomWords(6)+"@yopmail.com");
		//driver.findElement(mail).sendKeys(CommonLib.readDataPropertyFile("TEXT_EMAIL"));
		
		//driver.findElement(IdNum).sendKeys(CommonLib.readDataPropertyFile("TEXT_IDNO"));
		int len = CommonLib.randomNumber(9);
		String length = ""+len;
		driver.findElement(IdNum).sendKeys(length);
		driver.findElement(Datepick).click(); 
		driver.findElement(TodayDate).click();
		CommonLib.SelectByValue(gender, CommonLib.readDataPropertyFile("SELECT_GENDER"));
		CommonLib.SelectByValue(race, CommonLib.readDataPropertyFile("SELECT_RACE_OTHER"));
		
		  
		 
//		CommonLib.generateAlpha(driver.findElement(mail));		 
//		String as=	CommonLib.generateAlpha(driver.findElement(mail)); 
//		String az="yopmail.com"; 
		
		
//		driver.findElement(username).sendKeys(CommonLib.generateAlpha(6));		
//		driver.findElement(password).sendKeys(CommonLib.readDataPropertyFile("TEXT_PASSWORD"));
//		driver.findElement(Confirmpass).sendKeys(CommonLib.readDataPropertyFile("TEXT_PASSWORD"));
//		driver.findElement(titleId).sendKeys(CommonLib.readDataPropertyFile("TEXT_TITLEID"));
//		
		
		
//		SelectAssignedtoGroup();
		
	
		//CommonLib.SelectByText(facility, CommonLib.readDataPropertyFile("TEXT_FACILITYNO")); 
		
		
		
	}
	
	//******************************************************************* ***********
	// Function	Name	  : SelectAssignedtoGroup
	// Summary	          : Function to select each elements from Assigned to group					
	//********************************************************************************
/*	public void SelectAssignedtoGroup() throws Exception {
		driver.findElement(AssigntoGroup).click();
		Thread.sleep(4000);
        List<WebElement> elements = driver.findElements(AssigntoGroup);
        System.out.println(elements.size());

        for(int i=0;i<=elements.size();i++) {
            String strAssdropdown = elements.get(i).getText();
            CommonLib.SelectByValue(AssigntoGroup, strAssdropdown);
        }
    }*/
	
	//********************************************************************************
	// Function	Name	  : ClickonSAve
	// Summary	          : Function to Save create user					
	//********************************************************************************
	
	public void ClickonSAve() {
		CommonLib.scrollMethod(driver, driver.findElement(UserSAve));
		driver.findElement(UserSAve).click();
		
		
		
	}
	
	//********************************************************************************
	// Function	Name	  : dateUser
	// Summary	          : Function to pick current date in Create User					
	//********************************************************************************
		
//	public void dateUser() {
//		WebElement dateUser=driver.findElement(Datepick);
//		dateUser.click();
//		CommonLib.getCurrentDay(dateUser);
//	}
	
	//********************************************************************************
	// Function	Name	  : ClickonViewProfile
	// Summary	          : Function to click on view profile button					
	//********************************************************************************
		
	public void ClickonViewProfile() throws Exception { 
		//Thread.sleep(3000);
		//CommonLib.highLighterMethod(driver, driver.findElement(ProfileData));
		Thread.sleep(3000);
		driver.findElement(ViewProf).click();   
	}
	
	//********************************************************************************
	// Function	Name	  : ClickonYesAddtoCareGroup
	// Summary	          : Function to click on yes in AddtoGroup					
	//********************************************************************************
		
	public void ClickonYesAddtoCareGroup() throws Exception {
		Thread.sleep(5000);
		driver.findElement(AddtocareYes).click();
	}
	
}
