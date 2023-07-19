package psi_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createnewdiscussionpage {
	
	
	  
		

		
		@FindBy(xpath="//*[@id=\"__next\"]/div/section/main/section/main/div/form/div/div[3]/div[2]/div/div[1]/div[2]/div[1]/div/input")
		private WebElement Enter_Title;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/span[1]/textarea[1]")
		private WebElement Short_Discription;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/img[1]")
		private WebElement Image_text;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span[2]")
		private WebElement Enter_url;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/input[1]")
		private WebElement URL_textbox;
		@FindBy(xpath="//button[contains(text(),'Add')]")
		private WebElement Add_tab;
		@FindBy(xpath="//div[@Class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']")
		private WebElement Description;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
		private WebElement Date_Time;
		@FindBy(xpath="//div[contains(text(),'PM')]")
		private WebElement PM;
		@FindBy(xpath="//span[contains(text(),'Ok')]")
		private WebElement Ok_tab;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]")
		private WebElement Time_2min;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/label[2]")
		private WebElement Time_5min;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/label[3]")
		private WebElement Time_10min;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/label[4]")
		private WebElement Time_15min;
		@FindBy(xpath= "//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[2]")		
		private WebElement TableTime_tab ;
		@FindBy(xpath= "//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/label[3]")
		private WebElement PitchTime_2min ;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/label[2]")
		private WebElement PitchTime_1min;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]")
		private WebElement PitchTime_30sec;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[5]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]")
		private WebElement RecordDisc_Tab;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]")
		private WebElement RedirectURL_Text;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[6]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]")
		private WebElement EnableSurvey_tab;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[7]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]")
		private WebElement PitchModeration_Tab;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[8]/div[1]/div[2]/div[1]/div[1]/input[1]")
		private WebElement RestrictedWords;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[9]/div[1]/div[2]/div[1]/div[1]/button[1]")
		private WebElement Chat_tab;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[10]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]")
		private WebElement PitchAudio_tab;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[13]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]")
		private WebElement PartAnonymous_tab;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[13]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]")
		private WebElement Guest_tab;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[13]/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]")
		private WebElement LateParticipant_tab ;
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[4]/div[13]/div[4]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]")
		private WebElement ListDiscussion_tab ;
		
		
		
		
		
		@FindBy(xpath="//body/div[@id='__next']/div[1]/section[1]/main[1]/section[1]/main[1]/div[1]/form[1]/div[1]/div[6]/div[2]/button[3]")
		private WebElement Publish_Tab ;

		
		public Createnewdiscussionpage(WebDriver driver ){
			PageFactory.initElements(driver, this);	
		}
		
		
		public void Topic_Title() {
			// TODO Auto-generated method stub
			Enter_Title.sendKeys("Robots in Everyday Life");
		}	
		public void ShortDiscsription() {
			
			 Short_Discription.sendKeys("As technology continues to develop rapidly, robots are becoming increasingly prevalent in our daily lives. They can be found in factories and other industrial settings, performing dangerous or difficult tasks for humans to do. But robots are also starting to appear in more mundane environments, such as homes and hospitals. ");

		}
		public void Long_Description() {

			 Description.sendKeys("Safety\r\n"
			 		+ "Robots are able to carry out tasks in hazardous environments such as the inside of a nuclear power plant or deep underwater. They can also shield humans from dangerous situations by working alongside us, such as flying planes or driving cars.\r\n"
			 		+ "\r\n"
			 		+ "Time Saving\r\n"
			 		+ "Many repetitive and arduous tasks can be carried out by robots, which means we don’t have to do them. This can increase productivity and free up time for more critical activities.\r\n"
			 		+ "\r\n"
			 		+ "Accessibility\r\n"
			 		+ "Robots offer people access to things that we wouldn’t otherwise be able to do. For example, a robot could carry heavy objects or assist someone in moving from one place to another as a wheelchair does for those who need assistance walking.\r\n"
			 		+ "\r\n"
			 		+ "Surveillance\r\n"
			 		+ "Robots can be equipped with cameras to give us a view of places that would otherwise be inaccessible or too dangerous for humans. This includes bomb disposal robots that enter hazardous situations and gather information before experts decide how to proceed.\r\n"
			 		+ "\r\n"
			 		+ "Lessens Loneliness\r\n"
			 		+ "Artificial intelligence (AI) robotic companions can keep people company when they’re alone, providing social interaction and making those who feel lonely less likely to become depressed. Whether it’s a robot that performs tasks with the person or one that simply provides companionship, robotic “friends” can make life more fulfilling for people of all ages.\r\n"
			 		+ "\r\n"
			 		+ "Productivity\r\n"
			 		+ "Robots reduce human efforts and increase productivity within the workplace by taking on dangerous jobs that humans don’t want to do. This could be mundane activities such as vacuuming or more complex jobs like assembling components in a factory-type environment.\r\n"
			 		+ "\r\n"
			 		+ "Improved Operation\r\n"
			 		+ "Robots can also improve the operation of systems such as computer networks and electrical grids. They can repair problems without people having to step in, which means greater productivity and faster response times if there is a need to fix an issue.\r\n"
			 		+ "\r\n"
			 		+ "Less Human Errors\r\n"
			 		+ "Robots can ensure better accuracy within the workplace, which reduces the likelihood of human error. When robots work alongside humans, they can help reduce mistakes by carrying out critical tasks without humans having to risk their lives.");
			
			 Image_text.click();
			
			 Enter_url.click();
			
			 URL_textbox.sendKeys("https://www.orientsoftware.com/Media/Default/Images/BlogPost/2022-01-07/robots-in-everyday-life.png");
			
			 Add_tab.click();
		}
		
		public void SetDate_Time()  {
			Date_Time.sendKeys(Keys.CONTROL+"a");
			Date_Time.sendKeys("2023-07-06 07:00");
			PM.click();
			Ok_tab.click();
		}
		
		public void Set_Time15() {
			Time_15min.click();	
		}
		public void Set_Time10() {
			Time_10min.click();	
		}
		public void Set_Time5() {
			Time_5min.click();
		}
		public void Set_Time2() {
			Time_2min.click();
		}
		public void decrease_participants_per_table() {
			TableTime_tab.click();
			TableTime_tab.click();
			TableTime_tab.click();
		}

		public void setPitchTime() {	
			PitchTime_2min.click();
			PitchTime_1min.click();
			PitchTime_30sec.click();
		}
		
		public void Record_Tab_disable() {
			RecordDisc_Tab.click();//disable
		}
		
		public void Record_Tab_eanled() {
			RecordDisc_Tab.click();//disable
			RecordDisc_Tab.click();//enable
		}
		public void URL() {
			// TODO Auto-generated method stub
			RedirectURL_Text.sendKeys("https://www.searchenginejournal.com/chrome-devtools-technical-seo-audits/344103/");
		}
		public void Enable_Surevy_disable() {		
			EnableSurvey_tab.click();   //ON	
			EnableSurvey_tab.click(); //OFF
		}
		public void Enable_Surevy_enable() {		
			EnableSurvey_tab.click();   //ON	
		}
		public void Pitch_Moderation() {
			
			PitchModeration_Tab.click();
			RestrictedWords.sendKeys("Red,Yellow,Black,Blue,Green");
			
		}
		public void Chat_Enable() {//default enabled	
			Chat_tab.click();
			Chat_tab.click();
		}
		public void Chat_disable() {//default enabled
			Chat_tab.click();
		}
		public void PitchAudio_Enable() {//default enabled
			PitchAudio_tab.click();
			PitchAudio_tab.click();
		}
		public void PitchAudio_disable() {//default enabled
			PitchAudio_tab.click();
		}
		public void Participant_Anonymous() {	//default disabled
			PartAnonymous_tab.click();
		}
		public void AllowGuest() {//default disabled
			Guest_tab.click();
		}
		public void LateParticipant() {//default disabled
			LateParticipant_tab.click();
		}
		public void DiscussionList_Org() {	
			ListDiscussion_tab.click();
		}
	
		public void Publish() {	
			Publish_Tab.click();
		}
		
		
		
}
