package com.sgic.automation.orangehrm.tests.LeaveTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.LeavePeriod;
import com.sgic.automation.orangehrm.pages.LeaveTypes;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class DeleteLeaveType extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(DeleteLeaveType.class);

    @Test( priority = 9,groups = "LEAVE",testName = "Delete Leave Type")
    public void DeleteLeaveType(){
        extentTest=extentReport.startTest("Delete Leave Type");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeavePeriod.clickLeaveModule();
        LOGGER.info("Leave Menu Clicked");
        LeavePeriod.clickMenuConfigure();
        LOGGER.info("Configure Menu Clicked");
        LeaveTypes.clickMenuLeaveType();
        LOGGER.info("Leave Type Menu Clicked");
        softAssert.assertTrue(LeaveTypes.isLeaveTypeHeaderDisplay(),"Delete Leave Type not Displayed");
        LeaveTypes.clickLeaveTypeCheckbox();
        LOGGER.info("Leave Type Checkbox Clicked");
        LeaveTypes.clickLeaveTypeBtnDelete();
        LOGGER.info("Leave Type Delete Button Clicked");
        softAssert.assertTrue(LeaveTypes.isleaveTypeDeleteConfirmationDisplay(),"Delete Leave Type Confirmation Popup");
        LeaveTypes.clickLeaveTypeDeleteConfirmationOk();
        LOGGER.info("Confirmation Ok Button Clicked");
        extentTest.log(LogStatus.PASS, "Leave Type Sucessfully Deleted");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
