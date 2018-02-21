package parking;

public class ParkingTicket {
	private Cop cop;
	private ParkingMeter parkingMeter;
	private String ticketNumber;
	private double finePerIllegalMinute;

	// private Vehicle vehicle;
	public ParkingTicket(Cop cop, ParkingMeter parkingMeter, String ticketNumber, 
			double finePerIllegalMinute) {
		super();
		this.cop = cop;
		this.parkingMeter = parkingMeter;
		this.ticketNumber = ticketNumber;
		this.finePerIllegalMinute = finePerIllegalMinute;
	}

	public Cop getCop() {
		return new Cop(cop);
	}

	public void setCop(Cop cop) {
		this.cop = new Cop(cop);
	}

	public ParkingMeter getParkingMeter() {
		return parkingMeter;
	}

	public void setParkingMeter(ParkingMeter parkingMeter) {
		this.parkingMeter = parkingMeter;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public double getFinePerIllegalMinute() {
		return finePerIllegalMinute;
	}

	public void setFinePerIllegalMinute(double finePerIllegalMinute) {
		this.finePerIllegalMinute = finePerIllegalMinute;
	}

	@Override
	public String toString() {
		
		return "ParkingTicket [cop=" + cop + ", parkingMeter=" + parkingMeter + ", ticketNumber=" + ticketNumber
				+ ", finePerIllegalMinute=" + finePerIllegalMinute + "]";
	}

	
}
