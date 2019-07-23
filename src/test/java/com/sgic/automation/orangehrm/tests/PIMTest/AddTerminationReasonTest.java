package com.sgic.automation.orangehrm.tests.PIMTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.PIMData;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.PIMPage;
import com.sgic.automation.orangehrm.pages.TerminationReasonPage;
import com.sgic.automation.orangehrm.tests.PIMPageTest;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddTerminationReasonTest extends TestBase {
  private static final Logger LOGGER = Logger.getLogger(AddTerminationReasonTest.class);

  /*
  Verify add function in termination reason page
   */

  @Test(priority = 7, dataProvider = "Termination", dataProviderClass = PIMData.class)
  public void addTerminationReasonPage(String name) {
    softAssert = new SoftAssert();
    LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
    extentTest = extentReport.startTest("Add termination reason");
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

}
