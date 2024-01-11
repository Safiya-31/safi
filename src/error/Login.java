package error;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		    
	        WebDriver driver=new ChromeDriver();
			
		    driver.get("https://demo.nopcommerce.com/");
		     
		    driver.manage().window().maximize();
		    
//			1. Register    
		     
		    driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
		     
		    driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();
		    
		    driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("safiya sharma");
		    
		    driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("safi");
		    
		    driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]")).sendKeys("31");
		    
		    driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]")).sendKeys("may");
		    
		    driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]")).sendKeys("2002");
		    
		    driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("safiayashaik@gmail.com");
		    
		    driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("charani techsoft Pvt Ltd");
		    
		    driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();   
		    
		    driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("Shaik@2002");
		    
		    driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("Shaik@2002");
		    
		    driver.findElement(By.xpath("//button[@id=\"register-button\"]")).click();
		    
		    driver.findElement(By.xpath("//a[@href=\"/login?returnUrl=%2F\"]")).click();
		    
		 // 2. Login
		    
		    driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys("safiayashaik@gmail.com");
		 
		    driver.findElement(By.xpath("//input[@class=\"password\"]")).sendKeys("Shaik@2002");
		    
		    driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click() ;  
		    
		    driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).click();
		    
			//gift 
		    
		    driver.findElement(By.xpath("(//a[@href=\"/gift-cards\"])[1]")).click();
		    
		    //drop down
		    
	         WebElement drop=  driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));    // drop down  for position
		    
		    Select as= new Select(drop);
		    
		    as.selectByValue("5");
		    
		    Thread.sleep(2000);
		    
		    as.selectByValue("10");
		    
		    WebElement task=   driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));   // drop down for display
		    
		    Select sa=new Select(task);
		    
		    sa .selectByValue("6");
		    
		    Thread.sleep(2000);
		    
		    sa.selectByValue("9");
		    
		    Thread.sleep(2000);
		    
		    //virtual gift
		    
		    driver.findElement(By.xpath("(//a[@href=\"/25-virtual-gift-card\"])[4]")).click();
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//input[@id=\"giftcard_43_RecipientName\"]")).sendKeys("Aravind");
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//input[@id=\"giftcard_43_RecipientEmail\"]")).sendKeys("t.aravind646@gmail.com");
		    
		    Thread.sleep(2000);
		  
		    driver.findElement(By.xpath("//textarea[@id=\"giftcard_43_Message\"]")).sendKeys("I Love You ma ");
		      
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-43\"]")).click();
		    
		    driver.navigate().back();    
		    
		    driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-43\"]")).click();
		   
		    Thread.sleep(2000);
		    
		    driver.navigate().back();    
		    
		    //physical gift card
		    
		    driver.findElement(By.xpath("(//a[@href=\"/50-physical-gift-card\"])[4]")).click();
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//input[@id=\"giftcard_44_RecipientName\"]")).sendKeys("safiii");
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//input[@id=\"giftcard_44_RecipientName\"]")).sendKeys(" i miss uh");
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-44\"]")).click();
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-44\"]")).click();
		    
		    //100 physical card
		    
		    driver.findElement(By.xpath("(//a[@href=\"/100-physical-gift-card\"])[2]")).click();
		    
		    driver.findElement(By.xpath("//input[@id=\"giftcard_45_RecipientName\"]")).sendKeys("sony");
		    
		    driver.findElement(By.xpath("// textarea[@id=\"giftcard_45_Message\"]")).sendKeys("ur enugh");
		     
		    driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-45\"]")).click();
		    
		    driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-45\"]")).click();
		    
		    
	}

}
