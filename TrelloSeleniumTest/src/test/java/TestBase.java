import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    ChromeDriver driver;

    @BeforeMethod
public void setUp(){

   driver = new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   driver.navigate().to("https://www.trello.com/");




}
@AfterMethod
    public void tearDown(){

    driver.quit();
}


    protected void InitLoginToTheAcount(){

        driver.findElement(By.linkText("Log In")).click();
    }

    protected void FillLoginForm(){

        driver.findElement(By.id("user")).click();
        driver.findElement(By.id("user")).clear();
        driver.findElement(By.id("user")).sendKeys("bouchard.pintodavid@gmail.com");

        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Basketball09");

    }

    protected void SubmitLogin() {

        driver.findElement(By.id("login")).click();

    }
}
