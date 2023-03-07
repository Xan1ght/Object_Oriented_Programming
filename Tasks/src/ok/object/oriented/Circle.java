package ok.object.oriented;

public class Circle {
    private int radius;
    private String color;

    public double area() {
        return Math.PI*Math.pow(radius, 2);
    }

    public double perimeter() {
        return Math.PI*(2*radius);
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        System.out.println("Радиус " + radius + "\nЦвет " + color
                + "\nПлощадь " + area() + "\nПериметр " + perimeter());
        return ("Радиус " + radius + "\nЦвет " + color
                + "\nПлощадь " + area() + "\nПериметр " + perimeter());
    }
}


class Main2 {
    public static void main(String[] args) {

        Circle test1 = new Circle(5, "Красный");
        test1.toString();

        System.out.println();    // Пустая строка
        Circle test2 = new Circle(10, "Синий");
        test2.toString();
    }
}