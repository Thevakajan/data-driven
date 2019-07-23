package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

/**
 * @Author Jeyapriya
 */
public class DatePickerData extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(PerformanceTestData.class);
    public DatePickerData() {super
            ("src\\test\\resources\\ExcelSheet\\OrangeHrm.xlsx");

    }
    @DataProvider(name = "AttendanceRecord")
    public Object[][] AttendanceRecord() {

        int rows = getRowCount("AttendanceRecord");
        int col = getColumnCount("AttendanceRecord");

        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("AttendanceRecord", i, j);
            }
        }
        return data;
    }
}
