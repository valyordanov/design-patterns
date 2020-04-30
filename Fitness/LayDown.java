package fitness;

public class LayDown implements Command {

	private TrainingPerson position;

	public LayDown(TrainingPerson position) {
		this.position = position;
	}
	
	@Override
	public void upload() {
		this.position.LayDown();		
	}
}
