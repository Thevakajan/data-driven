package com.sgic.automation.orangehrm.tests.RecruitmentTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.RecruitmentData;
import com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy;
import com.sgic.automation.orangehrm.pages.EditRecruitmentVacancy;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;

public class EditRecruitmentVacancyTest extends TestBase {
    /**
     * EDIT RECRUITMENT VACANCY
     */
    @Test(priority = 4, groups = "REGRESSION",dataProviderClass = RecruitmentData.class, dataProvider = "EditVacancy", testName = "EditRecruitmentVacancy")
    public void editRecruitmentVacancy(String jobTitle, String VacancyName, String HiringManager,
                                       String PositionNum, String Description) {
        extentTest =extentReport.startTest("EditRecruitmentVacancy");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(),
                "RecruitmentBtn is not Displayed");
        AddRecruitmentVacancy.recruitmentBtnClick();
        softAssert.assertTrue(AddRecruitmentVacancy.isVancyBtnDisplay());
        AddRecruitmentVacancy.vacancyBtnClick();
        softAssert.assertTrue(EditRecruitmentVacancy.isVacancyEditlinkVerify());
        EditRecruitmentVacancy.vacancyEditLinkClick();
        softAssert.assertTrue(EditRecruitmentVacancy.isVacancyEditBtnVerify());
        EditRecruitmentVacancy.vacancyEditBtnClick();
        softAssert.assertTrue(EditRecruitmentVacancy.isJobTitleDropDownDisplayed(), "DropDown not Display");
        extentTest.log(LogStatus.PASS,"JobTitle ="+jobTitle+", Vacancy ="+VacancyName+", HiringManager ="+HiringManager+", Position ="+PositionNum
                +", Description ="+Description);
        EditRecruitmentVacancy.AddRecruitmentVacancyForm(jobTitle, VacancyName, HiringManager, PositionNum, Description);
        EditRecruitmentVacancy.isSaveBtnVisible();
        EditRecruitmentVacancy.saveBtn();
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }
}
