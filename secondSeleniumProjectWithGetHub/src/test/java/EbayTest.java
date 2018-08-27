import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class EbayTest extends TestBase{

    @Test
    public void RegistrationTest(){


        InitNewUserRegistration();
        FillFirstNameForm();
        FillLatsNameForm();
        FillEmailForm();
        FillPasswordForm();
        ClickOnButtonSubmitRegistration();
    }


}
