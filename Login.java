
public class Login {
	private Authentictor authenticator;
	private static Login login = new Login();
	protected Login(){
	}
	
	public boolean attemptLogin(User user, String password){
		return false;
	}
	
	public Login getInstance(){
		return this.login;
	}
}
