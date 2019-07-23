package com.sgic.automation.orangehrm.tests.performance;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.ManageReviewsPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
/**test for performance functionality
 * @Author Jeyapriya
 */
public class DeleteAllPerformanceReview extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(DeleteAllPerformanceReview.class);
    /**
     * testcase:delete PerformanceReview
     */
    @Test(groups = "PERFORMANCE",priority = 12,testName = "Delete PerformanceReview")
    public  void deletePerformanceReview(){
        extentTest=extentReport.startTest("delete  Performance Review ");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        extentTest.log(LogStatus.PASS, "Login page is displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+"  Password: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        extentTest.log(LogStatus.PASS, "Login success");
        LOGGER.info("DashBoardPage is displayed");
        extentTest.log(LogStatus.PASS, "Dashboard page is displayed");        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Performance button is not Displayed");
        DashBoardPage.clickPerfomance();
        DashBoardPage.clickManageReviewbtn();
        DashBoardPage.clickManageReviewsbtn();
        LOGGER.info("Manage review page is displayed");
        extentTest.log(LogStatus.PASS, "Manage Review page is displayed");
        softAssert.assertTrue(ManageReviewsPage.isReviewsPageDisplayed() ,"ManageReviewsPage   is not Displayed");
        LOGGER.info("select all trackers details");
        ManageReviewsPage.clickSelectBtn();
        LOGGER.info("delete all trackers details");
        ManageReviewsPage.clickDeleteBtn();
        ManageReviewsPage.clickAlertOk();
        extentTest.log(LogStatus.PASS, "delete Performance review ");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        LOGGER.info("logout success");
        extentTest.log(LogStatus.PASS, "logout success");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }
}
