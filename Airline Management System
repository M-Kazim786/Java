package airline;

public class Flight {
      private String flightNumber;
      private String origin;
      private String destination;
      private int availableSeats;
      
      public Flight() {
    	  
      }
      
      public Flight(String flightNumber,String origin,String destination,int availableSeats) {
    	  this.flightNumber=flightNumber;
    	  this.origin=origin;
    	  this.destination=destination;
    	  this.availableSeats=availableSeats;
      }

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
      
     public boolean assignCustomer() {
    	 if(availableSeats>0) {
    		 availableSeats--;
    		 return true;
    		 
    	 }
    	 else  {
    		 return false;
    	 }
     }

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", origin=" + origin + ", destination=" + destination
				+ ", availableSeats=" + availableSeats + "]";
	}
     
     
}

package airline;
import java.util.List;
import java.util.ArrayList;

public class Airline  {
    private List<Flight> flights;
    
    public Airline() {
        flights = new ArrayList<>(); // Initialize the list
    }
    
    public void addFlight(Flight flight) {
      flights.add(flight);
    }
    
    public Flight findFlightByNumber(String flightNumber) {
    	for(int i=0;i<flights.size();i++) {
    		if(flights.get(i).getFlightNumber().equals(flightNumber)) {
    			return flights.get(i);
    }
   
    }
    	return null;
           }
    public String registerCustomer(String flightNumber) {
    	Flight flight=findFlightByNumber(flightNumber);
    	
    	if(flightNumber!=null) {
    		if(flight.getAvailableSeats()>0) {
    			flight.setAvailableSeats(flight.getAvailableSeats()-1);
    			return "You have been registered succesfully for flight:"+flightNumber;
    			
    		}else {
                return "No available seats for flight: " + flightNumber;
    		
    	} 
    	} else {
    		return "No flights found";
    	}
    
    }
    
    public void listFlights() {
    	for(int i=0;i<flights.size();i++) {
    		System.out.println(flights.toString());
    	}
    }
    
    
    
    
}
