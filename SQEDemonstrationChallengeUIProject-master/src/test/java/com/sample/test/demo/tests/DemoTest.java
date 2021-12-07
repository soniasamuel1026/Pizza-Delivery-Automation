package com.sample.test.demo.tests;

import org.testng.annotations.Test;
import com.sample.test.demo.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class DemoTest extends TestBase {

	  @Test (priority=1)	
    public void demoTest() {
        System.out.println("HELLO WORLD");
        
    }
	  @Test (priority=2)	
    public void happyPath()
    {
    	//Pizza1
    	Select s = new Select(driver.findElement(By.id("pizza1Pizza")));
    	   	
    	s.selectByIndex(2);
    	
    	
    	//Toppings1
    	Select s1=new Select(driver.findElement(By.xpath("//div[@id='pizza1']//select[@class='toppings1']")));
    	s1.selectByIndex(4);
    	
    	
    	//Toppings2
    	Select s2=new Select(driver.findElement(By.xpath("//div[@id='pizza1']//select[@class='toppings2']")));
    	s2.selectByIndex(5);
    	
    	//Quantity
    	driver.findElement(By.id("pizza1Qty")).sendKeys("2");
    	
    	//Name
    	driver.findElement(By.id("name")).sendKeys("Arvind");
    	
    	//Email 	
    	
    	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
    	
    	//Phone Number 	
    	
    	driver.findElement(By.id("phone")).sendKeys("9999999999");
    	
    	
    	//Cash on Pickup
    	driver.findElement(By.id("cashpayment")).click();;
    	
    	
    	  try {
    			Thread.sleep(5000L);
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	
   // 	Place Order
    	driver.findElement(By.id("placeOrder")).click();
    	
    	
    	  try {
  			Thread.sleep(5000L);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
    	
    	driver.findElement(By.xpath("/html/body/div[5]/div[1]/button/span[1]")).click();
    	driver.findElement(By.id("reset")).click();
     	
    }
	  
	  
	  //Negative Case
	  
	  @Test (priority=3)	
	    public void negativeCase()
	    {
	    	//Pizza1
	    	Select s = new Select(driver.findElement(By.id("pizza1Pizza")));
	    	   	
	    	s.selectByIndex(2);
	    	
	    	
	    	//Toppings1
	    	Select s1=new Select(driver.findElement(By.xpath("//div[@id='pizza1']//select[@class='toppings1']")));
	    	s1.selectByIndex(4);
	    	
	    	
	    	//Toppings2
	    	Select s2=new Select(driver.findElement(By.xpath("//div[@id='pizza1']//select[@class='toppings2']")));
	    	s2.selectByIndex(5);
	    	
	    	//Quantity
	    	driver.findElement(By.id("pizza1Qty")).sendKeys("2");
	    	
	    	//Name
	    	//driver.findElement(By.id("name")).sendKeys("Abhinav");
	    	
	    	//Email 	
	    	
	    	driver.findElement(By.id("email")).sendKeys("def@gmail.com");
	    	
	    	//Phone Number 	
	    	
	    //	driver.findElement(By.id("phone")).sendKeys("9999999999");
	    	
	    	
	    	//Cash on Pickup
	    	driver.findElement(By.id("cashpayment")).click();;
	    	
	    	
	    	  try {
	    			Thread.sleep(5000L);
	    		} catch (InterruptedException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	    	
	   // 	Place Order
	    	driver.findElement(By.id("placeOrder")).click();
	    	
	    	
	    	  try {
	  			Thread.sleep(5000L);
	  		} catch (InterruptedException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
	    	
	
	    
	    	
	     	
	    }
     

}
