import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Installation\\demo\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.findElement(By.name("firstname")).sendKeys("abcd");
		driver.findElement(By.name("lastname")).sendKeys("xyz");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-1")).click();
		driver.findElement(By.id("datepicker")).sendKeys("12/12/2021");
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-2")).click();
Select dropdown=new Select(driver.findElement(By.id("continents")));
dropdown.selectByIndex(0);

Select drop=new Select(driver.findElement(By.id("selenium_commands")));
drop.selectByIndex(1);
		}

}
