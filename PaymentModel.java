public interface PaymentModel {
	public void makeTransaction(int amount, String senderBank, int sendAcc, String recvBank, int recvAcc);
}