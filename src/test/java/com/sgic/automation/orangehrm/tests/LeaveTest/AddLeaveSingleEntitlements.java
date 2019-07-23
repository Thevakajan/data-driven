package com.sgic.automation.orangehrm.tests.LeaveTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.AssignLeaveData;
import com.sgic.automation.orangehrm.TestData.EntitlementsData;
import com.sgic.automation.orangehrm.pages.*;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.PageBase;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class AddLeaveSingleEntitlements  extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(AddLeaveSingleEntitlements.class);

    //Add Single Entitlement
    @Test(priority = 1,groups = "LEAVE",dataProviderClass = EntitlementsData.class,dataProvider = "AddSingleEntitlements",testName = "Add Leave Single Entitlements")
    public void addLeaveSingleEntitlement(String txtEmpName, String LeaveType,String LeavePeriod,String txtEntitlement){
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest("Add Leave Single Entitlements");
        AddLeaveEntitlement.clickMenuLeave();
        LOGGER.info("Leave page is displayed");
        AddLeaveEntitlement.clickMenuEntitlements();
        AddLeaveEntitlement.clickAddEntitlements();
        LOGGER.info("Add Leave Entitlement page is displayed");
        softAssert.assertTrue(AddLeaveEntitlement.isAddLeaveEntitlementHeaderDisplay(),"Add Leave Entitlements not displayed");
        PageBase.staticWait(5);
        AddLeaveEntitlement.AddSingleEntitlementsData(txtEmpName,LeaveType,LeavePeriod,txtEntitlement);
        AddLeaveEntitlement.clickBtnSave();
        LOGGER.info("Add Leave Entitlement is Saved");
        extentTest.log(LogStatus.PASS, "Leave Single Entitlement Sucessfully Added");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

}
