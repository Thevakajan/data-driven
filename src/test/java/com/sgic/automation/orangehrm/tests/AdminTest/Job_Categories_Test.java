package com.sgic.automation.orangehrm.tests.AdminTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.AdminMenuPage;
import com.sgic.automation.orangehrm.pages.JobCategory;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Job_Categories_Test extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(Job_Categories_Test.class);
    @Test(groups = "REGRESSION", priority = 7)
    public void TestJobCategory() {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest(" Add JobCategory");
        AdminMenuPage.clickAdmin();
        AdminMenuPage.clickJobMenu();
        AdminMenuPage.clickJobCategories();
//        softAssert.assertTrue(Employment_Status.isDisplayEmployee_Status_Header(), "Employment_Status Page Title is not Displayed");
        JobCategory.ClickAddButton();
        JobCategory.setjobCategory_name(Constants.JobCatery);
        JobCategory.ClickButtonSave();

        extentTest.log(LogStatus.PASS, " OrangeHRM Add Job Category Add Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }

}
