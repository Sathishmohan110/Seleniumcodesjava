import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sathi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_833o4zmtnn_b&adgrpid=55759171661&hvpone=&hvptwo=&hvadid=294130660745&hvpos=&hvnetw=g&hvrand=2756183021612939197&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9050527&hvtargid=kwd-326600735004&hydadcr=5840_1914862&gclid=CjwKCAjwt7SWBhAnEiwAx8ZLahLZDGj5LFYf5ytfqVOMhHiyrtibGaMbUPCfgi70XzmPVxt5-ilVVxoC7qgQAvD_BwE");
	   Actions action =new Actions(driver);
	   
	  // action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
	   //driver.findElement(By.xpath("//a[@id='nav_prefetch_yourorders']")).click();
	   action.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("ehell").build().perform();
	}

}
