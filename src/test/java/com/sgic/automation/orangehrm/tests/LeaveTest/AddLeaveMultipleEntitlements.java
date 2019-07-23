package com.sgic.automation.orangehrm.tests.LeaveTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.AssignLeaveData;
import com.sgic.automation.orangehrm.TestData.EntitlementsData;
import com.sgic.automation.orangehrm.pages.*;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import static com.sgic.automation.orangehrm.utils.TestBase.extentReport;

public class AddLeaveMultipleEntitlements extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(AddLeaveMultipleEntitlements.class);

        @Test( priority = 2,groups = "LEAVE",dataProviderClass = EntitlementsData.class,dataProvider = "AddMultipeEntitlements",testName = "Add Leave Multiple Entitlements")
        public void addLeaveMultipleEntitlement(String filtersLocation,String filtersSubunit, String LeaveType,String LeavePeriod,String txtEntitlement){
            extentTest=extentReport.startTest("Add Leave Multiple Entitlements");
            LOGGER.info("Login page is displayed");
            softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
            LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
            LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
            LOGGER.info("DashBoardPage is displayed");
            AddLeaveEntitlement.clickMenuLeave();
            LOGGER.info("Leave page is displayed");
            AddLeaveEntitlement.clickMenuEntitlements();
            LOGGER.info("Leave Entitlements Menu clicked");
            AddLeaveEntitlement.clickAddEntitlements();
            LOGGER.info("Add Entitlements Menu clicked");
            softAssert.assertTrue(AddLeaveEntitlement.isAddLeaveEntitlementHeaderDisplay(), "Add Leave Multiple Entitlement");
            AddLeaveEntitlement.AddMultipleEntitlementsData(filtersLocation,filtersSubunit,LeaveType,LeavePeriod,txtEntitlement);
            AddLeaveEntitlement.clickBtnSave();
            LOGGER.info("Add Entitlements Saved");
            extentTest.log(LogStatus.PASS, "Leave Multiple Entitlement Sucessfully Added");
            extentReport.endTest(extentTest);
            softAssert.assertAll();
        }
}
