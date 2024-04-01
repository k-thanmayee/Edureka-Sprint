package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class courses {
	WebDriver driver;

	public courses(WebDriver driver) {
		this.driver= driver;
	    PageFactory.initElements( driver, this);
	}

	@FindBy(className="ga_corporate_click")
	WebElement corp;

	@FindBy(xpath="//*[@id='mCSB_1_container']/li[1]/a")
	WebElement courseclick;

	@FindBy(xpath="//*[@id='corpcat-2-cl-co']/div/div[3]/a")
	WebElement subcourse;

	@FindBy(xpath="//*[@id=\"corp-course-modal-title\"]/span")
	WebElement coursename;
	
	public void Corptrainpage() {
		corp.click();
		JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollTo(0,1225)");
	}

	public void Courseclick() {
		courseclick.click();
	}

	public void Subcourseclick() {
		subcourse.click();
	}

	public void CompanyName() {
		String subcourse=coursename.getText();
		SoftAssert as=new SoftAssert();
		as.assertEquals(subcourse,"Microservices Certification Training Course");
	}

}
