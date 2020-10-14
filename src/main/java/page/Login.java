package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

    public static void login(WebDriver driver){
        /*inicia sesión en la aplicación*/
        driver.findElement(By.id("email")).sendKeys("nicoaolea@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("nk43542289");
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
    }
}
