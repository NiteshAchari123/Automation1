package SelTestCases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingWebdriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitesh\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=15461201666&extra_1=s%7Cc%7C589521732875%7Cb%7Cfacebook%20%27%7C&placement=&creative=589521732875&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D15461201666%26adgroupid%3D130924380175%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9062037%26loc_interest_ms%3D9302867%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwoIqhBhAGEiwArXT7K6m-jDD2EJYWKuNZDEqYGRKfvPOFGdLR1Yn1BVh-UHqBaCrr8v0H0xoCZJQQAvD_BwE");
	
	    WebElement Footerdriver = driver.findElement(By.id("pageFooterChildren"));
	   
	    System.out.println(Footerdriver.findElements(By.tagName("a")).size()); 
	    
	
	   
	}

}
