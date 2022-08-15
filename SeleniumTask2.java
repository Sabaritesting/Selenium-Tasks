import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Installation\\demo\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.name("first_name")).sendKeys("abcd");
		driver.findElement(By.name("last_name")).sendKeys("xyz");
		driver.findElement(By.name("business_name")).sendKeys("awxc");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		WebElement element=driver.findElement(By.xpath("//label[@id='recaptcha-anchor-label']"));
		String name=element.getText();
		System.out.println(name);
		driver.findElement(By.id("demo")).click();
	}

}
