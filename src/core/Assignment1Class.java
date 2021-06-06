package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Assignment1Class {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String url = "http://automationpractice.com/index.php";
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement signinbutton = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		signinbutton.click();
		Thread.sleep(3000);
		WebElement EnterEmail = driver.findElement(By.xpath("//input[@id='email_create']"));
		EnterEmail.sendKeys("shivaniawate1925@gmail.com");
		WebElement CreateAccount = driver.findElement(By.xpath("//button[@name='SubmitCreate']"));
		CreateAccount.click();
		Thread.sleep(5000);
		
		WebElement gender = driver.findElement(By.xpath("//input[@id='customer_firstname']//preceding::input[1]"));
		gender.click();
//		try {
//			
//			WebElement gender = driver.findElement(By.xpath("//input[@id='customer_firstname']//preceding::input[1]"));
//			gender.click();
//			
//		} catch (Exception e) {
			
		//}
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		FirstName.sendKeys("shivani");
		WebElement LastName = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		LastName.sendKeys("awate");
		WebElement Password = driver.findElement(By.xpath("//input[@name='passwd']"));
		Password.sendKeys("shivani@123");
		
		WebElement datedropdown = driver.findElement(By.id("days"));
		Select date = new Select(datedropdown);
		date.selectByValue("3");
		

		WebElement monthdropdown = driver.findElement(By.id("months"));
		Select month = new Select(monthdropdown);
		month.selectByValue("4");
		
		WebElement yeardropdown = driver.findElement(By.id("years"));
		Select year = new Select(yeardropdown);
		year.selectByValue("1996");
		
		WebElement Address = driver.findElement(By.xpath("//input[@name='address2']"));
		Address.sendKeys("gharkulresi");
		WebElement City = driver.findElement(By.xpath("//input[@name='city']"));
		City.sendKeys("nashik");
		WebElement StateDropdown = driver.findElement(By.name("id_state"));
		Select state = new Select(StateDropdown);
		state.selectByIndex(4);
		
		WebElement Postalcode = driver.findElement(By.xpath("//input[@id='postcode']"));
		Postalcode.sendKeys("422101");
		WebElement countrydropdown = driver.findElement(By.name("id_country"));
		Select country = new Select(countrydropdown);
		country.selectByIndex(0);
		WebElement MobileNo = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		MobileNo.sendKeys("7385338734");
		
		
		
		WebElement RegisterButton = driver.findElement(By.xpath("//button[@name='submit_search']"));
		RegisterButton.click();
		
	
		
		
		
		
		
		
				
		
	}

}
