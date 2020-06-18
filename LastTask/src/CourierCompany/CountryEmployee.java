package CourierCompany;

public class CountryEmployee extends Employee {
	
	public CountryEmployee() {
		this.counter = Employee.COUNTRY;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Second counter employee: " + message);
	}

}