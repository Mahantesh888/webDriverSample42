package testScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class GooglePageTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.print("page title..."+ driver.getTitle());
		driver.close();
		

	}

}
