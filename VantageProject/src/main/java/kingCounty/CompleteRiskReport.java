package kingCounty;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import core.CommonLib;

public class CompleteRiskReport extends CommonLib{
	
	By assesmentSelectDropdown = By.id(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_ASSESMENT_SELECT_DROPDOWN_XP"));
	By reportDropdown = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_REPORT_DROPDOWN_XP"));
	By SubjectName = By.xpath(CommonLib.readElementPropertyFile("SUBJECT_INFO_NAME_XP"));
	By SubjectDob = By.xpath(CommonLib.readElementPropertyFile("SUBJECT_INFO_DOB_XP"));
	By SubjectCCN = By.xpath(CommonLib.readElementPropertyFile("SUBJECT_INFO_CCN_XP"));
	By SubjectGender = By.xpath(CommonLib.readElementPropertyFile("SUBJECT_INFO_GENDER_XP"));
	By SubjectRace = By.xpath(CommonLib.readElementPropertyFile("SUBJECT_INFO_RACE_XP"));
	
	By headerFirst = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_FIRST_SECTION_HEADER_XP"));
	By headerFirstTitleOne = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_FIRST_SECTION_TITLE_ONE_XP"));
	By headerFirstTitleTwo = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_FIRST_SECTION_TITLE_TWO_XP"));
	By headerFirstTitleThree = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_FIRST_SECTION_TITLE_THREE_XP"));
	By headerFirstTitleInfo = By.id(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_FIRST_SECTION_TITLE_ONE_INFO_ID"));
	By headerSecondTitleInfo = By.id(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_FIRST_SECTION_TITLE_TWO_INFO_ID"));
	By headerThirdTitleInfo = By.id(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_FIRST_SECTION_TITLE_THREE_INFO_ID"));
	By headerSecond = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_SECOND_SECTION_HEADER_XP"));
	By headerSecondInfo = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_SECOND_SECTION_INFO_XP"));
	By headerThird = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_THIRD_SECTION_HEADER_XP"));
	By headerThirdinfolowrisk = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_THIRD_LOW_RISK_XP"));
	By headerThirdinfomoderaterisk = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_THIRD_MODERATE_RISK_XP"));
	By headerThirdinfohighrisk = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_THIRD_HIGH_RISK_XP"));
	
	By headerThirdinfoLowriskGraphOne = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_THIRD_LOW_RISK_GRAPH_ONE_XP"));
	By headerThirdinfoModerateriskGraphOne = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_THIRD_MODERATE_RISK_GRAPH_ONE_XP"));
	By headerThirdinfoHighriskGraphOne = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_THIRD_HIGH_RISK_GRAPH_ONE_XP"));
	
	By headerThirdinfoLowriskGraphTwo = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_THIRD_LOW_RISK_GRAPH_TWO_XP"));
	By headerThirdinfoModerateriskGraphTwo = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_THIRD_MODERATE_RISK_GRAPH_TWO_XP"));
	By headerThirdinfoHighriskGraphTwo = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_THIRD_HIGH_RISK_GRAPH_TWO_XP"));
	
	By headerFourthRisktoRecidivate = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_FOURTH_SECTION_RISK_TO_RECIDIVATE_XP"));
	By headerFourthRiskCategory = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_FOURTH_SECTION_RISK_CATEGORY_XP"));
	By headerFourthProbability = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_FOURTH_SECTION_PROBABILITY_XP"));
	By headerFourthGeneralPopulation = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_FOURTH_SECTION_GENERAL_POPULATION_XP"));
	
	By headerFourthPdfBtn = By.id(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_PDF_BUTTON_ID"));
	By headerFourthScrollupBtn = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_SCROLL_UP_BUTTON_XP"));
	By headerFourthCloseBtn = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_CLOSE_BUTTON_XP"));
	By prInterviewOption = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_PR_INTERVIEW_OPTION_XP"));
	By goBtn = By.id(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_GO_BTN_ID"));
	By prInterviewReportTitle = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_PR_INTERVIEW_REPORT_TITLE_XP"));
	By prInterviewReportInfoHeadings = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_PR_INTERVIEW_REPORT_INFO_HEADINGS_XP"));
	By prInterviewReportHeadings = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_PR_INTERVIEW_REPORT_HEADINGS_XP"));
	
	By prInterviewDemographicsAge = By.id(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_PR_INTERVIEW_REPORT_AGE_ID"));
	By prInterviewDemographicsDob = By.id(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_PR_INTERVIEW_REPORT_DOB_ID"));
	By prInterviewDemographicsGender = By.id(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_PR_INTERVIEW_REPORT_GENDER_ID"));
	By prInterviewDemographicsRace = By.id(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_PR_INTERVIEW_REPORT_RACE_ID"));
	By homeBtn = By.xpath(CommonLib.readElementPropertyFile("VANTAGE_HOME_XP"));
	By completedPrinsActionDropdown = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_DROPDOWN_XP"));
	By completedPrinsActionDropdownReportoption = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_REPORT_OPTION_XP"));
	By completedPrinsActionReviewFrame = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_REVIEW_FRAME_XP"));
	//********************************************************************************
	// Function	Name	  : formatFunctionality
	// Summary	          : Function to check Format/Functionality 					
	//********************************************************************************
	public void formatFunctionality() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		String name = driver.findElement(SubjectName).getText();
		String dob = driver.findElement(SubjectDob).getText();
		String ccn = driver.findElement(SubjectCCN).getText();
		System.out.println(name);
		System.out.println(dob);
		System.out.println(ccn);
		Thread.sleep(5000);
		driver.findElement(completedPrinsActionDropdown).click();
		Thread.sleep(5000);
		driver.findElement(completedPrinsActionDropdownReportoption).click();
		Thread.sleep(5000);
		
//		String firstTitleInfo = driver.findElement(headerFirstTitleInfo).getText();
//		String secondTitleInfo = driver.findElement(headerSecondTitleInfo).getText();
//		String thirdTitleInfo = driver.findElement(headerThirdTitleInfo).getText();
		
		String[] nameCheck = name.split(" ");
		System.out.println(nameCheck);
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='strongrFrame']//iframe")));
		Thread.sleep(4000);
		CommonLib.assertTrueFn(assesmentSelectDropdown);
		CommonLib.highLighterMethod(driver, driver.findElement(assesmentSelectDropdown));
		CommonLib.assertTrueFn(assesmentSelectDropdown);
		CommonLib.highLighterMethod(driver, driver.findElement(reportDropdown));
		CommonLib.assertTrueFn(headerFirst);
		CommonLib.highLighterMethod(driver, driver.findElement(headerFirst));
		CommonLib.assertTrueFn(headerFirstTitleOne);
		CommonLib.highLighterMethod(driver, driver.findElement(headerFirstTitleOne) );
		CommonLib.assertTrueFn(headerFirstTitleTwo);
		CommonLib.highLighterMethod(driver, driver.findElement(headerFirstTitleTwo) );
		CommonLib.assertTrueFn(headerFirstTitleThree);
		CommonLib.highLighterMethod(driver, driver.findElement(headerFirstTitleThree) );
		
		CommonLib.assertTrueFn(headerSecond);
		CommonLib.highLighterMethod(driver, driver.findElement(headerSecond) );
		CommonLib.assertTrueFn(headerSecondInfo);
		CommonLib.highLighterMethod(driver, driver.findElement(headerSecondInfo) );
		
		CommonLib.assertTrueFn(headerThird);
		CommonLib.highLighterMethod(driver, driver.findElement(headerThird) );
		CommonLib.assertTrueFn(headerThirdinfolowrisk);
		CommonLib.highLighterMethod(driver,driver.findElement(headerThirdinfolowrisk) );
		CommonLib.assertTrueFn(headerThirdinfoLowriskGraphOne);
		CommonLib.highLighterMethod(driver, driver.findElement(headerThirdinfoLowriskGraphOne) );
		CommonLib.assertTrueFn(headerThirdinfomoderaterisk);
		CommonLib.highLighterMethod(driver, driver.findElement(headerThirdinfomoderaterisk) );
		CommonLib.assertTrueFn(headerThirdinfoModerateriskGraphOne);
		CommonLib.highLighterMethod(driver, driver.findElement(headerThirdinfoModerateriskGraphOne) );
		CommonLib.assertTrueFn(headerThirdinfohighrisk);
		CommonLib.highLighterMethod(driver, driver.findElement(headerThirdinfohighrisk) );
		CommonLib.assertTrueFn(headerThirdinfoHighriskGraphOne);
		CommonLib.highLighterMethod(driver, driver.findElement(headerThirdinfoHighriskGraphOne) );
		
		CommonLib.assertTrueFn(headerThirdinfoLowriskGraphTwo);
		CommonLib.highLighterMethod(driver, driver.findElement(headerThirdinfoLowriskGraphTwo) );
		CommonLib.assertTrueFn(headerThirdinfoModerateriskGraphTwo);
		CommonLib.highLighterMethod(driver, driver.findElement(headerThirdinfoModerateriskGraphTwo) );
		CommonLib.assertTrueFn(headerThirdinfoHighriskGraphTwo);
		CommonLib.highLighterMethod(driver, driver.findElement(headerThirdinfoHighriskGraphTwo) );
		CommonLib.scrollMethod(driver, driver.findElement(headerFourthScrollupBtn));
		
		CommonLib.assertTrueFn(headerFourthRisktoRecidivate);
		CommonLib.highLighterMethod(driver, driver.findElement(headerFourthRisktoRecidivate) );
		CommonLib.assertTrueFn(headerFourthRiskCategory);
		CommonLib.highLighterMethod(driver, driver.findElement(headerFourthRiskCategory) );
		CommonLib.assertTrueFn(headerFourthProbability);
		CommonLib.highLighterMethod(driver, driver.findElement(headerFourthProbability) );
		CommonLib.assertTrueFn(headerFourthGeneralPopulation);
		CommonLib.highLighterMethod(driver, driver.findElement(headerFourthGeneralPopulation) );
		
		CommonLib.assertTrueFn(headerFourthPdfBtn);
		CommonLib.highLighterMethod(driver, driver.findElement(headerFourthPdfBtn) );
		CommonLib.assertTrueFn(headerFourthScrollupBtn);
		CommonLib.highLighterMethod(driver, driver.findElement(headerFourthScrollupBtn) );
		Thread.sleep(5000);
//		driver.findElement(headerFourthPdfBtn).sendKeys(Keys.ESCAPE);
//		CommonLib.scrollMethod(driver, driver.findElement(headerFourthCloseBtn));
//		Thread.sleep(4000);
//		CommonLib.assertTrueFn(headerFourthCloseBtn);
//		driver.findElement(By.xpath("(//button[contains(text(),'Close')])[5]")).click();
//		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//div[@id='modal-strongr']")).click();
		driver.findElement(headerFourthCloseBtn).click();
	}

	//********************************************************************************
	// Function	Name	  : pdfPrint
	// Summary	          : Function to check pdfPrint 					
	//********************************************************************************
	public void pdfPrint() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		//CommonLib.scrollMethod(driver, driver.findElement(headerFourthPdfBtn));
		driver.findElement(completedPrinsActionDropdown).click();
		Thread.sleep(2000);
		driver.findElement(completedPrinsActionDropdownReportoption).click();
		Thread.sleep(5000);
		CommonLib.frameSwitchMethod(completedPrinsActionReviewFrame);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		CommonLib.scrollMethod(driver, driver.findElement(headerFourthPdfBtn));
		Thread.sleep(5000);
		driver.findElement(headerFourthPdfBtn).click();
		
		
	}
	//********************************************************************************
	// Function	Name	  : prInterviewReport
	// Summary	          : Function to check PR Interview Report in Format Functionality					
	//********************************************************************************
	public void prInterviewReport() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		wait.until(ExpectedConditions.presenceOfElementLocated(completedPrinsActionDropdown));
		driver.findElement(completedPrinsActionDropdown).click();
		Thread.sleep(2000);
		driver.findElement(completedPrinsActionDropdownReportoption).click();
		Thread.sleep(5000);
		//String name = driver.findElement(SubjectName).getText();
		String dob = driver.findElement(SubjectDob).getText();
		String ccn = driver.findElement(SubjectCCN).getText();
		String gender = driver.findElement(SubjectGender).getText();
		String race = driver.findElement(SubjectRace).getText();
		Thread.sleep(5000);
		CommonLib.assertTrueFn(assesmentSelectDropdown);
		driver.findElement(reportDropdown).click();
		Thread.sleep(3000);
		String strReas = driver.findElement(prInterviewOption).getText();
		CommonLib.SelectByValue(reportDropdown, strReas);
		Thread.sleep(3000);
		CommonLib.assertTrueFn(goBtn);
		driver.findElement(goBtn).click();
		Thread.sleep(5000);
		//String ageChk = driver.findElement(prInterviewDemographicsAge).getText();
		String dobChk = driver.findElement(prInterviewDemographicsDob).getText();
		String genderChk = driver.findElement(prInterviewDemographicsGender).getText();
		String raceChk = driver.findElement(prInterviewDemographicsRace).getText();
		CommonLib.assertEqualsFn(dob, dobChk);
		CommonLib.assertEqualsFn(gender, genderChk);
		CommonLib.assertEqualsFn(race, raceChk);
		CommonLib.assertTrueFn(headerFourthPdfBtn);
		CommonLib.assertTrueFn(prInterviewReportTitle);
		List<WebElement> infoHeadingList = driver.findElements(prInterviewReportInfoHeadings);
		int infoHeadingListSize = infoHeadingList.size();
		for(int i = 0;i<infoHeadingListSize;i++) {
			CommonLib.assertTrueFn(prInterviewReportInfoHeadings);
		}
		
		List<WebElement> headingList = driver.findElements(prInterviewReportHeadings);
		int headingListSize = headingList.size();
		for(int i = 0;i<headingListSize;i++) {
			CommonLib.assertTrueFn(prInterviewReportHeadings);
		}
		
		CommonLib.assertTrueFn(headerFourthPdfBtn);
		Thread.sleep(4000);
		driver.findElement(headerFourthPdfBtn).click();
		Thread.sleep(8000);
		CommonLib.assertTrueFn(headerFourthScrollupBtn);
		Thread.sleep(5000);
		driver.findElement(headerFourthScrollupBtn).click();
		Thread.sleep(5000);
		driver.findElement(headerFourthCloseBtn).click();
		Thread.sleep(5000);
		driver.findElement(homeBtn).click();
	}
	


}
