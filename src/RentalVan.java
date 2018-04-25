
public class RentalVan extends Coupe implements Rental {
	
	double dailyRate;
	
	public RentalVan(double r) {
		dailyRate = r;
		
	}
	public void rentalRate() {
		System.out.println("Rental Rate: $" + dailyRate);
		
	}
}
