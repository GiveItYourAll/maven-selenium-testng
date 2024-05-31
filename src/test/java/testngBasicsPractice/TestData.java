package testngBasicsPractice;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "InvalidLoginCredentialsDataSet")
    public Object[][] invalid_login_credentials() {
        return new Object[][]{
                {"invalid", "invalid", "invalid credentials"},
                {"", "invalid", "Username cannot be empty"},
                {"yoll-student", "", "Password cannot be empty"},
                {"", "", "Username cannot be empty"},
                {"yoll-student", "invalid", "Invalid credentials"}


        };

    }
}
