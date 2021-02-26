package jobBoardProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyHeading {
    public static void main(String[] args) {
    	
    	String expHeader= new String("Welcome to Alchemy Jobs");
    	WebDriver driver = new FirefoxDriver();     
	
        //Open browser
	
        driver.get("https://alchemy.hguy.co/jobs");
      
        WebElement getHeader = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/header/h1"));
        String actHeader = getHeader.getText();
        System.out.println("Expected header: "+expHeader);
        System.out.println("Actual header: "+actHeader);
        
        if(actHeader.equals(expHeader)) {
        	System.out.println("Header matched");
        	
        	//Close browser
        	driver.close();
        }
        else 
        	System.out.println("Header not matched");        
    }
}