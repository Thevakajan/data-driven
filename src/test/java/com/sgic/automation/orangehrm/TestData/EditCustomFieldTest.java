package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.pages.CustomFields;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.PIMPage;
import com.sgic.automation.orangehrm.tests.PIMTest.DeleteCustomFieldTest;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EditCustomFieldTest extends TestBase {
  private static final Logger LOGGER = Logger.getLogger(DeleteCustomFieldTest.class);


  @Test(priority = 0, dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void editCustomField(String username, String password) {
    softAssert = new SoftAssert();
    extentTest = extentReport.startTest("OrangeHRMLogin");
    LOGGER.info("login with username: " + username + " password: " + password);
    LoginPage.login(username, password);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");
    PIMPage.clickConfiguration();
    CustomFields.clickCustomField();

    softAssert.assertTrue(CustomFields.isDeleteCustomFieldDisplay(), "CustomField page is not displayed");
    CustomFields.clickSelectCustomField();
    CustomFields.clearFieldName();
    CustomFields.setFieldName("abcd");
    CustomFields.clickSave();
    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    extentReport.endTest(extentTest);
    softAssert.assertAll();
  }
}

