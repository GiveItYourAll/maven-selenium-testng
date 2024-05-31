package homework.utilities;

import org.openqa.selenium.WebDriver;

public class Driver {
    private static WebDriver driver;

    private Driver() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = DriverFactory.getDriver("default");

        }
        return driver;
    }
    public void setDriver(WebDriver driverType){
        driver = driverType;

    }
    public static void quitDriver(){
        if(driver!=null){
        driver.quit();
        driver=null;
    }
}}
