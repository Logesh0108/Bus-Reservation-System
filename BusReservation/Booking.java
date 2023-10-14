package BusReservation;
import java.util.*;
import java.text.SimpleDateFormat;
public class Booking {


		String passengername;
		int busno;
		Date date;
	    Booking(){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the passenger name : ");
			passengername = sc.next();
			System.out.println("Enter the bus no : ");
			busno = sc.nextInt();
			System.out.println("Enter the date dd-mm-yyyy");
			String dateinput = sc.next();
			SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
			try {
				date  = dateformat.parse(dateinput);
			}
			catch(Exception e){
				System.out.println(e);
			}
	}

	public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<Bus>buses) {
		int capacity = 0;
		//Object busNo;
		for(Bus bus:buses) {
			if(bus.getBusno()== busno) {
				capacity = bus.getCapacity();
			}
		}
		int booked =0;
		for(Booking b:bookings) {
			if(b.busno == busno && b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity?true : false;
	}
	
}