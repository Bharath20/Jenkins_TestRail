 package core;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonLib extends Base{
	
	//********************************************************************************
	// Function	Name	  : readElementPropertyFile
	// Summary	          : To get element from Element.properties
	//********************************************************************************
	public static String readElementPropertyFile(String strQuery)
	{
			Properties prop = new Properties();
			File file = new File("E:\\amal\\VantageProject\\config\\KingCounty.properties");
			String strData=""; 
			FileInputStream fileInput = null;
			try 
			{
				fileInput = new FileInputStream(file);			
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
			try 
			{
				prop.load(fileInput);
				strData = prop.getProperty(strQuery);	
			} catch (IOException e)
			{
				e.printStackTrace();
			}
				return strData;
		}
		//********************************************************************************
		// Function	Name	  : readDataPropertyFile
		// Summary	          : To get data from TestData.properties
		//********************************************************************************
		public static String readDataPropertyFile(String strQuery)
		{
			Properties prop = new Properties();
			File file = new File("E:\\amal\\VantageProject\\config\\TestData.properties");
			String strData=""; 
			FileInputStream fileInput = null;
			try 
			{
				fileInput = new FileInputStream(file);
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
			try 
			{
				prop.load(fileInput);
				strData = prop.getProperty(strQuery);
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return strData;
		}	
		//********************************************************************************
		// Function	Name	  : getWait
		// Summary	          : Wait function		
		//********************************************************************************
		public static WebDriverWait getWait() {
			wait = new WebDriverWait(driver, 120);
			wait.pollingEvery(250, TimeUnit.MILLISECONDS);
			wait.ignoring(NoSuchElementException.class);
			return wait;
		}
		//********************************************************************************
		// Function	Name	  : executescriptclick
		// Summary	          : Function to click an element using Javascript					
		//********************************************************************************	
		public static void executescriptclick(WebElement myWebElement) {
			// TODO Auto-generated method stub
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", myWebElement);
		}
		//********************************************************************************
		// Function	Name	  : highLighterMethod
		// Summary	          : Function to highlight an element						
		//********************************************************************************		
		public static void highLighterMethod(WebDriver driver, WebElement currentAss) throws Exception{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: lightblue; border: 2px solid black;');", currentAss);
			Thread.sleep(2000);
		 	js.executeScript("arguments[0].removeAttribute('style','')", currentAss);
		 }
		//********************************************************************************
		// Function	Name	  : scrollMethod
		// Summary	          : Function to scroll down until an element	is found				
		//********************************************************************************		
		public static void scrollMethod(WebDriver driver, WebElement completedPrins) {
			// TODO Auto-generated method stub
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", completedPrins);
		}
		//********************************************************************************
		// Function	Name	  : mouseHoverMethod
		// Summary	          : Function to perform Mouse Hover				
		//********************************************************************************		
		public static void mouseHoverMethod(WebDriver driver, WebElement hover) {
			// TODO Auto-generated method stub
			Actions action = new Actions(driver);
			action.moveToElement(hover).build().perform();
		}
		//********************************************************************************
		// Function	Name	  : getList
		// Summary	          : Function to get element from a list						
		//********************************************************************************
		public static List<WebElement> getList(By element) {
			List<WebElement> list = driver.findElements(element);
			return list;
		}
		//********************************************************************************
		// Function	Name	  : assertTrueFn
		// Summary	          : Function to Assert True						
		//********************************************************************************
		public static void assertTrueFn(By element) {
			assertTrue(driver.findElement(element).isDisplayed());
		}
		//********************************************************************************
		// Function	Name	  : assertEqualsFn
		// Summary	          : Function to Assert Equal							
		//********************************************************************************
		public static void assertEqualsFn(String actual,String expected) {
			assertEquals(actual, expected);
		}
		//********************************************************************************
		// Function	Name	  : randomValueGenerator
		// Summary	          : Function to generate random numbers						
		//********************************************************************************	
		public static int randomValueGenerator(int min, int max) {
			// TODO Auto-generated method stub
			int temp = 0;
	        for(int i = 0; i < 5; i++){
	             temp = (min + (int)(Math.random() * ((max - min) + 1))); 
	         }
			return temp;
		}
		//********************************************************************************
		// Function	Name	  : randomValueGenerator
		// Summary	          : Function to set view LImit 						
		//********************************************************************************
		public static void viewLImitSetter(By element1,By element2) throws Exception {
			Thread.sleep(3000);
			driver.findElement(element1).click();
			Thread.sleep(5000);
			driver.findElement(element2).click();	
		}
		//********************************************************************************
		// Function	Name	  : frameSwitchMethod
		// Summary	          : Function to switch frames 						
		//********************************************************************************
		public static void frameSwitchMethod(By element) throws Exception {
			driver.switchTo().frame(driver.findElement(element));
		}
		//********************************************************************************
        // Function    Name      : getCurrentDay
        // Summary              : Function to get current date
        //********************************************************************************
        public static String getCurrentDay (WebElement dateUser){
            //Create a Calendar Object
            Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
            //Get Current Day as a number
            int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
            System.out.println("Today Int: " + todayInt +"\n");
            //Integer to String Conversion
            String todayStr = Integer.toString(todayInt);
            System.out.println("Today Str: " + todayStr + "\n");
            return todayStr;
        }
		//********************************************************************************
		// Function	Name	  : SelectByValue
		// Summary	          : Function to select select by value from dropdown 						
		//********************************************************************************
		public static void SelectByValue(By reasonLook, String strReas) {
 			// TODO Auto-generated method stub
			Select drpValue = new Select(driver.findElement(reasonLook));
			drpValue.selectByValue( strReas);
		}
		//********************************************************************************
		// Function	Name	  : SelectByValue
		// Summary	          : Function to select select by text from dropdown 						
		//********************************************************************************
		public static void SelectByText(By seleAssessment, String strAss) {
			// TODO Auto-generated method stub
			Select drpValue = new Select(driver.findElement(seleAssessment));
			drpValue.selectByVisibleText( strAss);
		}
		//********************************************************************************
		// Function	Name	  : SelectByIndex
		// Summary	          : Function to select select by Index from dropdown 						
		//********************************************************************************
		public static void SelectByIndex(By cannotcompletedropdown, int i) {
			// TODO Auto-generated method stub
			Select drpValue = new Select(driver.findElement(cannotcompletedropdown));
			drpValue.selectByIndex(i);
		}
		//********************************************************************************
		// Function	Name	  : CheckFieldsEditable
		// Summary	          : Function to check fields are editable 					
		//********************************************************************************	
		public static void CheckFieldsEditable(By ele) {
						
			driver.findElement(ele).isEnabled(); 
		}
		//********************************************************************************
		// Function	Name	  : generateAlpha
		// Summary	          : Function to generate random string 					
		//********************************************************************************	
		public static String generateAlpha(WebElement ele) {
							
			String alphaNum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			StringBuilder salt = new StringBuilder();
			Random rnd = new Random();
			while (salt.length() < 6) { // length of the random string.
					    int index = (int) (rnd.nextFloat() * alphaNum.length());
					    salt.append(alphaNum.charAt(index));
					   }
			String saltStr = salt.toString();
			return saltStr;
				}
		
		//random word generator
		public static String randomWords(int length) {
			
			Random random = new Random();
			StringBuilder word = new StringBuilder(length);
		    for (int i = 0; i < length; i++) {
		        word.append((char)('a' + random.nextInt(26)));
		    }
		    
		    return word.toString();
		}

		//random number generator
		public static int randomNumber(int length) {
		
			int num = 0;
			Random random = new Random();
			num = random.nextInt(length) + 1;
			return num;
		}
		//function for pdf
//		public static void ReadPdfFile(String fileName) throws Exception {
			
			/*File f = new File(fileName);
		     PDFParser parser = new PDFParser((RandomAccessRead) new FileInputStream(f));
		     parser.parse();

		     COSDocument cosDoc = parser.getDocument();
		     PDDocument pdDoc = new PDDocument(cosDoc);

		     PDFTextStripper pdfStripper = new PDFTextStripper();
		     String parsedText = pdfStripper.getText(pdDoc);

		     System.out.println(parsedText);*/


			
//			try (PDDocument pdDocument = PDDocument.load(new File(fileName))) {
//				pdDocument.getClass();
//				PDFTextStripperByArea pdfTextStripperByArea = new PDFTextStripperByArea();
//				pdfTextStripperByArea.setSortByPosition(true);
//				PDFTextStripper pdfTextStripper = new PDFTextStripper();
//				String textInPDFFile = pdfTextStripper.getText(pdDocument);
//				String textLines[] = textInPDFFile.split("\\r?\\n");
//				for (String textLine : textLines) {
//					System.out.println(textLine);
//				}
//			}
//				catch(Exception e) {
//					 System.out.println("Exception thrown");
//					
//				}
//			
//		}

			
}
