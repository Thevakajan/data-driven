package com.sgic.automation.orangehrm.tests.AdminTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.Add_License;
import com.sgic.automation.orangehrm.pages.AdminMenuPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LicensesAdd_Test extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(LicensesAdd_Test.class);
    @Test(groups = "REGRESSION", priority = 8)
    public void TestsaveLicense() {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest(" Add License");
        AdminMenuPage.clickAdmin();
        AdminMenuPage.clickMenuQualifications();
        AdminMenuPage.ClickMenuLicenses();
        Add_License.ClickAddButton();
        Add_License.setname(Constants.Name);
        Add_License.ClickSaveButton();
        extentTest.log(LogStatus.PASS, " OrangeHRM Add Languages Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }
}
