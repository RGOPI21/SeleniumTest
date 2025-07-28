package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calculation {
	WebDriver driver;
	
	@Test
    public void DemoTestID() throws Exception {
        driver = new ChromeDriver();
        driver.get("https://www.easycalculation.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//h1[normalize-space()='Cost of Living Comparison Calculator']")).click();
        Thread.sleep(5000);
        driver.quit();

}
}
