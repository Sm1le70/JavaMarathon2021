package day13;

import java.util.Date;
import java.util.GregorianCalendar;

public class Message {
    private User sender, receiver;
    private String text;
    private Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date = new GregorianCalendar().getTime();
    }

    @Override
    public String toString() {
        return "FROM: '" + sender + "'\n" +
                "TO: '" + receiver + "'\n" +
                "ON: " + date + "\n" +
                "'" + text + "'\n";
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }
}
