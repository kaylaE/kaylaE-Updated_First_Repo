package Util;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Reusable_methods extends drivers{
//dependency injection concept	
    
     public void launch_url(String url){
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 		driver.get(url);  
 	
     }
     
    public void TextField(String text,String text1){
    	driver.findElement(By.id(text)).sendKeys(text1);
    }
     
     public void do_click (String text){
    	driver.findElement(By.id( text)).click();
    	
     }
   public void click_link_text(String text){
	   driver.findElement(By.linkText(text)).click();
   }
     public void assert_text(String text){
    	String Main_title = driver.getTitle() ;
	    String Expected_Title = text;
	    Assert.assertEquals(Main_title, Expected_Title);
     }

	/*public void do_click(String string) {
		String Actual = driver.findElement(By.cssSelector(".content-header")).getText();
	    String Expected = "Book Your Jet";
	    Assert.assertEquals(Actual,Expected);
		
	}

	public void assert_text1 (String text1) {
		String Actual = driver.getTitle();
	    String Expected = text1;
	    Assert.assertEquals(Actual,Expected);
		
	*/

	
		
	}


		
	

