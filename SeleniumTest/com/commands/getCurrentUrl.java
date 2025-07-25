package com.commands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {
	public static void main(String[] args) {
		WebDriver driver_1 =new ChromeDriver();
		WebDriver driver_2 =new ChromeDriver();
		WebDriver driver_3 =new ChromeDriver();
		WebDriver driver_4 =new ChromeDriver();
		WebDriver driver_5 =new ChromeDriver();
		//WebDriver driver_1 =new EdgeDriver();
		//System.setProperty("webdriver.edgedriver.driver1", "C:\\Users\\ASWINRAGHAV\\spring_workspace\\demo\\drivers\\msedgedriver.exe")
				//driver_1.manage().window().maximize();
		driver_1.get("https://www.hollandandbarrett.com");
		
		driver_2.get("https://opensource-demo.orangehrmlive.com");
		driver_3.get("https://demo.opencart.com/");
		driver_4.get("http://www.bing.com/");
		driver_5.get("http://www.half.ebay.com/");
		
		String currentUrl_1 = driver_1.getCurrentUrl();
		System.out.println(currentUrl_1);
		
		String title_1 = driver_1.getTitle();
		System.out.println(title_1);
		String pageSource_1 = driver_1.getPageSource();
		System.out.println(pageSource_1);
		
		String currentUrl_2 = driver_2.getCurrentUrl();
		System.out.println(currentUrl_2);
		
		String title_2 = driver_2.getTitle();
		System.out.println(title_2);
		String pageSource_2 = driver_2.getPageSource();
		System.out.println(pageSource_2);
		
		String currentUrl_3 = driver_3.getCurrentUrl();
		System.out.println(currentUrl_3);
		
		String title_3 = driver_3.getTitle();
		System.out.println(title_3);
		String pageSource_3 = driver_3.getPageSource();
		System.out.println(pageSource_3);
		
		String currentUrl_4 = driver_4.getCurrentUrl();
		System.out.println(currentUrl_4);
		
		String title_4 = driver_1.getTitle();
		System.out.println(title_4);
		String pageSource_4 = driver_4.getPageSource();
		System.out.println(pageSource_4);
		
		String currentUrl_5 = driver_5.getCurrentUrl();
		System.out.println(currentUrl_5);
		
		String title_5 = driver_1.getTitle();
		System.out.println(title_5);
		String pageSource_5 = driver_5.getPageSource();
		System.out.println(pageSource_5);
}
	
}