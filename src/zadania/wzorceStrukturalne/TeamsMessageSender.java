package zadania.wzorceStrukturalne;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TeamsMessageSender implements MessageSender {

    private List<Message> messages = new ArrayList<>();

    @Override
    public void send(String channelName, String author, String message) {
        messages.add(new Message(channelName, author, LocalDateTime.now(), message));
        System.out.println("Wysłano wiadomość " + message);
    }
}
