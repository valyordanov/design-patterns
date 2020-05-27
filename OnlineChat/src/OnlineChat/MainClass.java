package OnlineChat;

public class MainClass {
	public static void main(String[] args) {

	MessageMediator mediator = new ChatMessageMediator();
    
	UserFactory userFactory = FactoryProducer.getUsers();
	
	User user1 = new ChatUser(mediator, "Boyan");
    User user2 = new ChatUser(mediator, "Stefan");
    User user3 = new ChatUser(mediator, "Valentin");

    user1.send("addBot");
    
    user2.send("Valentin, What's your cat's name?");
    
    user3.send("Jonny");
	
	}
}
