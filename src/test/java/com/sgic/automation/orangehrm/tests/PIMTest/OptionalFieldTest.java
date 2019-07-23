package com.sgic.automation.orangehrm.tests.PIMTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.LoginData;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.OptionalFieldsPage;
import com.sgic.automation.orangehrm.pages.PIMPage;
import com.sgic.automation.orangehrm.tests.PIMPageTest;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OptionalFieldTest extends TestBase {
  private static final Logger LOGGER = Logger.getLogger(OptionalFieldTest.class);

  /**
   * @Author Jenisha Edit optional field
   */
  @Test(priority = 0, dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void optionalField(String username, String password) {
    softAssert = new SoftAssert();
    extentTest = extentReport.startTest("Edit optional field");
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

}
