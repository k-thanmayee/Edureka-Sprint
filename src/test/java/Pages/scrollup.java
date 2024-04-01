package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class scrollup {
	WebDriver driver;

	public scrollup(WebDriver driver) {
		this.driver= driver;
	    PageFactory.initElements( driver, this);
	}

	@FindBy(xpath="//*[@id='mCSB_1_container']/li[1]/a")
	WebElement courseclick;

	@FindBy(xpath="/html/body/a")
	WebElement scrollupbutton;

	@FindBy(xpath="//*[@id='b2bhead']/article[1]/section/div/div/h1")
	WebElement text;
	
	public void ScrollDown() {
		JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public void Scrollclick() {
		scrollupbutton.click();
	}

	public void Compare() {
		String value=text.getText();
		SoftAssert as=new SoftAssert();
		as.assertEquals(value,"CORPORATE TRAINING");
	}

}
