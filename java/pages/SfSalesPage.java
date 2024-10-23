package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;

public class SfSalesPage extends Base {
	public SfSalesPage(ChromeDriver driver) {
		this.driver = driver;
	}
	public SfSalesPage clickOnToggle()
	{
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;
	}
	public SfSalesPage clickOnViewAll()
	{
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		return this;
	}
	public SfOpportunityPage clickOnSales()
	{
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		return new SfOpportunityPage(driver);
	}

}
