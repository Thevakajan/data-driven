package com.sgic.automation.orangehrm.tests.AdminTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.UserAddData;
import com.sgic.automation.orangehrm.pages.AdminPage;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddUserTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddUserTest.class);
    @Test( groups = "REGRESSION",priority = 1, dataProvider = "AddUser", dataProviderClass = UserAddData.class)
    public void SaveUserTest(String UserRole,String EmployeeName,String Username,String Status,String Password,String Cpassword) {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        DashBoardPage.clickAdmin();
        extentTest=extentReport.startTest("UserAdd");
        AdminPage.SaveUser(UserRole,EmployeeName,Username,Status,Password,Cpassword);
        extentTest.log(LogStatus.PASS, " OrangeHRM User Add Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();


    }
}
