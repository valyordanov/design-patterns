package fitness;

public class GetUp implements Command{

	private TrainingPerson position;

	public GetUp(TrainingPerson position) {
		this.position = position;
	}
	
	@Override
	public void upload() {
		this.position.Getup();		
	}
}
