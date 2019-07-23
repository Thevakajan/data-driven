package com.sgic.automation.orangehrm.tests.LeaveTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.LeaveTypeData;
import com.sgic.automation.orangehrm.pages.LeavePeriod;
import com.sgic.automation.orangehrm.pages.LeaveTypes;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class AddLeaveType extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddLeaveType.class);


    //Add New Leave type
        @Test( priority = 8,groups = "LEAVE",dataProviderClass = LeaveTypeData.class,dataProvider = "LeaveType",testName = "Leave Entitlements and Usage Report")
        public void addLeaveType(String LeaveTypeName){
            extentTest=extentReport.startTest("Add Leave Type");
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
            softAssert.assertTrue(LeaveTypes.isLeaveTypeHeaderDisplay(),"Add Leave Type");
            LeaveTypes.clickLeaveTypeBtnAdd();
            LOGGER.info("Add button Clicked");
            LeaveTypes.AddLeaveType(LeaveTypeName);
            LOGGER.info("Add Leave Type Name Entered");
            LeaveTypes.clickLeaveTypeAddSave();
            LOGGER.info("Save button Clicked");
            extentTest.log(LogStatus.PASS, "Leave Type Sucessfully Edited");
            extentReport.endTest(extentTest);
            softAssert.assertAll();
        }

}
