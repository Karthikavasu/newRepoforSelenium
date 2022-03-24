package inputs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class inputs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\MyProject1\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// TODO Auto-generated method stub
		WebElement  ageSelect = driver.findElement(By.xpath("//*[text()='5 to 7 Years']"));
		

	}

}
