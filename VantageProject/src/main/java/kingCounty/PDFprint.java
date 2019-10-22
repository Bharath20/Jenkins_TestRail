package kingCounty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.CommonLib;

public class PDFprint extends CommonLib{

	By completedPrinsActionDropdown = By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_DROPDOWN_XP"));
	By ActionReport=By.xpath(CommonLib.readElementPropertyFile("REVIEW_PRINS_COMPLETED_PRINS_ACTION_REPORT_OPTION_XP"));
	By pdfBtn=By.xpath(CommonLib.readElementPropertyFile("BUTTON_PDF_XP"));
	
	//********************************************************************************
	// Function	Name	  : reportPrins
	// Summary	          : Function to perform Report functionality in PRINS					
	//********************************************************************************
		public void reportPrins() throws Exception {
			// TODO Auto-generated method stub
				Thread.sleep(5000);
				driver.findElement(completedPrinsActionDropdown).click();
				Thread.sleep(3000);
				driver.findElement(ActionReport).click();
					CommonLib.frameSwitchMethod(ActionReport);
					Thread.sleep(8000);
					CommonLib.assertTrueFn(ActionReport);
					List<WebElement> fieldList = driver.findElements(ActionReport);
					int reportfieldListSize = fieldList.size();
					for(int i=0 ; i< reportfieldListSize ; i++) {
						if(driver.findElement(ActionReport).isEnabled()) {
							System.out.println("FIELD EDITABLE !!!");
						}
						else {
							System.out.println("FIELD NOT EDITABLE !!!");
						}
				}
		}
		
		//********************************************************************************
		// Function	Name	  : verifyPDF
		// Summary	          : Function to Verify Pdf					
		//********************************************************************************
//		public void verifyPDF() throws Exception {
//			SubjectProfile objSubj = new SubjectProfile();
//			Assign objAss = new Assign();
//			objSubj.subjectProfileClick();
//			//CommonLib.scrollMethod(driver, driver.findElement(pdfBtn));
//			Thread.sleep(20000);
//			driver.switchTo().frame(0);
//			CommonLib.scrollMethod(driver, driver.findElement(pdfBtn));
//			Thread.sleep(5000);
//			driver.findElement(pdfBtn).click();
//			Thread.sleep(15000);
//		//	CommonLib.ReadPdfFile(CommonLib.readDataPropertyFile("NEEDS_PDF_PATH"));
//		
//	}
}
