package bai4jame;

public class Bai4 {

        public static void main(String[] args) {
            // Tạo đối tượng Fan 1
            Fan fan1 = new Fan();
            fan1.setSpeed(Fan.FAST);
            fan1.setRadius(10);
            fan1.setColor("vàng");
            fan1.setOn(true);

            // Tạo đối tượng Fan 2
            Fan fan2 = new Fan();
            fan2.setSpeed(Fan.MEDIUM);
            fan2.setRadius(5);
            fan2.setColor("xanh");
            fan2.setOn(false);

            // Hiển thị thông tin các đối tượng Fan
            System.out.println("Thông tin Fan 1:");
            System.out.println(fan1.toString());

            System.out.println("\nThông tin Fan 2:");
            System.out.println(fan2.toString());
        }
    }

