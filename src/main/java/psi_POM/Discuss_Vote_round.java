package psi_POM;




import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Discuss_Vote_round {
	
	
	@FindBy(xpath="//span[@class=\"anticon anticon-plus-circle mx-2 my-2 rounded-full text-2xl md:mx-3 md:text-3xl border-primary-6 bg-primary-6 hover:text-primary-6 dark:text-neutral-10 dark:hover:text-primary-6 dark:hover:bg-neutral-10 box-border border-[3px] text-white hover:bg-white\"]")
	private WebElement voteI;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/span") private WebElement voteD;
	@FindBy(xpath="//button[@data-test-id=\"discussion-table-mute\"]") private WebElement unmute;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[4]/div[2]/div[2]/div[1]/button") private WebElement mute;
	@FindBy(xpath="/html/body/div[1]/div/section/section/aside/div/div/div[3]/div[2]/div/div/span/input") private WebElement typemessage;
	@FindBy(xpath="/html/body/div[1]/div/section/section/aside/div/div/div[3]/div[2]/div/div/span/span/button") private WebElement send;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[4]/div[2]/div[2]/button") private WebElement hand_raise;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[4]/div[2]/div[2]/div[2]/button[4]") private WebElement reaction4;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[4]/div[2]/div[2]/div[2]/button[3]") private WebElement reaction3;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[4]/div[2]/div[2]/div[2]/button[2]") private WebElement reaction2;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[4]/div[2]/div[2]/div[2]/button[1]") private WebElement reaction1;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[4]/div[2]/div[2]/div[2]/button[1]") private WebElement avatar;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[4]/div[2]/div[2]/div[2]/button[1]") private WebElement report_tab;



	
	public Discuss_Vote_round(WebDriver driver) {	
//		///html/body/div[1]/div/section/section/main/div/div/div[2]/div/div[2]/div/div[2]/div[1]/button
	PageFactory.initElements(driver,this);
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
	}
	

	public void mute_click() {	

		unmute.click();	
	}
public void unmute_click() {	
		
		mute.click();	
	}
	
	public void type_message() {
		typemessage.sendKeys("prasanna.wadgaonkar+1@raftlabs.co");	
	}
	public void Send_message() {	
		send.click();
	}	
	public void hand_raise_click() {	
		hand_raise.click();	
	}
	public void reaction_click() {	
		reaction4.click();	
		reaction3.click();
		reaction2.click();
		reaction1.click();
	}
	public void avatar_click() {	
		avatar.click();	
	}
	public void report_click() {	
		report_tab.click();	
	}
	
	public void vote_inc_click() {	
		voteI.click();	
	}
	public void vote_dec_click() {	
		voteD.click();	
	}

	
}


// /html/body/div[1]/div/section/section/main/div/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/span vote -
// /html/body/div[1]/div/section/section/main/div/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/span vote + 
// //button[@data-test-id="discussion-table-unmute"] mute-unmute 
// /html/body/div[1]/div/section/section/main/div/div/div[4]/div[2]/div[2]/button hand raise
// /html/body/div[1]/div/section/section/main/div/div/div[4]/div[2]/div[2]/div[2]/button[4] reaction btn
// /html/body/div[1]/div/section/section/main/div/div/div[4]/div[1]/div[1]/div/span[1] avatar 
// /html/body/div[4]/div/div[2]/div/div/div/div[5]/div/button report participant

