package day11.task1;

public class Warehouse {
    private int countPickedOrders = 0, countDeliveredOrders = 0;

    public String toString() {
        return ("Собрано заказов - " + countPickedOrders + ", доставлено заказов - " + countDeliveredOrders);
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void pickOrder() {
        countPickedOrders++;
    }

    public void deliverOrder() {
        countDeliveredOrders++;
    }
}
