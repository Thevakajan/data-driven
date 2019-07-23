package com.sgic.automation.orangehrm.tests.RecruitmentTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.RecruitmentData;
import com.sgic.automation.orangehrm.pages.*;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.PageBase;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class AddRecruitmentVacancyTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddRecruitmentVacancyTest.class);

    /**
     * RECRUITMENT_ADD VACANCY
     */
    @Test(priority = 0,groups = "REGRESSION", dataProviderClass = RecruitmentData.class, dataProvider = "AddVacancy", testName = "AddRecruitmentVacancyTest")
    public void addRecruitmentVacancyTest(String jobTitle, String VacancyName, String HiringManager,
                                          String PositionNum, String Description) {
        extentTest =extentReport.startTest("AddRecruitmentVacancyTest");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);
        AdminMenuPage.clickAdmin();
        AdminMenuPage.clickJobMenu();
        AdminMenuPage.clickJobTitle();
        JobTitle.ClickAddButton();
        PageBase.implicitWait(2);
        AddRecruitmentVacancy.txtjobTitle_name(Constants.RecruitmentJobTitle);
        AddRecruitmentVacancy.ClickButtonSave();

        softAssert.assertTrue(com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy.isRecruitmentBtnDisplay(),
                "RecruitmentBtn is not Displayed");
        com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy.recruitmentBtnClick();
        extentTest.log(LogStatus.PASS, "recruitment Button Click");
        softAssert.assertTrue(com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy.isVancyBtnDisplay());
        com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy.vacancyBtnClick();
        extentTest.log(LogStatus.PASS, "Vacancy Button Click");
        com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy.isVacancyAddBtnVerify();
        extentTest.log(LogStatus.PASS, "Vacancy Add Button Verify");
        com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy.vacancyAddBtnClick();
        extentTest.log(LogStatus.PASS, "Vacancy Add Button Click");
        softAssert.assertTrue(com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy.isVacancyAddPageVerify());
        softAssert.assertTrue(com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy.isJobTitleDropDownDisplayed(), "DropDown not Display");
        extentTest.log(LogStatus.PASS, "Vacancy Add Page Verify");
        extentTest.log(LogStatus.PASS, "jobtitle = " +jobTitle+"vacancy name = " + VacancyName+"hiringmanager = "+HiringManager
                +"position num = "+PositionNum+"description ="+Description);
        com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy.AddRecruitmentVacancyForm(jobTitle, VacancyName, HiringManager, PositionNum, Description);
        com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy.isSaveBtnVisible();
        extentTest.log(LogStatus.PASS, "Vacancy save Button verify");
        com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy.saveBtn();
        extentTest.log(LogStatus.PASS, "Vacancy save button click");

        /**
         * Verified add vacancy details
         */
        com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy.vacancyBtnClick();
        com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy.Adddatacheck();


        extentTest.log(LogStatus.PASS, "Vacancy add data verifyed");
        com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy.checkAdddataPage();
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }
}
