package day13;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private List<User> subscriptions;

    public User(String name) {
        this.name = name;
        subscriptions = new ArrayList<>();
    }

    public String toString() {
        return name;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return (user.subscriptions.contains(this) && this.subscriptions.contains(user));
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    public String getName() {
        return name;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }
}
