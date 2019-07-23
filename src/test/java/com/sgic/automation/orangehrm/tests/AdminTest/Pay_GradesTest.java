package com.sgic.automation.orangehrm.tests.AdminTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.AdminMenuPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.Pay_Grades;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Pay_GradesTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(Pay_GradesTest.class);
        @Test(groups = "REGRESSION", priority = 9)
        public void SavePay_GradesTest() {
            softAssert = new SoftAssert();
            LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
            LOGGER.info("DashBoardPage is displayed");
            extentTest=extentReport.startTest("Pay_Grades Page");
            AdminMenuPage.clickAdmin();
            AdminMenuPage.clickJobMenu();
            AdminMenuPage.clickJPayGrades();
            softAssert.assertTrue(Pay_Grades.isDisplayTitleHeader(), "PayGrades Page Title is not Displayed");
            Pay_Grades.ClickAddButton();
            Pay_Grades.setname(Constants.OrgUserName);
            Pay_Grades.ClickButtonSave();
            extentTest.log(LogStatus.PASS, " OrangeHRM Pay_Grades Add Success: ");
            extentReport.endTest(extentTest);
            softAssert.assertAll();
        }

    }

