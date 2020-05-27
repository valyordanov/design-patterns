package OnlineChat;

public class FactoryProducer {
	public static UserFactory getUsers() {
		return new UserFactory();
	}
}
