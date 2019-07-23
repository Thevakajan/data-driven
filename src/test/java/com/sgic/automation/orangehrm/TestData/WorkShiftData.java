package com.sgic.automation.orangehrm.TestData;


import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class WorkShiftData extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(ClientData.class);

    public WorkShiftData() {
        super("src\\test\\resources\\ExcelSheet\\Admin.xlsx");
    }
    @DataProvider
    public Object[][] Work_Shift() {

        int rows = getRowCount("Work_Shift");
        int col = getColumnCount("Work_Shift");


        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Work_Shift", i, j);
            }
        }
        return data;
    }

    @DataProvider
    public Object[][] Edit_Shift() {

        int rows = getRowCount("Edit_Work_shift");
        int col = getColumnCount("Edit_Work_shift");


        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Edit_Work_shift", i, j);
            }
        }
        return data;
    }
}
