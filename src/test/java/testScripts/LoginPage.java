package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		List<WebElement> wagnardetails = driver.findElements(By.xpath("//td[contains(text(),'San Francisco')]//preceding-sibling::td[2]"));
		System.out.println("size of list "+ wagnardetails.size());
		for(WebElement ele:wagnardetails) {
			System.out.println("People working in San frans"+ele.getText());
		}
		///System.out.println(salary+ "Wagner salary");
		
		
	}

}
