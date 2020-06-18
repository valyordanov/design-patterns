package CourierCompany;

public class PlovdivCityEmployee extends Employee{

	public PlovdivCityEmployee() {
		this.counter = Employee.PLOVDIV_CITY;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("First counter employee: " + message);
	}

}
