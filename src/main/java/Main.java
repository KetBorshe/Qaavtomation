import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");
        WebElement fieldEmail = driver.findElement(By.xpath("//input[@class='login-email reg-field__input']"));
        WebElement  fieldPass = driver.findElement(By.xpath("//input[@class='login-password reg-field__input']"));
        fieldEmail.sendKeys("ketborshe@gmail.com");
        fieldPass.sendKeys("2512Kate");
        fieldPass.sendKeys(Keys.ENTER);
        List<WebElement> trueLogins = driver.findElements(By.xpath("//*[@id='ember116']/img"));
        if (trueLogins.isEmpty()){
            System.out.println("ERROR");
        }
        else {
            trueLogins.get(0).isDisplayed();
            System.out.println(trueLogins.get(0).isDisplayed());
        }



    }
}
