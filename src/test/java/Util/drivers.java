package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class drivers {
	
	public static WebDriver driver ;
	
   public void manage_browser(String browsername){
	   
        if (driver ==null){
        if(browsername.equalsIgnoreCase("FF")){
        	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\drivers\\geckodriver.exe");
        	driver = new FirefoxDriver();
        }
   
        	
       } else if(browsername.equalsIgnoreCase("CH")){
        	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
        	driver = new ChromeDriver();
       }
   
        
   }


     
   
   public void closebrowser(){
   driver = null;
   }
       }
       
        
        
        /*   case "IE"
    	System.setProperty("webdriver.ie.driver", "C:\\Program Files\\drivers\\IEDriverServer.exe");
    	driver = new InternetExplorerDriver();
   
   }*/





