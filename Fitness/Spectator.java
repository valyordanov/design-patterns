package fitness;

public class Spectator implements Observer{
	
	private String name;
	private Observable position;

	public Spectator(String name) {
		this.setName(name);
	}

	private void setName(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(position == null) {
			System.out.println("Position not changed");
			return;
		}
		String positionName = position.getUpdate();
		System.out.println(this.getName() + " - position is: " + positionName);
	}

	private String getName() {
		return name;
	}

	@Override
	public void changePosition(Observable position) {
		this.position = position;
	}

}
