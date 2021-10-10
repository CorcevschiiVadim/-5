import java.util.Scanner;
public class Number12 {
    private static int[] arrValues = new int[5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int remaining = 0;

        while (remaining != 5) {
            System.out.printf("Enter value %d/5 between 10 and 100: ", remaining + 1);
            int num = sc.nextInt();

            if (num < 10 || num > 100)
                continue;

            if (isUnique(num))
                System.out.printf("Unique value: %d\n", num);

            try {
                arrValues[remaining++] = num;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

            printUnique();
        }
    }

    public static boolean isUnique(int num) {
        for (int i = 0; i < arrValues.length; i++) {
            if (arrValues[i] == num)
                return false;
        }
        return true;
    }

    public static void printUnique() {
        System.out.println("\nUnique values:\n");
        System.out.print(arrValues[0] + " ");

        int unique = 0;

        for (int i = 1; i < arrValues.length; i++) {
            if (arrValues[i] > 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (arrValues[i] == arrValues[j]) {
                        unique = 0;
                        break;
                    } else {
                        unique = arrValues[i];
                    }
                }
                if (unique > 0)
                    System.out.print(unique + " ");
            } else {
                continue;
            }
        }
        System.out.println();
    }
}
