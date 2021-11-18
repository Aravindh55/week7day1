package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Base.BaseClass;

public class EditLeadPage extends BaseClass{
	public EditLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public EditLeadPage verifyEditLeadPage() {
		boolean displayed = driver.findElement(By.id("sectionHeaderTitle_leads")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}
	public EditLeadPage clearExistingName() {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		return this;

	}
	public EditLeadPage updateCompanyname() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		return this;

	}
	public ViewLeadPage clickUpdate() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);

	}
}
