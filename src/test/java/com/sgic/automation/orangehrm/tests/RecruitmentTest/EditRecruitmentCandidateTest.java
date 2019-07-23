package com.sgic.automation.orangehrm.tests.RecruitmentTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.RecruitmentData;
import com.sgic.automation.orangehrm.pages.*;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;

public class EditRecruitmentCandidateTest extends TestBase {
    /**
     * EDIT RECRUITMENT CANDIDATE
     * @param Firstname, edit recruitment candidate firstname
     * @param Middlename,edit recruitment candidate middlename
     * @param Lastname, edit candidate lastname
     * @param Mail, edit candidate mail address
     * @param ContactNumber, edite contact number
     * @param jobVacancy, edit recruitment jobvacancy
     * @param keyWord, edit keyword
     * @param comment, edit vacancy comment
     * @param dateofApplication, edit candidate date of application
     */
    @Test(priority = 5, groups = "REGRESSION",dataProviderClass = RecruitmentData.class, dataProvider = "EditCandidate", testName = "EditRecruitmentCandidate")
    public void editCandidates(String Firstname, String Middlename, String Lastname, String Mail,
                               String ContactNumber, String jobVacancy, String keyWord, String comment,
                               String dateofApplication) {
        extentTest =extentReport.startTest("EditRecruitmentCandidate");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(),"Recruitment Page is not Displayed");
        AddRecruitmentVacancy.recruitmentBtnClick();
        softAssert.assertTrue(SearchRecruitmentCandidate.isCandidateBtnVerify(),"CandidateBtn is not Verify");
        SearchRecruitmentCandidate.candidateBtnClick();
        softAssert.assertTrue(SearchRecruitmentCandidate.isCandidatePageDisplay(),"Candidate Page is not Displayed");
        softAssert.assertTrue(EditRecruitmentCandidate.EditLinkLVerify());
        EditRecruitmentCandidate.setEditCandidateLink();
        EditRecruitmentCandidate.setEditCanBtn();

        AddRecruitmentCandidate.uploadFile("HRMcv.docx");
        softAssert.assertTrue(AddRecruitmentCandidate.jobVacancy());
        AddRecruitmentCandidate.dateclear();
        extentTest.log(LogStatus.PASS,"Firstame ="+Firstname+", MiddleName = "+Middlename+", Lastname = "+Lastname+", Email ="+Mail
                +", ContactNumber ="+ContactNumber+", Vacancy = "+jobVacancy+", Keyword = "+keyWord+", Comment = "+comment
                +", Date of Application = "+dateofApplication);
        AddRecruitmentCandidate.AddCandidateForms(Firstname, Middlename, Lastname,Mail,ContactNumber,jobVacancy,keyWord,comment,dateofApplication);
        AddRecruitmentCandidate.setSaveBtn();
        extentReport.endTest(extentTest);
    }
}
