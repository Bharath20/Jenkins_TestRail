package test;

import org.testng.annotations.Test;





import core.Base;
import core.CommonLib;
import kingCounty.Assign;
import kingCounty.CareGroup;
import kingCounty.CaseLoadCheck;
import kingCounty.CaseLoadPersonICon;
import kingCounty.CompleteRiskReport;
import kingCounty.DesignDisplay;
import kingCounty.Facility;
import kingCounty.Gain_NSI;
import kingCounty.LogOut;
import kingCounty.Login;
import kingCounty.ManageUsers;
import kingCounty.MenuOption;
import kingCounty.MyAccount;
import kingCounty.Organization;
import kingCounty.Prins;
import kingCounty.PrinsCanNotComplete;
import kingCounty.PrinsHistory;
import kingCounty.SubjectProfile;
import kingCounty.User;
import kingCounty.VantageHome;

public class TestScripts extends Base{
	
	
	//********************************************************************************
	// Function	Name	  : C1947
	// Summary	          : Function to perform TestCase ID C1947					
	//********************************************************************************
	@Test
	public void C1947() throws Exception {
		Login objuser = new Login();
		String struser = CommonLib.readDataPropertyFile("USER_Username");
		String strpass = CommonLib.readDataPropertyFile("USER_Password");
		Thread.sleep(5000);
		objuser.appLogin(struser,strpass);
		Thread.sleep(2000);
	}
	//********************************************************************************
	// Function	Name	  : C1948
	// Summary	          : Function to perform TestCase ID C1948					
	//********************************************************************************
	@Test
	public void C1948() throws Exception {
		SubjectProfile objsub = new SubjectProfile();
		objsub.subjectProfileClick();
	}
	//********************************************************************************
	// Function	Name	  : C12155
	// Summary	          : Function to perform TestCase ID C12155					
	//********************************************************************************
	@Test
	public void C12155() throws Exception {
		SubjectProfile objsub = new SubjectProfile();
		objsub.subjectProfileSearchByKeyword();
		objsub.subjectProfileSearchResults();
		objsub.viewDropDownValue25Selector();
		objsub.viewDropDownValue10Selector();
		objsub.viewDropDownValue50Selector();
		objsub.viewDropDownValue100Selector();
		objsub.subjectProfileSearchBySubject();
		objsub.subjectProfileSearchByStaff();
	}
	//********************************************************************************
	// Function	Name	  : C1952
	// Summary	          : Function to perform TestCase ID C1952					
	//********************************************************************************
	@Test
	public void C1952() throws Exception {
		SubjectProfile objsub = new SubjectProfile();
		Thread.sleep(4000);
		objsub.homeButtonClick();
		Thread.sleep(4000);
		objsub.subjectProfileClick();
 		objsub.subjectProfile();
	}
	//********************************************************************************
	// Function	Name	  : C11990
	// Summary	          : Function to perform TestCase ID C11990					
	//********************************************************************************
	@Test
	public void C11990() throws Exception {
		Prins objprins = new Prins();
		Assign objAssign = new Assign();
		SubjectProfile objsub = new SubjectProfile();
		//objsub.homeButtonClick();
		objsub.subjectProfileClick();
		objAssign.UnAssignaSubject();
		objAssign.AssignClick();
		objAssign.SelectAssessment();
		objAssign.selectReasonLookUp();
		objAssign.selectRadioButtonPage1();
		objAssign.Radiobutton();
		objAssign.CloseAssignedPage();
		objprins.reviewingPrins();
	}
	//********************************************************************************
	// Function	Name	  : C11991
	// Summary	          : Function to perform TestCase ID C11991					
	//********************************************************************************
	@Test
	public void C11991() throws Exception {
			Prins objprins = new Prins();
			Assign objAssign = new Assign();
			SubjectProfile objsub = new SubjectProfile();
			objsub.subjectProfileClick();
			objAssign.UnAssignaSubject();
			objAssign.AssignClick();
			objAssign.SelectAssessment();
			objAssign.selectReasonLookUp();
			objAssign.selectRadioButtonPage1();
			objAssign.Radiobutton();
			objAssign.CloseAssignedPage();
			objprins.editingPrins();
		}
	//********************************************************************************
	// Function	Name	  : C1949_C1950
	// Summary	          : Function to perform TestCase ID C1949 and C1950					
	//********************************************************************************
	@Test
		public void C1949_C1950() throws Exception{
			Assign objAssign = new Assign();
			SubjectProfile objsub = new SubjectProfile();
			String strAss= CommonLib.readDataPropertyFile("SELECT_ASSESSMENT");
			String strReas= CommonLib.readDataPropertyFile("SELECT_REASONLOOK");
			Thread.sleep(4000);
			objsub.homeButtonClick();
			objsub.subjectProfileClick();
			objAssign.AssignNoResult();
			objAssign.UnAssignaSubject();
			objAssign.AssignClick();
			objAssign.SelectAssessment();
			objAssign.selectReasonLookUp();
			objAssign.selectRadioButtonPage1();
			objAssign.Radiobutton();
			objAssign.CloseAssignedPage();
			
		}

