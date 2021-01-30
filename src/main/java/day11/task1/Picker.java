package day11.task1;

public class Picker implements Worker {
    private int salary = 0;
    private int wage = 80;
    private boolean isPayed = false;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String toString() {
        return ("Зарплата сборщика - " + getSalary());
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        warehouse.pickOrder();
        salary += wage;
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if ((warehouse.getCountPickedOrders() >= 10000) && !isPayed) {
            salary += 70000;
            isPayed = true;
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
