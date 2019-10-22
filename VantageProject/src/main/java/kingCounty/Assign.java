package kingCounty;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import core.CommonLib;

public class Assign extends CommonLib{
	
	
	By UserName= By.name(CommonLib.readElementPropertyFile("TEXT_USERNAME_NAME"));
	By Password= By.name(CommonLib.readElementPropertyFile("TEXT_PASSWORD_NAME"));
	By Login =By.xpath(CommonLib.readElementPropertyFile("BUTTON_LOGN_XP"));
	
	By subject= By.xpath(CommonLib.readElementPropertyFile("LINK_SUBJECT_XP"));
	By Assign = By.id(CommonLib.readElementPropertyFile("BUTTON_ASSIGN_ID"));
	By NoResultFound= By.xpath(CommonLib.readElementPropertyFile("LABEL_NORESULTFOUND_XP"));
	By AssignClose= By.xpath(CommonLib.readElementPropertyFile("BUTTON_ASSIGNCLOSE_XP"));
	By UnAssign= By.id(CommonLib.readElementPropertyFile("BUTTON_UNASSIGN_ID"));
	By UnAssignLink= By.xpath(CommonLib.readElementPropertyFile("LINK_UNASSIGN_XP"));
	By UnAssignList= By.xpath(CommonLib.readElementPropertyFile("LINK_UNASSIGN_LIST_XP"));
	By CurrentAssignList= By.xpath(CommonLib.readElementPropertyFile("CURRENT_ASSIGN_LIST_XP"));
	By SeleAssessment= By.id(CommonLib.readElementPropertyFile("SELECT_ASSESSMENT_ID")); 
	By ReasonLook= By.id(CommonLib.readElementPropertyFile("SELECT_REASONFORASSES_ID"));
	By AssignClosepopup= By.id(CommonLib.readElementPropertyFile("BUTTON_ASSIGN_CLOSE_ID"));
	By CloseAssign =By.xpath(CommonLib.readElementPropertyFile("BUTTON_CLOSE_XP"));
	By CurrentAss= By.xpath(CommonLib.readElementPropertyFile("LABLE_CURRENT_XP"));
	By Next	= By.xpath(CommonLib.readElementPropertyFile("LINK_NEXT_XP"));
	By RadBtn	= By.xpath(CommonLib.readElementPropertyFile("RADIO_RAD1_XP"));
	By AssignFrame	= By.xpath(CommonLib.readElementPropertyFile("ASSIGN_FRAME_XP"));
	By nextBtn	= By.xpath(CommonLib.readElementPropertyFile("NEXT_BTN_XP"));
	By completeBtn	= By.xpath(CommonLib.readElementPropertyFile("COMPLETE_BTN_XP"));
	By bookingDate	= By.xpath(CommonLib.readElementPropertyFile("PRINS_FIRST_QUESTION_DATE_FIELD_XP"));
	By datePick	= By.xpath(CommonLib.readElementPropertyFile("PRINS_FIRST_QUESTION_DATE_PICK_XP"));
	By date	= By.xpath(CommonLib.readElementPropertyFile("PRINS_FIRST_QUESTION_DATE_XP"));
	By bookingNo	= By.xpath(CommonLib.readElementPropertyFile("PRINS_FIRST_BOOKING_NO_XP"));
	By interviewDate	= By.xpath(CommonLib.readElementPropertyFile("PRINS_FIRST_QUESTION_INTERVIEW_DATE_XP"));
	By interviewTodayDate	= By.xpath(CommonLib.readElementPropertyFile("PRINS_INTERVIEW_DATE_XP"));
	By readyToComplete	= By.xpath(CommonLib.readElementPropertyFile("READY_TO_COMPLETE_XP"));
	By Complete	= By.xpath(CommonLib.readElementPropertyFile("PRINS_COMPLETE_XP"));
	By close	= By.xpath(CommonLib.readElementPropertyFile("CLOSE_REPORT_XP"));
	
	public void Credential(String userna,String passwo) {
		
		driver.findElement(UserName).sendKeys(CommonLib.readDataPropertyFile("USER_Username"));
		driver.findElement(Password).sendKeys(CommonLib.readDataPropertyFile("USER_Password"));
		driver.findElement(Login).click();
	}
	
	// Function for assign click
	public void AssignClick() throws Exception {
		Thread.sleep(5000);
		driver.findElement(Assign).click();
		Thread.sleep(5000);
	}
	// Function for verify whether Assign a No Result text from Assign pop-up
	public void AssignNoResult() throws Exception {
		AssignClick();
		try {
			CommonLib.assertTrueFn(NoResultFound);
			driver.findElement(AssignClose).click();
			
		} catch (Exception e) {
			// TODO: handle exception
			driver.findElement(AssignClose).click();
		}
	
	}
	
