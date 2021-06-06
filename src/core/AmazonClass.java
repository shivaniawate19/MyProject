package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonClass {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
        String url ="https://www.amazon.in/";
        
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
//		WebElement signinbutton = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
//		signinbutton.click();
//		WebElement CreateAccount = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
//		CreateAccount.click();
//		
//		WebElement username = driver.findElement(By.xpath("//input[@name='customerName']"));
//		username.sendKeys("Akshay Shinde");
//		WebElement MobileNo = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
//		MobileNo.sendKeys("8888167026");
//		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//		password.sendKeys("akshay123");
//		WebElement submitbutton = driver.findElement(By.xpath("//input[@id='continue']"));
//		submitbutton.click();
		
		WebElement searchbyname = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbyname.sendKeys("kurtis for women");
		
        WebElement submit = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		submit.click();
		Thread.sleep(3000);
		
		WebElement selectkurti = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small']"));
		selectkurti.click();
		
		
		
		
		
		
		
				

	}

}
