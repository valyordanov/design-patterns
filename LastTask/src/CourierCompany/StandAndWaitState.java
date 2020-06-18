package CourierCompany;

public class StandAndWaitState implements State {

	private String stateName = "STAND_AND_WAIT";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
	}
	
	public String getStateName() {
		return this.stateName;
	}
}