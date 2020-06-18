package CourierCompany;

public abstract class Employee {
	public static int PLOVDIV_CITY = 1;
	public static int COUNTRY = 2;
	public static int ABROAD = 3;
	
	protected int counter;
	protected Employee employee;

	public void setNextEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void logMessage(int counter, String message) {
		
		if(this.counter <= counter) {
			this.writeMessage(message);
		}
		
		if(this.employee != null) {
			this.employee.logMessage(counter, message);
		}
	}

	abstract protected void writeMessage(String message);
}

