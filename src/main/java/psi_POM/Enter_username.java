package psi_POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Enter_username {
	
//	private WebElement enter_name;
//	private WebElement letsgo;
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div/div[2]/div[1]/div/form/div[1]/div/div[2]/div/div/input") private WebElement enter_name;
	@FindBy(xpath="//button[@data-test-id=\"lets-go-btn\"]") private WebElement letsgo;
	
	public Enter_username(WebDriver driver) {	
		PageFactory.initElements(driver,this);
//		enter_name = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div[1]/div/form/div[1]/div/div[2]/div/div/input"));
//		letsgo = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div[1]/div/form/button"));
	
	}// //button[@data-test-id=\"stop-btn\"]
	// /html/body/div[1]/div/div/div[1]/div/div[2]/div[1]/div/form/div[1]/div/div[2]/div/div/input
	public void enter_name() {	
		enter_name.sendKeys("guest user1");
	}
	
	public void letsgo_click() {	
		letsgo.click();
	}
	
		
	
}
