package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

/**
 * @Author Jeyapriya
 */
public class AttendanceRecordPage extends PageBase {
    private static By hdrAttendanceRecord=By.xpath("//*[@id=\"content\"]/div[1]/div[1]");
    private static By txtEmployeeName=By.id("attendance_employeeName_empName");
    private static By txtDate=By.id("attendance_date");
    private static By btnView=By.id("btView");
    private static By selectDate=By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a");
    private static By txtSelectMonth=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]");
    private static By txtSelectyear=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]");
    private static By btnNextMonth=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span");
    private static By btnPreviousMonth=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span");
    private static By result=By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[1]");


    public static boolean isAttendanceRecordDisplayed(){
        return getDriver().findElement(hdrAttendanceRecord).isDisplayed();
    }
    public static void setEmployeeName(String employeeName){
        getDriver().findElement(txtEmployeeName).sendKeys(employeeName, Keys.TAB);
    }
    public static void setDate1(){
        getDriver().findElement(txtDate).click();
        getDriver().findElement(selectDate).click();
    }
    public static void setDate2(){
        getDriver().findElement(txtDate).click();
        Select dropDownOption = new Select(getDriver().findElement(txtSelectMonth));
        dropDownOption.selectByVisibleText("Sep");
        getDriver().findElement(selectDate).click();
    }
    public static void setDate3(){
        getDriver().findElement(txtDate).click();
        Select dropDownOption = new Select(getDriver().findElement(txtSelectyear));
        dropDownOption.selectByVisibleText("2012");
        getDriver().findElement(selectDate).click();
    }
    public static void setDate4(){
        getDriver().findElement(txtDate).click();
        getDriver().findElement(btnNextMonth).click();
        getDriver().findElement(selectDate).click();
    }
    public static void setDate5(){
        getDriver().findElement(txtDate).click();
        getDriver().findElement(btnPreviousMonth).click();
        getDriver().findElement(selectDate).click();
    }

    public static void clickView(){
        getDriver().findElement(btnView).click();
    }
    public static void viewAttendanceRecord(String employeeName){
        AttendanceRecordPage.setEmployeeName(employeeName);
        AttendanceRecordPage.setDate1();
        AttendanceRecordPage.clickView();
    }
    public static void viewAttendanceRecord1WithChangeMonth(String employeeName){
        AttendanceRecordPage.setEmployeeName(employeeName);
        AttendanceRecordPage.setDate2();
        AttendanceRecordPage.clickView();
    }
    public static void viewAttendanceRecord1WithChangeYear(String employeeName){
        AttendanceRecordPage.setEmployeeName(employeeName);
        AttendanceRecordPage.setDate3();
        AttendanceRecordPage.clickView();
    }
    public static void viewAttendanceRecord1WithChangeNextMonth(String employeeName){
        AttendanceRecordPage.setEmployeeName(employeeName);
        AttendanceRecordPage.setDate4();
        AttendanceRecordPage.clickView();
    }
    public static void viewAttendanceRecord1WithChangePreviousMonth(String employeeName){
        AttendanceRecordPage.setEmployeeName(employeeName);
        AttendanceRecordPage.setDate5();
        AttendanceRecordPage.clickView();
    }
    public static boolean isResultDisplay(){
        return getDriver().findElement(result).isDisplayed();
    }
}
