package SelTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstTestCAse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitesh\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://jqueryui.com/droppable/");
      
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        
        WebElement drag = driver.findElement(By.id("draggable")); 
        
        WebElement drop = driver.findElement(By.id("droppable")); 
        
        
        Actions a = new Actions(driver);
        
        
        a.dragAndDrop(drag, drop).build().perform();
       System.out.println("successfully dropped");
       
       driver.switchTo().defaultContent();
	
	}
   
}
