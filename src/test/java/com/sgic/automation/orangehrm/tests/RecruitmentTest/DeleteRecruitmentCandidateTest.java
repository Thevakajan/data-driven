package com.sgic.automation.orangehrm.tests.RecruitmentTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy;
import com.sgic.automation.orangehrm.pages.DeleteRecruitmentCandidate;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.SearchRecruitmentCandidate;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;

public class DeleteRecruitmentCandidateTest extends TestBase {
    /**
     * DELETE RECRUITMENT CANDIDATE
     */
    @Test(priority = 7, groups = "REGRESSION", testName = "DeleteCandidate")
    public void deleteCandidate() {
        extentTest =extentReport.startTest("DeleteCandidate");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(),
                "RecruitmentBtn is not Displayed");
        AddRecruitmentVacancy.recruitmentBtnClick();
        softAssert.assertTrue(SearchRecruitmentCandidate.isCandidateBtnVerify(),"CandidateBtn is not Verify");
        SearchRecruitmentCandidate.candidateBtnClick();
        softAssert.assertTrue(SearchRecruitmentCandidate.isCandidatePageDisplay(),"Candidate Page is not Displayed");
        softAssert.assertTrue(DeleteRecruitmentCandidate.isCandidatedeleteCBoxDisplay());
        DeleteRecruitmentCandidate.candidate_deleteCBoxClick();
        softAssert.assertTrue(DeleteRecruitmentCandidate.isCandidatedeleteBtnDisplay());
        DeleteRecruitmentCandidate.recruitmentdeleteBtnClick();
        softAssert.assertTrue(DeleteRecruitmentCandidate.okBtnVerify());
        DeleteRecruitmentCandidate.setOkBtn();
        extentTest.log(LogStatus.PASS,"Data Deleted");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

}
