package com.sgic.automation.orangehrm.tests.PIMTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.LoginData;
import com.sgic.automation.orangehrm.pages.DataImportPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.PIMPage;
import com.sgic.automation.orangehrm.tests.PIMPageTest;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ImportDataTest extends TestBase {
  private static final Logger LOGGER = Logger.getLogger(ImportDataTest.class);
  /*
  Verify file upload in importData page
   */

  @Test(priority = 10, dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void importData(String username, String password) {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);
    extentTest = extentReport.startTest("Upload file");
    extentTest.log(LogStatus.PASS, "username = " + username + " password =" + password);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");

    PIMPage.clickConfiguration();
    DataImportPage.dataImportPage();
    softAssert
        .assertTrue(DataImportPage.isDataImportDisplayed(), "Data import page is not displayed");
    DataImportPage.fileUpload("importData.csv");
    DataImportPage.clickUpload();
    //softAssert.assertEquals(DataImportPage.verifyFileUpload(), "importData.csv", "Invalid File Name");
    extentReport.endTest(extentTest);
    softAssert.assertAll();

  }


}
