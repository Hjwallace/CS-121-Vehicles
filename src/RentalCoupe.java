
public class RentalCoupe extends Coupe implements Rental {
	double dailyRate;
	
	public RentalCoupe(double r) {
		dailyRate = r;
		
	}
	public void rentalRate() {
		System.out.println("Rental Rate: $" + dailyRate);
		
	}

}
