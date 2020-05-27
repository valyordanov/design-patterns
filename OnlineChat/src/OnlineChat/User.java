package OnlineChat;

public abstract class User {

    protected MessageMediator mediator;
    protected String name;

    public User(MessageMediator med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
    
}