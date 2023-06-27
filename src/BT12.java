import java.util.Arrays;
import java.util.Scanner;

public class BT12 {
    public static void main(String[] args) {
        double[] arr = {1.2, 2.5, 3.7, 4.9, 6.3, 7.6, 8.8, 10.1, 11.4};
        System.out.print("Nhap gia tri can tim: ");
        Scanner scanner = new Scanner(System.in);
        double target = scanner.nextDouble();
        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Gia tri " + target + " xuat hien tai vi tri " + index);
        } else {
            System.out.println("Khong tim thay gia tri " + target + " trong mang.");
        }
        double max = findMax(arr);
        System.out.println("Gia tri lon nhat trong mang la: " + max);
    }

    private static int binarySearch(double[] arr, double target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
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
