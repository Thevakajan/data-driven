package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class UserAddData extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(UserAddData.class);

    public UserAddData () {
        super("src\\test\\resources\\ExcelSheet\\Admin.xlsx");
    }
    @DataProvider
    public Object[][] AddUser() {

        int rows = getRowCount("UserAdd");
        int col = getColumnCount("UserAdd");


        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("UserAdd", i, j);
            }
        }
        return data;
    }
}
