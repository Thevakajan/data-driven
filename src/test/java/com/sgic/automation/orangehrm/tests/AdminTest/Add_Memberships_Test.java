package com.sgic.automation.orangehrm.tests.AdminTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.AdminMenuPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.Memberships;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Add_Memberships_Test  extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(Add_Memberships_Test.class);
    @Test(groups = "REGRESSION", priority = 1)
    public void TestMembership() {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest(" Add Membership");
        AdminMenuPage.clickAdmin();
        AdminMenuPage.clickMenuQualifications();
        AdminMenuPage.ClickMenuMembership();
        Memberships.ClickAddButton();
        Memberships.setname(Constants.Name);
        Memberships.ClickSaveButton();
        extentTest.log(LogStatus.PASS, " OrangeHRM Add ClickMenuMembership Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }

}
