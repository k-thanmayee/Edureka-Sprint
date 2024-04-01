package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ExcelStepDef {
	WebDriver driver = new ChromeDriver();
	@Test(dataProvider = "loginData" , dataProviderClass = ExcelData.class)
	public  void TestExcel(String name,String trainingneeded, String email, String phoneno)
	{
	driver.get("https://www.edureka.co/");
	driver.findElement(By.className("ga_corporate_click")).click();
	driver.findElement(By.xpath("//button[@data-toggle='modal']")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/form/div/div[1]/input")).sendKeys(name);
    WebElement e= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/form/div/div[3]/select"));
    Select s2= new Select(e);
	s2.selectByVisibleText(trainingneeded);
    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/form/div/div[4]/input")).sendKeys(email);
    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/form/div/div[5]/div/input")).sendKeys(phoneno);
    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/form/div/div[7]/button")).click();
	}
}
