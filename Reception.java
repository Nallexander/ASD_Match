public class Reception{

    private static Reception reception = new Reception();
    private Matcherpool matcherpool;
    private LinkedList<Response> responses;
    private UsageStatistics statisticsEngine;
	
    private Reception(){
	this.matcherpool = Matcherpool.getInstance();
	this.responses = null;
	this.statisticsEngine = new Usagestatistics();
    }

    public static Reception getInstance(){
	return this.reception;
    }
    
    public void handleRequest(Matcher matcher, Request request){
	
    }
    public void updateUser(Database Handler, User user){
	
    }
    public void activateMatch(Match match){
	
    }
    public void handleResponse(Response response){
	
    }
    public void save(DBHandler db){
	
    }
    public LinkedList<Responder> getResponders(DBHandler db){
	
    }
    public void handleDecline(Invitation invitation){
	
    }
}
