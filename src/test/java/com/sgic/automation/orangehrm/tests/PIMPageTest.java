package com.sgic.automation.orangehrm.tests;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.LoginData;
import com.sgic.automation.orangehrm.TestData.PIMData;
import com.sgic.automation.orangehrm.pages.CustomFields;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.DataImportPage;
import com.sgic.automation.orangehrm.pages.EmployeeListPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.OptionalFieldsPage;
import com.sgic.automation.orangehrm.pages.PIMPage;
import com.sgic.automation.orangehrm.pages.ReportPage;
import com.sgic.automation.orangehrm.pages.ReportingMethodPage;
import com.sgic.automation.orangehrm.pages.TerminationReasonPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author Jenisha
 */
public class PIMPageTest extends TestBase {


  private static final Logger LOGGER = Logger.getLogger(PIMPageTest.class);

  /**
   * @Author Jenisha Edit optional field
   */


  @Test(priority = 0, dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void optionalField(String username, String password) {
    softAssert = new SoftAssert();
    extentTest = extentReport.startTest("OrangeHRMLogin");
    LOGGER.info("login with username: " + username + " password: " + password);
    LoginPage.login(username, password);
    extentTest.log(LogStatus.PASS, "username = " + username + " password =" + password);
    LOGGER.info("login success with username: " + username + " password: " + password);

    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");

    PIMPage.clickConfiguration();
    PIMPage.clickOptionalField();

    softAssert
        .assertTrue(OptionalFieldsPage.isOptionlFieldDisplayes(), "OptionalField is not displayed");

    OptionalFieldsPage.clicEditBtn();
    OptionalFieldsPage.selectOption();
    OptionalFieldsPage.clickSaveBtn();
    //softAssert.assertTrue(OptionalFieldsPage.isConfirmationDisplayed(), "edit function is not work");
    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    extentReport.endTest(extentTest);
    softAssert.assertAll();

  }
    /*
    Add Custom field
     */

  @Test(priority = 1, groups = "REGRESSION", dataProviderClass = PIMData.class, dataProvider = "CustomFieldData")
  public void customFields(String fieldName, String screen, String type) {
    softAssert = new SoftAssert();
    extentTest = extentReport.startTest("Add custom field");
    extentTest
        .log(LogStatus.PASS, "FieldName = " + fieldName + " Screen =" + screen + " Type =" + type);
    LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);

    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");
    PIMPage.clickConfiguration();
    CustomFields.clickCustomField();

    softAssert.assertTrue(CustomFields.isCustomFieldDisplay(), "CustomField page is not displayed");
    CustomFields.clickAddBtn();
    CustomFields.addCustomFieldForm(fieldName, screen, type);
    softAssert.assertEquals(CustomFields.getSelectedOption(), "Personal Details",
        "DropDown value is incorrect");
    softAssert.assertEquals(CustomFields.getTypeDropDownOption(), "Text or Number", "DropDown value is incorrect");
    CustomFields.clickSave();
    //softAssert.assertEquals(CustomFields.isTypeDropDownDisplayed(), "Drop Down", "DropDown value is incorrect");
    softAssert.assertTrue(CustomFields.isAddConfirmationDisplay(), "Add function is not work");
    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    extentReport.endTest(extentTest);
    softAssert.assertAll();

  }
  /*
  Verify add function in reporting method page
   */

  @Test(priority = 2, dataProvider = "ReportingMethod", dataProviderClass = PIMData.class)
  public void addReportingMethod(String name) {
    softAssert = new SoftAssert();
    LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
    extentTest = extentReport.startTest("Add reporting method");
    extentTest.log(LogStatus.PASS, "ReportingMethod = " + name);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");

    PIMPage.clickConfiguration();
    ReportingMethodPage.reportingMethodPage();
    softAssert.assertTrue(ReportingMethodPage.isReportingMethodDisplayed(),
        "Reporting method page is not displayed");
    ReportingMethodPage.addReportingMethodName();
    ReportingMethodPage.addReportingMethodForm(name);
    ReportingMethodPage.saveReportingMethodName();
    softAssert.assertTrue(ReportingMethodPage.isAddReportingMethodDisplayed(),
        "Add function is not displayed");

    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    extentReport.endTest(extentTest);
    softAssert.assertAll();


  }

