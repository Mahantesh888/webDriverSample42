package testScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
public class GooglePageTest {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.setBrowserVersion("115");
		// without launching chrome we can test/ run 
		//option.addArguments("Headless");
		WebDriver driver = new ChromeDriver(option);
	    
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.print("page title..."+ driver.getTitle());
	    System.out.println("page url" + driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().refresh();

	}

}
