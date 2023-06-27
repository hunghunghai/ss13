import java.util.Arrays;
import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        // Bước 1: Nhập mảng từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Bước 2: Sắp xếp mảng tăng dần
        Arrays.sort(array);

        // Bước 3: Lấy số cần tìm từ bàn phím
        System.out.print("Nhập giá trị cần tìm: ");
        int target = scanner.nextInt();

        // Bước 4: Tìm kiếm nhị phân
        int result = binarySearch(array, target);

        // Bước 5: Kiểm tra kết quả tìm kiếm và in ra thông báo
        if (result == -1) {
            System.out.println("Không tìm thấy giá trị trong mảng.");
        } else {
            System.out.println("Giá trị được tìm thấy tại vị trí: " + result);
        }
    }

    // Hàm tìm kiếm nhị phân
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Giá trị được tìm thấy
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Không tìm thấy giá trị
    }
}