  /*
  Verify delete function in reporting method page
   */
  @Test(priority = 3, dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void deleteReportingMethod(String username, String password) {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);
    extentTest = extentReport.startTest("delete custom field");
    extentTest.log(LogStatus.PASS, "username = " + username + " password =" + password);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");

    PIMPage.clickConfiguration();
    ReportingMethodPage.reportingMethodPage();
    softAssert.assertTrue(ReportingMethodPage.isReportingMethodDisplayed(),
        "Reporting method page is not displayed");

    ReportingMethodPage.selectReportingMethodName();
    ReportingMethodPage.deleteReportingMethodName();

    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    extentReport.endTest(extentTest);
    softAssert.assertAll();


  }

  /*
  Verify edit function in reporting method page
   */
  @Test(priority = 4, dataProvider = "EditReportingMethod", dataProviderClass = PIMData.class)
  public void editReportingMethod(String name) {
    softAssert = new SoftAssert();
    LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
    extentTest = extentReport.startTest("Add custom field");
    extentTest.log(LogStatus.PASS, "name = " + name);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");

    PIMPage.clickConfiguration();
    ReportingMethodPage.reportingMethodPage();
    softAssert.assertTrue(ReportingMethodPage.isReportingMethodDisplayed(),
        "Reporting method page is not displayed");

    ReportingMethodPage.clickReportingMethodName();
    ReportingMethodPage.clearReportingMethodName();
    ReportingMethodPage.addReportingMethodForm(name);
    // ReportingMethodPage.editReportingMethodName("abcd");
    ReportingMethodPage.saveAndEditReportingMethodName();
    softAssert.assertTrue(ReportingMethodPage.isEditReportingMethodDisplayed(),
        "Edit function is not displayed");

    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    extentReport.endTest(extentTest);
    softAssert.assertAll();


  }
  /*
  Verify add function in termination reason page
   */

  @Test(priority = 5, dataProvider = "Termination", dataProviderClass = PIMData.class)
  public void addTerminationReasonPage(String name) {
    softAssert = new SoftAssert();
    LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
    extentTest = extentReport.startTest("Edit custom field");
    extentTest.log(LogStatus.PASS, "name = " + name);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");

    PIMPage.clickConfiguration();
    // ReportingMethodPage.reportingMethodPage();
    TerminationReasonPage.terminationReasonPage();
    // softAssert.assertTrue(TerminationReasonPage.isTerminationReasonDisplayed(), "Termination reason is not displayed");
    TerminationReasonPage.addTerminationReasonName();
    TerminationReasonPage.addTerminationReasonForm(name);
    TerminationReasonPage.saveTerminationReasonName();
    softAssert.assertTrue(TerminationReasonPage.isAddTerminationReasonDisplayed(),
        "Add function is not displayed");
    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    extentReport.endTest(extentTest);
    softAssert.assertAll();
  }

  /*
  Verify delete function in termination reason page
   */
  @Test(priority = 6, dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void deleteTerminationReasonPage(String username, String password) {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);
    extentTest = extentReport.startTest("delete Termination Reason");
    extentTest.log(LogStatus.PASS, "username = " + username + " password =" + password);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");

    PIMPage.clickConfiguration();
    // ReportingMethodPage.reportingMethodPage();
    TerminationReasonPage.terminationReasonPage();
    // softAssert.assertTrue(TerminationReasonPage.isTerminationReasonDisplayed(), "Termination reason is not displayed");

    TerminationReasonPage.selectTerminationReasonName();
    TerminationReasonPage.deleteTerminationReasonName();

    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    extentReport.endTest(extentTest);
    softAssert.assertAll();
  }

