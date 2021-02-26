package jobBoardProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getTitle {
    public static void main(String[] args) {
    	
        WebDriver driver = new FirefoxDriver();     
	
        //Open browser
	
        driver.get("https://alchemy.hguy.co/jobs");
        
        //get title
        String actTitle = driver.getTitle();
        
        //print title in console    	
        
        String expTitle= new String("Alchemy Jobs – Job Board Application");
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