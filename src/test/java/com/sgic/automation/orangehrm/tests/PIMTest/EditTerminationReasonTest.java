package com.sgic.automation.orangehrm.tests.PIMTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.LoginData;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.PIMPage;
import com.sgic.automation.orangehrm.pages.TerminationReasonPage;
import com.sgic.automation.orangehrm.tests.PIMPageTest;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EditTerminationReasonTest extends TestBase {
  private static final Logger LOGGER = Logger.getLogger(EditTerminationReasonTest.class);

  /*
  Verify edit function in Termination Reason page
   */
  @Test(priority = 9, dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
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

}
