
public class TransitVan extends Coupe implements Transit {
	String route;
	
	public TransitVan(String r) {
		route = r;
	}
	@Override
	public void transitRoute() {
		System.out.println("Route: " + route);
	}
	
}
