public class Matcher{

    private LinkedList<User> users;
    private Learner learner;
    private Scheduler scheduler;
    private LinkedList<Requests> requests;
    private StatisticalModel statisticalModel;

    public Matcher(){
	
    }
    public Match  match(Request request, List<Responder> responders, String method, StatisticalModel model){
	
    }
    public void batch(Date date, List<Request> requests, String method){
	
    }
    public void save(Reception reception){
	
    }
    public void addRequest(Request request){
	
    }
    public void processRequest(Request request){
	
    }
    public void replaceResponder(Match match, Responder responder){
	
    }
    public Responder findNewResponder(Match match, StatisticalModel model, List<Responder> responder){
	
    }
    public LinkedList<Responder> getResponders(Reception reception){
	
    }
}