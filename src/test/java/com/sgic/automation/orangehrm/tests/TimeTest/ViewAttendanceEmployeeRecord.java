package com.sgic.automation.orangehrm.tests.TimeTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.AttendanceEmployeeRecord;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.TimePage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;

public class ViewAttendanceEmployeeRecord extends TestBase {
    /**
     * Time_Attendance test
     */
    @Test(priority = 14,groups = "REGRESSION", testName = "TimePageAttendanceTest")
    public void TimePageAttendanceTest() {
        extentTest =extentReport.startTest("TimePage_Attendance Test");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(TimePage.timeButtonVerify());
        TimePage.timeBtnClick();
        softAssert.assertTrue(TimePage.time_attendanceButtonVerify());
        TimePage.time_attendanceButtonClick();
        softAssert.assertTrue(TimePage.attendanceEmployeeRecorddsropdownVerify());
        TimePage.attendanceEmployeeRecordsropdownClick();
        softAssert.assertTrue(AttendanceEmployeeRecord.employeeNameVerify());
        AttendanceEmployeeRecord.employeenameClear();
        AttendanceEmployeeRecord.employeeName();
        extentTest.log(LogStatus.PASS, "Employee name = "+ "Russel Hamilton");
        softAssert.assertTrue(AttendanceEmployeeRecord.AttendanceEmployeeRecordDateVerify());
        AttendanceEmployeeRecord.AttendanceEmployeeRecordDateClear();
        AttendanceEmployeeRecord.AttendanceEmployeeRecordDate();
        extentTest.log(LogStatus.PASS, "Date = "+ "2019-02-24");
        AttendanceEmployeeRecord.viewButtonClick();
        extentTest.log(LogStatus.PASS, "Attendance details success fully added");


    }

}
