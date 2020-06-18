package CourierCompany;

public class AbroadEmployee extends Employee {

	public AbroadEmployee() {
		this.counter = Employee.ABROAD;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Third counter employee: " + message);
	}

}