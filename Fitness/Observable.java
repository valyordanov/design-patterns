package fitness;

public interface Observable {
	public void subscribe(Observer observer);
	public void unsubscribe(Observer observer);
	public void notifySpectators();
	public String getUpdate();
	
}
