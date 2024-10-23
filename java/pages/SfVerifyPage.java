package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;

public class SfVerifyPage extends Base {
	public SfVerifyPage(ChromeDriver driver) {
		this.driver = driver;
		
	}
	public SfVerifyPage verify()
	{
		String db = driver.findElement(By.xpath("//*[@slot='primaryField']")).getText();
		if (db.contains("Shanmuganathan")) {
			System.out.println("The Account is created");
		} else {
			System.out.println("The Account is not created");
		}
			return this;
	}

}
