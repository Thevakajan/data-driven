package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class EmailConfigData extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(EmailConfigData.class);

    public EmailConfigData () {
        super("src\\test\\resources\\ExcelSheet\\Admin.xlsx");
    }
    @DataProvider
    public Object[][] EmailConfige() {

        int rows = getRowCount("EmailConfig");
        int col = getColumnCount("EmailConfig");


        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("EmailConfig", i, j);
            }
        }
        return data;
    }
}
