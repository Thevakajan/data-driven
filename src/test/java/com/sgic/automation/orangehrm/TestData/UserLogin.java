package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class UserLogin extends ExcelDataConfig {
        private static final Logger LOGGER = Logger.getLogger(com.sgic.automation.orangehrm.TestData.UserLogin.class);

        public UserLogin () {
            super("src\\test\\resources\\ExcelSheet\\Leave.xlsx");
        }
        @DataProvider
        public Object[][] OrangeHRMUserLogin() {

            int rows = getRowCount("User_Login");
            int col = getColumnCount("User_Login");


            LOGGER.info("row = "+ rows + " columns = "+ col);

            Object[][] data = new Object[rows][col];
            for (int i = 1; i <= rows; i++) {
                for (int j = 0; j < col; j++) {
                    data[i - 1][j] = getData("User_Login", i, j);
                }
            }
            return data;
        }

    }
