import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    ChromeDriver driver; //creer driver

    @BeforeMethod

    public void setUp(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        OpenEbay();

    }

    @AfterMethod
    public void tearDown(){

        driver.quit();
    }



    public void OpenEbay() {
        driver.get("http://www.ebay.com");
    }

    public void InitNewUserRegistration() {
        driver.findElement(By.linkText("register")).click();
    }

    //fill click on button
    public void ClickOnButtonSubmitRegistration() {
        driver.findElement(By.id("ppaFormSbtBtn")).click();
    }

    // fill password field while registration
    public void FillPasswordForm() {
        driver.findElement(By.id("PASSWORD")).click();
        driver.findElement(By.id("PASSWORD")).clear();
        driver.findElement(By.id("PASSWORD")).sendKeys("D4C3B2A1a1b2c3d4");
    }

    // fill email field while registration
    public void FillEmailForm() {
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        String email = "bouchard.pintodavid+" +System.currentTimeMillis()+"@gmail.com";
        driver.findElement(By.id("email")).sendKeys(email);
        System.out.println(email);

    }

    // fill lastname field while registration
    public void FillLatsNameForm() {
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Pinto");
    }

    // fill firstname field while registration
    public void FillFirstNameForm() {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("David");
    }

    protected void SubmitLogin() {
        driver.findElement(By.id("sgnBt")).click();
    }

    protected void FillLoginForm() {

        driver.findElement(By.name("userid")).click();
        driver.findElement(By.name("userid")).clear();
        driver.findElement(By.name("userid")).sendKeys("bouchard.pintodavid+1535361444942@gmail.com");

        driver.findElement(By.id("pass")).click();
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("D4C3B2A1a1b2c3d4");
    }

    public void InitLogIn() {
        driver.findElement(By.linkText("Sign in")).click();
}
}
