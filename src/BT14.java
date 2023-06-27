import java.util.Arrays;
import java.util.Scanner;

public class BT14 {
    public static void main(String[] args) {
        // Bước 1: Khởi tạo mảng từ người dùng
        int[] arr = getInputArray();

        // Bước 2: Sắp xếp lại mảng
        Arrays.sort(arr);

        // Bước 3: Nhập giá trị cần tìm từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int value = scanner.nextInt();

        // Bước 4: Gọi hàm tìm kiếm nhị phân đệ quy
        int index = binarySearch(arr, 0, arr.length - 1, value);

        // Bước 8: Kiểm tra kết quả tìm kiếm
        if (index != -1) {
            System.out.println("Số " + value + " được tìm thấy tại vị trí " + index);
        } else {
            System.out.println("Số " + value + " không được tìm thấy trong mảng.");
        }
    }

    private static int[] getInputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    private static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) {
            return -1; // Không tìm thấy số trong mảng
        }

        int middle = (left + right) / 2;

        if (array[middle] == value) {
            return middle; // Tìm thấy số trong mảng
        } else if (array[middle] < value) {
            return binarySearch(array, middle + 1, right, value); // Tìm kiếm phía bên phải của middle
        } else {
            return binarySearch(array, left, middle - 1, value); // Tìm kiếm phía bên trái của middle
        }
    }
}
