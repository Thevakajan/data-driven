package com.sgic.automation.orangehrm.tests.PIMTest;

import com.sgic.automation.orangehrm.TestData.PIMData;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.PIMPage;
import com.sgic.automation.orangehrm.pages.ReportPage;
import com.sgic.automation.orangehrm.tests.PIMPageTest;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddReportPageTest extends TestBase {
  private static final Logger LOGGER = Logger.getLogger(AddReportPageTest.class);

  /*
  Verify add function in report page
   */
  @Test(priority = 12, dataProvider = "AddReport", dataProviderClass = PIMData.class)
  public void addReportPage(String name, String criteria, String criteriaInclude, String fieldGroup,
      String field) {
    softAssert = new SoftAssert();
    LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);

    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");
    ReportPage.clickReportPage();
    softAssert.assertTrue(ReportPage.isReportPageDisplayed(), "Report page is not displayed");
    ReportPage.clickAddBtn();

    ReportPage.addReportForm(name, criteria, criteriaInclude, fieldGroup, field);

    softAssert.assertAll();


  }


}
