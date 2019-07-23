package com.sgic.automation.orangehrm.tests.AdminTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.AdminMenuPage;
import com.sgic.automation.orangehrm.pages.Employment_Status;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Employment_StatusTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(Employment_StatusTest.class);

        @Test(groups = "REGRESSION", priority = 5)
        public void gEmployee_Satatus_Save() {
            softAssert = new SoftAssert();
            LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
            LOGGER.info("DashBoardPage is displayed");
            extentTest=extentReport.startTest("Employee_Satatus_Save");
            AdminMenuPage.clickAdmin();
            AdminMenuPage.clickJobMenu();
            AdminMenuPage.clickEmployeeStatus();
//        softAssert.assertTrue(Employment_Status.isDisplayEmployee_Status_Header(), "Employment_Status Page Title is not Displayed");
            Employment_Status.ClickAddButton();
            Employment_Status.setEmployment_Status(Constants.Employeename);
            Employment_Status.ClickButtonSave();

            extentTest.log(LogStatus.PASS, " OrangeHRM EmployeeStatus Add Success: ");
            extentReport.endTest(extentTest);
            softAssert.assertAll();

        }


    }

