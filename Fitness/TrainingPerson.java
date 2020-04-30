package fitness;

public class TrainingPerson {

	private boolean position;
	
	public void LayDown() {
		System.out.println("Lay down");
		this.position = true;
	}
	
	public void Getup() {
		System.out.println("Get up");
		this.position = false;
	}
}
