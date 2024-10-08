package BusReservation;
import java.util.Scanner;
import java.util.ArrayList;
public class BookingDemo {

	public static void main(String[] args) {
		
		//Collection of Bus Objects
		 ArrayList<Bus> buses = new ArrayList<Bus>();
		
		 buses.add(new Bus(1,true,3));
		 buses.add(new Bus(2,true,3));
		 buses.add(new Bus(3,false,2));
		 
	   //Collection of bookings Objects
		   ArrayList<ReserveBus> booking = new ArrayList<ReserveBus>();
		 
		 //Displaying All Bus 
		 for(Bus b:buses) {
			 b.Display();
		 }
		 
		 int userinp=1;
		 Scanner scanner = new Scanner(System.in);
		 
		 while(userinp>0&&userinp<3) {
           System.out.println("Enter 1 to Book");
           System.out.println("Enter 2 to Check Availability");
           System.out.println("Enter 3 to Exit");
           userinp=scanner.nextInt();
           if(userinp==1) {
        	   ReserveBus Passengerbooking = new ReserveBus();
        	   if(Passengerbooking.isAvailable(booking,buses)) {
        		    booking.add(Passengerbooking);
        		    System.out.println("Your Booking Is Confirmed...");
        	   }
        	   else {
        		   System.out.println("Sorry.Bus is Full .Try Another Bus or Date If Available");
        	   }
           }
           if(userinp==2) {
        	   																																
           }
		 }
     }
}
