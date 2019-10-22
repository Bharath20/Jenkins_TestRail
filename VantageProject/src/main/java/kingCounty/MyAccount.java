package kingCounty;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import core.CommonLib;

public class MyAccount extends CommonLib{
	
	By Firstname =By.name(CommonLib.readElementPropertyFile("TEXT_FIRSTNAME_NAME"));
	By middlename =By.name(CommonLib.readElementPropertyFile("TEXT_MIDDLENAME_NAME"));
	By lastname =By.name(CommonLib.readElementPropertyFile("TEXT_LASTNAME_NAME"));
	By phone =By.id(CommonLib.readElementPropertyFile("TEXT_PHONE_ID"));
	By mobile =By.id(CommonLib.readElementPropertyFile("TEXT_MOBILE_ID"));
	By gender =By.id(CommonLib.readElementPropertyFile("SELECT_GENDER_ID"));
	By race =By.id(CommonLib.readElementPropertyFile("SELECT_RACE_ID"));
	By Datepick =By.xpath(CommonLib.readElementPropertyFile("TEXT_DATE_XP")); 
	By mail= By.id(CommonLib.readElementPropertyFile("TEXT_EMAIL_ID"));
	By titleId =By.id(CommonLib.readElementPropertyFile("TEXT_TITLE_ID"));
	By AssigntoGroup =By.id(CommonLib.readElementPropertyFile("SELECT_ASSIGNTOGROUP_ID"));
	By EditFields =By.xpath(CommonLib.readElementPropertyFile("LIST_EDITUSER_XP"));
	By ChangePassw =By.xpath(CommonLib.readElementPropertyFile("BUTTON_CHANGEPASSWORD_XP"));
	By UserIcon =By.xpath(CommonLib.readElementPropertyFile("IMAGE_USER_XP"));
	By UploadProf= By.xpath(CommonLib.readElementPropertyFile("TEXT_UPLOADPROF_XP"));
	By GetUser= By.xpath(CommonLib.readElementPropertyFile("BUTTON_GETUSERNAME_XP"));
	By NewPass= By.xpath(CommonLib.readElementPropertyFile("TEXT_CHANGEPASSWORD_NEWPASS_XP"));
	By ConfiPass= By.xpath(CommonLib.readElementPropertyFile("TEXT_CHANGEPASSWORD_CONFIPASS_XP"));
	By ChangeSave= By.xpath(CommonLib.readElementPropertyFile("BUTTON_CHANGEPASS_SAVE_XP"));
	By Ok= By.xpath(CommonLib.readElementPropertyFile("BUTTON_GETUSEROK_XP"));
	By Save= By.xpath(CommonLib.readElementPropertyFile("BUTTON_CREATESAVE_XP")); 
	By ChangeCancel=By.xpath(CommonLib.readElementPropertyFile("BUTTON_CREATECANCEL_XP"));
	By MyAccount =By.xpath(CommonLib.readElementPropertyFile("LINK_MENUMYACCOUNT_XP"));
	
	//********************************************************************************
	// Function	Name	  : VerifyFieldsEditUser
	// Summary	          : Function to verify fields in Edit user					
	//********************************************************************************
		public void VerifyFieldsEditUser() throws Exception { 
			//driver.findElement(EditFields).click();
			Thread.sleep(3000);
	        List<WebElement> elements = driver.findElements(EditFields);
	        System.out.println(elements.size());
	        for(int i=0;i<=elements.size();i++) {
	        	Thread.sleep(3000); 
	        	CommonLib.assertTrueFn(EditFields);
	        }
	    } 
		
		//********************************************************************************
		// Function	Name	  : VerfiyEmailTitleAssign
		// Summary	          : Function to verify fields Email,title,Assigned to group and user in Edit user					
		//********************************************************************************
		public void VerfiyEmailTitleAssign() {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			CommonLib.assertTrueFn(mail);
			CommonLib.assertTrueFn(titleId);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			CommonLib.assertTrueFn(AssigntoGroup);
			CommonLib.assertTrueFn(ChangePassw);
			CommonLib.scrollMethod(driver, driver.findElement(UserIcon));
			CommonLib.assertTrueFn(UserIcon);
			CommonLib.assertTrueFn(UploadProf);
			CommonLib.assertTrueFn(GetUser);			
			
		}
	
		//********************************************************************************
		// Function	Name	  : VerfiyEmailTitleAssign
		// Summary	          : Function to verify fields Email,title,Assigned to group and user in Edit user					
		//********************************************************************************
		public void VeifyFieldsEnables() {
			CommonLib.CheckFieldsEditable(Firstname);
			CommonLib.CheckFieldsEditable(middlename);
			CommonLib.CheckFieldsEditable(lastname);
			CommonLib.CheckFieldsEditable(phone);
			CommonLib.CheckFieldsEditable(mobile);
			CommonLib.CheckFieldsEditable(phone);
			CommonLib.CheckFieldsEditable(titleId);
			
			CommonLib.SelectByValue(gender, CommonLib.readDataPropertyFile("SELECT_GENDER_MALE"));
			CommonLib.SelectByValue(AssigntoGroup, CommonLib.readDataPropertyFile("SELECT_ASSIGNEDGROUP_ACCOUNT"));
		} 
		
		//********************************************************************************
		// Function	Name	  : ChangePasssword
		// Summary	          : Function to change password					
		//********************************************************************************
		public void ChangePasssword() {
			driver.findElement(ChangePassw).click();
			driver.findElement(NewPass).sendKeys(CommonLib.readDataPropertyFile("TEXT_NEWPASS"));
			driver.findElement(ConfiPass).sendKeys(CommonLib.readDataPropertyFile("TEXT_CONFIPASS"));
			driver.findElement(ChangeCancel).click();
		}
		
		//********************************************************************************
		// Function	Name	  : ClickonGetUserName
		// Summary	          : Function to click get username					
		//********************************************************************************
		public void ClickonGetUserName() throws Exception {
			CommonLib.scrollMethod(driver, driver.findElement(GetUser)); 
			Thread.sleep(5000);
			driver.findElement(GetUser).click();
			Thread.sleep(3000);
			driver.findElement(Ok).click();
			Thread.sleep(3000);
			driver.findElement(Save).click(); 
		} 
		
		//********************************************************************************
		// Function	Name	  : ClickonMyAccount
		// Summary	          : Function to click on My Account					
		//********************************************************************************
		public void ClickonMyAccount() throws Exception {
			Thread.sleep(3000);
			driver.findElement(MyAccount).click();
		}
		 
}
