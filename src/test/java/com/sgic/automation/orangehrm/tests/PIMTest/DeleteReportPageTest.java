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

public class DeleteReportPageTest extends TestBase {
  private static final Logger LOGGER = Logger.getLogger(DeleteReportPageTest.class);

  /*
 Verify delete function in report page
  */
  @Test(priority = 13, dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
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


}
