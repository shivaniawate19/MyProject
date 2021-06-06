package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2class {
	static WebDriver driver;

	public static void main(String[] args) {
		String url =" http://demo.guru99.com/test/newtours/register.php";
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstName']"));
		FirstName.sendKeys("shivani");
		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastName']"));
		LastName.sendKeys("awate");
		WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("7385338734");
		WebElement Email = driver.findElement(By.xpath("//input[@id='userName']"));
		Email.sendKeys("shivaniawate1925@gmail.com");
		WebElement Address = driver.findElement(By.xpath("//input[@name='address1']"));
		Address.sendKeys("gharkulresi");
		WebElement City = driver.findElement(By.xpath("//input[@name='city']"));
		City.sendKeys("nashik");
		WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("maharaashtra");
		WebElement Postalcode = driver.findElement(By.xpath("//input[@name='postalCode']"));
		Postalcode.sendKeys("422101");
		WebElement countrydropdown = driver.findElement(By.name("country"));
		Select country = new Select(countrydropdown);
		country.selectByVisibleText("INDIA");

		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("shivani");
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("shiv123");
		WebElement confirmpassword = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		confirmpassword.sendKeys("shiv123");
		WebElement submitbutton = driver.findElement(By.xpath("//input[@name='submit']"));
		submitbutton.click();
		
		
		
		
	}

}
