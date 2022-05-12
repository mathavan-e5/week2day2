package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverSelenium {


    public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	String text = driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	driver.findElement(By.linkText("CRM/SFA")).click();
	String title = driver.getTitle();
	System.out.println(title);

	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("leaftest");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("mathavan");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("m");
	
	WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dd1=new Select (findElement);
	dd1.selectByValue("LEAD_EMPLOYEE");
	
	driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("600053");			
	driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/11/1999");
	
	WebElement findElement1 =driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select dd2=new Select (findElement1);   
	dd2.selectByValue("IND_SOFTWARE");
	
	WebElement findElement2 =driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select dd3=new Select (findElement2);   
	dd3.selectByValue("OWN_SCORP");
	
	WebElement findElement3 =driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select dd4=new Select (findElement3);   
	dd4.selectByValue("CATRQ_AUTOMOBILE");
	
	WebElement findElement4 =driver.findElement(By.name("generalCountryGeoId"));
	Select dd5=new Select (findElement4);   
	dd5.selectByValue("IND");
	
	
	
    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("computer science");
	

	//contact information
    driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("53");
    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mathavan10814@gmail.com");
    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8939445084");
    //primary address
    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("no7 kamadhenu street elango nagar meanmbedu");
    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("ambattur chennai");
    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("53");
    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600053");
    driver.findElement(By.className("smallSubmit")).click();
    String firstname=driver.findElement(By.id("viewLead_firstName_sp")).getText();
    System.out.println(firstname);
    	
	
}


}
