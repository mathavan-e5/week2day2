package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Facebook {
	  public static final WebElement ElementDropDown = null;
	  public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("mathavan");
		driver.findElement(By.name("lastname")).sendKeys("m");
		driver.findElement(By.name("reg_email__")).sendKeys("mathavan10814@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("kety55");
		WebElement findElement= driver.findElement(By.id("day"));
		Select day=new Select (findElement);
		day.selectByValue("13");
		WebElement findElement1= driver.findElement(By.id("month"));
		Select month=new Select(findElement1);
		month.selectByVisibleText("Apr");
		WebElement findElement2= driver.findElement(By.id("year"));
		Select year=new Select(findElement2);
		year.selectByValue("2003");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.close();
		
		 
		 
		 
		
		
		
	}

}
