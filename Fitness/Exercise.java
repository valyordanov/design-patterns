package fitness;

import java.util.ArrayList;
import java.util.List;

public class Exercise implements Observable{

	private List<Observer> observers = new ArrayList<Observer>();
	private String name;
	
	
	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.changePosition(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifySpectators() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		this.notifySpectators();
	}

}