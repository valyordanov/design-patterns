package CourierCompany;

public class PreparationState implements State {

	private String stateName = "PREPARATION_STATE";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
	}
	
	public String getStateName() {
		return this.stateName;
	}

}