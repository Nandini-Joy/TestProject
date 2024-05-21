package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCases {
	WebDriver driver;
	
	   public TestCases(WebDriver driver)
	   {
		   this.driver=driver;
	   }
	   
	   //Repository
	   By CreateAccount=By.linkText("Create an Account");
	   By firstname=By.xpath("//input[@name='firstname']");
	   By lastname=By.xpath("//input[@name='lastname']");
	   By Email=By.xpath("//input[@name='email']");
	   By Password=By.xpath("//input[@name='password']");
	   By ConfirmPassword=By.xpath("//input[@name='password_confirmation']");
	   By Submit=By.xpath("//button[@class='action submit primary']");
	   By Whatsnew=By.xpath("//ul[@id='ui-id-2']/child::li[1]/child::a[1]");
	   By Hoodies=By.xpath("//div[@class='categories-menu']/child::ul[1]/child::li[1]/child::a[1]");
	   By Pic=By.xpath("//ol[@class='products list items product-items']/child::li[1]/child::div[1]/child::a[1]/child::span[1]/child::span[1]/child::img[1]");
	   By Size=By.xpath("//div[@class='swatch-opt']/child::div[1]/child::div[1]/child::div[2]");
	   By Color=By.xpath("//div[@class='swatch-attribute color']/child::div[1]/child::div[3]");
	   By Cart=By.xpath("//button[@title='Add to Cart']");
	   By MoreInfo=By.xpath("//div[@class='product data items']/child::div[3]/child::a[1]");
	   By Home=By.xpath("//a[@title='Go to Home Page']");
	   By signin=By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
	   By EmailinSignInPage=By.xpath("//input[@id='email']");
	   By PasswordinSignInPage=By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']");
	   
	   
	   public void ClickonAccountLink()
	   
	   {
		   try {
		   driver.findElement(CreateAccount).click();
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception cauch :" + e.getMessage());
		   }
	   }
	   public void ClickonFirstname(String fname)
	   
	   {
		   try {
		   driver.findElement(firstname).sendKeys(fname);
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception cauch :" + e.getMessage());
		   }
		   
	   }
	   public void ClickonLastname(String lname)
	   {
		   try {
			   driver.findElement(lastname).sendKeys(lname);
			   }
			   catch(Exception e)
			   {
				   System.out.println("Exception cauch :" + e.getMessage());
			   }
		   
	   }
	   
	   public void EnterEmail(String Em)
	   {
		   try {
			   driver.findElement(Email) .sendKeys(Em);
			   }
			   catch(Exception e)
			   {
				   System.out.println("Exception cauch :" + e.getMessage());
			   }
		  
	   }
	   public void EnterPassword(String Epass)
	   {
		   try {
			   driver.findElement(Password).sendKeys(Epass);
			   }
			   catch(Exception e)
			   {
				   System.out.println("Exception cauch :" + e.getMessage());
			   }
		   
		   
	   }
	   public void EnterPasswordAgain(String CPass)
	   {
		   try {
			   driver.findElement(ConfirmPassword).sendKeys(CPass);
			   }
			   catch(Exception e)
			   {
				   System.out.println("Exception cauch :" + e.getMessage());
			   }
		   
		   
	   }
	   public void ClickonSubmit()
	   {
		   try {
			   driver.findElement(Submit).click();
			   }
			   catch(Exception e)
			   {
				   System.out.println("Exception cauch :" + e.getMessage());
			   }
		   
	   }
	   public void ClickonWhatsNew()
	   {
		   try {
			   driver.findElement(Whatsnew).click();
			   }
			   catch(Exception e)
			   {
				   System.out.println("Exception cauch :" + e.getMessage());
			   }
		   
		   
	   }
	   
	   public void ClickonHoodies()
	   {
		   try {
			   driver.findElement(Hoodies).click();
			   }
			   catch(Exception e)
			   {
				   System.out.println("Exception cauch :" + e.getMessage());
			   }
		
	   }
	   public void ClickonPic()
	   {
		   try {
			   driver.findElement(Pic).click();
			   }
			   catch(Exception e)
			   {
				   System.out.println("Exception cauch :" + e.getMessage());
			   }
		   
	   }
	   public void ClickonSize()
	   {
		   try {
			   driver.findElement(Size).click();
			   }
			   catch(Exception e)
			   {
				   System.out.println("Exception cauch :" + e.getMessage());
			   }
		   
	   }
	   public void ClickonColor()
	   {

		   try {
			   driver.findElement(Color).click();
			   }
			   catch(Exception e)
			   {
				   System.out.println("Exception cauch :" + e.getMessage());
			   }
		   
	   }
	   public void ClickOnCart()
	   {
		   try {
			   driver.findElement(Cart).click();
			   }
			   catch(Exception e)
			   {
				   System.out.println("Exception cauch :" + e.getMessage());
			   }
		   
	   }
	   public void ClickonMoreInfo()
	   {
	   try {
		   driver.findElement(MoreInfo).click();
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception cauch :" + e.getMessage());
		   }
	   
		   
	   }
	   public void ClickonHome()
	   {
		   try {
			   driver.findElement(Home).click();
			   }
			   catch(Exception e)
			   {
				   System.out.println("Exception cauch :" + e.getMessage());
			   }
		   
	   }
	   public void ClickOnSignin()
	   {
		   try {
		   driver.findElement(signin).click();
		   Thread.sleep(2000);
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception caught :" + e.getMessage());
		   }
	   }
	   public void loginCredentials(String Enteremail, String Enterpassword)
		{
			driver.findElement(EmailinSignInPage).sendKeys(Enteremail);
			driver.findElement(PasswordinSignInPage).sendKeys(Enterpassword);
		}
	
	
	
	
	
	

}
