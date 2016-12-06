import java.util.*;

public class Reception{

    private static Reception reception = new Reception();
    private MatcherPool matcherpool = MatcherPool.getInstance();
    private LinkedList<Response> responses;
    //    private UsageStatistics statisticsEngine;
	
    private Reception(){
    }

    public static Reception getInstance(){
	return reception;
    }
    /*   
    public void handleRequest(Matcher matcher, Request request){
	
    }
    */
    /*
    public void updateUser(DatabaseHandler dbhandler, User user){
   
    }
    */
    public void activateMatch(Match match){
	
    }
    public void handleResponse(Response response){
	
    }
    /*
    public void save(DBHandler db){
	
    }
    */
    /*
     public LinkedList<Responder> getResponders(DBHandler db){
       
     }
    */
    public void handleDecline(Invitation invitation){
	
    }
}
