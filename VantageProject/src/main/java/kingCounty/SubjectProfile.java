package kingCounty;

import static org.testng.Assert.assertNotNull;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import core.CommonLib;
public class SubjectProfile extends CommonLib{

	By HomeButton = By.xpath(CommonLib.readElementPropertyFile("VANTAGE_HOME_XP"));
	By SubjectProfile = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_PRO_PIC_XP"));
	By SubjectProfileClickTest = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_PROFILE_TEST_XP"));
	By SubjectProfileSearchClick = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_SEARCH_XP"));
	By SubjectProfileSearchByKeyword = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_SEARCH_KEYWORD_XP"));
	By SubjectProfileSearchBySubject = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_SEARCH_SUBJECT_XP"));
	By SubjectProfileSearchByStaff = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_SEARCH_STAFF_XP"));
	By SubjectProfileSearchByKeywordField = By.id(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_SEARCH_KEYWORD_FIELD_ID"));
	By SubjectProfileSearchByKeywordContentSubject = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_SEARCH_RESULT_CONTENT_SUBJECT_XP"));
	By SubjectProfileSearchByKeywordContentStaff = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_SEARCH_RESULT_CONTENT_STAFF_XP"));
	By SubjectProfileSearchByKeywordContentSubjectCount = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_SEARCH_RESULT_CONTENT_SUBJECT_COUNT_XP"));
	By SubjectProfileViewDropdown = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_VIEW_XP"));
	By SubjectProfileViewDropdownValue25 = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_VIEW_25_XP"));
	By SubjectProfileViewDropdownValue10 = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_VIEW_10_XP"));
	By SubjectProfileViewDropdownValue50 = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_VIEW_50_XP"));
	By SubjectProfileViewDropdownValue100 = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_VIEW_100_XP"));
	By SubjectMenuLeft = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_MENU_XP"));
	By MenuCaseLoadOption = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_MENU_CASELOAD_OPTION_XP"));
	By MenuCloseButton = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_MENU_CLOSE_BUTTON_XP"));
	By SubjectUserPic = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_PIC_XP"));
	By SubjectDetails = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_DETAILS_XP"));
	By SubjectDetailsInfo = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_DETAILS_INFORMATION_XP"));
	By SubjectDetailsInfoCloseButton = By.xpath(CommonLib.readElementPropertyFile("CASELOAD_SUBJECT_DETAILS_INFO_CLOSE_BUTTON_XP"));
	//********************************************************************************
	// Function	Name	  : subjectProfileClick
	// Summary	          : Function to click on a particular subject profile					
	//********************************************************************************
	public void subjectProfileClick() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		CommonLib.getWait();
		wait.until(ExpectedConditions.elementToBeClickable(SubjectProfile));
		driver.findElement(SubjectProfile).click();
		Thread.sleep(5000);
	}
	//********************************************************************************
	// Function	Name	  : subjectProfileSearchResults
	// Summary	          : Function to searching in subject profile						
	//********************************************************************************
	public void subjectProfileSearchResults() throws Exception {
		Thread.sleep(3000);
		try {
			List<WebElement> contentSubjectList = driver.findElements(SubjectProfileSearchByKeywordContentSubject);
			int contentSubjectListSize = contentSubjectList.size();
			String contentSubjectListSizeString = ""+contentSubjectListSize;
			System.out.println("count from list"+contentSubjectListSize);
			List<WebElement> contentStaffList = driver.findElements(SubjectProfileSearchByKeywordContentStaff);
			int contentStaffListSize = contentSubjectList.size();
			System.out.println(contentStaffListSize);
			if(contentSubjectList.size() != 0) {
				assertNotNull(driver.findElement(SubjectProfileSearchByKeywordContentSubject));
				if(contentStaffList.size() != 0){
					assertNotNull(SubjectProfileSearchByKeywordContentStaff);
				}
			}
			else if(contentStaffList.size() != 0){
				assertNotNull(SubjectProfileSearchByKeywordContentStaff);
			}
			else {
					System.out.println("NO SUBJECT OR STAFF PRESENT");
			}	
			String subjectCount = driver.findElement(SubjectProfileSearchByKeywordContentSubjectCount).getText();
			int SubjectCountInt = Integer.parseInt(subjectCount);
			SubjectCountInt = SubjectCountInt -1;
			subjectCount = ""+SubjectCountInt;
			System.out.println("count from page"+subjectCount);
			CommonLib.assertEqualsFn(subjectCount, contentSubjectListSizeString);
			Thread.sleep(5000);
			driver.findElement(SubjectProfileSearchByKeywordField).clear();
			driver.findElement(SubjectProfileSearchByKeywordField).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//********************************************************************************
	// Function	Name	  : viewDropDownValue25Selector
	// Summary	          : Function to set page view as 25						
	//********************************************************************************
	public void viewDropDownValue25Selector() throws Exception {
		Thread.sleep(3000);
		driver.findElement(SubjectProfileSearchByKeywordField).clear();
		CommonLib.viewLImitSetter(SubjectProfileViewDropdown, SubjectProfileViewDropdownValue25);
		Thread.sleep(5000);
		List<WebElement> contentSubjectList = driver.findElements(SubjectProfileSearchByKeywordContentSubject);
		int contentSubjectListSize = contentSubjectList.size();
		String contentSubjectListSizeString = ""+contentSubjectListSize;
		String limit = ""+25;
		CommonLib.assertEqualsFn(limit, contentSubjectListSizeString);
		Thread.sleep(5000);
	}
	//********************************************************************************
	// Function	Name	  : viewDropDownValue25Selector
	// Summary	          : Function to set page view as 10						
	//********************************************************************************
	public void viewDropDownValue10Selector() throws Exception {
		Thread.sleep(3000);
		driver.findElement(SubjectProfileSearchByKeywordField).clear();
		CommonLib.viewLImitSetter(SubjectProfileViewDropdown, SubjectProfileViewDropdownValue10);
		Thread.sleep(5000);
		List<WebElement> contentSubjectList = driver.findElements(SubjectProfileSearchByKeywordContentSubject);
		int contentSubjectListSize = contentSubjectList.size();
		String contentSubjectListSizeString = ""+contentSubjectListSize;
		String limit = ""+10;
		CommonLib.assertEqualsFn(limit, contentSubjectListSizeString);
		Thread.sleep(5000);
	}
	//********************************************************************************
	// Function	Name	  : viewDropDownValue25Selector
	// Summary	          : Function to set page view as 50						
	//********************************************************************************
	public void viewDropDownValue50Selector() throws Exception {
		Thread.sleep(3000);
		CommonLib.viewLImitSetter(SubjectProfileViewDropdown, SubjectProfileViewDropdownValue50);
		Thread.sleep(5000);
		List<WebElement> contentSubjectList = driver.findElements(SubjectProfileSearchByKeywordContentSubject);
		int contentSubjectListSize = contentSubjectList.size();
		String contentSubjectListSizeString = ""+contentSubjectListSize;
		String limit = ""+50;
		CommonLib.assertEqualsFn(limit, contentSubjectListSizeString);
		Thread.sleep(5000);
	}
	//********************************************************************************
	// Function	Name	  : viewDropDownValue25Selector
	// Summary	          : Function to set page view as 100					
	//********************************************************************************
	public void viewDropDownValue100Selector() throws Exception {
		Thread.sleep(8000);
		CommonLib.viewLImitSetter(SubjectProfileViewDropdown, SubjectProfileViewDropdownValue100);
		Thread.sleep(15000);
		List<WebElement> contentSubjectList = driver.findElements(SubjectProfileSearchByKeywordContentSubject);
		int contentSubjectListSize = contentSubjectList.size();
		String contentSubjectListSizeString = ""+contentSubjectListSize;
		String limit = ""+100;
		CommonLib.assertEqualsFn(limit, contentSubjectListSizeString);
		Thread.sleep(5000);
	}
	//********************************************************************************
	// Function	Name	  : subjectProfileSearch
	// Summary	          : Function to entering the search keyword	using KEYWORD					
	//********************************************************************************
	public void subjectProfileSearchByKeyword() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		CommonLib.getWait();
		wait.until(ExpectedConditions.elementToBeClickable(SubjectProfileSearchClick));
		driver.findElement(SubjectProfileSearchClick).click();
		Thread.sleep(2000);
		CommonLib.assertTrueFn(SubjectProfileSearchByKeyword);
		Thread.sleep(2000);
		CommonLib.getWait();
		wait.until(ExpectedConditions.elementToBeClickable(SubjectProfileSearchByKeyword));
		driver.findElement(SubjectProfileSearchByKeyword).click();
		Thread.sleep(2000);
		CommonLib.assertTrueFn(SubjectProfileSearchByKeywordField);
		driver.findElement(SubjectProfileSearchByKeywordField).sendKeys("25");
		Thread.sleep(2000);
		driver.findElement(SubjectProfileSearchByKeywordField).sendKeys(Keys.ENTER);
	}
	//********************************************************************************
	// Function	Name	  : subjectProfileSearch
	// Summary	          : Function to entering the search keyword using SUBJECT				
	//********************************************************************************
	public void subjectProfileSearchBySubject() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		CommonLib.getWait();
		wait.until(ExpectedConditions.elementToBeClickable(SubjectProfileSearchClick));
		driver.findElement(SubjectProfileSearchClick).click();
		Thread.sleep(2000);
		CommonLib.assertTrueFn(SubjectProfileSearchBySubject);
		Thread.sleep(2000);
		CommonLib.getWait();
		wait.until(ExpectedConditions.elementToBeClickable(SubjectProfileSearchBySubject));
		driver.findElement(SubjectProfileSearchBySubject).click();
		Thread.sleep(2000);
		CommonLib.assertTrueFn(SubjectProfileSearchByKeywordField);
		driver.findElement(SubjectProfileSearchByKeywordField).sendKeys(CommonLib.readDataPropertyFile("Subject_profile_search_by_subject"));
		Thread.sleep(2000);
		driver.findElement(SubjectProfileSearchByKeywordField).sendKeys(Keys.ENTER);
	}	
	//********************************************************************************
	// Function	Name	  : subjectProfileSearch
	// Summary	          : Function to entering the search keyword	using STAFF					
	//********************************************************************************
	public void subjectProfileSearchByStaff() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		CommonLib.getWait();
		wait.until(ExpectedConditions.elementToBeClickable(SubjectProfileSearchClick));
		driver.findElement(SubjectProfileSearchClick).click();
		Thread.sleep(2000);
		CommonLib.assertTrueFn(SubjectProfileSearchByStaff);
		Thread.sleep(2000);
		CommonLib.getWait();
		wait.until(ExpectedConditions.elementToBeClickable(SubjectProfileSearchByStaff));
		driver.findElement(SubjectProfileSearchByStaff).click();
		Thread.sleep(2000);
		CommonLib.assertTrueFn(SubjectProfileSearchByKeywordField);
		driver.findElement(SubjectProfileSearchByKeywordField).sendKeys("Albert");
		Thread.sleep(2000);
		driver.findElement(SubjectProfileSearchByKeywordField).sendKeys(Keys.ENTER);
	}
	//********************************************************************************
	// Function	Name	  : homeButtonClick
	// Summary	          : Function to perform home Button Click					
	//********************************************************************************	
	public void homeButtonClick() throws Exception {
		driver.findElement(HomeButton).click();
		
		//CommonLib.assertTrueFn(SubjectProfile);
	}
	//********************************************************************************
	// Function	Name	  : subjectProfile
	// Summary	          : Function to verify subject profile information					
	//********************************************************************************
	public void subjectProfile() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		driver.findElement(SubjectUserPic).click();
		CommonLib.assertTrueFn(SubjectDetails);
		assertNotNull(driver.findElement(SubjectDetailsInfo));
		Thread.sleep(5000);
		driver.findElement(SubjectDetailsInfoCloseButton).click();
	}
}
