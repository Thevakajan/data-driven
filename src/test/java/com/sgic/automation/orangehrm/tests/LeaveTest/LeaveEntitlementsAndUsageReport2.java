package com.sgic.automation.orangehrm.tests.LeaveTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.ReportData;
import com.sgic.automation.orangehrm.pages.LeaveEntitlementsAndUsageReport;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LeaveEntitlementsAndUsageReport2  extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(LeaveEntitlementsAndUsageReport2.class);

    //Leave Entitlements and Usage Report
    @Test(priority = 6,groups = "LEAVE",dataProviderClass = ReportData.class, dataProvider = "UsageReport_2", testName = "Leave Entitlements and Usage Report")
    public void LeaveEntitlementsAndUsageReport2(String leaveBalance, String employeeName , String periodFrom) {
        extentTest = extentReport.startTest("Leave Entitlements And Usage Report-2");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeaveEntitlementsAndUsageReport.clickMenuLeave();
        LOGGER.info("Leave Menu clicked");
        LeaveEntitlementsAndUsageReport.clickReports();
        LOGGER.info("Report Menu Clicked");
        LeaveEntitlementsAndUsageReport.clickmenuLeaveEntitlementsAndUsageReport();
        LOGGER.info("LeaveEntitlementsAndUsageReport Menu Clicked");
        softAssert.assertTrue(LeaveEntitlementsAndUsageReport.isleaveEntitlementsAndUsageReportDisplay(), "Leave Entitlement and Usage Report");
        LOGGER.info("LeaveEntitlementsAndUsageReport page verified");
        LeaveEntitlementsAndUsageReport. ReportData_Employee(leaveBalance,employeeName, periodFrom);
        LeaveEntitlementsAndUsageReport.clickleaveBalanceViewBtn();
        LOGGER.info("View Button is clicked");
        extentTest.log(LogStatus.PASS, "Leave Entitlement Usage Report Sucessfully Generated");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
