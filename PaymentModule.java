import java.util.List;

public class PaymentModule {
	private static PaymentModule paymentModule = new paymentModule();

	/* Private constructor that precents other classes from instantiating*/
	private PaymentModule() {}

	public static PaymentModule getInstance() {
		return paymentModule;
	}

	private List<User> users;
	private PaymentModel model;

	public void save(Reception reception){}
}
