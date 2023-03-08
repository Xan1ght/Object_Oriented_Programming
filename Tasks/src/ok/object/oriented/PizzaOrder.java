package ok.object.oriented;

public class PizzaOrder {
    private String name, size, street;
    private Boolean needSauce, orderIsAccepted = false;
    enum Size {
        SMALL ("Маленькая"),
        MEDIUM("Средняя"),
        BIG("Большая");

        private String size;

        Size(String size) {
            this.size = size;
        }

        public String getSize() {
            return size;
        }
    }   // Who the fuck knows what this enum doing!? Прикол...

    public PizzaOrder() {};

    public PizzaOrder(String name, String size, Boolean needSauce, String street) {
        this.name = name;
        this.size = size;
        this.needSauce = needSauce;
        this.street = street;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setNeedSauce(Boolean needSauce) {
        this.needSauce = needSauce;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public Boolean getNeedSauce() {
        return needSauce;
    }

    public String getStreet() {
        return street;
    }

    public void order() {
        if (orderIsAccepted) {
            System.out.println("Заказ уже принят");
        }
        else {
            if (getNeedSauce()) {
                System.out.println("Заказ принят. " + getSize() + " пицца \"" + getName()
                        + "\" с соусом на адрес " + getStreet());
            }
            else {
                System.out.println("Заказ принят. " + getSize() + " пицца \"" + getName()
                        + "\" без соуса на адрес " + getStreet());
            }
            orderIsAccepted = true;
        }
    }

    public Boolean cancel() {
        if (orderIsAccepted) {
            System.out.println("Заказ отменен");
            return orderIsAccepted = false;
        }
        else {
            System.out.println("Заказ не был принят");
            return orderIsAccepted;
        }
    }

    public String toString() {
        System.out.println("Название " + getName() + "\nРазмер " + getSize()
                + "\nСоус " + getNeedSauce() + "\nУлица " + getStreet() + "\nЗаказ " + orderIsAccepted);
        return ("Название " + getName() + "\nРазмер " + getSize()
                + "\nСоус " + getNeedSauce() + "\nУлица " + getStreet() + "\nЗаказ " + orderIsAccepted);
    }
}


class Main5 {
    public static void main(String[] arg) {

        PizzaOrder.Size size = PizzaOrder.Size.BIG;

        PizzaOrder test1 = new PizzaOrder("Пепперони", size.getSize(), false, "Болонина 9");
        test1.toString();

        System.out.println();   // Пустая строка
        test1.cancel();

        System.out.println();   // Пустая строка
        test1.order();

        System.out.println();   // Пустая строка
        test1.order();

        System.out.println();   // Пустая строка
        test1.cancel();

        System.out.println();   // Пустая строка
        PizzaOrder test2 = new PizzaOrder();
        test2.setName("Маргарита");
        test2.setSize((size = PizzaOrder.Size.SMALL).getSize());
        test2.setNeedSauce(true);
        test2.setStreet("Зосимовская 1");
        test2.toString();

        System.out.println();   // Пустая строка
        test2.order();

        System.out.println();   // Пустая строка
        test2.cancel();
    }
}