package homework.testRadioButtonsFunctionality.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

   public static WebDriver getDriver(String browserType) {
      return switch(browserType) {
          case "safari"->new SafariDriver();
                  case "firefox"->new FirefoxDriver();
                  default -> new ChromeDriver();
       };


       };
    }


