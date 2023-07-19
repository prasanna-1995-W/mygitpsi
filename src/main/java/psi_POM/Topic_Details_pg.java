package psi_POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Topic_Details_pg {
	
	

	@FindBy(xpath="//button[@data-test-id=\"got-it-modal-btn\"]") private WebElement gotittab;
	@FindBy(xpath="//button[@class=\"ant-modal-close\"]") private WebElement closetab;
	
	public Topic_Details_pg(WebDriver driver) {	
		
	PageFactory.initElements(driver,this);
	
}
	public void gotittabclick() {	
	
		gotittab.click();
	}
 	public void closetab() {	
		closetab.click();
	}	 
	
}