  /*
  Verify edit function in Termination Reason page
   */
  @Test(priority = 7, dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void editTerminationReasonPage(String username, String password) {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);
    extentTest = extentReport.startTest("Edit Termination Reason");
    extentTest.log(LogStatus.PASS, "username = " + username + " password =" + password);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");

    PIMPage.clickConfiguration();
    // ReportingMethodPage.reportingMethodPage();
    TerminationReasonPage.terminationReasonPage();
    // softAssert.assertTrue(TerminationReasonPage.isTerminationReasonDisplayed(), "Termination reason is not displayed");

    TerminationReasonPage.clickTerminationReasonName();
    TerminationReasonPage.clearTerminationReasonName();
    TerminationReasonPage.setTerminationReasonName("abcde");
    TerminationReasonPage.saveAndEditTerminationReasonName();
    softAssert.assertTrue(TerminationReasonPage.isEditTerminationReasonDisplayed(),
        "Edit function is not displayed");
    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    extentReport.endTest(extentTest);
    softAssert.assertAll();
  }
  /*
  Verify file upload in importData page
   */

  @Test(priority = 8, dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void importData(String username, String password) {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);
    extentTest = extentReport.startTest("Upload file");
    extentTest.log(LogStatus.PASS, "username = " + username + " password =" + password);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");

    PIMPage.clickConfiguration();
    DataImportPage.dataImportPage();
    softAssert
        .assertTrue(DataImportPage.isDataImportDisplayed(), "Data import page is not displayed");
    DataImportPage.fileUpload("importData.csv");
    DataImportPage.clickUpload();
    //softAssert.assertEquals(DataImportPage.verifyFileUpload(), "importData.csv", "Invalid File Name");
    extentReport.endTest(extentTest);
    softAssert.assertAll();

  }

  /*
  Verify search function in report page
   */
  @Test(priority = 9, dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void reportPageSearch(String username, String password) {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);
    extentTest = extentReport.startTest("Search report name");
    extentTest.log(LogStatus.PASS, "username = " + username + " password =" + password);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");
    ReportPage.clickReportPage();
    ReportPage.isReportPageDisplayed();
    ReportPage.typeReportName("xyz");
    ReportPage.clickSearchBtn();
    //softAssert.assertTrue(ReportPage.isSearchResultDisplayed(), "PIM page Search is not displayed");
    extentReport.endTest(extentTest);
    ReportPage.clickAddBtn();

    softAssert.assertAll();


  }

  /*
  Verify add function in report page
   */
  @Test(priority = 10, dataProvider = "AddReport", dataProviderClass = PIMData.class)
  public void addReportPage(String name, String criteria, String criteriaInclude, String fieldGroup,
      String field) {
    softAssert = new SoftAssert();
    LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);

    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");
    ReportPage.clickReportPage();
    softAssert.assertTrue(ReportPage.isReportPageDisplayed(), "Report page is not displayed");
    ReportPage.clickAddBtn();

    ReportPage.addReportForm(name, criteria, criteriaInclude, fieldGroup, field);

