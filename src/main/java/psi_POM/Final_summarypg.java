package psi_POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final_summarypg {
	
	
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div/div[4]/button") private WebElement viewODisc;

	
	public Final_summarypg(WebDriver driver) {	

	PageFactory.initElements(driver,this);

	}
	
	public void view_click(WebDriver driver) {
	
		viewODisc.click();	
	}
	
}



