package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class LearningWebElemenCommands {

    public static void main (String[] args) {


        System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www-archive.mozilla.org/projects/ui/accessibility/unix/testcase/html/");

      //  WebElement firstNameField = driver.findElement(By.id("firstname"));
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        firstNameInput.sendKeys("DaNa");

       WebElement firstNameInput1 = driver.findElement(By.id("lastname"));
        firstNameInput1.sendKeys("Didi");
     //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);

        Thread.sleep(3000);
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       firstNameInput.clear();





       // driver.quit();



    }


}
