package kingCounty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.CommonLib;

public class Gain_NSI extends CommonLib{

	
	
	By assesmentSelectDropdown = By.id(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_ASSESMENT_SELECT_DROPDOWN_ID"));
	By reportDropdown = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_GAIN_REPORT_DROPDOWN_XP"));
	By goBtn = By.xpath(CommonLib.readElementPropertyFile("FORMAT_FUNCTIONALITY_GO_BTN_ID"));
	By completedPrinsActionDropdown = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_DROPDOWN_XP"));
	By completedPrinsActionReviewOption = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_REVIEW_OPTION_XP"));
	By completedPrinsActionReviewViewReport = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_REVIEW_VIEW_REPORT_XP"));
	By completedPrinsActionReviewFrame = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_REVIEW_FRAME_XP"));
	By gainNeedsForReport = By.xpath(CommonLib.readElementPropertyFile("GAIN_NEEDSREPORT_NEEDS_FOR_TEXT_XP"));
	By gainNeedsForReportInfo = By.xpath(CommonLib.readElementPropertyFile("GAIN_NEEDSREPORT_NEEDS_FOR_INFO_XP"));
	By gainNeedsForccn = By.xpath(CommonLib.readElementPropertyFile("GAIN_NEEDSREPORT_NEEDS_FOR_CCN_XP"));
	By gainNeedsForScreener = By.id(CommonLib.readElementPropertyFile("GAIN_NEEDSREPORT_NEEDS_FOR_SCREENER_ID"));
	By gainNeedsForCcnDisplayed = By.xpath(CommonLib.readElementPropertyFile("GAIN_NEEDSREPORT_NEEDS_FOR_CCN_DISPLAYED_XP"));
	By gainNeedsForAssesmentSummary = By.xpath(CommonLib.readElementPropertyFile("GAIN_NEEDSREPORT_NEEDS_FOR_ASSESMENTSUMMARY_XP"));
	By gainNeedsForFirstGraphHeader = By.xpath(CommonLib.readElementPropertyFile("GAIN_NEEDSREPORT_NEEDS_FOR_FIRST_GRAPH_HEADER_XP"));
	By gainNeedsForFirstGraphLow = By.xpath(CommonLib.readElementPropertyFile("GAIN_NEEDSREPORT_NEEDS_FOR_FIRST_GRAPH_LOW_XP"));
	By gainNeedsForFirstGraphModerate = By.xpath(CommonLib.readElementPropertyFile("GAIN_NEEDSREPORT_NEEDS_FOR_FIRST_GRAPH_MODERATE_XP"));
	By gainNeedsForFirstGraphHigh = By.xpath(CommonLib.readElementPropertyFile("GAIN_NEEDSREPORT_NEEDS_FOR_FIRST_GRAPH_HIGH_XP"));
	By gainNeedsForNsiGraph = By.id(CommonLib.readElementPropertyFile("GAIN_NEEDSREPORT_NEEDS_FOR_FIRST_NSI_GRAPH_ID"));
	By gainNeedsForSecondGraphHeader = By.xpath(CommonLib.readElementPropertyFile("GAIN_NEEDSREPORT_NEEDS_FOR_SECOND_GRAPH_HEADER_XP"));
	By gainNeedsForGainGraph = By.xpath(CommonLib.readElementPropertyFile("GAIN_NEEDSREPORT_NEEDS_FOR_FIRST_GAIN_GRAPH_ID"));
	By gainNeedsForDescription = By.xpath(CommonLib.readElementPropertyFile("GAIN_NEEDSREPORT_NEEDS_FOR_DESCRIPTION_XP"));
	By gainNeedsForGainScores = By.xpath(CommonLib.readElementPropertyFile("GAIN_NEEDSREPORT_NEEDS_FOR_GAIN_SCORES_XP"));
	By gainNeedsForThirdSection = By.xpath(CommonLib.readElementPropertyFile("GAIN_NEEDSREPORT_NEEDS_FOR_THIRD_SECTION_XP"));
	By gainNeedsForFourthSection = By.xpath(CommonLib.readElementPropertyFile("GAIN_NEEDSREPORT_NEEDS_FOURTH_SECTION_XP"));
	
	
	//********************************************************************************
	// Function	Name	  : gainFormatFunctionality
	// Summary	          : Function to check Format Functionality	of GAIN-SS				
	//********************************************************************************
	public void gainFormatFunctionality() throws Exception {
		
		//String ccnDisplayed = driver.findElement(gainNeedsForccn).getText();
		Thread.sleep(5000);
//		driver.findElement(completedPrinsActionDropdown).click();
//		Thread.sleep(3000);
//		driver.findElement(completedPrinsActionReviewOption).click();
		driver.switchTo().defaultContent();
		CommonLib.frameSwitchMethod(completedPrinsActionReviewFrame);
		Thread.sleep(8000);
		CommonLib.assertTrueFn(assesmentSelectDropdown);
		CommonLib.assertTrueFn(reportDropdown);
		CommonLib.assertTrueFn(goBtn);
		CommonLib.assertTrueFn(gainNeedsForReport);
		//String ccnPageValue = driver.findElement(gainNeedsForCcnDisplayed).getText();
		//CommonLib.assertEqualsFn(ccnDisplayed, ccnPageValue);
		CommonLib.assertTrueFn(gainNeedsForScreener);
		List<WebElement> needsList = driver.findElements(gainNeedsForReportInfo);
		for(int i =0;i<needsList.size();i++) {
			CommonLib.assertTrueFn(gainNeedsForReportInfo);
		}
		CommonLib.assertTrueFn(gainNeedsForAssesmentSummary);
		CommonLib.assertTrueFn(gainNeedsForFirstGraphHeader);
		CommonLib.highLighterMethod(driver, driver.findElement(gainNeedsForFirstGraphHeader));
		CommonLib.highLighterMethod(driver, driver.findElement(gainNeedsForFirstGraphLow));
		CommonLib.highLighterMethod(driver, driver.findElement(gainNeedsForFirstGraphModerate));
		CommonLib.highLighterMethod(driver, driver.findElement(gainNeedsForFirstGraphHigh));
		CommonLib.assertTrueFn(gainNeedsForNsiGraph);
		CommonLib.highLighterMethod(driver, driver.findElement(gainNeedsForSecondGraphHeader));
		CommonLib.assertTrueFn(gainNeedsForGainGraph);
		CommonLib.assertTrueFn(gainNeedsForDescription);
		CommonLib.assertTrueFn(gainNeedsForGainScores);
		CommonLib.assertTrueFn(gainNeedsForThirdSection);
		CommonLib.assertTrueFn(gainNeedsForFourthSection);
		
		
	}
}
