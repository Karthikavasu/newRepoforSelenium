package inputs;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myclassfile {
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\MyProject1\\src\\main\\resources\\chromedriver.exe");
		//FileInputStream fis = new FileInputStream("C:\\Users\\Karthika\\eclipse-workspace\\MyProject1\\src\\main\\java\\inputs\\inputs.java");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipcart.com/");
		//driver.quit();
		Thread.sleep(2000);
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		searchbox.sendKeys("kids toys");
		Thread.sleep(5000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(15000);
		Properties prop = new Properties();
		//ageSelect.click();
	
		//*[text()='5 to 7 Years']
	}
}
