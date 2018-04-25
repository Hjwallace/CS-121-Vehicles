
public class Boat implements Vehicle {
	private boolean engine;
	private boolean anchor;
	
	public Boat() {
		this.engine = false;
		this.anchor = false;
	}

	@Override
	public void checkEngine() {
		
		if (engine == true) {
			System.out.println("Engine: On");
		}else {
			System.out.println("Engine: Off");
		}
	}

	@Override
	public void On(boolean x) {
		
		if (x ==true) {
			System.out.println("....Turning Engine On....");
		}else {
			System.out.println("....Turning Engine Off....");
		}
		
		this.engine = x;	
	}
	
	public void Up(boolean x) {
		if (x ==true) {
			System.out.println("....Raising Anchor....");
		}else {
			System.out.println("....Lowering Anchor....");
		}
		this.anchor = x;
	}
	
	public void checkAnchor() {
		if (anchor == true) {
			System.out.println("Anchor: Up");
		}else {
			System.out.println("Anchor: Down");
		}
	}

}
