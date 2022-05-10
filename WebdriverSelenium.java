package week2day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverSelenium {


    public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
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
	driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("employee");
	driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("600053");			
	driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/11/1999");
	driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("computersoftware");
	driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("corporation");
	driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Atuomobile");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("computer science");
	driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
	driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TamilNadu");
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
