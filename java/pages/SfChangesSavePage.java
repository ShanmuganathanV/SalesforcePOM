package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;

public class SfChangesSavePage extends Base {
	public SfChangesSavePage(ChromeDriver driver) {
		this.driver = driver;
	}
	public SfChangesSavePage clickOnNew() throws InterruptedException {
	// clicking new option
				driver.findElement(By.xpath("//a/div[text()='New']")).click();
				Thread.sleep(2000);
				return this;
	}
	
	public SfChangesSavePage clickOpportunityName() throws InterruptedException {
				// Opportunity name
				driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Shanmuganathan");
				Thread.sleep(2000);
				return this;
	}
	public SfChangesSavePage enterAmount() throws InterruptedException
	{
				// Amount
				driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
				Thread.sleep(3000);
				return this;
	}
	public SfChangesSavePage enterDate() throws InterruptedException
	{
				// Choose the close date today
				driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
				Thread.sleep(3000);
				return this;
	}
	public SfChangesSavePage chooseToday() throws InterruptedException
	{
				// CHoose the today
				driver.findElement(By.xpath("//button[text()='Today']")).click();
				Thread.sleep(3000);
				return this;
	}
	public SfChangesSavePage clickStage() throws InterruptedException
	{
	
				// click on stage
				driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
				Thread.sleep(3000);
				return this;
	}
	public SfChangesSavePage selectNeedAnalysis() throws InterruptedException {
				// click on need analysis
				driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
				Thread.sleep(3000);
				return this;
	}
	public SfVerifyPage clickSave() throws InterruptedException
	{
				// click on save
				driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
				Thread.sleep(8000);
				return new SfVerifyPage(driver);
	}
	

}
