package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW_01_emag {

    public static void main (String[] args) {


        System.out.println("STARTTTTTTTTTTTTTTTTTT");
        System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
        // System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://emag.ro");

        //  WebElement firstNameField = driver.findElement(By.id("firstname"));
        WebElement searchField = driver.findElement(By.id("searchboxTrigger"));
        searchField.sendKeys("aspiratoare");
        searchField.sendKeys(Keys.RETURN);

// Așteaptă pentru rezultate
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        // Găsește toate aspiratoarele listate utilizând XPath
        List<WebElement> aspirators = driver.findElements(By.xpath("//div[@class='card-item card-standard js-product-data js-card-clickable']/a"));

        // Verifică dacă există suficiente rezultate
        if (aspirators.size() >= 3) {
            // Selectează al treilea aspirator
            aspirators.get(2).click();
        } else {
            System.out.println("Nu au fost găsite suficiente rezultate.");
        }
    }
}
