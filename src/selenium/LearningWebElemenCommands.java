package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LearningWebElemenCommands {

    public static void main (String[] args) {


        System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www-archive.mozilla.org/projects/ui/accessibility/unix/testcase/html/");

      //  WebElement firstNameField = driver.findElement(By.id("firstname"));


      //  driver.quit();



    }


}
