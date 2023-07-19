package psi_POM;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Add_idea_b15 {
	
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div[1]/div[3]/button")
	private WebElement addideatab;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div[1]/div[3]/div/button")
	private WebElement edit_ideatab;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[3]/div/div[1]/div[3]/div/button")
	private WebElement joindistab;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div[1]/div[3]/div/button")
	private WebElement join_live_distab;


	public Add_idea_b15(WebDriver driver) {			
	PageFactory.initElements(driver,this);
	}
	
	public void addidea_click() {	
		addideatab.click();
	}
	public void editidea_click() {	
		edit_ideatab.click();
	}
	public void joindis_click() {	
		joindistab.click();
	}
	public void join_live_distab_click() {	
		join_live_distab.click();
	}
	
	
}