	//Function for UnAssign a subjects from Current Assessments
	public void UnAssignaSubject() throws InterruptedException {

		Thread.sleep(5000);
		List<WebElement> currentAssignList = driver.findElements(CurrentAssignList);
		int currentAssignListSize = currentAssignList.size();
		for(int i = 0 ; i< currentAssignListSize ; i++) {
			driver.findElement(UnAssign).click();
			Thread.sleep(4000);
			driver.findElement(UnAssignLink).click();
			Thread.sleep(4000);
		}
		
		
	}
	
	//Function for Assign an assessment Gain
	public void SelectAssessment() throws Exception {
		
		
		String strAss=CommonLib.readDataPropertyFile("SELECT_ASSESSMENTPRINS");
		Thread.sleep(6000);
		CommonLib.SelectByText(SeleAssessment,strAss);	
		Thread.sleep(4000);
		
	}
	
	//Function for Assign an Reason look up 
	public void selectReasonLookUp() throws Exception {
		
		String strReas=CommonLib.readDataPropertyFile("SELECT_REASONLOOK_PRINS");
		CommonLib.SelectByValue(ReasonLook, strReas);
		Thread.sleep(3000);
		driver.findElement(AssignClosepopup).click();
		Thread.sleep(5000);
	}
	
	public void selectRadioButtonPage1() throws Exception {
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(AssignFrame));
		Thread.sleep(6000);
        WebElement Head=driver.findElement(By.xpath("//div[@class='v4-header ng-binding']"));
        System.out.println(Head.getText());

        CommonLib.scrollMethod(driver, driver.findElement(datePick));
        driver.findElement(datePick).click();
       
        driver.findElement(date).click();
       // CommonLib.getCurrentDay(driver.findElement(datePick));
        Thread.sleep(5000);
        driver.findElement(bookingNo).sendKeys(CommonLib.readDataPropertyFile("PRINS_BOOKIN_NUMBER"));
        
        driver.findElement(interviewDate).click();
        driver.findElement(interviewTodayDate).click();
        Thread.sleep(5000);
        driver.findElement(Next).click();

	}
	
	//Function for close Assigned Page
	public void CloseAssignedPage() {
	
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);
		//driver.findElement(by)
		//driver.findElement(By.xpath("//div[@class='ng-scope']")).click();;
		//driver.findElement(close).click();
	}
	
	
	public void HighlightCurrentAssessment() throws Exception {
		
		CommonLib.highLighterMethod(driver, driver.findElement(CurrentAss));
	} 
	
	public void Radiobutton() throws Exception {
		////page 1
		Thread.sleep(5000);
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371033']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371037']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371040']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371045']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371050']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371058']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371066']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371070']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371073']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371076']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371079']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371083']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371091']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372044']")));
		driver.findElement(By.id("A372032")).sendKeys("dfsfds");
		driver.findElement(By.id("A372033")).sendKeys("dfsfds");
		driver.findElement(By.id("A372034")).sendKeys("dfsfds");
		driver.findElement(nextBtn).click();
		Thread.sleep(8000);
		////page 2
		CommonLib.scrollMethod(driver, driver.findElement(By.xpath("//td[@class='answerfld-style ng-scope'][1]")));
		Thread.sleep(5000);
		driver.findElement(By.id("A372037_charge_0")).sendKeys("murder");
		Thread.sleep(4000);
		driver.findElement(By.id("A372037_court_1")).sendKeys("county");
		Thread.sleep(4000);
		driver.findElement(By.id("A372037_bail_amt_2")).sendKeys("none");
		Thread.sleep(4000);
		driver.findElement(By.id("A372037_domestic_violence_3")).sendKeys("none");
		Thread.sleep(4000);
		driver.findElement(By.id("A372037_cause_nbr_4")).sendKeys("68658");
		Thread.sleep(4000);
		CommonLib.executescriptclick(driver.findElement(By.id("A372037")));
		Thread.sleep(4000);
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371098']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371099']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371101']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371103']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371105']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371107']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371110']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371112']")));
		driver.findElement(nextBtn).click();
		Thread.sleep(5000);
		////page 3
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371115']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371133']")));
		//CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371139']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371318']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371151']")));
		driver.findElement(By.id("A371153")).sendKeys("county");
		driver.findElement(By.id("A371154")).sendKeys("94984998");
		driver.findElement(By.id("A371155")).sendKeys("county");
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371157']")));
		driver.findElement(By.id("A371165")).sendKeys("graduated");
		driver.findElement(nextBtn).click();
		Thread.sleep(5000);
		////page 4
