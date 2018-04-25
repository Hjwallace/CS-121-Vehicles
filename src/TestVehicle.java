
public class TestVehicle {

	public static void main(String[] args) {
		
		TransitVan tr = new TransitVan("Muncie to Indy");
		System.out.println("-------------");
		System.out.println("|Transit Van|");
		System.out.println("-------------");
		tr.checkEngine();
		tr.checkDoors();
		tr.transitRoute();
		
		Boat b = new Boat();
		System.out.println("-------");
		System.out.println("|Ferry|");
		System.out.println("-------------");
		//Anchor
		b.checkAnchor();
		b.Up(true);
		b.checkAnchor();
		//Engine 
		b.checkEngine();
		b.On(true);
		b.checkEngine();
		
		RentalVan rv = new RentalVan(80);
		System.out.println("------------");
		System.out.println("|Rental Van|");
		System.out.println("-------------");
		rv.checkEngine();
		rv.checkDoors();
		rv.rentalRate();

		RentalCoupe c = new RentalCoupe(25);
		System.out.println("--------------");
		System.out.println("|Rental Coupe|");
		System.out.println("-------------");
		c.checkEngine();
		c.On(true);
		c.checkEngine();
		c.checkDoors();
		c.unlock(true);
		c.checkDoors();
		
		RentalBoat b1 = new RentalBoat(35);
		System.out.println("-------------");
		System.out.println("|Rental Boat|");
		System.out.println("-------------");
		b1.checkAnchor();
		b1.checkEngine();
		b1.rentalRate();
		
		System.out.println("FINAL TEST");
		System.out.println("--------------------");
		
		Vehicle[] all = new Vehicle[5];
		all[0] = tr;
		all[1] = b;
		all[2] = rv;
		all[3] = c;
		all[4] = b1;
		
		for(int i = 0; i < all.length; i++ ) {
			all[i].On(true);
			all[i].checkEngine();
		}

		
		
		

		
		

		
	}

}
