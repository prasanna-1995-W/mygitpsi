package Test_Cases;





import org.testng.annotations.Test;


import Base.BaseClass2_userside;
import psi_POM.Add_idea_b15;
import psi_POM.Add_idea_module;
import psi_POM.Discuss_Vote_round;
import psi_POM.Enter_username;
import psi_POM.Final_summarypg;
import psi_POM.GetStartedpage_Guestlogin;
import psi_POM.Review_IdeasPg;
import psi_POM.Topic_Details_pg;
import psi_POM.WaitingRoomPg;



public class Test_guestuser extends BaseClass2_userside {



	@Test()
	public void login_guest() throws InterruptedException  {
		GetStartedpage_Guestlogin gl = new GetStartedpage_Guestlogin(driver);
	    gl.getstarted_btn();
	}
	
	@Test(dependsOnMethods="login_guest")
	public void login_guest2() throws InterruptedException  {
		Enter_username eu = new Enter_username(driver);
		
		eu.enter_name();
		eu.letsgo_click();
	}
	
	@Test(priority=1,dependsOnMethods="login_guest2")
	public void close_hdw() throws InterruptedException  {
		Topic_Details_pg td =new Topic_Details_pg(driver);
		td.gotittabclick();
		Thread.sleep(2000);
	}
	@Test(priority=2,dependsOnMethods="close_hdw")
	public void join_disc() throws InterruptedException  {	
		
		Add_idea_b15 adi =new Add_idea_b15(driver);
		adi.joindis_click();
	
	}
	@Test(priority=3,dependsOnMethods="join_disc")
	public void add_idea() throws InterruptedException  {	

		Add_idea_module aim = new Add_idea_module(driver);
		aim.enter_title();
		aim.record_click();
		Thread.sleep(3000);
		aim.done_click();	
		Thread.sleep(1000);
//		aim.play_click();
//		Thread.sleep(5000);
		aim.submit_idea_click();
	}
	
	@Test(priority=4,dependsOnMethods="add_idea")
	public void waitingroom() throws InterruptedException  {
		WaitingRoomPg wr = new WaitingRoomPg(driver);
		Thread.sleep(1000);
		wr.unmuteRq_btn();
		wr.reaction_btn();
//		wr.leave_btn();
//		Thread.sleep(1000);
//		wr.goback_btn();
//		wr.test_audio_btn()
//		wr.close_test_audio_btn();
//		wr.type_message();
//		Thread.sleep(1000);
//		wr.Send_message();			
	}
	
	@Test(priority=5,dependsOnMethods="waitingroom")
	public void review_idea() throws InterruptedException  {
		Review_IdeasPg ripg = new  Review_IdeasPg(driver);
//		td.closetab();
		Thread.sleep(2000);
		ripg.play_audio_click(driver);	
////	Thread.sleep(20000);
//		ripg.joinDiscR();
	}
	
	@Test(priority=6,dependsOnMethods="review_idea")
	public void discussion_room() throws InterruptedException  {

		Discuss_Vote_round dvr = new Discuss_Vote_round(driver);
		dvr.hand_raise_click();
		dvr.mute_click();//mute
		dvr.hand_raise_click();
		dvr.reaction_click();
		dvr.type_message();
		dvr.reaction_click();
		dvr.Send_message();
		dvr.unmute_click();//unmute
		dvr.type_message();
		dvr.reaction_click();
		dvr.Send_message();
		dvr.reaction_click();
		dvr.mute_click();//mute	
//		dvr.vote_inc_click();
//		dvr.reaction_click();dvr.vote_dec_click();
		Final_summarypg fsp = new Final_summarypg(driver);
		fsp.view_click(driver);
		Thread.sleep(3000);
		driver.navigate().back();
		
	}
	


	


}
