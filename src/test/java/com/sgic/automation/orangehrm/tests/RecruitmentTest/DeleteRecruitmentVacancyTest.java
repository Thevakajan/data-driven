package com.sgic.automation.orangehrm.tests.RecruitmentTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy;
import com.sgic.automation.orangehrm.pages.DeleteRecruitmentVacancy;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;

public class DeleteRecruitmentVacancyTest extends TestBase {
    /**
     * DELETE RECRUITMENT VACANCY
     */

    @Test(priority = 6, groups = "REGRESSION", testName = "DeleteRecruitmentVacancy")
    public void deleteRecruitmentVacancy() {
        extentTest =extentReport.startTest("DeleteRecruitmentVacancy");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);


        softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(),
                "RecruitmentBtn is not Displayed");
        AddRecruitmentVacancy.recruitmentBtnClick();
        softAssert.assertTrue(AddRecruitmentVacancy.isVancyBtnDisplay());
        AddRecruitmentVacancy.vacancyBtnClick();
        softAssert.assertTrue(DeleteRecruitmentVacancy.isRecruitmentdeleteCBoxDisplay());
        DeleteRecruitmentVacancy.recruitmentdeleteCBoxClick();
        softAssert.assertTrue(DeleteRecruitmentVacancy.isRecruitmentdeleteBtnDisplay());
        DeleteRecruitmentVacancy.recruitmentdeleteBtnClick();
        DeleteRecruitmentVacancy.setOkBtn();
        extentTest.log(LogStatus.PASS,"Data Deleted");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

}
