package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
/*
Admin Test Script
Theva Automation
 */
public class AdminPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(AdminPage.class);
    private static By AddAdminHrder = By.xpath("//h1");
    private static By AddBtn = By.id("btnAdd");
    private static By UserRole = By.id("systemUser_userType");
    private static By EmployeeName = By.id("systemUser_employeeName_empName");
    private static By UserNamea = By.id("systemUser_userName");
    private static By Status = By.id("systemUser_status");
    private static By Passwordd = By.id("systemUser_password");
    private static By CPassword = By.id("systemUser_confirmPassword");
    private static By BtnSavea = By.id("btnSave");

    public static boolean isDisplayAddAdmin(){
        return getDriver().findElement(AddAdminHrder).isDisplayed();

    }
    public static void ClickAddButton(){
        getDriver().findElement(AddBtn).click();
        LOGGER.info("Admin_Add_Button_Click*** ");
    }
    public static void setUserRole(String txtUserRole) {
        getDriver().findElement(UserRole).sendKeys(txtUserRole);
        LOGGER.info("Admin_Send_UserRolle*** ");
    }
    public static void setEmployeeName(String txtEmployeeName) {
        getDriver().findElement(EmployeeName).sendKeys(txtEmployeeName);
        LOGGER.info("Admin_Send_EmployeeName***");
    }
    public static void setUUserNamea(String txtUserName) {
        getDriver().findElement(UserNamea).sendKeys(txtUserName);
        LOGGER.info("Admin_Send_Password*** ");
    }
    public static void setStatus(String txtStatus) {
        getDriver().findElement(Status).sendKeys(txtStatus);
        LOGGER.info("Admin_Send_Status*** ");
    }
    public static void setPPasswordd(String txtPassword) {
        getDriver().findElement(Passwordd).sendKeys(txtPassword);
        LOGGER.info("Admin_Send_Password*** ");
    }
    public static void setCPassword(String txtCPassword) {
        getDriver().findElement(CPassword).sendKeys(txtCPassword);
        LOGGER.info("Admin_send_ConformPassword*** ");
    }
    public static void BtnSave() {
        getDriver().findElement(BtnSavea).click();
        LOGGER.info("Admin_Save_Button_Click*** ");
    }

    public static void SaveUser(String UserRole, String EmployeeName, String Username, String Status, String Password, String Cpassword){
        AdminPage.ClickAddButton();
        AdminPage.setUserRole(UserRole);
        AdminPage.setEmployeeName(EmployeeName);
        AdminPage.setUUserNamea(Username);
        AdminPage.setStatus(Status);
        AdminPage.setPPasswordd(Password);
        AdminPage.setCPassword(Cpassword);
        AdminPage.BtnSave();
    }
}
