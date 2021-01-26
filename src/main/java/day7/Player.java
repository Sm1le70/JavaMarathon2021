package day7;

public class Player {

    private int stamina;
    public static final int MAX_STAMINA = 100, MIN_STAMINA = 0;  //переменная MAX_STAMINA нигде не используется, куда бы её воткнуть...
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public void run() {
        if (stamina > MIN_STAMINA + 1) {
            stamina--;
        } else if (stamina > MIN_STAMINA) {
            stamina--;
            countPlayers--;
        }
    }

    public static void info() {
        switch (countPlayers) {
            case 0:
            case 1:
                System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных места");
                break;
            case 5:
                System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободное место");
                break;
            default:
                System.out.println("На поле нет свободных мест");
        }

    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
}
