package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class PIMData extends ExcelDataConfig {
  private static final Logger LOGGER = Logger.getLogger(PIMData.class);

  public PIMData () {

    super("src\\test\\resources\\ExcelSheet\\excel.xlsx");
  }
  @DataProvider(name = "CustomFieldData")
  public Object[][] CustomFieldData() {

    int rows = getRowCount("Sheet3");
    int col = getColumnCount("Sheet3");

    LOGGER.info("row = "+ rows + " columns = "+ col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("Sheet3", i, j);
      }
    }
    return data;
  }
  @DataProvider(name = "ReportingMethod")
  public Object[][] ReportingMethod() {

    int rows = getRowCount("ReportingMethod");
    int col = getColumnCount("ReportingMethod");

    LOGGER.info("row = "+ rows + " columns = "+ col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("ReportingMethod", i, j);
      }
    }
    return data;
  }
  @DataProvider(name = "Termination")
  public Object[][] Termination() {

    int rows = getRowCount("TerminationReason");
    int col = getColumnCount("TerminationReason");

    LOGGER.info("row = "+ rows + " columns = "+ col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("TerminationReason", i, j);
      }
    }
    return data;
  }
  @DataProvider(name = "EditReportingMethod")
  public Object[][] EditReportingMethod() {

    int rows = getRowCount("EditReportingMethod");
    int col = getColumnCount("EditReportingMethod");

    LOGGER.info("row = "+ rows + " columns = "+ col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("EditReportingMethod", i, j);
      }
    }
    return data;
  }
  @DataProvider(name = "EditTerminationReason")
  public Object[][] EditTerminationReason() {

    int rows = getRowCount("EditTerminationReason");
    int col = getColumnCount("EditTerminationReason");

    LOGGER.info("row = "+ rows + " columns = "+ col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("EditTerminationReason", i, j);
      }
    }
    return data;
  }
  @DataProvider(name = "AddReport")
  public Object[][] AddReport() {

    int rows = getRowCount("Report");
    int col = getColumnCount("Report");

    LOGGER.info("row = "+ rows + " columns = "+ col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("Report", i, j);
      }
    }
    return data;
  }








}
