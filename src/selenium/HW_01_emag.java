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
       // System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
         System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://emag.ro");

        //  WebElement firstNameField = driver.findElement(By.id("firstname"));
        WebElement searchField = driver.findElement(By.id("searchboxTrigger"));
        searchField.sendKeys("aspiratoare");

        //searchField.click();
        searchField.submit();
      //  searchField.sendKeys(Keys.RETURN);

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
       // WebElement productCard = driver.findElement(By.xpath("//div[@class='card-item card-standard js-product-data js-card-clickable ' and @data-product-id='3300004']"));
       //  WebElement productCard = driver.findElement(By.xpath("//div[@class='card-item card-standard js-product-data js-card-clickable ' and @data-product-id='3300004']"));
        WebElement productCard = driver.findElement(By.xpath("//div[@class = 'card-item card-standard js-product-data js-card-clickable '][3]"));
        productCard.click();
        //Initializing the web element via the By.className locator strategy
     //   WebElement element = driver.findElement(By.className("card_grid.js-products-container card-collection list-view-updated show-me-a-grid"));
//Verifying that element was found (!null) and printing a message
        if (productCard != null)
            System.out.println("Element found by className");
//Closing

       driver.get("https://www.emag.ro/aspirator-umed-uscat-karcher-wd-2-v-12-4-18-aspirare-umeda-si-uscata-12-l-furtun-1-8m-1000w-functie-de-suflare-galben-negru-16280000/pd/D4MJNJMBM");


     WebElement addToCart = driver.findElement(By.xpath("//div[@class='btn btn-xl btn-emag btn-block main-button gtm_680klw yeahIWantThisProduct'  ' and @data-offer-id='1038102']"));
        addToCart.click();

    }
}
