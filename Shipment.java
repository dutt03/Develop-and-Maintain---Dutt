import java.time.LocalDate;

public class Shipment {

	private LocalDate shipmentDate;
	private LocalDate arrivalDate;
	private String deliveryAddress;
	private String shipmentStatus;
	private String shippingMethod;

	// Constructor
	public Shipment(LocalDate shipmentDate, LocalDate arrivalDate, String deliveryAddress,
			String shipmentStatus, String shippingMethod) {
		this.shipmentDate = shipmentDate;
		this.arrivalDate = arrivalDate;
		this.deliveryAddress = deliveryAddress;
		this.shipmentStatus = shipmentStatus;
		this.shippingMethod = shippingMethod;
	}

	// Getters and Setters
	public LocalDate getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(LocalDate shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getShipmentStatus() {
		return shipmentStatus;
	}

	public void setShipmentStatus(String shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}

	public String getShippingMethod() {
		return shippingMethod;
	}

	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
}
