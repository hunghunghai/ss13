import java.util.Scanner;

public class BT11 {
    public static void main(String[] args) {
        double[] arr = {1.5, 2.8, 3.2, 4.7, 5.1, 6.4, 7.9, 8.3, 9.6, 10.0};

        System.out.print("Nhap gia tri can tim: ");
        Scanner scanner = new Scanner(System.in);
        double target = scanner.nextDouble();

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Gia tri " + target + " xuat hien tai vi tri " + index);
        } else {
            System.out.println("Khong tim thay gia tri " + target + " trong mang.");
        }

        double max = findMax(arr);
        System.out.println("Gia tri lon nhat trong mang la: " + max);
    }

    private static int linearSearch(double[] arr, double target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
