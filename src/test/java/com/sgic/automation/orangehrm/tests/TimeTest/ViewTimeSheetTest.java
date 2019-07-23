package com.sgic.automation.orangehrm.tests.TimeTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.TimePage;
import com.sgic.automation.orangehrm.pages.TimeSheetPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;

public class ViewTimeSheetTest extends TestBase {
    /**
     * Time_Time sheet test
     */
    @Test(priority = 9, groups = "REGRESSION", testName = "TimePageTimesheetTest")
    public void TimePageTimesheetTest() {
        extentTest =extentReport.startTest("TimePage_TimeSheet Test");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(TimePage.timeButtonVerify());
        TimePage.timeBtnClick();
        softAssert.assertTrue(TimePage.timesheets_ButtonVerify());
        TimePage.timesheets_ButtonClick();
        softAssert.assertTrue(TimePage.employeeTimesheetsdropdownVerify());
        TimePage.employeeTimesheetsdropdownClick();
        softAssert.assertTrue(TimeSheetPage.employeeNameVerify());
        TimeSheetPage.employeenameClear();
        TimeSheetPage.employeeName();
        extentTest.log(LogStatus.PASS, "Employee name = "+ "Russel Hamilton");
        softAssert.assertTrue(TimeSheetPage.viewButtonVerify());
        TimeSheetPage.viewButtonClick();
        softAssert.assertTrue(TimeSheetPage.addTimesheetButtonVerify());
        TimeSheetPage.addTimesheetButtonClick();
        softAssert.assertTrue(TimeSheetPage.addTimesheetDateVerify());
        TimeSheetPage.addTimesheetDateClear();
        TimeSheetPage.addTimesheetDate();
        extentTest.log(LogStatus.PASS, "Date = "+"2019-02-24");
        TimeSheetPage.addTimesheetButtonClick();
        extentTest.log(LogStatus.PASS, "Time sheet page data success fully added");


    }
}
