package fitness;

public class MainClass {

	public static void main(String[] args) {
		
		Exercise exercise = new Exercise();
		
		Observer observer1 = new Spectator("Spectator 1");
		Observer observer2 = new Spectator("Spectator 2");
		Observer observer3 = new Spectator("Spectator 3");
		
		exercise.subscribe(observer1);
		exercise.subscribe(observer2);
		exercise.subscribe(observer3);
		
		Instructor instructor = new Instructor();
		TrainingPerson TrainingPerson = new TrainingPerson();
		
		LayDown layDown = new LayDown(TrainingPerson);
		GetUp getUp = new GetUp(TrainingPerson);
		
		instructor.setExercise(getUp);
		instructor.uploadExercise();
		exercise.setName("Get up");

		instructor.setExercise(layDown);
		instructor.uploadExercise();
		exercise.setName("Lay down");

	}
}
