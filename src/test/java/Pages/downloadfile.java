package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class downloadfile {
	WebDriver driver;

	public downloadfile(WebDriver driver) {
		this.driver= driver;
	    PageFactory.initElements( driver, this);
	}

	@FindBy(xpath="//*[@id='b2bhead']/article[4]/div/div[3]/div/a")
	WebElement downloadbutton;

	@FindBy(xpath="//*[@id='popup-query-form']/div/div[7]/a")
	WebElement downloadfile;
	
	public void downloadlinkbutton() {
		JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollTo(0,1500)");
		downloadbutton.click();
	}

	public void SubmitFile() {
		downloadfile.click();
	}

}
