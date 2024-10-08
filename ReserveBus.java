package BusReservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class ReserveBus {
  //data received from console is stored in the variables as individual Objects
     String PassengerName;
     int BusNumber;
     Date date;
  //Constructor used to get data from User
     ReserveBus(){
    	 Scanner scanner = new Scanner(System.in);           //scanner object to get input multiple time
    	 System.out.println("Enter Name of Passenger : ");
    	 PassengerName =scanner.next();                      //scanner object used to get name string
    	 System.out.println("Enter Bus Number : ");
    	 BusNumber=scanner.nextInt();                        //scanner object used to get busNumber integer
    	 System.out.println("Enter Date as dd-MM-yyyy : ");
    	 String dateInput = scanner.next();                  //scanner object used to get date as string
    	 SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");  // String date can not be valited
    	 
     //Error Handling
        try {
			date = DateFormat.parse(dateInput);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
     }
      
        //to check Availability             

	public boolean isAvailable(ArrayList<ReserveBus> booking, ArrayList<Bus> buses) {
		int capacity=0;
		for(Bus bus:buses) {
			if(bus.getBusNumber()==BusNumber) {
				capacity=bus.GetSeatingCapacity();
			}
		}
		int booked=0;
		for(ReserveBus book:booking) {
			if(book.BusNumber==BusNumber && book.date.equals(date)){
				booked++;
			}
		}
		
		return booked<capacity?true:false;
	}
}
