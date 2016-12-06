public class Invitation extends Question{
    private Match match;
    private Responder responder;

    public Invitation(Match match, Responder responder,User user, int timeout){
        super(user,timeout);
	this.match = match;
	this.responder = responder;
	
    }
     public Invitation(User user, int timeout){
	super(user,timeout);
    }

    public void answer(boolean answer){
    }

}