	//********************************************************************************
	// Function	Name	  : C12005
	// Summary	          : Function to perform TestCase ID C12005					
	//********************************************************************************
	@Test
	public void C12005() throws Exception {
		PrinsHistory objprins = new PrinsHistory();
		SubjectProfile objsub = new SubjectProfile();
		Assign objAssign = new Assign();
		objsub.subjectProfileClick();
		objAssign.UnAssignaSubject();
		objAssign.AssignClick();
		objAssign.SelectAssessment();
		objAssign.selectReasonLookUp();
		objAssign.selectRadioButtonPage1();
		objAssign.Radiobutton();
		objAssign.CloseAssignedPage();
		objprins.ClickonHitory();
		objprins.HighlightAssignedandCompleted();
	}
	//********************************************************************************
	// Function	Name	  : C12006
	// Summary	          : Function to perform TestCase ID C12006				
	//********************************************************************************
	@Test
	public void C12006() throws Exception {
		Assign objAssign= new Assign(); 
        PrinsCanNotComplete objPrinsCan = new PrinsCanNotComplete();
        SubjectProfile objsub = new SubjectProfile();
        objsub.subjectProfileClick();
        objAssign.AssignClick();  
        objPrinsCan.SelectAssessmentPrins();
        objPrinsCan.selectReasonLookUpPrins();
        objPrinsCan.CanNotCompleteClick();
        objPrinsCan.SelectCanNotCompleteReasonDropDown();
	}
	//********************************************************************************
	// Function	Name	  : C58622
	// Summary	          : Function to perform TestCase ID C58622					
	//********************************************************************************
	@Test
	public void C58622() throws Exception {
		CompleteRiskReport objcomp = new CompleteRiskReport();
        SubjectProfile objsub = new SubjectProfile();
        Assign objAssign= new Assign(); 
        objsub.subjectProfileClick();
		objAssign.UnAssignaSubject();
		objAssign.AssignClick();
		objAssign.SelectAssessment();
		objAssign.selectReasonLookUp();
		objAssign.selectRadioButtonPage1();
		objAssign.Radiobutton();
		objAssign.CloseAssignedPage();
		objcomp.formatFunctionality();
	}
	//********************************************************************************
	// Function	Name	  : C58622
	// Summary	          : Function to perform TestCase ID C58622					
	//********************************************************************************
	@Test
	public void C63316() throws Exception {
		CompleteRiskReport objcomp = new CompleteRiskReport();
        SubjectProfile objsub = new SubjectProfile();
        Assign objAssign= new Assign(); 
        objsub.subjectProfileClick();
		objAssign.UnAssignaSubject();
		objAssign.AssignClick();
		objAssign.SelectAssessment();
		objAssign.selectReasonLookUp();
		objAssign.selectRadioButtonPage1();
		objAssign.Radiobutton();
        objAssign.CloseAssignedPage();
		objcomp.pdfPrint();
	}
	//********************************************************************************
	// Function	Name	  : C25354
	// Summary	          : Function to perform TestCase ID C25354					
	//********************************************************************************
	@Test
	public void C25354() throws Exception {
		CompleteRiskReport objcomp = new CompleteRiskReport();
        SubjectProfile objsub = new SubjectProfile();
        Assign objAssign= new Assign(); 
        objsub.subjectProfileClick();
//		objAssign.UnAssignaSubject();
//		objAssign.AssignClick();
//		objAssign.SelectAssessment();
//		objAssign.selectReasonLookUp();
//		objAssign.selectRadioButtonPage1();
//		objAssign.Radiobutton();
//      objAssign.CloseAssignedPage();
		objcomp.prInterviewReport();
	}
	//********************************************************************************
	// Function	Name	  : C58622
	// Summary	          : Function to perform TestCase ID C58622					
	//********************************************************************************
	@Test
	public void C58631() throws Exception {
		CompleteRiskReport objcomp = new CompleteRiskReport();
		objcomp.pdfPrint();
	}
	//********************************************************************************
	// Function	Name	  : C1869
	// Summary	          : Function to perform TestCase ID C1869					
	//********************************************************************************
	@Test
	public void C1869() throws Exception {
		SubjectProfile objsub = new SubjectProfile();
		Assign objAssign= new Assign();
		objsub.subjectProfileClick();
		objAssign.UnAssignaSubject();
		objAssign.AssignClick();
		objAssign.SelectAssessmentGain();
		objAssign.selectReasonLookUpGain();
		objAssign.RadiobuttonGain();
	}
	//********************************************************************************
	// Function	Name	  : C1869
	// Summary	          : Function to perform TestCase ID C1869					
	//********************************************************************************
	@Test
	public void C1871() throws Exception {
			Gain_NSI objgain = new Gain_NSI();
			objgain.gainFormatFunctionality();
		
		}
	
	/////////////////////////////////////
	//********************************************************************************
		// Function	Name	  : C68055
		// Summary	          : Function to perform TestCase ID C68055					
		//********************************************************************************
			@Test
			public void C68055() throws Exception {
				MenuOption objMenu = new MenuOption();
				objMenu.ClickonMenu();
				objMenu.HighlightAllMenuOptions();
				objMenu.HighlightingMajorOptions();
			}
			
