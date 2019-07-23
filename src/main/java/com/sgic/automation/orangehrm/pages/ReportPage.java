package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ReportPage extends PageBase {
  private static final Logger LOGGER = Logger.getLogger(ReportPage.class);
  private static By reportPage=By.id("menu_core_viewDefinedPredefinedReports");
  private static By reportPageHeading=By.xpath("//*[@id=\"content\"]/div[1]/a");
  private static By reportName=By.id("search_search");
  private static By searchBtn=By.xpath("//*[@id=\"searchForm\"]/fieldset/p/input[1]");
  private static By resetBtn=By.xpath("//*[@id=\"searchForm\"]/fieldset/p/input[2]");
  private static By addBtn=By.id("btnAdd");
  private static By addReportName=By.id("report_report_name");
  private static By selectionCriteria=By.id("report_criteria_list");
  private static By selectedCriteriaInclude =By.id("report_include_comparision");
  private static By displayFieldGroups=By.id("report_display_groups");
  private static By displayFields=By.id("report_display_field_list");
  private static By saveBtn=By.id("btnSave");
  private static By cancelBtn=By.id("btnCancel");
  private static By deleteBtn=By.id("btnDelete");
  private static By selectName=By.id("ohrmList_chkSelectRecord_5");
  private static By okBtn=By.id("dialogDeleteBtn");
  private static By searchConfirmation=By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]");
  private static By editBtn=By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[4]/a");
  private static By editConfirmation=By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]");


  public static void clickReportPage(){

    getDriver().findElement(reportPage).click();
  }
  public static boolean isReportPageDisplayed(){
    return getDriver().findElement(reportPageHeading).isDisplayed();
  }

  public static void typeReportName(String name){

    getDriver().findElement(reportName).sendKeys(name);
  }
  public static void clearReportName(){

    getDriver().findElement(reportName).clear();
  }
  public static void clickSearchBtn(){

    getDriver().findElement(searchBtn).click();
  }
  public static void clickResetBtn(){

    getDriver().findElement(resetBtn).click();
  }
  public static void clickAddBtn(){

    getDriver().findElement(addBtn).click();
  }
  public static void clickDeleteBtn(){

    getDriver().findElement(deleteBtn).click();
  }
  public static void clickSelectBtn(){

    getDriver().findElement(selectName).click();
  }
  public static boolean isSearchResultDisplayed(){
    return getDriver().findElement(searchConfirmation).isDisplayed();
  }
  public static void setReportName(String name) {

    getDriver().findElement(addReportName).sendKeys(name);
  }
  public static boolean isSelectionCriteriaDisplayed() {
    return getDriver().findElement(selectionCriteria).isDisplayed();
  }

  public static void setSelectionCriteriaDownOption(String criteria) {
    Select screenDropDownOption = new Select(getDriver().findElement(selectionCriteria));
    screenDropDownOption.selectByVisibleText(criteria);
  }
  public static boolean isCriteriaIncludeDisplayed() {
    return getDriver().findElement(selectedCriteriaInclude).isDisplayed();
  }

  public static void setCriteriaIncludeDownOption(String criteriaInclude) {
    //implicitWait(4);
    getDriver().findElement(selectedCriteriaInclude).sendKeys(criteriaInclude);
//    Select screenDropDownOption = new Select(getDriver().findElement(selectedCriteriaInclude));
//    screenDropDownOption.selectByValue(criteriaInclude);
  }
  public static boolean isFieldGroupsDisplayed() {
    return getDriver().findElement(displayFieldGroups).isDisplayed();
  }

  public static void setFieldGroupsDownOption(String fieldGroups) {
    Select screenDropDownOption = new Select(getDriver().findElement(displayFieldGroups));
    screenDropDownOption.selectByVisibleText(fieldGroups);
  }
  public static boolean isDisplayFieldsDisplayed() {
    return getDriver().findElement(displayFields).isDisplayed();
  }

  public static void setDisplayFieldsDownOption(String field) {
    Select screenDropDownOption = new Select(getDriver().findElement(displayFields));
    screenDropDownOption.selectByVisibleText(field);
  }
  public static void clickSaveBtn(){

    getDriver().findElement(saveBtn).click();
  }
  public static void clickCancelBtn(){

    getDriver().findElement(cancelBtn).click();
  }
  public static void clickOkBtn(){

    getDriver().findElement(okBtn).click();
  }
  public static void clickEditBtn(){

    getDriver().findElement(editBtn).click();
  }
  public static boolean isEditValueDisplayed(){
    return getDriver().findElement(editConfirmation).isDisplayed();
  }

  public static void addReportForm(String name, String criteria, String criteriaInclude, String fieldGroup, String field){

    ReportPage.setReportName(name);
    ReportPage.setSelectionCriteriaDownOption(criteria);
    ReportPage.setCriteriaIncludeDownOption(criteriaInclude);
    ReportPage.setFieldGroupsDownOption(fieldGroup);
    ReportPage.setDisplayFieldsDownOption(field);

  }



}
