package parking;

public class Cop {
	private String name;
	private String badgeNumber;

	public Cop(String name, String badgeNumber) {
		super();
		this.name = name;
		this.badgeNumber = badgeNumber;
	}
	
	public Cop(Cop cop) {
//		this.name = cop.name;
//		this.badgeNumber = cop.badgeNumber;
		this(cop.name, cop.badgeNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBadgeNumber() {
		return badgeNumber;
	}

	public void setBadgeNumber(String badgeNumber) {
		this.badgeNumber = badgeNumber;
	}

	@Override
	public String toString() {
		return "Cop [name=" + name + ", badgeNumber=" + badgeNumber + "]";
	}

}