		//********************************************************************************
		// Function	Name	  : C1937
		// Summary	          : Function to perform TestCase ID C1937					
		//********************************************************************************
				@Test
				public void C1937() throws Exception {
					
					User objUser= new User();
					MenuOption objMenu = new MenuOption();
					objMenu.ClickonMenu();
					objUser.HighlightHeaderCreateUser();
					objUser.Fillfields();
					objUser.ClickonSAve();
					objUser.ClickonViewProfile();
					objUser.ClickonYesAddtoCareGroup();
				
				}

		//********************************************************************************
		// Function	Name	  : C1944    
		// Summary	          : Function to perform TestCase ID C1944    					
		//********************************************************************************
			@Test
			public void C1944() throws Exception {
				
				SubjectProfile objSubj = new SubjectProfile();
				DesignDisplay objDesign = new DesignDisplay();
				objSubj.homeButtonClick();
				objDesign.AssertNullSubjectDetails();
				objDesign.ClickonMenuCaseLoad();
				objDesign.ClickonMenuCloseIcon();
				objDesign.HighlightSubjectTile();
				
			}
			
		//********************************************************************************
		// Function	Name	  : C1945        
		// Summary	          : Function to perform TestCase ID C1945   					
		//********************************************************************************
				@Test	
				public void C1945() throws Exception {
					
					CaseLoadCheck objcase = new CaseLoadCheck();
					objcase.ClickonTichIconSubject();
				}
				
		//********************************************************************************
		// Function	Name	  : C1946       
		// Summary	          : Function to perform TestCase ID C1946   					
		//********************************************************************************
		@Test
		public void C1946() throws Exception {
			CaseLoadPersonICon objCasePerson = new CaseLoadPersonICon();
			objCasePerson.ClickonSubjectTilePerson();
		}
		
		//********************************************************************************
		// Function	Name	  : C1942     
		// Summary	          : Function to perform TestCase ID C1942   					
		//********************************************************************************
		@Test
		public void C1942() throws Exception {
			Organization objOrga = new Organization();
			objOrga.ClickonOrganization();
		}	
		
		//********************************************************************************
		// Function	Name	  : C11987     
		// Summary	          : Function to perform TestCase ID C11987   					
		//********************************************************************************
		@Test
		public void C11987() throws Exception {
			LogOut objLogout = new LogOut();
			objLogout.ClickonLogouticon();
		}
		
		//********************************************************************************
		// Function	Name	  : C1938    
		// Summary	          : Function to perform TestCase ID C1938  					
		//********************************************************************************
		@Test
		public void C1938() throws Exception {
				MyAccount objMyAcc = new MyAccount();
				MenuOption objMenu = new MenuOption();
				objMenu.ClickonMenu();
				objMyAcc.ClickonMyAccount();
				objMyAcc.VerifyFieldsEditUser();
				objMyAcc.VerfiyEmailTitleAssign();
				objMyAcc.VeifyFieldsEnables();
				objMyAcc.ChangePasssword();
				objMyAcc.ClickonGetUserName();
			}
			
		//********************************************************************************
		// Function	Name	  : C1939  
		// Summary	          : Function to perform TestCase ID C1939  					
		//********************************************************************************
		@Test
		public void C1939() throws Exception {
			ManageUsers objManag = new ManageUsers();
			objManag.HihglightingFieldsonManagerUser();
			objManag.ClickonStaffButton();
			objManag.ClickonStudentButton();
			objManag.NavigatetoNextPage();
			objManag.NavigatetoPreviosPage();
			objManag.ClickonSearch();
			objManag.Deleteuser();
			objManag.ClickonActivate();
			objManag.ClickonAddUser();
			
			
		}
		
		@Test
		public void C1940() throws Exception {
			
			VantageHome vantageHome = new VantageHome();
			vantageHome.home();
			Facility facility = new Facility();
			facility.facility();
		}
		//********************************************************************************
				// Function	Name	  : C1951  
				// Summary	          : Function to perform TestCase ID C1951 					
				//********************************************************************************
				@Test
				public void C1951() throws Exception {
					CareGroup objCare = new CareGroup();
					objCare.clickonCaregroupFucntionality(); 
				}

//				//********************************************************************************
//				// Function	Name	  : C1870  
//				// Summary	          : Function to perform TestCase ID C1870 					
//				//********************************************************************************
//				@Test
//				public void C1870() throws Exception {
//					PDFPrint objPdf = new PDFPrint();
//					objPdf.verifyPDF();
//				}
				//********************************************************************************
				// Function	Name	  : C12006
				// Summary	          : Function to perform TestCase ID C11991					
				//********************************************************************************
				@Test
				public void C11989() throws Exception {
					Assign objAssign= new Assign();
					objAssign.HighlightCurrentAssessment();
					objAssign.UnAssignaSubject();
					objAssign.CloseAssignedPage();
					
				}
}
