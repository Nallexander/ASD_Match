import java.util.List;
//import Payment;
//import Request;
//import Subscription;
//import Reception;

public class Requester extends User {
	private List<Request> requests;
	private Subscription subscription;
	private List<Payment> payments;
	
	public Requester(String mail){
		super(mail);
	}
	
	public Requester(String mail, String phone, String address, String aboutMe){
		super(mail, phone, address, aboutMe);
	}
	
	public void createRequest(String requestDescription, Reception reception){
		
	}
	
	public void sendFeedback(Reception reception){
		
	}
	public void cancelSubscription(){
		
	}
	public void subscribe(Subscription subscription){
		
	}
	public List<Payment> checkPayments(){
		return this.payments;
		
	}
}
