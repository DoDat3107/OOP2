package bai3jame;

public class Bai3 {

    public static void main(String[] args) {
        // Sinh một mảng gồm 100,000 số nguyên ngẫu nhiên
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }

        // Tạo một đối tượng Stopwatch
        Stopwatch stopwatch = new Stopwatch();

        // Thực hiện thuật toán sắp xếp chọn
        selectionSort(array);

        // Dừng đồng hồ bấm giờ
        stopwatch.stop();

        // Lấy thời gian đã trôi qua tính bằng mili giây
        long elapsedTime = stopwatch.getElapsedTime();

        // In ra thời gian đã trôi qua
        System.out.println("Thời gian thực thi sắp xếp 100,000 phần tử: " + elapsedTime + " milliseconds");
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi array[minIndex] với array[i]
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
