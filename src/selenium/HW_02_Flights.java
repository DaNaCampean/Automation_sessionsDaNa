package selenium;

/*

1. https://www.hotwire.com/
2. Flights
3. From LAX
4. To Bucharest Otopeni
5. From date - 7 days from today
6. To date - 14 days from today
7. 2 adults

 */


import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW_02_Flights {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hotwire.com/");

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement flightsClick = driver.findElement(By.xpath("//div[@data-bdd = 'farefinder-option-flights' and @class = 'farefinder-option inactive']"));
     flightsClick.click();
     flightsClick.click();

        WebElement searchField = driver.findElement(By.xpath("//input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']"));
        searchField.sendKeys("LAX");



            }
}
