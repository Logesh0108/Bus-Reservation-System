package BusReservation;
import java.util.*;
public class BusDemo {

	public static void main(String[] args) {
		ArrayList <Bus>buses  = new ArrayList<>();
		ArrayList <Booking>bookings  = new ArrayList<>();

		buses.add(new Bus(100,true,1));
		buses.add(new Bus(101,false,50));
		buses.add(new Bus(102,true,50));
		for(Bus b:buses) {
			b.displayBusinfo();
		}

		
		
		
		int useroption = 1;
		Scanner sc  = new Scanner(System.in);
		while(useroption == 1) {
			System.out.println("Enter 1 to Book Tickets or 2 to Exit");
			useroption = sc.nextInt();
			if(useroption == 1) {
				System.out.println("Book Tickets");
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else
					System.err.println("Bus is full Try anoter date or Bus.....!!!!");
			}
		}
	}

}
