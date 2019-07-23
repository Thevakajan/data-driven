package com.sgic.automation.orangehrm.tests.TimeTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.TimePage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;

public class TimePageVerificationTest extends TestBase {
    /**
     * Time page verification test
     */
    @Test(priority = 8,groups = "REGRESSION",testName = "TimePageTest")
    public void TimePageTest() {
        extentTest =extentReport.startTest("TimePage Verification");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(TimePage.timeButtonVerify());
        TimePage.timeBtnClick();
        softAssert.assertTrue(TimePage.timesheets_ButtonVerify());
        TimePage.timesheets_ButtonClick();
        softAssert.assertTrue(TimePage.employeeTimesheetsdropdownVerify());
        //TimePage.employeeTimesheetsdropdownClick();
        softAssert.assertTrue(TimePage.time_attendanceButtonVerify());
        TimePage.time_attendanceButtonClick();
        softAssert.assertTrue(TimePage.attendanceEmployeeRecorddsropdownVerify());
        //TimePage.attendanceEmployeeRecordsropdownClick();
        softAssert.assertTrue(TimePage.attendanceConfigurationdropdownVerify());
        // TimePage.attendanceConfigurationdropdownClick();
        softAssert.assertTrue(TimePage.time_ReportButtonVerify());
        TimePage.time_ReportButtonClick();
        softAssert.assertTrue(TimePage.reportProjectdropdownVerify());
        //TimePage.reportProjectdropdownClick();
        softAssert.assertTrue(TimePage.reportEmployeedropdownVerify());
        //TimePage.reportEmployeedropdownClick();
        softAssert.assertTrue(TimePage.reporyAttendanceSummeryReportdropdownVerify());
        //TimePage.reporyAttendanceSummeryReportdropdownClick();
        softAssert.assertTrue(TimePage.time_projectInfoButtonVerify());
        TimePage.time_projectInfoButtonClick();
        softAssert.assertTrue(TimePage.projectInfoCustomerInfodropdownVerify());
        //TimePage.projectInfoCustomerInfodropdownClick();
        softAssert.assertTrue(TimePage.projectInfodropdownVerify());
        //TimePage.projectInfodropdownClick();
        extentTest.log(LogStatus.PASS, "Time page verification success");


    }
}
