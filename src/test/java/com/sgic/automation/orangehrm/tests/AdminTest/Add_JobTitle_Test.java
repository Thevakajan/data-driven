package com.sgic.automation.orangehrm.tests.AdminTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.JobTitleData;
import com.sgic.automation.orangehrm.pages.AdminMenuPage;
import com.sgic.automation.orangehrm.pages.JobTitle;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.PageBase;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Add_JobTitle_Test extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(Add_JobTitle_Test.class);
    @Test(priority = 14, dataProvider = "JobTitleSave", dataProviderClass = JobTitleData.class)
    public void SaveJobTitleTest(String JjobTitle,String JobDecription,String Notes) {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");

        AdminMenuPage.clickAdmin();
        AdminMenuPage.clickJobMenu();
        AdminMenuPage.clickJobTitle();
        softAssert.assertTrue(JobTitle.isDisplayTitleHeader(), "Job Title is not Displayed");
        extentTest=extentReport.startTest("TitleSave");
//
        JobTitle.ClickAddButton();
        PageBase.implicitWait(2);
        softAssert.assertTrue(JobTitle.isDisplayAddJobTitleHeader(), "JobAdd  Title is not Displayed");
        JobTitle.setJobTitle(JjobTitle);
        JobTitle.setJobDescription(JobDecription);
        JobTitle.setNote(Notes);
        JobTitle.ClickButtonSave();
        JobTitle.ClickCheckBox();
        JobTitle.ClickDeleteButton();
        JobTitle.ClickConForomOk();
        extentTest.log(LogStatus.PASS, " OrangeHRM JobTitle Add Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();


    }

}
