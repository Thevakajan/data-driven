package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class AssignLeaveData extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(AssignLeaveData.class);

    public AssignLeaveData() {
        super
                ("src\\test\\resources\\ExcelSheet\\Leave.xlsx");
    }

    @DataProvider(name = "AssignLeaveFullDay")
    public Object[][] AssignLeaveFullDay() {

        int rows = getRowCount("Assign_Leave_Full_Day");
        int col = getColumnCount("Assign_Leave_Full_Day");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Assign_Leave_Full_Day", i, j);
            }
        }
        return data;
    }

    @DataProvider(name = "AssignLeaveHalfDay")
    public Object[][] AssignLeaveHalfDay() {

        int rows = getRowCount("Assign_Leave_Half_Day");
        int col = getColumnCount("Assign_Leave_Half_Day");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Assign_Leave_Half_Day", i, j);
            }
        }
        return data;
    }

    @DataProvider(name = "AssignLeaveSpecificTime")
    public Object[][] AssignLeaveSpecificTime() {

        int rows = getRowCount("Assign_Leave_Specific_Time");
        int col = getColumnCount("Assign_Leave_Specific_Time");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Assign_Leave_Specific_Time", i, j);
            }
        }
        return data;
    }
    }

