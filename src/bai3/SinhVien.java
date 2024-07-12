package bai3;

public class SinhVien {
    public static void main(String[] args) {
        // Điểm của SV 1
        String[] scores1 = {"8", "7", "9","8"};
        Thongtin student1 = new Thongtin("Đỗ Chính Đạt", 23, scores1);

        // Điểm của SV 2
        String[] scores2 = {"7", "6", "8","9"};
        Thongtin student2 = new Thongtin("Nguyên Thảo Nguyên", 22, scores2);

        // Chiển khai VS1
        System.out.println("Sinh Viên 1:");
        System.out.println("Họ Tên: " + student1.getName());
        System.out.println("Tuổi: " + student1.getAge());
        System.out.println("Điểm: " + java.util.Arrays.toString(student1.getScores()));
        System.out.println("Điểm trung bình: " + student1.calculateAverageScore());

        // Chiển khai SV2
        System.out.println("\nStudent 2:");
        System.out.println("Tên: " + student2.getName());
        System.out.println("Tuổi: " + student2.getAge());
        System.out.println("Điểm: " + java.util.Arrays.toString(student2.getScores()));
        System.out.println("Điểm trung bình: " + student2.calculateAverageScore());

        //Chiênr khai SV có điểm TB cao nhất
        Thongtin higherAvgStudent = Thongtin.compareStudents(student1, student2);
        System.out.println("\nSinh viên có điểm trung bình cao nhất là:");
        System.out.println("Họ Tên: " + higherAvgStudent.getName());
        System.out.println("Điểm trung bình: " + higherAvgStudent.calculateAverageScore());
    }
}
