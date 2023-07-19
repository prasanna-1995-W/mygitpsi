package Test_Cases;


import org.testng.annotations.Test;

import Base.BaseClass;
import psi_POM.CreateDiscussiontab;
import psi_POM.Createnewdiscussionpage;
import psi_POM.Loginpage;



public class Test_OrgAdmin extends BaseClass{
	
	@Test()
	public void lgn() {//org admin loign 
		Loginpage lp = new Loginpage(driver);
		lp.Send_username();
		lp.Send_Password();
		lp.SignIn_btn();
	}
	
	@Test(priority=3)
	public void cretenewdiscussion() {//navigate to create new discussion page
		CreateDiscussiontab cd= new CreateDiscussiontab(driver);
		cd.NewDiss_btn();
	}
	
	@Test(priority=4)
	public void entertitle() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);
		cnd.Topic_Title();
	}
	@Test(priority=5)
	public void entershortd() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);
		cnd.ShortDiscsription();
	}
	@Test(priority=6)
	public void enterdescrption() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);
		cnd.Long_Description();
	}
	
	@Test(priority=7)
	public void setdatetime() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);
		cnd.SetDate_Time();
	}
	@Test(priority=8)
	public void Tablesetting() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);
//		cnd.Set_Time2();
		cnd.setPitchTime();
		cnd.decrease_participants_per_table();	
		cnd.Record_Tab_eanled();
		cnd.URL();
		cnd.Enable_Surevy_disable();
		cnd.Pitch_Moderation();
		cnd.Chat_Enable();
		cnd.PitchAudio_Enable();
		cnd.Participant_Anonymous();
		cnd.AllowGuest();
		cnd.LateParticipant();
		cnd.DiscussionList_Org();
	}
	@Test(priority=9)
	public void published() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);
		cnd.Publish();	
	}

}



