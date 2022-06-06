package zadania.wzorceStrukturalne;

public class TeamsMessageSenderProxy implements MessageSender {

    private TeamsMessageSender teamsMessageSender;
    private TokenHolder tokenHolder;

    public TeamsMessageSenderProxy(TeamsMessageSender teamsMessageSender, TokenHolder tokenHolder){
        this.teamsMessageSender = teamsMessageSender;
        this.tokenHolder = tokenHolder;
    }

    @Override
    public void send(String channelName, String author, String message){
        teamsMessageSender.send(channelName, author, message);
    }
}