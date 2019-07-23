package com.sgic.automation.orangehrm.pages;


import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class Edit_Work_Shift extends PageBase {
    private  static final Logger LOGGER = Logger.getLogger(Edit_Work_Shift.class);
    private static By JobWork_shift_Header = By.xpath("//h1");
    private static By AddButton = By.id("btnAdd");
    private static By Shift_Name = By.id("workShift_name");
    private static By Frome_Time = By.id("workShift_workHours_from");
    private static By To_Time = By.id("workShift_workHours_to");
    private static By Available_Employees = By.id("workShift_availableEmp");
    private static By Add_Employees = By.id("btnAssignEmployee");
    private static By Save= By.id("btnSave");
    private static By Edit= By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/a");


    public static boolean isJobWork_shift_HeaderHeaderDisplay(){
        return getDriver().findElement(JobWork_shift_Header).isDisplayed();
    }
    public static void clickAddButton() {

        getDriver().findElement(AddButton).click();
    }
    public static void clickAdd_Employee() {

        getDriver().findElement(Add_Employees).click();
    }
    public static void clickSave() {

        getDriver().findElement(Save).click();
    }
    public static void clickGenderlEdit() {

        getDriver().findElement(Edit).click();
    }

    public static void setShift_name(String txtShift_Name) {
        getDriver().findElement(Shift_Name).clear();
        getDriver().findElement(Shift_Name).sendKeys(txtShift_Name);
        LOGGER.info("Typeing Shift_Name");
    }
    public static void setFrome_time(String txtftime) {

        getDriver().findElement(Frome_Time).sendKeys(txtftime);
        LOGGER.info("Typeing Frome Time");
    }
    public static void setTo_Time(String txtTo_Time) {

        getDriver().findElement(To_Time).sendKeys(txtTo_Time);
        LOGGER.info("Typeing End Time");
    }
    public static void setAvilable_Employee(String txtA_Employee) {

        getDriver().findElement(Available_Employees).sendKeys(txtA_Employee);
        LOGGER.info("Typeing Frome Time");
    }

    public static void Edit_Work_Shift(String name, String ftime, String ttime, String aemployee){
        Edit_Work_Shift.clickGenderlEdit();
        implicitWait(3);
        Edit_Work_Shift.isJobWork_shift_HeaderHeaderDisplay();
        LOGGER.info("Show Is Work Shift Edit Header");
        Edit_Work_Shift.setShift_name(name);
        LOGGER.info("Edit Is Shift Name");
        Edit_Work_Shift.setFrome_time(ftime);
        LOGGER.info("Edit Is Frome Time");
        Edit_Work_Shift.setTo_Time(ttime);
        LOGGER.info("Edit Is End Time");
        Edit_Work_Shift.setAvilable_Employee(aemployee);
        LOGGER.info("Edit Is Avalabil Employee");
        Edit_Work_Shift.clickAdd_Employee();
        LOGGER.info("Edit Is Avalabil Button Employee");
        Edit_Work_Shift.clickSave();
        LOGGER.info("Edit Is Save Button Employee");
    }


}
