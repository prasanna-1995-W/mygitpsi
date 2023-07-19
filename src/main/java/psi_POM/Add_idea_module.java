package psi_POM;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Add_idea_module {
	//button[@data-test-id="record-btn"]
	
	@FindBy(xpath="//textarea[@data-test-id='idea-title-inp']") private WebElement title;
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[2]/button") private WebElement delete_old;
	@FindBy(xpath="//button[@data-test-id=\"record-btn\"]") private WebElement recordtab;// /html/body/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div[1]/button
	@FindBy(xpath="//button[@data-test-id=\"stop-btn\"]") private WebElement done;
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/div/button") private WebElement play;
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div/button[1]") private WebElement pause_recoding;
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[2]/div[1]") private WebElement pause;
	@FindBy(xpath="//button[@data-test-id=\"delete-audio-btn\"]") private WebElement delete_audio;
	@FindBy(xpath="//button[@data-test-id=\"idea-modal-cta-btn\"]") private WebElement submit_idea;
	

	
	public Add_idea_module(WebDriver driver) {	
	PageFactory.initElements(driver,this);
	}

	public void enter_title() throws InterruptedException {	
		title.sendKeys("my idea updated");
		Thread.sleep(2000);
	}
	public void delete_OA_click() {	
		delete_old.click();
	}
	public void record_click() {	
	
		recordtab.click();
	}
	public void done_click() {	
		done.click();
	}
	public void play_click() {	
		play.click();
	}
	public void pause_record_click() {	
		pause_recoding.click();
	}
	public void pause_click() {	
		pause.click();
	}
	public void delete_click() {	
		delete_audio.click();
	}
	public void submit_idea_click() {	
		submit_idea.click();
	}
	
	
	
	
}

