package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class connectwithus {
	WebDriver driver;

	public connectwithus(WebDriver driver) {
		this.driver= driver;
	    PageFactory.initElements( driver, this);
	}

	@FindBy(className="ga_corporate_click")
	WebElement corptraining;

	@FindBy(xpath="//button[@data-toggle='modal']")
	WebElement ConnectWithUs;

	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/form/div/div[1]/input")
	WebElement name;

	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/form/div/div[2]/input")
	WebElement companyname;

	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/form/div/div[3]/select")
	WebElement trainingneeded;

	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/form/div/div[4]/input")
	WebElement email;

	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/form/div/div[5]/div/input")
	WebElement phnnum;

	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/form/div/div[7]/button")
	WebElement submitbutton;

	public void corptrainpage() {
		corptraining.click();
	}

	public void connectButton() {
		ConnectWithUs.click();
	}

	public void firstname(String fname) {
		name.sendKeys(fname);
	}

	public void CompanyName(String compname) {
		companyname.sendKeys(compname);
	}

	public void trainingNeeded(String trainneed) {
		Select s2= new Select(trainingneeded);
		s2.selectByVisibleText(trainneed);
	}

	public void eMail(String mail) {
		email.sendKeys(mail);
	}

	public void phnNum(String phnnumb) {
		phnnum.sendKeys(phnnumb);
	}


	public void Submit() {
		submitbutton.click();
	}

}
