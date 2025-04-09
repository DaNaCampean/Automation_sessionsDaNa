package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class LearningWebElemenCommands {

    public static void main (String[] args) {


        System.out.println("STARTTTTTTTTTTTTTTTTTT");

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


        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         firstNameInput.clear();
        //click on element ... text field

        WebElement emailText = driver.findElement(By.id("email"));

       // erroare ????

        WebElement typeHereButton = driver.findElement(By.name("B1"));
        typeHereButton.click();


        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




        // click on link

        // isDisplayed

        //isEnabled

        // isSelected
        System.out.println("STARTTTTTTTTTTTTTTTTTT3333333333333333");


      //  WebElement RadioButton1 = driver.findElement(By.id("rbutton1"));
        //Radio Button 1
          WebElement radioButton1 = driver.findElement(By.id("rbutton1"));

        System.out.println("xxxxxxxxxxxxxxxxx");
        WebElement RadioButton2 = driver.findElement(By.id("rbutton2"));
      //  System.out.println("RADIO BUTTONS");
     //  System.out.println("Radio B 1 = " + radioButton1.isSelected());
       RadioButton2.isSelected();
        System.out.println("Radio B 2 = " + RadioButton2.isSelected());
        //Verifying that radioButton1 is selected
        Boolean isRadioButtonSelected = radioButton1.isSelected();
        System.out.println("Radio button is selected: " + isRadioButtonSelected);
        //Verifying that radioButton1 is selected
       // Boolean isRadioButton2Selected = RadioButton2.isSelected();
       // System.out.println("Radio button2 is selected: " + isRadioButton2Selected);

//Getting


        // submit command

        //getText Command

        //getTagName Command

        //getCssValue Command

        // getAttribute Command

        // getSize Command

        // getLocation Command
        //








       driver.quit();



    }


}
