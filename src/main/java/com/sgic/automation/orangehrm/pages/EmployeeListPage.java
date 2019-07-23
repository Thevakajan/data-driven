package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import java.io.File;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class EmployeeListPage extends PageBase {
  private static final Logger LOGGER = Logger.getLogger(EmployeeListPage.class);
  private static By employeeList=By.id("menu_pim_viewEmployeeList");
  private static By employeeListHeading=By.xpath("//*[@id=\"employee-information\"]/a");
  private static By searchByName=By.id("empsearch_employee_name_empName");
  private static By searchById=By.id("empsearch_id");
  private static By searchByEmploymentStatus=By.id("empsearch_employee_status");
  private static By searchByInclude=By.id("empsearch_termination");
  private static By searchBySupervisorName=By.id("empsearch_supervisor_name");
  private static By searchByJobTitle=By.id("empsearch_job_title");
  private static By searchBySubUnit=By.id("empsearch_sub_unit");
  private static By searchBtn=By.id("searchBtn");
  private static By resetBtn=By.id("resetBtn");
  private static By addBtn=By.id("btnAdd");
  private static By firstName=By.id("firstName");
  private static By middleName=By.id("middleName");
  private static By lastName=By.id("lastName");
  private static By employeeId=By.id("employeeId");
  private static By photograph=By.id("photofile");
  private static By createLogin=By.id("chkLogin");
  private static By userName=By.id("user_name");
  private static By password=By.id("user_password");
  private static By confirmPassword=By.id("re_password");
  private static By status=By.id("status");
  private static By saveBtn=By.id("btnSave");
  private static By select=By.id("ohrmList_chkSelectRecord_89");
  private static By deleteBtn=By.id("btnDelete");
  private static By okBtnForDelete=By.id("dialogDeleteBtn");
  private static By confirmationMessage=By.xpath("//*[@id=\"frmList_ohrmListComponent\"]/script");
  private static By checkSearchName=By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[3]/a");
  private static By ConfirmUserCreate=By.xpath("//*[@id=\"pdMainContainer\"]/div[1]/h1");


  public static void clickEmployeeList(){

    getDriver().findElement(employeeList).click();
    LOGGER.info("Employee List page clicked");
  }
  public static boolean isEmployeeListDisplayes(){
    return getDriver().findElement(employeeListHeading).isDisplayed();
  }


  public static void typeSearchName(String name){
    getDriver().findElement(searchByName).sendKeys(name);

    LOGGER.info("Search by name");
  }

  public static void typeSearchId( int id){

    getDriver().findElement(searchById).sendKeys();
  }
  public static void typeSearchEmploymentStatus(String status){
    getDriver().findElement(searchByEmploymentStatus).sendKeys(status);
    LOGGER.info("Search by id ");
  }
  public static void typeSearchInclude(String include){
    getDriver().findElement(searchByInclude).sendKeys(include);
    LOGGER.info("Search by include");
  }
  public static void typeSearchSupervisorName(String supervisorName){
    getDriver().findElement(searchBySupervisorName).sendKeys(supervisorName);
    LOGGER.info("Search by supervisor name");
  }
  public static void typeSearchJobTitle(String jobTitle){
    getDriver().findElement(searchByJobTitle).sendKeys(jobTitle);
    LOGGER.info("Search by job title");
  }
  public static void typeSearchSubUnit(String subUnit){
    getDriver().findElement(searchBySubUnit).sendKeys(subUnit);
    LOGGER.info("Search by sub unit");
  }
  public static void clickSearchBtn(){

    getDriver().findElement(searchBtn).click();
    LOGGER.info("Search button clicked");
  }
  public static void clickResetBtn(){

    getDriver().findElement(resetBtn).click();
    LOGGER.info("Reset button clicked");
  }
  public static void clickCreateLogin(){

    getDriver().findElement(createLogin).click();
    LOGGER.info("Create login clicked");
  }

  public static void typeFirstName(String fName){
    getDriver().findElement(firstName).sendKeys(fName);
    LOGGER.info("First Name");
  }
  public static void typeMiddleName(String mName){
    getDriver().findElement(middleName).sendKeys(mName);
    LOGGER.info("Middle Name");
  }
  public static void typeLastName(String lName){
    getDriver().findElement(lastName).sendKeys(lName);
    LOGGER.info("Last name");
  }
  public static void typeEmployeeId(int id){

    getDriver().findElement(employeeId).sendKeys();
    LOGGER.info("Employee id");
  }
  public static void photoUpload(String fileName){
    getDriver().findElement(photograph).sendKeys(PageBase.uploadFilepath+ File.separator+ fileName);
    LOGGER.info("photo uploaded");
  }
  public static void clickAddBtn(){

    getDriver().findElement(addBtn).click();
    LOGGER.info("Add button clicked");
  }


  public static void typeUserName(String uName){
    getDriver().findElement(userName).sendKeys(uName);
    LOGGER.info("UserName");
  }
  public static void typePassword(String userPassword){
    getDriver().findElement(password).sendKeys(userPassword);
    LOGGER.info("password");
  }
  public static void confirmPassword(String userPassword){
    getDriver().findElement(confirmPassword).sendKeys(userPassword);
    LOGGER.info("confirm password");
  }
//  public static void typeStatus(String userStatus){
//    getDriver().findElement(status).sendKeys(userStatus);
//    LOGGER.info("Status");
//  }

  public static boolean isDropDownDisplayed() {
    return getDriver().findElement(status).isDisplayed();
  }

  public static String getSelectedOption() {
    Select dropDownOption = new Select(getDriver().findElement(status));
    return dropDownOption.getFirstSelectedOption().getText();
  }

  public static void setDropDownOption(String option) {
    Select dropDownOption = new Select(getDriver().findElement(status));
    dropDownOption.selectByVisibleText(option);
  }

  public static void clicSaveBtn(){

    getDriver().findElement(saveBtn).click();
    LOGGER.info("Save button clicked");
  }
  public static void clickSelectBtn(){

    getDriver().findElement(select).click();
    LOGGER.info("Select button clicked");
  }
  public static void clickDeleteBtn(){

    getDriver().findElement(deleteBtn).click();
    LOGGER.info("Delete clicked");
  }
  public static void clickOkBtn(){

    getDriver().findElement(okBtnForDelete).click();
    LOGGER.info(" ok button clicked");
  }

  public static boolean isConfirmationMessageDisplayed(){
    return getDriver().findElement(confirmationMessage).isDisplayed();
  }

  public static boolean isSearchNameDisplayed(){
    return getDriver().findElement(checkSearchName).isDisplayed();
  }

  public static boolean isUserDisplayed(){
    return getDriver().findElement(ConfirmUserCreate).isDisplayed();
  }


}