//		driver.findElement(By.id("A371166")).sendKeys("54668464");
//		Thread.sleep(5000);
//		driver.findElement(By.id("A372031")).sendKeys("94984998");
//		Thread.sleep(5000);
//		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='AddresCheck_372261__0']")));
//		driver.findElement(By.id("AddressOutSideUS_372261__0")).sendKeys("King County");
//		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='AddresCheck_372261__1']")));
//		driver.findElement(By.id("AddressOutSideUS_372261__1")).sendKeys("King County");
//		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='AddresCheck_372261__2']")));
//		driver.findElement(By.id("AddressOutSideUS_372261__2")).sendKeys("King County");
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371170']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371224']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371210']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371172']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371188']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371191']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371199']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372258']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372248']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371229']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371233']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371235']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371240']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371241']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371247']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371250']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371247']")));
		driver.findElement(By.id("A371254")).sendKeys("NONE");
		Thread.sleep(5000);
		driver.findElement(nextBtn).click();
		Thread.sleep(5000);
		
		////page 5
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371256']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371258']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371263']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371273']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371278']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371283']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371288']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371293']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371297']")));
		driver.findElement(By.id("A372043")).sendKeys("NONE");
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A371304']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372038']")));
		driver.findElement(By.id("A371306")).sendKeys("NONE");
		Thread.sleep(5000);
		driver.findElement(Complete).click();
		Thread.sleep(8000);
		
		
		
		
		
		
		
		
		
//		List<WebElement> radiolist = driver.findElements(By.xpath("//form[@class='answers-display max-width answers-options ng-pristine ng-valid']"));
//			int radiolistsize=radiolist.size();  
//			System.out.println(radiolistsize);
//			s5:for(int i=1;i<=radiolistsize;i++) {
//				CommonLib.scrollMethod(driver, driver.findElement(By.xpath("(//div[@class='font-size-10 no-bold black-text ng-binding ng-scope'])[1]")));
//				try {
//	
//				String str = "((//div[@class='question-display'])[x]//label[@class='col s1'])[1]";
//				String str1 = str.replace("x",""+i);
//				System.out.println(str1);
//				if(driver.findElement(By.xpath(str1)).isDisplayed())
//				{
//				CommonLib.executescriptclick(driver.findElement(By.xpath(str1)));
//				radiolist = driver.findElements(By.xpath("//div[@class='question-display']"));
//				radiolistsize=radiolist.size();
//				Thread.sleep(5000);
//				if(driver.findElement(By.xpath("//div[@class='question-display']")).isDisplayed()&& driver.findElement(nextBtn).isDisplayed()) {
//						continue s5;
//						}
//				}
//				else {
//					i++;
//				}
//				
//				}
//				catch (Exception e) {
//					// TODO: handle exception
//					driver.findElement(Complete).click();
//					Thread.sleep(5000);
//					break;
//				}
//				}
//			driver.findElement(nextBtn).click();
	}
		//	driver.switchTo().defaultContent();
		//		}
    //Function for Assign an assessment Prins
    public void SelectAssessmentGain() throws Exception {

        Thread.sleep(4000);
        String strAss1=CommonLib.readDataPropertyFile("SELECT_ASSESSMENTGAIN");
        CommonLib.SelectByText(SeleAssessment,strAss1);
        Thread.sleep(4000);

    }
	public void selectReasonLookUpGain() throws Exception {
		
		String strReas=CommonLib.readDataPropertyFile("SELECT_REASONLOOK_GAIN");
		CommonLib.SelectByValue(ReasonLook, strReas);
		Thread.sleep(3000);
		driver.findElement(AssignClosepopup).click();
		Thread.sleep(5000);
	}

	public void RadiobuttonGain() throws Exception {
		// TODO Auto-generated method stub
		//gain
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(AssignFrame));
		Thread.sleep(6000);
		CommonLib.scrollMethod(driver, driver.findElement(By.xpath("//label[@for='A372263']")));
		Thread.sleep(5000);
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372263']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372268']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372273']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372278']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372288']")));
		driver.findElement(nextBtn).click();
		Thread.sleep(5000);
		
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372294']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372299']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372304']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372309']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372314']")));
		driver.findElement(nextBtn).click();
		Thread.sleep(5000);
		
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372319']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372324']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372329']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372334']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372339']")));
		driver.findElement(nextBtn).click();
		Thread.sleep(5000);
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372344']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372350']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372354']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372359']")));  
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372364']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372369']")));
		Thread.sleep(5000);
		driver.findElement(Complete).click();
		Thread.sleep(8000);
		//nsi
		CommonLib.scrollMethod(driver, driver.findElement(By.xpath("//label[@for='A372404']")));
		Thread.sleep(5000);
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372404']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372412']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372528']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372418']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372421']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372424']")));
		driver.findElement(nextBtn).click();
		Thread.sleep(5000);
		
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372433']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372449']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372453']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372459']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372463']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372467']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372594']")));
		driver.findElement(nextBtn).click();
		Thread.sleep(5000);
		
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372427']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372431']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372445']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372601']")));
		driver.findElement(nextBtn).click();
		Thread.sleep(5000);
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372472']")));
		driver.findElement(nextBtn).click();
		Thread.sleep(5000);
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372506']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372501']")));
		driver.findElement(nextBtn).click();
		Thread.sleep(5000);
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372350']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372358']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372370']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372375']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372403']")));
		CommonLib.executescriptclick(driver.findElement(By.xpath("//label[@for='A372383']")));
		Thread.sleep(5000);
		driver.findElement(Complete).click();
		Thread.sleep(8000);
		
	}
}
