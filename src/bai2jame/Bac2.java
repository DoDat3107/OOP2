package bai2jame;

public class Bac2 {
    public static void main(String[] args) {
        // Tạo đối tượng QuadraticEquation với các hệ số cho trước
        QuadraticEquation equation = new QuadraticEquation(5, 8, 7);

        // In ra các thông tin về phương trình
        System.out.println("Hệ số a: " + equation.getA());
        System.out.println("Hệ số b: " + equation.getB());
        System.out.println("Hệ số c: " + equation.getC());

        // Tính delta và in ra kết quả
        double delta = equation.delta();
        System.out.println("Delta của phương trình: " + delta);

        // Tính các nghiệm và in ra kết quả
       if(delta > 0){
            double root1 = equation.x1();
            double root2 = equation.x2();
            System.out.println("Phương trình có 2 nghiệm phân biệt");
            System.out.println("Nghiệm 1 của phương trình: " + root1);
            System.out.println("Nghiệm 2 của phương trình: " + root2);
        } else if (delta == 0) {
           double root1 = equation.x3();
           System.out.println("phương trình có 1 nghiệm duy nhất");
           System.out.println("Nghiệm của phương trình là: " + root1);
       }
       else {
           System.out.println("phương trình vô nghiệm");
       }
    }
}
