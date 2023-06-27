import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 8, 15, 20}; // Bước 1: Tạo mảng số nguyên cho sẵn
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị cần tìm: ");
        int target = scanner.nextInt(); // Bước 2: Lấy giá trị cần tìm từ bàn phím

        int max = linearSearch(arr, target); // Bước 3: Tìm số lớn nhất trong mảng và in ra
        System.out.println("Số lớn nhất trong mảng: " + max);

        int index = linearSearchIndex(arr, target); // Bước 4: Tìm kiếm tuyến tính và in ra vị trí
        if (index != -1) {
            System.out.println("Giá trị " + target + " được tìm thấy tại vị trí " + index);
        } else {
            System.out.println("Không tìm thấy giá trị " + target + " trong mảng.");
        }
    }

    private static int linearSearch(int[] arr, int target) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int linearSearchIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
