package com.sgic.automation.orangehrm.tests.RecruitmentTest;

import com.sgic.automation.orangehrm.TestData.RecruitmentData;
import com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.SearchRecruitmentCandidate;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;

public class SearchRecruitmentCandidateTest extends TestBase {
    /**
     * RECRUITMENT_SEARCH CANDIDATE test
     */
    @Test(priority = 2, groups = "REGRESSION",dataProviderClass = RecruitmentData.class, dataProvider = "SearchCandidate", testName = "SearchRecruitmentCandidate")
    public void searchCandidates(String CanJobTitle, String CanVacancy, String CanHiringManager,
                                 String CanStatus, String CanName, String CanKey, String fromDate, String toDate,
                                 String CanMethodApplication) {

        extentTest =extentReport.startTest("Search Recruitment Candidate");

        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay());
        AddRecruitmentVacancy.recruitmentBtnClick();
        softAssert.assertTrue(SearchRecruitmentCandidate.isCandidateBtnVerify());
        SearchRecruitmentCandidate.candidateBtnClick();
        softAssert.assertTrue(SearchRecruitmentCandidate.isCandidatePageDisplay());
        softAssert.assertTrue(SearchRecruitmentCandidate.isCandidateJobTitleDropDownDisplayed(),
                "DropDown is not Displayed");

        extentTest =extentReport.startTest("JobTitle ="+CanJobTitle+", Vacancy = "+CanVacancy+", HiringManager = "
                +CanHiringManager+", Status = "+CanStatus+", Candidate name = "+CanName+", Keyword = "+CanKey+", FromDate = "+fromDate+", ToDate"+toDate
                +", Method of Application ="+CanMethodApplication);
        SearchRecruitmentCandidate.RecruitmentCandidateSearchForm(CanJobTitle, CanVacancy, CanHiringManager, CanStatus, CanName,
                CanKey, fromDate, toDate, CanMethodApplication);
    }
}
