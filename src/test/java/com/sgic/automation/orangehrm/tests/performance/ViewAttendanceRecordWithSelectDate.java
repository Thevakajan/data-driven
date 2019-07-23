package com.sgic.automation.orangehrm.tests.performance;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.DatePickerData;
import com.sgic.automation.orangehrm.pages.AttendanceRecordPage;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.TimePage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;
/**
 *  @Author Jeyapriya
 */
public class ViewAttendanceRecordWithSelectDate extends TestBase {
    /**
     * testcase:view attendanceRecord(select one specific date in date picker)
     * @param employeeName
     */
    @Test(groups = "PERFORMANCE",priority = 14,dataProviderClass = DatePickerData.class,
            dataProvider = "AttendanceRecord",
            testName = "view attendanceRecord(select one specific date in date picker)")
    public void attendanceRecordSelectDate(String employeeName){
        extentTest=extentReport.startTest("date picker test with select one data");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.isLoginPageDisplay();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(), "Dashboard Page is not Displayed");
        DashBoardPage.clickTime();
        softAssert.assertTrue(TimePage.isTimeDisplayed(), "Time Page is not Displayed");
        TimePage.clickAttendance();
        TimePage.clickAttendanceRecord();
        AttendanceRecordPage.isAttendanceRecordDisplayed();
        AttendanceRecordPage.viewAttendanceRecord(employeeName);
        extentTest.log(LogStatus.PASS,"view "+employeeName+" attendance record with select specific date ");
        softAssert.assertTrue(AttendanceRecordPage.isResultDisplay(),"result is not display");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
