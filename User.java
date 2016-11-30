import java.util.List;
/*import Notification;
import Constraint;
import Login;
import Reception;*/

public abstract class User {
	private int ID;
	private String mail;
	private String phone;
	private String address;
	private List<Constraint> constraints;
	private List<Notification> notifications;
	private String aboutMe;
	
	public User(String mail){
		this.mail = mail;
	}
	
	public User(String mail, String phone, String address, String aboutMe){
		
	}
	
	public String getAboutMe(){
		return this.aboutMe;
	}
	
	public void setInfo(String info){
		this.aboutMe = info;
	}
	
	public void Login(Login login, String password){
		
	}
	
	public void sendFeedback(Reception reception){
		
	}
	
	public void addNotification(Notification notification){
	
	}
}
