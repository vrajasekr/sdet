package jobBoardProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getImgUrl {
	public static void main(String[] args) {
	    	
	    WebDriver driver = new FirefoxDriver();     
		
	    //Open browser
		
	    driver.get("https://alchemy.hguy.co/jobs");
	      
	    WebElement getUrlImg = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/header/div/img"));
	    String imgUrl = getUrlImg.getAttribute("src");

	       System.out.println("Image URL: " + imgUrl);
	       
	       driver.close();
       
	}
}

