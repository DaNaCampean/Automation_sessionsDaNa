package selenium;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //driver.get("https://www.google.com");
            driver.navigate().to("https://www.google.com");
            driver.manage().window().maximize();
            String title = driver.getTitle();
            System.out.println("The page title is: " + title);
        }
    }



