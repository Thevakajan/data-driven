package com.sgic.automation.orangehrm.tests.AdminTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.AdminMenuPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.Nationalities;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Add_Nationalities_Test extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(Add_Nationalities_Test.class);
    @Test(groups = "REGRESSION", priority = 2)
    public void TestNationality() {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest(" Add Membership");
        AdminMenuPage.clickAdmin();
        AdminMenuPage.clickMenuQualifications();
        AdminMenuPage.ClickMenuNationalities();
        Nationalities.ClickAddButton();
        Nationalities.setname(Constants.Nationality);
        Nationalities.ClickSaveButton();
        extentTest.log(LogStatus.PASS, " OrangeHRM Add CNationality Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }


}
