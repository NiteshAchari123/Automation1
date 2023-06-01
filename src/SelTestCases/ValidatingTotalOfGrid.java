package SelTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidatingTotalOfGrid {
	


public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitesh\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		js.executeScript("window.scrollBy(0,700)");
		
		js.executeScript("document.querySelector(\".tableFixHead\").scrollBy(0,5)");
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum=0;
		
		for (int i=0;i<values.size();i++)
		{
			int Number = Integer.parseInt(values.get(i).getText());
			
			sum = sum+ Number;
			
		}
			
		String s = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();
		System.out.println(Integer.parseInt(s));
		}

        
  
}

