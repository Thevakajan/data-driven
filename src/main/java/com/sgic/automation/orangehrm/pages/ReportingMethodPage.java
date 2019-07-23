package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class ReportingMethodPage extends PageBase {
  private static final Logger LOGGER = Logger.getLogger(PerformancePage.class);
  private static By reportingMethod=By.id("menu_pim_viewReportingMethods");
  private static By reportingMethodHeading=By.xpath("//*[@id=\"recordsListDiv\"]/div[1]/h1");
  private static By addReportingMethod=By.id("btnAdd");
  //private static By inputName=By.id("reportingMethod_name");
  private static By reportingMethodName=By.id("reportingMethod_name");
  private static By saveBtn=By.id("btnSave");
  private static By addConfirmation=By.xpath("//*[@id=\"recordsListTable\"]/tbody/tr[2]/td[2]/a");

  private static By cancelBtn=By.id("btnCancel");

  private static By selectForDelete=By.xpath("//*[@id=\"recordsListTable\"]/tbody/tr[2]/td[1]/input");

  private static By deleteBtn=By.id("btnDel");
  private static By selectOneReportingMethod=By.xpath("//*[@id=\"recordsListTable\"]/tbody/tr[2]/td[2]/a");

  private static By editReportingName=By.id("reportingMethod_name");
  private static By saveBtnForEdit=By.id("btnSave");
  private static By cancelBtnForEdit=By.id("btnCancel");
  private static By editConfirmation=By.xpath("//*[@id=\"recordsListTable\"]/tbody/tr[1]/td[2]/a");



  public static void reportingMethodPage(){

    getDriver().findElement(reportingMethod).click();
    LOGGER.info("Reporting method page clicked");
  }
  public static boolean isReportingMethodDisplayed(){
    return getDriver().findElement(reportingMethodHeading).isDisplayed();
  }

  public static void addReportingMethodName(){

    getDriver().findElement(addReportingMethod).click();
    LOGGER.info("reporting method name added");
  }

  public static void setReportingMethodName(String methodName) {

    getDriver().findElement(reportingMethodName).sendKeys(methodName);
    LOGGER.info("Custom Fields page clicked");
  }

  public static void saveReportingMethodName(){

    getDriver().findElement(saveBtn).click();
  }
  public static void cancelReportingMethodName(){

    getDriver().findElement(cancelBtn).click();
  }
  public static void selectReportingMethodName(){

    getDriver().findElement(selectForDelete).click();
  }
  public static void deleteReportingMethodName(){

    getDriver().findElement(deleteBtn).click();
  }
  public static void clickReportingMethodName(){

    getDriver().findElement(selectOneReportingMethod).click();
  }
  public static void clearReportingMethodName(){

    getDriver().findElement(editReportingName).clear();
  }
  public static void editReportingMethodName( String name){

    getDriver().findElement(editReportingName).sendKeys(name);
  }
  public static void saveAndEditReportingMethodName(){

    getDriver().findElement(saveBtnForEdit).click();
  }
  public static void clickCancelReportingMethodName(){

    getDriver().findElement(cancelBtnForEdit).click();
  }
  public static boolean isAddReportingMethodDisplayed(){
    return getDriver().findElement(addConfirmation).isDisplayed();
  }
  public static boolean isEditReportingMethodDisplayed(){
    return getDriver().findElement(editConfirmation).isDisplayed();
  }

  public static void addReportingMethodForm(String name){

    ReportingMethodPage.setReportingMethodName(name);
  }










}
