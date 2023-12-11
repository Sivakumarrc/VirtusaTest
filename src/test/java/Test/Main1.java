package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.automationanywhere.com");
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
        
        
        driver.quit();

	}

	private static void assertTrue(boolean displayed) {
		// TODO Auto-generated method stub
		
	}

	private static void assertEquals(String string, String currentUrl) {
		// TODO Auto-generated method stub
		
	}

}
