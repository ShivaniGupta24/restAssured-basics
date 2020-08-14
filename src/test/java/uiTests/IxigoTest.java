package uiTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IxigoTest {
    @Test
    public void serachFlights(){

        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ixigo.com/");
        By fromLocator = By.xpath("(//*[@placeholder='Enter city or airport'])[1]");
        driver.findElement(fromLocator).clear();
        driver.findElement(fromLocator).sendKeys("BLR");

        By toLocator = By.xpath("(//*[@placeholder='Enter city or airport'])[2]");
        driver.findElement(toLocator).clear();
        driver.findElement(toLocator).sendKeys("PNQ");
        driver.findElement(By.xpath("//button[text()='Search']")).click();

    }
}
