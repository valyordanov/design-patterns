package OnlineChat;

import java.util.List;

public class Bot {

	public static Bot bot;
	private Bot() {
		
	}
	public static Bot getBot() {
		if (bot == null) {
			bot = new Bot();
		}
		return bot;
	}
	
	public boolean watchForUnallowedWord(String message) {
		if (message.contains("cat")) {
			return true;
		}
		return false;
	}
	
	public void UserAnnouncement(List<User> users){
		for (User user : users) {
			user.receive("The word cat is not allowed.");
		}	
	}
}
