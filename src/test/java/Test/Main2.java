package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Main2 {
	
	 WebDriver driver ;

	@Test
	public void test() throws InterruptedException {

	
       driver = new ChromeDriver();

        driver.get("https://www.automationanywhere.com");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);
	}
	
	@Test
	public void test1()
	{
	
        driver.navigate().refresh();
        // Perform Mouse over on Products
        WebElement products = driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
        Actions action = new Actions(driver);
        action.moveToElement(products).perform();
        //Thread.sleep(100000);
	}
      
	@Test
	public void test2() throws InterruptedException {
        // Click on Process Discovery
        WebElement processDiscovery = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[2]/div/div/div/div/div[3]/ul/li[1]/ul/li/a"));
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        action.moveToElement(processDiscovery).perform();
        processDiscovery.click();

        // Verify the navigation to Process Discovery URL
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://www.automationanywhere.com/products/process-discovery")) {
            System.out.println("Navigated to Process Discovery page successfully");
        } else {
            System.out.println("Failed to navigate to Process Discovery page");
        }

	}
	
	@Test
	public void test3() throws InterruptedException {
		  driver.navigate().to("https://www.automationanywhere.com");
	        driver.manage().window().maximize();
	        
	        Thread.sleep(5000);
	        
	        driver.navigate().refresh();
	        
	        WebElement requestDemoButton = driver.findElement(By.xpath("//*[@id=\"block-mainpagecontent-2\"]/article/div/div/div/div[1]/div/div/div/div[1]/div/a[1]"));
	        requestDemoButton.click();
	        
	        assertEquals("https://www.automationanywhere.com/request-live-demo", driver.getCurrentUrl());
	        
	        
	        WebElement firstNameLabel = driver.findElement(By.id("LblFirstName"));
	        WebElement lastNameLabel = driver.findElement(By.id("LblLastName"));

	        assertTrue(firstNameLabel.isDisplayed());
	        assertTrue(lastNameLabel.isDisplayed());
	        
	        System.out.println("Test Is Passed");
	}

	private void assertTrue(boolean displayed) {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(String string, String currentUrl) {
		// TODO Auto-generated method stub
		
	}
}
