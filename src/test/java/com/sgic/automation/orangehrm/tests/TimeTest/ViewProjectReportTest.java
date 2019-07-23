package com.sgic.automation.orangehrm.tests.TimeTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.ReportReportProject;
import com.sgic.automation.orangehrm.pages.TimePage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;

public class ViewProjectReportTest extends TestBase {
    /**
     * Time_Report_report test
     */
    @Test(priority = 12,groups = "REGRESSION", testName = "TimePageProjectReportTest")
    public void TimePageProjectReportTest() {
        extentTest =extentReport.startTest("TimePage_ProjectReportTest");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(TimePage.timeButtonVerify());
        TimePage.timeBtnClick();
        softAssert.assertTrue(TimePage.time_ReportButtonVerify());
        TimePage.time_ReportButtonClick();
        softAssert.assertTrue(TimePage.reportProjectdropdownVerify());
        TimePage.reportProjectdropdownClick();
        softAssert.assertTrue(ReportReportProject.ReportProjectnameVerify());
        ReportReportProject.ReportProjectnameWrite();
        extentTest.log(LogStatus.PASS, "Project name = "+"thusya - HRMsys");
        softAssert.assertTrue(ReportReportProject.ReportFromDateVerify());
        ReportReportProject.ReportFromDateClear();
        ReportReportProject.ReportFromDate();
        extentTest.log(LogStatus.PASS, "From date = "+"2019-02-24");
        softAssert.assertTrue(ReportReportProject.ReportToDateVerify());
        ReportReportProject.ReportToDateClear();
        ReportReportProject.ReportToDate();
        extentTest.log(LogStatus.PASS, "Todate"+"2019-02-27");
        softAssert.assertTrue(ReportReportProject.ReportApproveVerify());
        ReportReportProject.ReportApproveClick();
        softAssert.assertTrue(ReportReportProject.ReportViewBtnVerify());
        ReportReportProject.ReportViewBtnClick();
        extentTest.log(LogStatus.PASS, "Successfully view ");

    }
}
