package zadania.wzorceStrukturalne;

public class ProxyMain {

    public static void main(String[] args) {

        TeamsMessageSender teamsMessageSender = new TeamsMessageSender();
        MessageSender messageSender = new TeamsMessageSenderProxy(teamsMessageSender, new TokenHolder());
        messageSender.send("1", "Kaisa", "Ważna wiadomość" );


    }
}
