package selenium;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.safari.SafariDriver;
    import org.openqa.selenium.safari.SafariOptions;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {
         //   System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
           // WebDriver driver = new ChromeDriver();
            //driver.get("https://www.google.com");
            //SafariOptions options = new SafariOptions();
            WebDriver driver = new SafariDriver();

            driver.navigate().to("https://www.google.com");
            driver.manage().window().maximize();
            String title = driver.getTitle();
            System.out.println("The page title is: " + title);
        }
    }



