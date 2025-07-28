package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DemoID {

	WebDriver driver;

    @Test
    public void DemoTestID() throws Exception {
        driver = new ChromeDriver();
        driver.get("https://www.hollandandbarrett.com/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("Gopi");
        driver.findElement(By.id("password")).sendKeys("gopi123");
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/form/div[2]/button")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}

	


