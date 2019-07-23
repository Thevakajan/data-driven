package com.sgic.automation.orangehrm.tests.TimeTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.AttendanceConfiguration;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.TimePage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;

public class SaveAttendanceConfigurationTest extends TestBase {
    /**
     * Time_Attendance_configuration test
     */
    @Test(priority = 11, groups = "REGRESSION",testName = "TimePageAttendanceConfigurationTest")
    public void TimePageAttendanceCofigurationTest() {
        extentTest =extentReport.startTest("TimePage_Attendance Configuration Test");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(TimePage.timeButtonVerify());
        TimePage.timeBtnClick();
        softAssert.assertTrue(TimePage.time_attendanceButtonVerify());
        TimePage.time_attendanceButtonClick();
        softAssert.assertTrue(TimePage.attendanceConfigurationdropdownVerify());
        TimePage.attendanceConfigurationdropdownClick();
        softAssert.assertTrue(AttendanceConfiguration.attendanceEmployeeInOutVerify());
        AttendanceConfiguration.attendanceEmployeeInOutClick();
        softAssert.assertTrue(AttendanceConfiguration.attendanceEmployeeEditDeleteVerify());
        AttendanceConfiguration.attendanceEmployeeEditDeleteClick();
        softAssert.assertTrue(AttendanceConfiguration.attendanceSupervisorEditDeleteVerify());
        AttendanceConfiguration.attendanceSupervisorEditDeleteClick();
        softAssert.assertTrue(AttendanceConfiguration.saveBtnVerify());
        AttendanceConfiguration.saveBtnClick();
        extentTest.log(LogStatus.PASS, "Successfully save attendance configuration ");


    }


}
