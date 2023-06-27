import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT8 {
    private static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Mang ngau nhien: ");
        printArray(arr);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri min: ");
        int min = scanner.nextInt();

        System.out.print("Nhap gia tri max: ");
        int max = scanner.nextInt();

        List<Integer> foundNumbers = findNumbersInRange(arr, min, max);
        System.out.println("So luong so tim thay: " + foundNumbers.size());
        System.out.println("Cac so tim thay: " + foundNumbers);
    }

    private static List<Integer> findNumbersInRange(int[] arr, int min, int max) {
        List<Integer> foundNumbers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= min && arr[i] <= max) {
                foundNumbers.add(arr[i]);
            }
        }
        return foundNumbers;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
