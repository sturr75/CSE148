package parking;

public class Vehicle {
	private String make;
	private String licenseNumber;

	public Vehicle(String make, String licenseNumber) {
		super();
		this.make = make;
		this.licenseNumber = licenseNumber;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", licenseNumber=" + licenseNumber + "]";
	}

}
