package psi_POM;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WaitingRoomPg {
	
	
	@FindBy(xpath="/html/body/div[1]/div/section/section/aside/div/div/div[3]/div[2]/div/div/span/input") private WebElement typemessage;
	@FindBy(xpath="/html/body/div[1]/div/section/section/aside/div/div/div[3]/div[2]/div/div/span/span/button") private WebElement send;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div[2]/div/div[1]/div/div/div/div/div/div/table/tbody/tr/td[2]/span/button")
	private WebElement edit;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div[3]/div[2]/div/button") private WebElement unmuteRq;
	
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div[3]/div[2]/div/div[2]/button[4]") private WebElement reaction4;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div[3]/div[2]/div/div[2]/button[3]") private WebElement reaction3;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div[3]/div[2]/div/div[2]/button[2]") private WebElement reaction2;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div[3]/div[2]/div/div[2]/button[1]") private WebElement reaction1;
	
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div[3]/div[2]/button[2]") private WebElement leave;
	@FindBy(xpath="/html/body/div[6]/div/div[2]/div/div[2]/div/div/div[2]/button[2]") private WebElement goback;
	
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div[3]/div[2]/button[1]") private WebElement test_audio;
	@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[2]/button") private WebElement close_TA;
//	@FindBy(xpath="//button[@data-test-id=\"record-btn\"]") private WebElement record;
//	@FindBy(xpath="//button[@data-test-id=\"record-btn\"]") private WebElement play;
	
	
	///html/body/div[1]/div/section/section/main/div/div/div[3]/div/div[1]/button
	
	public WaitingRoomPg(WebDriver driver) {	// //button[@data-test-id="record-btn"]
		
	PageFactory.initElements(driver,this);
	}
	
	
	public void type_message() {
		typemessage.sendKeys("prasanna.wadgaonkar+1@raftlabs.co");	
	}
	
	public void Send_message() {	
		send.click();
	}
	public void edit_btn() {	
		edit.click();
	}
	public void unmuteRq_btn() {
		unmuteRq.click();
	}
	public void reaction_btn() {	
		reaction4.click();reaction3.click();reaction2.click();reaction1.click();
	}
	public void leave_btn() {	
		leave.click();	
	}
	public void goback_btn() {	
		goback.click();	
	}
	public void test_audio_btn() {	
		test_audio.click();	
	}
	public void close_test_audio_btn() {	
		close_TA.click();	
	}



}
// /html/body/div[1]/div/section/section/aside/div/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div/div

// /html/body/div[1]/div/section/section/aside/div/div/div[2]/div/div[2]/div/div[1]/div/div[2]
