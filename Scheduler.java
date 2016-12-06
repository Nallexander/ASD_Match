import java.util.List;
public class Scheduler{
    private List<Invitation> invitations;
    private List<Match> matches;
    private Matcher matcher;
    private static Scheduler scheduler = new Scheduler();


    private Scheduler(){
    }
    public static Scheduler getInstance(){
	return scheduler;
    }

    public Invitation invite(Match match){
	return this.invitations.get(1);
    }

    public void requestFeedback(User user){
    }
    public void sendInvite(Match match,Responder responder){
    }
    public void addMatch(Match match){
    }
    public void sendNotification(User user){
    }
}
