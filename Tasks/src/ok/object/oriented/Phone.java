package ok.object.oriented;

public class Phone {
    private String name, number, model, weight;

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + "\nНомер " + getNumber());
    }

    public Phone() {}

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, String weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String toString() {
        System.out.println("Номер " + getNumber() + "\nМодель " + model + "\nВес " + weight);
        return ("Номер " + getNumber() + "\nМодель " + model + "\nВес " + weight);
    }

    public void sendMessage(String[] number) {
        for (int i = 0; i < number.length; i++) {
            this.number = number[i];
            System.out.println(getNumber());
        }
    }
}


class Main1 {
    public static void main(String[] args) {

        Phone test1 = new Phone();
        test1.receiveCall("Batman");

        System.out.println();   // Пустая строка
        Phone test2 = new Phone("89005003232", "Iphone 7");
        test2.receiveCall("Alex", test2.getNumber());

        System.out.println();    // Пустая строка
        Phone test3 = new Phone("89005075855", "Xiaomi Redmi Note 6 Pro", "128 GB");
        test3.toString();

        System.out.println();    // Пустая строка
        String array[] = {"89705302233", "911", "35-35-35", "101"};
        test1.sendMessage(array);
    }
}