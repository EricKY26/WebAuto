package createNeteaseAlbum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class createNeteaseAlbum {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin", "H:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://photo.163.com");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'http://blog.163.com/newpage/ursweb/tmpl2/loginurs.html')]")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'x-URS-iframe')]")));
		
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("laotest99@163.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("qa1234");
		WebElement loginElement = driver.findElement(By.id("dologin"));
		loginElement.click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
		
		WebElement albumElement = driver.findElement(By.className("album"));
		albumElement.click();
		
		WebElement createAlbum = driver.findElement(By.linkText("¥¥Ω®œ‡≤·"));
		createAlbum.click();
		
		WebElement albumName = driver.findElement(By.name("fm-0"));
		albumName.sendKeys("autoName01");
		
		WebElement albumDesc = driver.findElement(By.name("fm-1"));
		albumDesc.sendKeys("autoDesc01");
		
		WebElement ensureCreate = driver.findElement(By.name("fm-a"));
		ensureCreate.click();
		
		driver.quit();
	}
	
	
//    public static void highlight(WebDriver driver, WebElement element) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("element = arguments[0];" +
//        "original_style = element.getAttribute('style');" +
//        "element.setAttribute('style', original_style + \";" +
//        "background: yellow; border: 2px solid red;\");" +
//        "setTimeout(function(){element.setAttribute('style', original_style);}, 2000);", element);
//        }
}
