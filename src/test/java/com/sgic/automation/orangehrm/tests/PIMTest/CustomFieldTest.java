package com.sgic.automation.orangehrm.tests.PIMTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.PIMData;
import com.sgic.automation.orangehrm.pages.CustomFields;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.PIMPage;
import com.sgic.automation.orangehrm.tests.PIMPageTest;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CustomFieldTest extends TestBase {
  private static final Logger LOGGER = Logger.getLogger(CustomFieldTest.class);
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
    //CustomFields.clickAddBtn();
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

}
