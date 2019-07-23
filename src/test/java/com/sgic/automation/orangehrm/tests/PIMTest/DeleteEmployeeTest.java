package com.sgic.automation.orangehrm.tests.PIMTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.LoginData;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.EmployeeListPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.PIMPage;
import com.sgic.automation.orangehrm.tests.PIMPageTest;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DeleteEmployeeTest extends TestBase {
  private static final Logger LOGGER = Logger.getLogger(DeleteEmployeeTest.class);

  @Test(priority = 18, groups = "REGRESSION", dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void deleteEmployee(String username, String password) throws InterruptedException {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);
    extentTest = extentReport.startTest("Delete user ");
    extentTest.log(LogStatus.PASS, "username = " + username + " password =" + password);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");
    EmployeeListPage.clickEmployeeList();
    EmployeeListPage.clickSelectBtn();
    EmployeeListPage.clickDeleteBtn();
    EmployeeListPage.clickOkBtn();
    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    extentReport.endTest(extentTest);
    softAssert.assertAll();

  }

}
