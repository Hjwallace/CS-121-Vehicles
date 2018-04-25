
public class RentalBoat extends Boat implements Rental {
	
	double dailyRate;
	public RentalBoat(double r) {
		dailyRate = r;
		
	}

	@Override
	public void rentalRate() {
		System.out.println("Rental Rate: $" + dailyRate);
		
	}

}
