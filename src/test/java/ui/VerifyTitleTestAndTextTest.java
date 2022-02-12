/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 *
 * @author Asus
 */
public class VerifyTitleTestAndTextTest {
    
    @Test
    public void titleTest(){
        
        SoftAssert softassert = new SoftAssert();
        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        String expectedText = "Search";
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        
        System.out.println("Verifying title");
        
        String actualTitle = driver.getTitle();
        softassert.assertEquals(actualTitle, expectedTitle, "Title verification failed");
        
        System.out.println("Verifying text");
        String actualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
        softassert.assertEquals(actualText, expectedText, "Text verification failed");
        System.out.println("Closing Browser");
        driver.close();
        
        softassert.assertAll();
    }
}
