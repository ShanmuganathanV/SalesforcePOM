package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;

public class SfLoginpage extends Base {
	public SfLoginpage(ChromeDriver driver) {
		this.driver = driver;
	}
	public SfLoginpage enterTheUsername()
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf.com");
		return this;
	}
	public SfLoginpage enterThePassword()
	{
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@2024");
		return this;
	}
	public  SfSalesPage clickLogin()
	{
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		return new SfSalesPage(driver);
	}

}
