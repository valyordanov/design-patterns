package OnlineChat;

public class UserFactory {
	
	public User createUser(ChatMessageMediator mediator, String name) {
		return new ChatUser(mediator, name);
	}	
}
