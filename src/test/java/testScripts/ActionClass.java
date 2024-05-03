package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws IOException {
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		//this will not show the images loaded on screen but in backened images will be loaded
		
		option.addArguments("--blink-settings=imagesEnabled=false");
		//--blink-settings=imagesEnabled=true  // this will display the images
		
		
		
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.get("https://demo.opencart.com/");
		
		//ul.nav.navbar-nav > li:nth-child(3)    
		//right click
		//action.contextClick(driver.findElement(By.id("search"))).perform();
		
		//move to element
		//action.moveToElement(driver.findElement(By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"))).perform();
		
		
		//performing 2 actions at once
		WebElement path = driver.findElement(By.cssSelector("ul.nav.navbar-nav > li:nth-child(3) "));
		
		WebElement path1 = driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[contains(text(),'Monitors (2)')]"));
		
		action.moveToElement(path).click(path1).build().perform();
		
		//TakesScreenshot
		TakesScreenshot screen = (TakesScreenshot)driver;
		//takes page screenshot
		File srcImg = screen.getScreenshotAs(OutputType.FILE);
		//takes element screenshot
		File srcimageelement = path.getScreenshotAs(OutputType.FILE);
		String imgpath = System.getProperty("user.dir")+"/Screenshot/"+ System.currentTimeMillis()+".png";
		
		FileUtils.copyFile(srcImg,new  File(imgpath));
		FileUtils.copyFile(srcimageelement,new  File(imgpath));
		
		

	}

}
