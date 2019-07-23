package com.sgic.automation.orangehrm.tests.AdminTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.AdminMenuPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.Skills;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SkillsAdd_Test extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(SkillsAdd_Test.class);
    @Test(groups = "REGRESSION", priority = 11)
    public void TestsaveSkill() {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest(" Add Skill");
        AdminMenuPage.clickAdmin();
        AdminMenuPage.clickMenuQualifications();
        AdminMenuPage.ClickMenuSkills();
        Skills.ClickAddButton();
        Skills.setjobCategory_name(Constants.Name);
        Skills.setDescription(Constants.Description);
        Skills.ClicksaveButton();
        extentTest.log(LogStatus.PASS, " OrangeHRM Add Job Category Add Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }
}
