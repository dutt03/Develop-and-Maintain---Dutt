public class Supplier {

	private String supplierName;
	private String supplierContactInformation;
	private String shippingInformation;

	// Constructor
	public Supplier(String supplierName, String supplierContactInformation, String shippingInformation) {
		this.supplierName = supplierName;
		this.supplierContactInformation = supplierContactInformation;
		this.shippingInformation = shippingInformation;
	}

	// Getters and Setters
	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierContactInformation() {
		return supplierContactInformation;
	}

	public void setSupplierContactInformation(String supplierContactInformation) {
		this.supplierContactInformation = supplierContactInformation;
	}

	public String getShippingInformation() {
		return shippingInformation;
	}

	public void setShippingInformation(String shippingInformation) {
		this.shippingInformation = shippingInformation;
	}
}
