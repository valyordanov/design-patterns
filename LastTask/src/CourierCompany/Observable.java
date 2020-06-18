package CourierCompany;

public interface Observable {
	public void subscribe(Observer observer);
	public void notifyObservers();
	public String getUpdate();
}
