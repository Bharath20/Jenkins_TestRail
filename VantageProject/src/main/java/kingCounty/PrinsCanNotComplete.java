package kingCounty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import core.CommonLib;

public class PrinsCanNotComplete extends CommonLib{

	By SeleAssessment= By.id(CommonLib.readElementPropertyFile("SELECT_ASSESSMENT_ID"));
    By cannotcomplete= By.xpath(CommonLib.readElementPropertyFile("BUTTON_CANNOTCOMPLETE_XP"));
    By CannotDropdown= By.xpath(CommonLib.readElementPropertyFile("SELECT_SHOWS_XP"));
    By ReasonLook= By.id(CommonLib.readElementPropertyFile("SELECT_REASONFORASSES_ID"));
    By AssignClosepopup= By.id(CommonLib.readElementPropertyFile("BUTTON_ASSIGN_CLOSE_ID"));
    
        //Function for Assign an assessment Prins
        public void SelectAssessmentPrins() throws Exception {

            Thread.sleep(4000);
            String strAss1=CommonLib.readDataPropertyFile("SELECT_ASSESSMENTPRINS");
            CommonLib.SelectByText(SeleAssessment,strAss1);
            Thread.sleep(2000);

        }
    	//Function for Assign an Reason look up 
    	public void selectReasonLookUpPrins() throws Exception {
    		
    		String strReas=CommonLib.readDataPropertyFile("SELECT_REASONLOOK_PRINS");
    		System.out.println(strReas);
    		CommonLib.SelectByValue(ReasonLook, strReas);
    		Thread.sleep(5000);
    		CommonLib.executescriptclick(driver.findElement(AssignClosepopup));
//    		WebElement btn = driver.findElement(By.id("assign-btn"));
//    		btn.click();
    		Thread.sleep(5000);
    	}
        //Function for click Can Not Complete
        public void CanNotCompleteClick() throws Exception {
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//div[@id='modal-strongr']//button[@class='btn'][contains(text(),'Close')]")).click();
        	Thread.sleep(4000);
            driver.findElement(cannotcomplete).click();
        }

        //Function for select each elements from drop down in Can Not Complete
        public void SelectCanNotCompleteReasonDropDown() throws Exception {

           	Thread.sleep(5000);
        	driver.findElement(By.xpath("//div[@class='col s12 m12']//div[1]//div[4]//select[1]")).click();
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].setAttribute('style', 'background: lightblue; border: 2px solid black;');", driver.findElement(By.xpath("//div[@class='col s12 m12']//div[1]//div[4]//select[1]")));
                Thread.sleep(4000);
                driver.findElement(By.xpath("//div[@class='col s12 m12']//div[1]//div[4]//select[1]")).sendKeys(Keys.ESCAPE);
        }


}
