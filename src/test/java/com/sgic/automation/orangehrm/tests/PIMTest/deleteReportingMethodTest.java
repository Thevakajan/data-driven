package com.sgic.automation.orangehrm.tests.PIMTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.LoginData;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.PIMPage;
import com.sgic.automation.orangehrm.pages.ReportingMethodPage;
import com.sgic.automation.orangehrm.tests.PIMPageTest;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class deleteReportingMethodTest extends TestBase {
  private static final Logger LOGGER = Logger.getLogger(deleteReportingMethodTest.class);
  /*
  Verify delete function in reporting method page
   */
  @Test(priority = 5, dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void deleteReportingMethod(String username, String password) {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);
    extentTest = extentReport.startTest("Delete reporting method");
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

}
