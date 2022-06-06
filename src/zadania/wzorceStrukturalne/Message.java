package zadania.wzorceStrukturalne;

import java.time.LocalDateTime;

public class Message {

    private String channelName;
    private String author;
    private LocalDateTime postDate;
    private String value;

    public Message(String channelName, String author, LocalDateTime postDate, String value) {
        this.channelName = channelName;
        this.author = author;
        this.postDate = postDate;
        this.value = value;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDateTime postDate) {
        this.postDate = postDate;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}