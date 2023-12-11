package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {

    public static void main(String[] args) throws InterruptedException {

       // System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.automationanywhere.com");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);

        driver.navigate().refresh();
        // Perform Mouse over on Products
        WebElement products = driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
        Actions action = new Actions(driver);
        action.moveToElement(products).perform();
        //Thread.sleep(100000);

      
        // Click on Process Discovery
        WebElement processDiscovery = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[2]/div/div/div/div/div[3]/ul/li[1]/ul/li/a"));
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

        driver.quit();
    }
}
