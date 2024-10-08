package BusReservation;

public class Bus {
      private int BusNumber;
      private boolean AC;
      private int SeatingCapacity;
      
      Bus(int BusNum,boolean ac,int SeatCap){
    	  this.BusNumber=BusNum;
    	  this.AC=ac;
    	  this.SeatingCapacity=SeatCap;
      }
      
    //Accessor - GETTERs
      
      public int getBusNumber(){ 
    	  return BusNumber;
      }
      
      public boolean getAC() {
    	  return AC;
      }
      
      public int GetSeatingCapacity() {
    	  return SeatingCapacity;
      }
      
    //Mutator - SETTERs
      
      public void setAC(boolean ac){ 
    	   AC=ac;
      }
      
      public void SetSeatingCapacity(int SeatCap) {
    	   SeatingCapacity=SeatCap;
      }
      
     //Display Outputs
      
      public void Display() {
    	  System.out.println("BusNumber Booked : "+ BusNumber + " AC : "+ AC + " Total Capacity : "+ SeatingCapacity);
      }
}
