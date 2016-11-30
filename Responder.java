import java.util.List;

public class Responder extends User {
	private List<Skill> skills;
	private List<Income> incomes;
	private List<Invitation> invitations;

	public Responder(String mail){
		super(mail);
	}
	
	public Responder(String mail, String phone, String address, String aboutMe) {
		super(mail, phone, address, aboutMe);
	}

	public List<Skill> getSkills(){
		return this.skills;
	}
	public void sendFeedback(Reception reception){
		
	}
	public List<Income> getIncome(){
		return this.incomes;
	}
	public void respond(Reception reception, Invitation invitation){
		
	}
	public void addInvitaiton(Invitation invitation){
		this.invitations.add(invitation);
	}
	public void cancelJob(Match match){
		
	}
}
