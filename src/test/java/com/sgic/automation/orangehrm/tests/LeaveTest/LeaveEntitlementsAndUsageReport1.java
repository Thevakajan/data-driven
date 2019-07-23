package com.sgic.automation.orangehrm.tests.LeaveTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.ReportData;
import com.sgic.automation.orangehrm.pages.LeaveEntitlementsAndUsageReport;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.PageBase;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LeaveEntitlementsAndUsageReport1 extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(LeaveEntitlementsAndUsageReport1.class);


    //Leave Entitlements and Usage Report
    @Test(priority = 5,groups = "LEAVE",dataProviderClass = ReportData.class, dataProvider = "UsageReport_1")
    public void LeaveEntitlementsAndUsageReport1(String leaveBalance, String leaveType, String leavePeriod, String leaveJobTitle, String leaveBalanceLocation, String leaveBalanceSubUnit) {
        extentTest = extentReport.startTest("Leave Entitlements And Usage Report-1");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login page is displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeaveEntitlementsAndUsageReport.clickMenuLeave();
        LOGGER.info("Leave Menu Clicked");
        LeaveEntitlementsAndUsageReport.clickReports();
        LOGGER.info("Report Menu Clicked");
        LeaveEntitlementsAndUsageReport.clickmenuLeaveEntitlementsAndUsageReport();
        LOGGER.info("LeaveEntitlementsAndUsageReport Menu Clicked");
        PageBase.staticWait(2);
        softAssert.assertTrue(LeaveEntitlementsAndUsageReport.isleaveEntitlementsAndUsageReportDisplay(), "Leave Entitlement and Usage Report");
        LOGGER.info("LeaveEntitlementsAndUsageReport Page is Verified");
        LeaveEntitlementsAndUsageReport.ReportData_LeaveType(leaveBalance, leaveType, leavePeriod, leaveJobTitle, leaveBalanceLocation, leaveBalanceSubUnit);
        LeaveEntitlementsAndUsageReport.clickleaveBalanceViewBtn();
        LOGGER.info("Leave Balance view button clicked");
        extentTest.log(LogStatus.PASS, " Report Sucessfully Generated");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
