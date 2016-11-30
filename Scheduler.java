public class Scheduler{
    private List<Inivitation> invitations;
    private List<Match> matches;
    private Matcher matcher;
    private static Scheduler scheduler = new Scheduler();


  private Scheduler(){
      this.invitations = new List<invitation>;
      this.matches = new List<Matches>;
      this.matcher = new Matcher();
      
}
public static Scheduler getInstance(){
    return scheduler;
}

public Invitation invite(Match match){
}

public void requestFeedback(User user){
}
public void sendInvite(Match match,Responder responder){
}
public void addMatch(Match match){
}
public void sendNotification(User user){
}
