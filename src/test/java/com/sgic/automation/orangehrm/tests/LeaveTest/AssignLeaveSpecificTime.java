package com.sgic.automation.orangehrm.tests.LeaveTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.AssignLeaveData;
import com.sgic.automation.orangehrm.pages.AssignLeave;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LeavePeriod;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class AssignLeaveSpecificTime extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AssignLeaveSpecificTime.class);

    @Test( priority = 17,groups = "LEAVE",dataProviderClass = AssignLeaveData.class,dataProvider = "AssignLeaveSpecificTime",testName = "Assign New Leave for a Specific Time Period")
    public void AssignLeaveSpecificTime(String employeeName, String leaveType,String fromDate,String toDate,String specificDuration,String specifictimeFrom,String specifictimeTo,String comment) {
        extentTest=extentReport.startTest("Assign Leave");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        LeavePeriod.clickLeaveModule();
        LOGGER.info("Leave Menu Clicked");
        AssignLeave.clickMenuAssignLeave();
        LOGGER.info("Assign Leave Menu Clicked");
        softAssert.assertTrue(AssignLeave.isAssignLeaveHeaderDisplayed(), "Assign Leave Not Displayed");
        AssignLeave.AssignLeaveSpecificTimeData(employeeName,leaveType,fromDate,toDate,specificDuration,specifictimeFrom,specifictimeTo,comment);
        //  AssignLeave.clickAssignBtn();
        LOGGER.info("Assign button is Clicked");
//        softAssert.assertTrue(AssignLeave.isConfirmationPopoupDisplayed());
//        LOGGER.info("Assign Leave confirmation message Displyed");
//        AssignLeave.clickOkbtn();
//        LOGGER.info("Ok button Clicked");
        extentTest.log(LogStatus.PASS, "Leave has Sucessfully Assigned");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
