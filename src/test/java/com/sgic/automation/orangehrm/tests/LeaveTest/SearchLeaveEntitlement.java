package com.sgic.automation.orangehrm.tests.LeaveTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.EntitlementsData;
import com.sgic.automation.orangehrm.pages.AddLeaveEntitlement;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.SearchLeaveEntitlements;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class SearchLeaveEntitlement extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(SearchLeaveEntitlement.class);

    // Search Entitlement
    @Test( priority = 3,groups = "LEAVE",dataProviderClass = EntitlementsData.class,dataProvider = "SearchEntitlements",testName = "Search Leave Entitlements")
    public void searchLeaveEntitlement(String employeeName,String leaveType, String leavePeriod) {
        extentTest=extentReport.startTest("Search Leave Entitlements");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("Login Sucessfully");
        LOGGER.info("DashBoardPage is displayed");
        AddLeaveEntitlement.clickMenuLeave();
        LOGGER.info("Leave Menu Clicked");
        AddLeaveEntitlement.clickMenuEntitlements();
        LOGGER.info("Entitlements Menu clicked");
        SearchLeaveEntitlements.clickViewLeaveEntitlements();
        LOGGER.info("View Entitlements Menu clicked");
        softAssert.assertTrue(SearchLeaveEntitlements.isSearchLeaveEntitlementHeaderDisplay(),"Add Leave Search Entitlement");
        SearchLeaveEntitlements.SearchEntitlementsData(employeeName,leaveType,leavePeriod);
        SearchLeaveEntitlements.clickBtnSearch();
        LOGGER.info("Leave Entitlements search button clicked");
        extentTest.log(LogStatus.PASS, "Leave Entitlement Sucessfully Searched");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
