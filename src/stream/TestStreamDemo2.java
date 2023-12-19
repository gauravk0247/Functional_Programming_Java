package stream;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Flight{
	private int flightNumber;
	private String flightName;
	private String flightSource;
	private String flightDestination;
	private Double flightCost;
	public Flight(int flightNumber, String flightName, String flightSource, String flightDestination,double price) {
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.flightSource = flightSource;
		this.flightDestination = flightDestination;
		this.flightCost = price;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public String getFlightSource() {
		return flightSource;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public Double getFlightCost() {
		return flightCost;
	}
	public String toString() {
		return "Flight [flightNumer="+flightNumber + ", FlightName="+flightName+" flightSource="+ flightSource+" flightDestination="+flightDestination
				+" flightCost="+flightCost;
	}
}
class FlightService{
	Set<Flight> flights;
	int i=0;
	// Add Flights
	public void AddFlight(Set<Flight> flights) {
		this.flights=flights;
		++i;
		System.out.println(i+" "+" Flight added");
	}
	public Stream<Flight> getFlights(){
		Stream<Flight> newStream = flights.stream();
		return newStream;
		
	}
	
	// Searched Flight
	public List<Flight> searchFlight(String source, String destination){
		List<Flight> resFlight = flights.stream().filter(flight ->
		flight.getFlightSource().equals(source) && 
		flight.getFlightDestination().equals(destination)).collect(Collectors.toList());
		return resFlight;
	}
	
	// Find FlightNumber
	public Flight getFlightByNumber(int flightNumber) {
		Flight flightObj = flights.stream().filter(flight->flight
				.getFlightNumber()==flightNumber).findAny().get();
		return flightObj;
	}
	
	// Sort Flight on Cost
	public Stream<Flight> getSortedFlight(){
		Comparator<Flight> cmp = (flight1, flight2)->{
			if(flight1.getFlightCost()>flight2.getFlightCost()) {
				return 1;
			}
			return -1;
		};
		Stream<Flight> newStream = flights.stream().sorted(cmp);
		return newStream;
	}
	
	public Flight getMaxPrice()
	{
		Comparator<Flight> maxCmp=
				(f1,f2)->f1.getFlightCost()>f2.getFlightCost()?1:-1;
				
	Flight flight=	flights.stream().max(maxCmp).get();
	return flight;
	}
	
	public void removeFlight(int flightNumber)
	{
		/*
		 * boolean removeIf(Predicate predicate)
		 * The above method defined inside collection framework
		 * to remove any object from any type of collection based on the
		 * given predicate reference
		 * 
		 * interface Predicate
		 * {
		 * boolean test(T t)
		 * }
		 * 
		 */
	boolean status=	flights.
	removeIf(f->f.getFlightNumber()==flightNumber);
	if(status)
	{
		System.out.println("flight removed successfully");
	}
	else
	{
		System.out.println("not removed");
	}
	}
}
public class TestStreamDemo2 {

	public static void main(String[] args) {
		FlightService service = new FlightService();
		Set<Flight> setOfFlight = new HashSet();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many flights do you want to add");
		int nof = sc.nextInt();
		for(int i=0;i<nof;i++) {
			System.out.println("Enter Flight Number");
			int flightNo = sc.nextInt();
			System.out.println("Enter Flight Name");
			String flightName = sc.next();
			System.out.println("Enter Flight Source");
			String flightSource = sc.next();
			System.out.println("Enter flight Destination");
			String flightDestination = sc.next();
			System.out.println("Enter flight Price");
			double price = sc.nextDouble();
			
			Flight flightObj = new Flight(flightNo, flightName, flightSource, flightDestination, price);
			
			setOfFlight.add(flightObj);
		}
			service.AddFlight(setOfFlight);
			
			Stream resultStream=service.getFlights();
			resultStream.forEach(Flight->System.out.println(Flight));
			/*System.out.println("Enter flight source location");
			String src =sc.next();
			System.out.println("Enter flight destination location");
			String dest=sc.next();
			// Calling Searched Flights
			List<Flight> searchedFlights = service.searchFlight(src, dest);
			
			// Iterating the reslt list
			searchedFlights.forEach(f->System.out.println(f));
			
			// Calling getFlightByNumber
			Flight f = service.getFlightByNumber(123);
			System.out.println(f);*/
			
			System.out.println("After sorting flight based on price ");
			Stream<Flight> resultSortedFlight = service.getSortedFlight();
			resultSortedFlight.forEach(f1->System.out.println(f1));
			
			
			// Calling getMaxPrice
			Flight f1 = service.getMaxPrice();
			System.out.println(f1);
			
			service.removeFlight(1234);
	}
}
