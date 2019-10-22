package kingCounty;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.CommonLib;

public class Prins extends CommonLib{

	By completedPrins = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_XP"));
	By completedPrinsActionDropdown = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_DROPDOWN_XP"));
	By completedPrinsActionReviewOption = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_REVIEW_OPTION_XP"));
	By completedPrinsActionReviewViewReport = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_REVIEW_VIEW_REPORT_XP"));
	By completedPrinsActionReviewFrame = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_REVIEW_FRAME_XP"));
	By completedPrinsActionReviewbookingNoField = By.id(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_REVIEW_BOOKING_NO_FIELD_ID"));
	By completedPrinsActionReviewFields = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_REVIEW_FIELD_ID"));
	By completedPrinsActionEditOption = By.xpath(CommonLib.readElementPropertyFile("EDIT_PRINS_OPTION_XP"));
	By completedPrinsActionEditConfirmButton = By.xpath(CommonLib.readElementPropertyFile("EDIT_PRINS_EDIT_CONFIRM_BUTTON_XP"));
	By completedPrinsActionEditFieldsEnabled = By.xpath(CommonLib.readElementPropertyFile("EDIT_PRINS_EDIT_FIELDS_ENABLED_XP"));
	By completedPrinsScroll = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_SCROLL_XP"));
	By closeBtn = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_REVIEW_FIELD_CLOSE_BUTTON_XP"));
	public void completedPrinsSelection() throws Exception {
		Thread.sleep(3000);
 		List<WebElement> completedPrinsList = driver.findElements(completedPrins);
		int completedPrinsListSize = completedPrinsList.size();
		for(int j =0 ; j<completedPrinsListSize ; j++) {
			System.out.println(completedPrinsList.get(j).getText());
		}
		for(int i = 0; i < completedPrinsListSize;i++) {
			String prinsStatus = completedPrinsList.get(i).getText();
			System.out.println(prinsStatus);
			CommonLib.scrollMethod(driver, driver.findElement(completedPrinsScroll));
			Thread.sleep(3000);
			if(prinsStatus.equalsIgnoreCase("PRINS")) {
				Thread.sleep(5000);
				System.out.println("prins present");
				driver.findElement(completedPrinsActionDropdown).click();
				Thread.sleep(5000);
				CommonLib.assertTrueFn(completedPrinsActionReviewOption);
				driver.findElement(completedPrinsActionReviewOption).click();
				break;
			}
			else {
				System.out.println("NO COMPLETED PRINS PRESENT");
			}
		}
	}
	
	//********************************************************************************
	// Function	Name	  : reviewingPrins
	// Summary	          : Function to perform Review functionality in PRINS					
	//********************************************************************************
	public void reviewingPrins() throws Exception {
		// TODO Auto-generated method stub
			Thread.sleep(5000);
			driver.findElement(completedPrinsActionDropdown).click();
			Thread.sleep(3000);
			driver.findElement(completedPrinsActionReviewOption).click();
				CommonLib.frameSwitchMethod(completedPrinsActionReviewFrame);
				Thread.sleep(8000);
				CommonLib.assertTrueFn(completedPrinsActionReviewViewReport);
				List<WebElement> reviewfieldList = driver.findElements(completedPrinsActionReviewFields);
				int reviewfieldListSize = reviewfieldList.size();
				for(int i=0 ; i< reviewfieldListSize ; i++) {
					if(driver.findElement(completedPrinsActionReviewFields).isEnabled()) {
						System.out.println("FIELD EDITABLE !!!");
					}
					else {
						System.out.println("FIELD NOT EDITABLE !!!");
					}
			}
	}
	//********************************************************************************
	// Function	Name	  : editingPrins
	// Summary	          : Function to perform Editing functionality in PRINS					
	//********************************************************************************
	public void editingPrins() throws Exception {
		Thread.sleep(5000);
		driver.findElement(completedPrinsActionDropdown).click();
		Thread.sleep(5000);
		driver.findElement(completedPrinsActionEditOption).click();
		Thread.sleep(5000);
		driver.findElement(completedPrinsActionEditConfirmButton).click();
		Thread.sleep(5000);
		List<WebElement> editfieldList = driver.findElements(completedPrinsActionReviewFields);
		int editfieldListSize = editfieldList.size();
		for(int i=0 ; i < editfieldListSize ; i++) {
			if(driver.findElement(completedPrinsActionReviewFields).isEnabled()) {
				System.out.println("FIELD EDITABLE !!!");
			}
			else {
				System.out.println("FIELD NOT EDITABLE !!!");
			}
		}
	}

}
