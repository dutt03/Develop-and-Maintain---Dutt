import java.time.LocalDate;

public class Transaction {

	private LocalDate transactionDate;
	private String paymentMethod;
	private double paymentAmount;
	private String paymentStatus;

	// Constructor
	public Transaction(LocalDate transactionDate, String paymentMethod, double paymentAmount, String paymentStatus) {
		this.transactionDate = transactionDate;
		this.paymentMethod = paymentMethod;
		this.paymentAmount = paymentAmount;
		this.paymentStatus = paymentStatus;
	}

	// Getters and Setters
	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
}
