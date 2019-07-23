package com.sgic.automation.orangehrm.tests.AdminTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.AdminMenuPage;
import com.sgic.automation.orangehrm.pages.Education;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.Skills;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EducationAdd_Test  extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(EducationAdd_Test.class);
    @Test(groups = "REGRESSION", priority = 3)
    public void TestsaveEducation() {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest(" Add Education");
        AdminMenuPage.clickAdmin();
        AdminMenuPage.clickMenuQualifications();
        AdminMenuPage.ClickMenuEducation();
        Skills.ClickAddButton();
        Education.setname(Constants.Name);
        Education.ClickSaveButton();
        extentTest.log(LogStatus.PASS, " OrangeHRM Add Education Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }
}
