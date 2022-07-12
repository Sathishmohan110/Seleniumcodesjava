import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ekart {

	public static void main(String[] args) throws InterruptedException {
		String[] items={"Beans","Carrot","Brinjal","Tomato"};
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sathi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products=driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int j=0;j<items.length;j++) {
			String item=items[j];
			System.out.println(item);
		for(int i=0;i<products.size();i++) {
		String name =products.get(i).getText().split("-")[0];

		System.out.println(name.contains(item));
	    if(name.contains(item)) {
	    	System.out.println(driver.findElements(By.xpath("//div[@class='product-action'] //button[@type='button']")).get(i).getText());
	    	driver.findElements(By.xpath("//div[@class='product-action'] //button[@type='button']")).get(i).click();
	    	break;
	    }
		}}
	}

}
