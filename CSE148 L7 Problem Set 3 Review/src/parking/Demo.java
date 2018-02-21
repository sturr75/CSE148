package parking;

import java.text.DecimalFormat;

public class Demo {

	public static void main(String[] args) {
		Cop cop = new Cop("John Doe", "123");
		
		ParkingMeter pm = new ParkingMeter(50, "SuffolkMeter101");
		ParkingTicket pt1 = new ParkingTicket(cop, pm, "101", 0.1);
		Cop cop2 = new Cop("Jane Doe", "321");
		pt1.setCop(cop2);
		System.out.println(pt1.toString());
		
		DecimalFormat df = new DecimalFormat("0.00");
		double d = 12345.1233456;
		System.out.println(df.format(d));
	}

}
