package psi_POM;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Review_IdeasPg {
	
	
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[3]/div/div[1]/button") private WebElement joindiscR;
	@FindBy(xpath="//button[@class='ant-btn css-adaxxp ant-btn-default font-InterTight md:text-cta-med inline-block px-3 text-[14px] font-semibold md:px-4 text-primary-6 bg-primary-1 hover:ring-primary-6 border-none transition-all hover:ring-1']")
	private WebElement playaudio;
    
	
	public Review_IdeasPg(WebDriver driver) {	

	PageFactory.initElements(driver,this);
	
	}
	
	public void joinDiscR() {
		
		joindiscR.click();
	}
	
	public void play_audio_click(WebDriver driver) {	
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(30));
		wait.until(ExpectedConditions.textToBePresentInElement(playaudio, "Play pitch"));

		List<WebElement> play = driver.findElements(By.xpath("//button[@class='ant-btn css-adaxxp ant-btn-default font-InterTight md:text-cta-med inline-block px-3 text-[14px] font-semibold md:px-4 text-primary-6 bg-primary-1 hover:ring-primary-6 border-none transition-all hover:ring-1']"));
		WebElement playaudio1 = play.get(0);
		playaudio1.click();
	}
	
}


// /html/body/div[1]/div/section/section/main/div/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/span vote -
// /html/body/div[1]/div/section/section/main/div/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/span vote + 
// //button[@data-test-id="discussion-table-unmute"] mute-unmute 
// /html/body/div[1]/div/section/section/main/div/div/div[4]/div[2]/div[2]/button
// /html/body/div[1]/div/section/section/main/div/div/div[4]/div[2]/div[2]/div[2]/button[4] reaction btn
// /html/body/div[1]/div/section/section/main/div/div/div[4]/div[1]/div[1]/div/span[1] avatar 
// /html/body/div[4]/div/div[2]/div/div/div/div[5]/div/button report participant

// /html/body/div[1]/div/section/section/main/div/div/div/div[4]/button viewotherdiscussion