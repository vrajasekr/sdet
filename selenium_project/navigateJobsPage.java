package jobBoardProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigateJobsPage {
	public static void main(String[] args) {
    	
    	String expHeader= new String("Welcome to Alchemy Jobs");
    	WebDriver driver = new FirefoxDriver();     
	
        //Open browser
	
        driver.get("https://alchemy.hguy.co/jobs");
      
        driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();
        
      //get title
        String actTitle = driver.getTitle();
        
        //print title in console
	
        System.out.println(actTitle);
        
        String expTitle= new String("Jobs – Alchemy Jobs");
        System.out.println("Expected Title: " + expTitle);
        System.out.println("Actual Title: " + actTitle);
        
        if(actTitle.equals(expTitle)) {
        	System.out.println("Title matched");
        	
        	//Close browser
        	driver.close();
        }
        else 
        	System.out.println("Title not matched");
	}
}
