package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


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
        firstNameInput.clear();




      //  driver.quit();



    }


}
