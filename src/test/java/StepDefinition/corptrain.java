package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.connectwithus;
import Pages.courses;
import Pages.downloadfile;
import Pages.scrollup;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class corptrain {
	
	WebDriver driver;
	@Before
	public void setdriver() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co/");
		
	}
	
	@Given("I am Edureka Home Page")
	public void i_am_edureka_home_page() {
	    
	}

	@When("I click on Corporate Training link")
	public void i_click_on_corporate_training_link() {
		connectwithus cwu=new connectwithus(driver);
		cwu.corptrainpage();
	}

	@When("I click on Connect with us button")
	public void i_click_on_connect_with_us_button() {
		connectwithus cwu=new connectwithus(driver);
		cwu.connectButton();
	}

	@When("I enter name {string}")
	public void i_enter_name(String name) {
		connectwithus cwu=new connectwithus(driver);
		cwu.firstname(name);
	}

	@When("I enter company name {string}")
	public void i_enter_company_name(String cname) {
		connectwithus cwu=new connectwithus(driver);
		cwu.CompanyName(cname);
	}

	@When("I enter Training Need {string}")
	public void i_enter_training_need(String tname) {
		connectwithus cwu=new connectwithus(driver);
		cwu.trainingNeeded(tname);
	}

	@When("I enter EmailId {string}")
	public void i_enter_email_id(String email) {
		connectwithus cwu=new connectwithus(driver);
		cwu.eMail(email);
	}

	@When("I enter Phone number {string}")
	public void i_enter_phone_number(String phone) {
		connectwithus cwu=new connectwithus(driver);
		cwu.phnNum(phone);
	}

	@When("I click on Submit")
	public void i_click_on_submit() {
		connectwithus cwu=new connectwithus(driver);
		cwu.Submit();
	}

	@Then("it is submitted successfully")
	public void it_is_submitted_successfully() {
		
	}

	@When("I click on Corporate Training link and scroll down")
	public void i_click_on_corporate_training_link_and_scroll_down() {
		courses c=new courses(driver);
		c.Corptrainpage();
	}

	@When("I click on Cloud Computing")
	public void i_click_on_cloud_computing() {
		courses c=new courses(driver);
		c.Courseclick();
	}
	
	@When("I click on Microservices Certification Training Course")
	public void i_click_on_microservices_certification_training_course() {
		courses c=new courses(driver);
		c.Subcourseclick();
	}
	
	@Then("I enter into the submitform block")
	public void i_enter_into_the_submitform_block() {
		courses c=new courses(driver);
		c.CompanyName();
	}
	
	@When("I scroll to the bottom")
	public void i_scroll_to_the_bottom() {
		scrollup su=new scrollup(driver);
		su.ScrollDown();
	}

	@When("I click on Scroll Up")
	public void i_click_on_scroll_up() {
		scrollup su=new scrollup(driver);
		su.Scrollclick();
	}

	@Then("I will scroll to top of the page")
	public void i_will_scroll_to_top_of_the_page() {
		scrollup su=new scrollup(driver);
		su.Compare();
	}

	@When("I scroll down and click on Download Full Course List")
	public void i_scroll_down_and_click_on_download_full_course_list() {
		downloadfile df=new downloadfile(driver);
		df.downloadlinkbutton();
	}


	@When("I click on Download Full Course List")
	public void i_click_on_download_full_course_list() {
		downloadfile df=new downloadfile(driver);
		df.SubmitFile();
	}

}
