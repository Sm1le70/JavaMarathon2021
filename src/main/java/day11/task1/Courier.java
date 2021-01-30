package day11.task1;

public class Courier implements Worker {
    private int salary = 0;
    private int wage = 100;
    private boolean isPayed = false;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String toString() {
        return ("Зарплата курьера - " + getSalary());
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        warehouse.deliverOrder();
        salary += wage;
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if ((warehouse.getCountDeliveredOrders() >= 10000) && !isPayed) {
            salary += 50000;
            isPayed = true;
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
