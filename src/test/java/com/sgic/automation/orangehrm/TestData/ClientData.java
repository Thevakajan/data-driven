package com.sgic.automation.orangehrm.TestData;


import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class ClientData  extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(ClientData.class);

    public ClientData () {
        super("src\\test\\resources\\ExcelSheet\\Admin.xlsx");
    }
    @DataProvider
    public Object[][] Client() {

        int rows = getRowCount("ClientData");
        int col = getColumnCount("ClientData");


        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("ClientData", i, j);
            }
        }
        return data;
    }
}
