package com.sgic.automation.orangehrm.tests.PIMTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.LoginData;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.PIMPage;
import com.sgic.automation.orangehrm.pages.ReportPage;
import com.sgic.automation.orangehrm.tests.PIMPageTest;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EditReportPageTest extends TestBase {
  private static final Logger LOGGER = Logger.getLogger(EditReportPageTest.class);
  /*
  Verify edit function in report page
   */
  @Test(priority = 14, dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
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


}
