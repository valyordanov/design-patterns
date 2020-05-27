package OnlineChat;

import java.util.ArrayList;
import java.util.List;

public class ChatMessageMediator implements MessageMediator {
	public Bot bot;
	private List<User> users;
    public ChatMessageMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            if (u != user) {
                u.receive(message);
            }
        }
        if (null != bot && bot.watchForUnallowedWord(message)) {
			deleteUser(user);
			System.out.print("Bot: ");
			System.out.println("user " + user.name + " was removed!");
			bot.UserAnnouncement(this.users);
			return;
        }
        if (message.equals("addBot")) {
        	this.bot = bot.getBot();
        } 
    }

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public void deleteUser(User user) {
		this.users.remove(user);
	}
}
