package com.sgic.automation.orangehrm.tests.RecruitmentTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.RecruitmentData;
import com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.SearchRecruitmentCandidate;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;

public class AddRecruitmentCandidateTest extends TestBase {
    /**
     * RECRUITMENT_ADD CANDIDATE
     */
    @Test(priority = 1, groups = "REGRESSION",dataProviderClass = RecruitmentData.class, dataProvider = "AddCandidate", testName = "AddRecruitmentCandidateTest")
    public void addCandidates(String Firstname, String Middlename, String Lastname, String Mail,
                              String ContactNumber, String jobVacancy, String keyWord, String comment,
                              String dateofApplication) {
        extentTest =extentReport.startTest("AddRecruitmentCandidateTest");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);
        extentTest.log(LogStatus.PASS, " Login worked");
        softAssert.assertTrue(com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy.isRecruitmentBtnDisplay(),"Recruitment Page is not Displayed");
        AddRecruitmentVacancy.recruitmentBtnClick();
        extentTest.log(LogStatus.PASS, " Recruitment button worked");
        softAssert.assertTrue(SearchRecruitmentCandidate.isCandidateBtnVerify(),"CandidateBtn is not Verify");
        SearchRecruitmentCandidate.candidateBtnClick();
        softAssert.assertTrue(SearchRecruitmentCandidate.isCandidatePageDisplay(),"Candidate Page is not Displayed");
        softAssert.assertTrue(com.sgic.automation.orangehrm.pages.AddRecruitmentCandidate.addButtonDis(),"Candidate AddBtn is not Verify");
        com.sgic.automation.orangehrm.pages.AddRecruitmentCandidate.AddButtonClick();
        com.sgic.automation.orangehrm.pages.AddRecruitmentCandidate.AddCandidatePage();
        com.sgic.automation.orangehrm.pages.AddRecruitmentCandidate.uploadFile("HRMcv.docx");
        extentTest.log(LogStatus.PASS, " Recruitment file upload");
        softAssert.assertTrue(com.sgic.automation.orangehrm.pages.AddRecruitmentCandidate.jobVacancy());
        com.sgic.automation.orangehrm.pages.AddRecruitmentCandidate.dateclear();
        extentTest.log(LogStatus.PASS, "FirstName = "+Firstname+", Middle Name = "+Middlename+", Last Name = "+Lastname
                +", Email = "+Mail+", Contact Number = "+ContactNumber+", Job Vacancy = "+jobVacancy+", Keyword = "+keyWord
                +", Comment = "+comment+", Date of Application = "+dateofApplication);
        com.sgic.automation.orangehrm.pages.AddRecruitmentCandidate.AddCandidateForms(Firstname, Middlename, Lastname,Mail,ContactNumber,jobVacancy,keyWord,comment,dateofApplication);
        com.sgic.automation.orangehrm.pages.AddRecruitmentCandidate.setSaveBtn();
        extentReport.endTest(extentTest);
        //DashBoardPage.clickLogoutbtn();
    }
}
