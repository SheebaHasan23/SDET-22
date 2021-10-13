package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamsungPhones {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver1/chromedriver1.exe");
	}
		public static void main(String[]args) throws InterruptedException
	{
		
			WebDriver driver=new ChromeDriver();
       driver.get("https://www.flipkart.com/");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//a[.='Login']"));
       driver.findElement(By.xpath("//button[.='✕']")).click();
       driver.findElement(By.name("q")).sendKeys("samsung mobiles");
       
       

	}
}


