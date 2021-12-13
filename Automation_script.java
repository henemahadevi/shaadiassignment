package shaadi.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Configuration.pathConfig;

public class Automation_script {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", pathConfig.driverPath);
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.marathishaadi.com/");
		d.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("pass@123");
		 WebElement profile = d.findElement(By.xpath("//div[@class='Dropdown-placeholder']"));
		 Actions act=new Actions(d);
		 act.moveToElement(profile).perform();
		 act.click().perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 d.findElement(By.xpath("//input[@value='Female']")).click();
		d.findElement(By.xpath("//button[@type='submit']")).click();
		d.findElement(By.xpath("//input[@name='first_name']")).sendKeys("prem");
		d.findElement(By.xpath("//input[@name='last_name']")).sendKeys("patil");
		d.findElement(By.xpath("(//div[@class='Dropdown-placeholder is-selected'])[1]")).sendKeys("01");
		 act.moveToElement(profile).perform();
		 act.click().perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		d.findElement(By.xpath("(//div[@class='Dropdown-placeholder is-selected'])[1]")).sendKeys("jan");
		 act.moveToElement(profile).perform();
		 act.click().perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		d.findElement(By.xpath("(//div[@class='Dropdown-placeholder'])[1]")).sendKeys("2000");
		 act.moveToElement(profile).perform();
		 act.click().perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		d.findElement(By.xpath("(//div[@class='Dropdown-placeholder is-selected'])[1]")).sendKeys("Hindu");
		 act.moveToElement(profile).perform();
		 act.click().perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		d.findElement(By.xpath("(//div[@class='Dropdown-placeholder is-selected'])[1]")).sendKeys("Marathi");
		 act.moveToElement(profile).perform();
		 act.click().perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 d.findElement(By.xpath("(//div[@class='Dropdown-placeholder is-selected'])[1]")).sendKeys("India");
		 act.moveToElement(profile).perform();
		 act.click().perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		d.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
