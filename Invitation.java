public class Invitation extends Question{
    private Match match;
    private Responder responder;

	public Invitation(Match match, Responder responder){
	this.match = match;
	this.responder = responder;
    }

    public void answer(boolean answer){
    }

}
