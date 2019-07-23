package com.sgic.automation.orangehrm.tests.LeaveTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.EntitlementsData;
import com.sgic.automation.orangehrm.pages.AddLeaveEntitlement;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.SearchLeaveEntitlements;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.PageBase;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class DeleteLeaveEntitlement extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(DeleteLeaveEntitlement.class);

    //Delete Leave Entitlements
    @Test( priority = 4,groups = "LEAVE",dataProviderClass = EntitlementsData.class,dataProvider = "SearchEntitlements",testName = "Delete Leave Entitlements")
    public void deleteLeaveEntitlement(String employeeName,String leaveType, String leavePeriod){
        extentTest=extentReport.startTest("Delete Leave Entitlement");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        AddLeaveEntitlement.clickMenuLeave();
        LOGGER.info("Leave Menu Clicked");
        AddLeaveEntitlement.clickMenuEntitlements();
        LOGGER.info("Entitlements Menu clicked");
        SearchLeaveEntitlements.clickViewLeaveEntitlements();
        LOGGER.info("View Entitlements Menu clicked");
        softAssert.assertTrue(SearchLeaveEntitlements.isSearchLeaveEntitlementHeaderDisplay(),"Delete Leave Entitlement");
        SearchLeaveEntitlements.SearchEntitlementsData(employeeName,leaveType,leavePeriod);
        SearchLeaveEntitlements.clickBtnSearch();
        LOGGER.info("Leave Entitlements search button clicked");
        extentTest.log(LogStatus.PASS, "Leave Entitlement Sucessfully Searched");
        PageBase.staticWait(5);
        softAssert.assertTrue(SearchLeaveEntitlements.isentitlementListHeaderDisplay(),"Entilement List not Displayed");
        LOGGER.info(" Search Leave Entitlements Results Header Verified");
        SearchLeaveEntitlements.clickCheckBox();
        LOGGER.info("Checkbox is clicked");
        PageBase.staticWait(1);
        SearchLeaveEntitlements.isPopupModelDisplay();
        LOGGER.info("Poup model verified");
        PageBase.staticWait(1);
        SearchLeaveEntitlements.clickBtnOk();
        LOGGER.info("Popup Ok Button Clicked");
        extentTest.log(LogStatus.PASS, "Leave Entitlement Sucessfully Deleted");
        LOGGER.info("Leave Entitlements Sucessfully Deleted ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
