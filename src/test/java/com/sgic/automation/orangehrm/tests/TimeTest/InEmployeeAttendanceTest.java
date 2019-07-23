package com.sgic.automation.orangehrm.tests.TimeTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.LoginData;
import com.sgic.automation.orangehrm.pages.*;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;

public class InEmployeeAttendanceTest extends TestBase {

    @Test(priority = 10, groups = "REGRESSION", dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
    public void addEmployee(String username, String password)  {

        LoginPage.login(username, password);
        extentTest = extentReport.startTest("Create user ");
        extentTest.log(LogStatus.PASS, "username = " + username + " password =" + password);
        PIMPage.clickPIM();
        softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");
        EmployeeListPage.clickEmployeeList();
        EmployeeListPage.clickAddBtn();
        EmployeeListPage.typeFirstName("Thusy");
        EmployeeListPage.typeLastName("Gunam");
        EmployeeListPage.photoUpload("profile-blank-female.png");
        EmployeeListPage.clickCreateLogin();
        EmployeeListPage.typeUserName("thusya");
        EmployeeListPage.typePassword("thusya1234");
        EmployeeListPage.confirmPassword("thusya1234");
        EmployeeListPage.setDropDownOption("Enabled");
        softAssert.assertEquals(EmployeeListPage.getSelectedOption(), "Disabled",
                "DropDown value is incorrect");
        EmployeeListPage.clicSaveBtn();
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgEmpName,Constants.OrgEmpPassword);
        softAssert.assertTrue(EmployeeAttendanceInOut.employeeTimeBtnDisplay());
        EmployeeAttendanceInOut.employeenameTimeBtnClick();
        EmployeeAttendanceInOut.employeeAttendanceBtnClick();
        EmployeeAttendanceInOut.employeeAttendanceInOutClick();
        EmployeeAttendanceInOut.employeeAttendanceInBtnClick();
        EmployeeAttendanceInOut.implicitWait(5);
        EmployeeAttendanceInOut.employeeAttendanceOutBtnClick();

    }

}