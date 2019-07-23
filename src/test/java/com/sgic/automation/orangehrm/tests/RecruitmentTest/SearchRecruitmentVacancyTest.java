package com.sgic.automation.orangehrm.tests.RecruitmentTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.RecruitmentData;
import com.sgic.automation.orangehrm.pages.AddRecruitmentVacancy;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.SearchRecruitmentVacancy;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;

public class SearchRecruitmentVacancyTest extends TestBase {
    /**
     * SEARCH RECRUITMENT VACANCY
     */
    @Test(priority = 3,groups = "REGRESSION", dataProviderClass = RecruitmentData.class, dataProvider = "SearchVacancy", testName = "SearchRecruitmentVacancy")
    public void searchRecruitmentVacancy(String SearchJobtitle,String SearchJobvacancy,String SearchhiringManager,String vacancySearch_Status){
        extentTest =extentReport.startTest("SearchRecruitmentVacancy");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);
        softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(), "RecruitmentBtn is not Displayed");
        AddRecruitmentVacancy.recruitmentBtnClick();
        softAssert.assertTrue(AddRecruitmentVacancy.isVancyBtnDisplay());
        AddRecruitmentVacancy.vacancyBtnClick();
        softAssert.assertTrue(SearchRecruitmentVacancy.VacancySearch_jobTitle_Display());
        softAssert.assertTrue(SearchRecruitmentVacancy.vacancySearch_jobVacancy_Display());
        softAssert.assertTrue(SearchRecruitmentVacancy.vacancySearch_hiringManager_Display());
        softAssert.assertTrue(SearchRecruitmentVacancy.vacancySearch_Status());
        SearchRecruitmentVacancy.searchRecruitmentVacancyForm(SearchJobtitle,SearchJobvacancy,SearchhiringManager,vacancySearch_Status);
        extentTest.log(LogStatus.PASS, "Jobtitle = "+SearchJobtitle+", Vacancy = "+SearchJobvacancy+", HirinhManager = "
                +SearchhiringManager+", Status = "+vacancySearch_Status);
        softAssert.assertTrue(SearchRecruitmentVacancy.vacancySearch_button_verify());
        SearchRecruitmentVacancy.VacancySearch_button_Click();
        extentReport.endTest(extentTest);
    }
}
