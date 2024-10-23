package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;

public class SfOpportunityPage extends Base {
	public SfOpportunityPage(ChromeDriver driver) {
		this.driver = driver;
	}
	public SfChangesSavePage clickOnOpportunity()
	{
		WebElement clickableElement1 = driver.findElement(By.xpath("//a/span[text()='Opportunities']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", clickableElement1);
		return new SfChangesSavePage(driver);
	}

}
