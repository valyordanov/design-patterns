package OnlineChat;

public interface MessageMediator {

	void sendMessage(String message, User user);
	void addUser(User user);
	void deleteUser(User user);
}
