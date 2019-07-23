package com.sgic.automation.orangehrm.tests.performance;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.PerformanceTestData;
import com.sgic.automation.orangehrm.pages.AddPerformanceReviewPage;
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
public class AddPerformanceReview extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddPerformanceReview.class);
    /**
     *test case:add PerformanceReview
     * @param employeeName:Linda Anderson
     * @param supervisorName:John Smith
     * @param startDate:2018-02-02
     * @param endDate:2019-01-01
     * @param dueDate:2018-12-12
     */
    @Test(groups = "PERFORMANCE",priority = 8,dataProviderClass = PerformanceTestData.class,
            dataProvider = "addPerformanceReview",testName = "Add PerformanceReview")
    public  void addPerformanceReview(String employeeName,String supervisorName,
                                      String startDate,String endDate,String dueDate){
        extentTest=extentReport.startTest("Add Performance Review");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        extentTest.log(LogStatus.PASS, "Login page is displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+"  Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        extentTest.log(LogStatus.PASS, "Login success");
        LOGGER.info("DashBoardPage is displayed");
        extentTest.log(LogStatus.PASS, "Dashboard page is displayed");        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        DashBoardPage.clickManageReviewbtn();
        DashBoardPage.clickManageReviewsbtn();
        LOGGER.info("ManageReviews Page is displayed");
        extentTest.log(LogStatus.PASS, "Manage Review page is displayed");
        softAssert.assertTrue(ManageReviewsPage.isReviewsPageDisplayed() ,"ManageReviewsPage   is not Displayed");
        ManageReviewsPage.clickAddbtn();
        LOGGER.info("Add ManageReviews Page is displayed");
        softAssert.assertTrue(AddPerformanceReviewPage.isAddReviewDisplayes() ,"Add review page  is not Displayed");
        LOGGER.info("add PerformanceReviews with employeeName: "+employeeName+", supervisorName: "+supervisorName+", startDate: "+
                startDate+", endDate "+endDate+", dueDate :"+dueDate);
        AddPerformanceReviewPage.addPerformanceReview(employeeName,supervisorName,startDate,endDate,dueDate);
        softAssert.assertTrue(AddPerformanceReviewPage.isSavebtnisplayed(),"save button not found");
        AddPerformanceReviewPage.clickSaveBtn();
        softAssert.assertTrue(ManageReviewsPage.isresultDisplayed(), "result is not Displayed");
        extentTest.log(LogStatus.PASS, "add PerformanceReviews with employeeName: "+employeeName+", supervisorName: "+supervisorName+", startDate: "+
                startDate+", endDate "+endDate+", dueDate :"+dueDate);
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        LOGGER.info("logout success");
        extentTest.log(LogStatus.PASS, "logout success");
        softAssert.assertAll();
        extentReport.endTest(extentTest);

    }
}
