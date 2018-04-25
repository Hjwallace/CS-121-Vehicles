
public class Coupe implements Vehicle  {
	private boolean engine;
	private boolean doors;
	
	public Coupe() {
		engine = false;
		doors = false;
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
	
	public void checkDoors() {
		if (doors == true) {
			System.out.println("Doors: Unlocked");
		}else {
			System.out.println("Doors: Locked");
		}
	}
	
	public void unlock(boolean x) {
		if (x ==true) {
			System.out.println("....Unlocking Doors....");
		}else {
			System.out.println("....Locking Doors....");
		}
		this.doors = x;	
		
	}

}
