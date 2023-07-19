package psi_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateDiscussiontab {
	
	
    public CreateDiscussiontab(WebDriver driver ){
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/div[4]/button[1]")
	
	private WebElement NewDiscussions;
	
	public void NewDiss_btn() {	
		NewDiscussions.click();
	}
	
	

}
