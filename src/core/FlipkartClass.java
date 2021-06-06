package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FlipkartClass {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
        String url ="https://www.flipkart.com/";
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement Close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Close.click();
//		WebElement searchbyname = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
//		searchbyname.sendKeys("janasya kurtis");
//
//		WebElement submit = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
//		submit.click();
//		Thread.sleep(3000);
//
//		
//		WebElement janasya = driver.findElement(By.xpath("//a[@class='IRpwTa']"));
//		janasya.click();
////		Thread.sleep(3000);
////		driver.switchTo().frame(2);
//		WebElement Addtocart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
//		Addtocart.click();
//		WebElement Selectsize = driver.findElement(By.xpath("//a[@class='_1fGeJ5 _2UVyXR _31hAvz']"));
//		Selectsize.click();
//		WebElement Gotocart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
//		Gotocart.click();
//		WebElement placeorder = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL]"));
//		placeorder.click();
		
		
		
		WebElement loginbutton = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		loginbutton.click();
//		driver.switchTo().frame(0);
//		WebElement searchdropdown = driver.findElement(By.name("q"));
//		Select search = new Select(searchdropdown);
//		search.selectByIndex(1);
		
		
		
		WebElement createaccount = driver.findElement(By.linkText("New to Flipkart? Create an account"));
		createaccount.click();
		//driver.switchTo().frame(0);
		//Thread.sleep(5000);                                                                     //run
		WebElement MobileNo = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		MobileNo.sendKeys("9096782500");
		WebElement Submit = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		Submit.click();
		
//		Thread.sleep(3000);
//		WebElement MobileNo = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
//		MobileNo.sendKeys("7385338734");
//		Thread.sleep(5000);
//		WebElement password = driver.findElement(By.xpath("input[@class='_2IX_2- _3mctLh VJZDxU']"));
//		password.sendKeys("shiv123");
//		WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
//		login.click();
		


	}

}
