package com.sgic.automation.orangehrm.tests.performance;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.PerformanceTestData;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.EditPerformanceReviewPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.ManageReviewsPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
/**test for performance functionality
 * @Author Jeyapriya
 */
public class EditPerformanceReview extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(EditPerformanceReview.class);
    /**
     * testcase:edit PerformanceReview with these parameters
     * @param startDate
     * @param endDate
     * @param dueDate
     */
    @Test(groups = "PERFORMANCE",priority = 11,dataProviderClass = PerformanceTestData.class,
            dataProvider = "editPerformanceReview",testName = "Edit PerformanceReview ")
    public  void editPerformanceReview(String startDate,String endDate,String dueDate){
        extentTest=extentReport.startTest("edit Performance Review");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        extentTest.log(LogStatus.PASS, "Login page is displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+"  Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        extentTest.log(LogStatus.PASS, "Login success");
        LOGGER.info("DashBoardPage is displayed");
        extentTest.log(LogStatus.PASS, "Dashboard page is displayed");        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        DashBoardPage.clickPerfomance();
        DashBoardPage.clickManageReviewbtn();
        DashBoardPage.clickManageReviewsbtn();
        LOGGER.info(" manage review page is display");
        extentTest.log(LogStatus.PASS, "Manage Review page is displayed");
        softAssert.assertTrue(ManageReviewsPage.isReviewsPageDisplayed() ,"ManageReviewsPage   is not Displayed");
        ManageReviewsPage.clickEditButton();
        LOGGER.info("edit ManageReviews with startDate change to: "+
                startDate+", endDate change to "+endDate+", dueDate change to:"+dueDate);
        EditPerformanceReviewPage.editPerformanceReview(startDate,endDate,dueDate);
        extentTest.log(LogStatus.PASS, "edit Performance review ");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        LOGGER.info("logout success");
        extentTest.log(LogStatus.PASS, "logout success");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }

}