    softAssert.assertAll();


  }

  /*
  Verify delete function in report page
   */
  @Test(priority = 11, dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void deleteReportPage(String username, String password) {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);
    extentTest = extentReport.startTest("Delete report name");
    extentTest.log(LogStatus.PASS, "username = " + username + " password =" + password);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");
    ReportPage.clickReportPage();
    softAssert.assertTrue(ReportPage.isReportPageDisplayed(), "Report page is not displayed");
    ReportPage.clickSelectBtn();
    ReportPage.clickDeleteBtn();
    ReportPage.clickOkBtn();
    extentReport.endTest(extentTest);
    softAssert.assertAll();


  }

  /*
  Verify edit function in report page
   */
  @Test(priority = 12, dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void editReportPage(String username, String password) {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);
    extentTest = extentReport.startTest("Edit report name");
    extentTest.log(LogStatus.PASS, "username = " + username + " password =" + password);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");
    ReportPage.clickReportPage();
    softAssert.assertTrue(ReportPage.isReportPageDisplayed(), "Report page is not displayed");
    ReportPage.clickEditBtn();
    ReportPage.clearReportName();
    ReportPage.typeReportName("test");
    ReportPage.clickSaveBtn();
    softAssert.assertTrue(ReportPage.isEditValueDisplayed(),
        "Report page edit function is not displayed");
    extentReport.endTest(extentTest);
    softAssert.assertAll();

  }

  /*
    verify search by name
   */
  @Test(priority = 13, groups = "REGRESSION", dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void searchEmployeePage(String username, String password) throws InterruptedException {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);
    extentTest = extentReport.startTest("Search employee ");
    extentTest.log(LogStatus.PASS, "username = " + username + " password =" + password);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");
    EmployeeListPage.clickEmployeeList();
    Thread.sleep(1000);
    softAssert.assertTrue(EmployeeListPage.isEmployeeListDisplayes(),
        "Employee list page is not displayed");

    EmployeeListPage.typeSearchName("Linda");
    EmployeeListPage.clickSearchBtn();
    softAssert.assertTrue(EmployeeListPage.isSearchNameDisplayed(),
        "Employee name is not displayed");
    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    extentReport.endTest(extentTest);
    softAssert.assertAll();
  }
  @Test(priority = 14, groups = "REGRESSION", dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void resetEmployeePage(String username, String password) throws InterruptedException {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);
    extentTest = extentReport.startTest("reset employee name ");
    extentTest.log(LogStatus.PASS, "username = " + username + " password =" + password);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");
    EmployeeListPage.clickEmployeeList();
    Thread.sleep(1000);
    softAssert.assertTrue(EmployeeListPage.isEmployeeListDisplayes(),
        "Employee list page is not displayed");
    EmployeeListPage.typeSearchName("Linda");
    EmployeeListPage.clickResetBtn();
    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    extentReport.endTest(extentTest);
    softAssert.assertAll();
  }

  @Test(priority = 15, groups = "REGRESSION", dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void addEmployee(String username, String password) throws InterruptedException {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);
    extentTest = extentReport.startTest("Create user ");
    extentTest.log(LogStatus.PASS, "username = " + username + " password =" + password);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");
    EmployeeListPage.clickEmployeeList();
    EmployeeListPage.clickAddBtn();
    EmployeeListPage.typeFirstName("Jeni");
    EmployeeListPage.typeMiddleName("Nisha");
    EmployeeListPage.typeLastName("Jenisha");
    // EmployeeListPage.typeEmployeeId(22);
    EmployeeListPage.photoUpload("profile-blank-female.png");
    EmployeeListPage.clickCreateLogin();
    EmployeeListPage.typeUserName("jenishaa");
    EmployeeListPage.typePassword("jenisha123");
    EmployeeListPage.confirmPassword("jenisha123");
    EmployeeListPage.setDropDownOption("Disabled");
    softAssert.assertEquals(EmployeeListPage.getSelectedOption(), "Disabled",
        "DropDown value is incorrect");
    EmployeeListPage.clicSaveBtn();
    //softAssert.assertTrue(EmployeeListPage.isUserDisplayed(), "User not created");
    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    extentReport.endTest(extentTest);
    softAssert.assertAll();

  }

  @Test(priority = 16, groups = "REGRESSION", dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void deleteEmployee(String username, String password) throws InterruptedException {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);
    extentTest = extentReport.startTest("Delete user ");
    extentTest.log(LogStatus.PASS, "username = " + username + " password =" + password);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");
    EmployeeListPage.clickEmployeeList();
    EmployeeListPage.clickSelectBtn();
    EmployeeListPage.clickDeleteBtn();
    EmployeeListPage.clickOkBtn();
    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    extentReport.endTest(extentTest);
    softAssert.assertAll();

  }
  @Test(priority = 16, groups = "REGRESSION", dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void editPersonalDetails(String username, String password) throws InterruptedException {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);
    extentTest = extentReport.startTest("Delete user ");
    extentTest.log(LogStatus.PASS, "username = " + username + " password =" + password);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");
    EmployeeListPage.clickEmployeeList();

  }
}







































