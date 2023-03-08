package ok.object.oriented;

public class Matrix {
    private int index, column;
    private double[][] array;

    public Matrix(int index, int column) {
        this.index = index;
        this.column = column;
        array = new double[index][column];
    }

    public void setValue(int i, int j, int value) {
        array[i - 1][j - 1] = value;
    }

    public double getValue(int i, int j) {
        return array[i - 1][ j - 1];
    }

    public void multiplicationByNumber(double number) {
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] * number + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void addWithMatrix(Matrix name) {
        if (index == name.index && column == name.column) {
            for (int i = 0; i < index; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(array[i][j] + name.array[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        else {
            System.out.println("Ошибка. Матрицы разной размерности. Сложение невозможно.");
        }
    }

    public void multiplicationByMatrix(Matrix name) {
        if (column == name.index) {
            double[][] c = new double[index][name.column];
            for (int i = 0; i < index; i++) {
                for (int j = 0; j < name.column; j++) {
                    for (int k = 0; k < name.column; k++) {
                        c[i][j] += array[i][k] * name.array[k][j];
                    }
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        else {
            System.out.println("Ошибка. Столбцы первой матрицы не равны строкам второй. Умножение невозможно");
        }
    }

    public void toMyString() {
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();   // Перенос строки для сохранения вида
        }
        System.out.println();   //Перенос
    }
}


class Main3 {
    public static void main(String[] arg) {

        System.out.println("Тесты с матрицей 1:");
        Matrix test1 = new Matrix(2, 2);
        test1.toMyString();

        test1.setValue(1, 1, 22);
        test1.setValue(1, 2, 50);
        test1.setValue(2, 1, 15);
        test1.toMyString();

        test1.multiplicationByNumber(2.5);


        System.out.println();   // Пустая строка
        System.out.println("Тесты с матрицей 2:");
        Matrix test2 = new Matrix(2, 2);
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                test2.setValue(i, j, i + 9);
            }
        }   // Заполняем массив
        test2.toMyString();


        System.out.println();   // Пустая строка
        System.out.println("Тесты с матрицей 1 и 2:");
        test1.addWithMatrix(test2);
        test1.multiplicationByMatrix(test2);    // test1 * test2


        System.out.println();   // Пустая строка
        System.out.println("Тесты ошибок с матрицей 1 и 3:");
        Matrix test3 = new Matrix(3, 2);
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                test3.setValue(i, j, i + 9);
            }
        }   // Заполняем массив
        test1.addWithMatrix(test3);
        test1.multiplicationByMatrix(test3);    // test1 * test3

        System.out.println();                   // Пустая строка
        test3.multiplicationByMatrix(test1);    // test3 * test1


        System.out.println();   // Пустая строка
        System.out.println("Преворека изменений у матриц 1,2,3:");
        test1.toMyString();
        test2.toMyString();
        test3.toMyString();
    }
}