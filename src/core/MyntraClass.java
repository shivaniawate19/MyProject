package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraClass {
	static WebDriver driver;


	public static void main(String[] args) {
		 String url ="https://www.myntra.com/";
	        
	        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			WebElement searchbyname = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
			searchbyname.sendKeys("kurtis for women");
			
	        WebElement submit = driver.findElement(By.xpath("//a[@class='desktop-submit']"));
			submit.click();
			WebElement selectkurti = driver.findElement(By.xpath("//div[@class='product-sliderContainer']"));
			selectkurti.click();
			//WebElement Selectsize = driver.findElement(By.xpath("//p[@class='size-buttons-unified-size']"));
			//Selectsize.click();
			WebElement Addtocart = driver.findElement(By.xpath("//div[@class='pdp-add-to-bag pdp-button pdp-flex pdp-center']"));
			Addtocart.click();
			WebElement Gotocart = driver.findElement(By.xpath("//a[@class='pdp-goToCart pdp-add-to-bag pdp-button pdp-flex pdp-center ']"));
			Gotocart.click();
			WebElement placeorder = driver.findElement(By.xpath("//div[@class='button-base-button']"));
			placeorder.click();

	}

}
