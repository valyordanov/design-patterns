package fitness;

public class Instructor {
	
	private Command command;
	
	public void setExercise(Command command) {
		this.command = command;
	}
	
	public void uploadExercise() {
		System.out.println("Position is changed. ");
		this.command.upload();	
	}
}
