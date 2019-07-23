package com.sgic.automation.orangehrm.tests.LeaveTest;

import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;

public class AssignLeaveCancel extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AssignLeaveCancel.class);


    //    @Test( priority = 18,groups = "REGRESSION",dataProviderClass = AssignLeaveData.class,dataProvider = "AssignLeaveFullDay",testName = "Assign New Leave Cancel")
//    public void AssignLeaveCancel(String employeeName, String leaveType,String fromDate,String toDate,String specificDuration,String comment) {
//        extentTest=extentReport.startTest("Assign Leave Cancel");
//        LOGGER.info("Login page is displayed");
//        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
//        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
//        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
//        LOGGER.info("DashBoardPage is displayed");
//        LeavePeriod.clickLeaveModule();
//        LOGGER.info("Leave Menu Clicked");
//        AssignLeave.clickMenuAssignLeave();
//        LOGGER.info("Assign Leave Menu Clicked");
//        softAssert.assertTrue(AssignLeave.isAssignLeaveHeaderDisplayed(), "Assign Leave Not Displayed");
//        AssignLeave.AssignFullDayLeaveData(employeeName,leaveType,fromDate,toDate,specificDuration,comment);
//        AssignLeave.clickAssignBtn();
//        LOGGER.info("Assign Button Clicked");
//        PageBase.implicitWait(3);
//        softAssert.assertTrue(AssignLeave.isConfirmationPopoupDisplayed(),"Assign Leave Confiramation message is not Displyed");
//        LOGGER.info("Confiramation Message is Verified");
//        AssignLeave.clickCancelbtn();
//        LOGGER.info("Cancel Button Clicked");
//        extentTest.log(LogStatus.PASS, "Leave Assigned has Sucessfully  Cancelled");
//        extentReport.endTest(extentTest);
//        softAssert.assertAll();
//    }

}
