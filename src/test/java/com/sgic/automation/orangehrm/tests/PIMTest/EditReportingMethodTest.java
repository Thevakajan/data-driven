package com.sgic.automation.orangehrm.tests.PIMTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.PIMData;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.PIMPage;
import com.sgic.automation.orangehrm.pages.ReportingMethodPage;
import com.sgic.automation.orangehrm.tests.PIMPageTest;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EditReportingMethodTest extends TestBase {
  private static final Logger LOGGER = Logger.getLogger(EditReportingMethodTest.class);

  /*
  Verify edit function in reporting method page
   */
  @Test(priority = 6, dataProvider = "EditReportingMethod", dataProviderClass = PIMData.class)
  public void editReportingMethod(String name) {
    softAssert = new SoftAssert();
    LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
    extentTest = extentReport.startTest("Edit reporting method");
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

}
