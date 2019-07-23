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

public class SearchReportPageTest extends TestBase {
  private static final Logger LOGGER = Logger.getLogger(SearchReportPageTest.class);
  /*
  Verify search function in report page
   */
  @Test(priority = 11, dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void reportPageSearch(String username, String password) {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);
    extentTest = extentReport.startTest("Search report name in Report page");
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

}
