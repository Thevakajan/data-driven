package com.sgic.automation.orangehrm.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/**
 * @Author Jeyapriya
 */
public class DatePicker {
    private static final Logger LOGGER = Logger.getLogger(PerformancePage.class);

//start date
    private static By txtstartDate = By.id("saveReview360Form_workPeriodStartDate");
    private static By selectStartDate=By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[3]/a");
    private static By selectMonth=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]");
    private static By selectYear=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]");
//end date
    private static By txtendDate = By.id("saveReview360Form_workPeriodEndDate");
    private static By selectEndDate=By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[7]/a");
//due date
    private static By txtdueDate = By.id("saveReview360Form_dueDate");
    private static By selectDueDate=By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]/a");


}
