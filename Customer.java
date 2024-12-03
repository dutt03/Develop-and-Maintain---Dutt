public class Customer {

	private String name;
	private String contactInformation;
	private String billingInformation;

	// Constructor
	public Customer(String name, String contactInformation, String billingInformation) {
		this.name = name;
		this.contactInformation = contactInformation;
		this.billingInformation = billingInformation;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

	public String getBillingInformation() {
		return billingInformation;
	}

	public void setBillingInformation(String billingInformation) {
		this.billingInformation = billingInformation;
	}
}
