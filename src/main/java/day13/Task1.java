package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Bob");
        User user2 = new User("Tom");
        User user3 = new User("John");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Как дела?");
        user2.sendMessage(user1, "Норм");
        user2.sendMessage(user1, "Ок");
        user2.sendMessage(user1, "Сам как?");

        user3.sendMessage(user1, "Привет!");
        user3.sendMessage(user1, "Как дела?");
        user3.sendMessage(user1, "АУ!");

        user1.sendMessage(user3, "Норм");
        user1.sendMessage(user3, "Ок");
        user1.sendMessage(user3, "Сам как?");

        user3.sendMessage(user1, "Всё работает");

        MessageDatabase.showDialog(user1, user3);

//        for (Message message:MessageDatabase.getMessages()) { //для проверки метода toString класса Message
//            System.out.println(message);
//        }
    }
}
