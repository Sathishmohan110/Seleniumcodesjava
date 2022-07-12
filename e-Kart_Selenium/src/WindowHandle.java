import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sathi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId= it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
	String mail=	driver.findElement(By.linkText("mentor@rahulshettyacademy.com")).getText();
	driver.switchTo().window(parentId);
	driver.findElement(By.id("username")).sendKeys(mail);
	}

}
