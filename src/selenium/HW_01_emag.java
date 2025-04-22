package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_01_emag {

    public static void main (String[] args) {


        System.out.println("STARTTTTTTTTTTTTTTTTTT");
        // System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
        System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www-archive.mozilla.org/projects/ui/accessibility/unix/testcase/html/");

        //  WebElement firstNameField = driver.findElement(By.id("firstname"));
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        firstNameInput.sendKeys("DaNa");
    }
}
