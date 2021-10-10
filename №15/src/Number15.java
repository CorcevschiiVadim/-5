import java.util.Scanner;
public class Number15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[];
        System.out.println("Введите число чтобы определить размер вашего массива:");
        int length = input.nextInt();
        if (length <= 0) {
            array = new int[10];
        }
        else {
            array = new int[length];
        }
        System.out.println("Введите" + length + "Цифры: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        echo(array);
    }

    public static void echo(int array[]) {
        System.out.print("Массив выглядет так:\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
