package com.sgic.automation.orangehrm.tests.AdminTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.ClientData;
import com.sgic.automation.orangehrm.pages.Add_OAuth_Client;
import com.sgic.automation.orangehrm.pages.AdminMenuPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Register_OAuth_Client_Test extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(Register_OAuth_Client_Test.class);
    @Test(groups = "REGRESSION",priority = 10, dataProvider = "Client", dataProviderClass = ClientData.class)
    public void ClientTest(String mailsentas,String PathMail,String TestEmail) {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        AdminMenuPage.clickAdmin();
        AdminMenuPage.ClickMenuConfiguration();
        AdminMenuPage.ClickregisterOAuthClient();
        extentTest=extentReport.startTest("Add OAuth Client");
        Add_OAuth_Client.Client(mailsentas,PathMail,TestEmail);
        extentTest.log(LogStatus.PASS, " OrangeHRM Mail Configuration Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();


    }
}
