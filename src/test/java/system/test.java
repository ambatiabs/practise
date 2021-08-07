package system;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import test1.LoginPage;

public class test {
//@Test(groups= {"OP", "health"})
public void userName() throws InterruptedException {
	System.out.println("hey dude");	
	//Assert.assertEquals("shankar","sai dude");
	System.setProperty("webdriver.chrome.driver",
		      "C:\\abs\\chromedriver_win32_91\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//Thread.sleep(5000);
	driver.get("https://google.com");
	driver.get("https://sites.google.com/a/chromium.org/chromedriver/chromedriver-canary");
	driver.findElement(By.xpath("//input[@id='jot-ui-searchInput']")).sendKeys("qwer");
	driver.findElement(By.xpath("//div[@id='sites-searchbox-search-button']")).click();
	String actualVAlue = driver.findElement(By.xpath("//strong[contains(text(),'\"qwer\"')]")).getText();
	Assert.assertEquals(actualVAlue,"\"qwer\"");
	//Assert.
}
//@Test(groups= {"health"})
public void healthCheck() throws InterruptedException {
	System.out.println("hey dude");	
	//Assert.assertEquals("shankar","sai dude");
	System.setProperty("webdriver.chrome.driver",
		      "C:\\abs\\chromedriver_win32_91\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//Thread.sleep(5000);
	driver.get("https://google.com");
	driver.get("https://sites.google.com/a/chromium.org/chromedriver/chromedriver-canary");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='jot-ui-searchInput']")).sendKeys("qwer");
	driver.findElement(By.xpath("//div[@id='sites-searchbox-search-button']")).click();
	String actualVAlue = driver.findElement(By.xpath("//strong[contains(text(),'\"qwer\"')]")).getText();
	Assert.assertEquals(actualVAlue,"\"qwer\"");
}
@Test(groups= {"OP"})
public void Orderprocessing() throws InterruptedException {
	LoginPage loginpage = new LoginPage();
	System.out.println("hey dude");	
	//Assert.assertEquals("shankar","sai dude");
	System.setProperty("webdriver.chrome.driver",
		      "C:\\abs\\chromedriver_win32_91\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//Thread.sleep(5000);
	driver.get("https://google.com");
	driver.get("https://sites.google.com/a/chromium.org/chromedriver/chromedriver-canary");
	
	loginpage.SearchFunctionality();
	
	String actualVAlue = driver.findElement(By.xpath("//strong[contains(text(),'\"qwer\"')]")).getText();
	System.out.println("git commit");
	Assert.assertEquals(actualVAlue,"\"qwer\"");
	Assert.fail();
	
}
}

