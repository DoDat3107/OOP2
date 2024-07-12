public class Main {
    public static void main(String[] args) {
        HCN HCN1 =new HCN(20,21);
        System.out.println("Chiều dài của hình chữ nhật ban đầu là: "+HCN1.a);
        System.out.println("Chieu rộng của hình chữ nhật ban đầu là: "+HCN1.b);
        System.out.println("Chu vi của hình chữ nhật ban đầu là: "+HCN1.V);
        System.out.println("Diện tích của hình chữ nhật ban đầu là: "+HCN1.S);

        System.out.println("---------------------update HCN-------------------");

        HCN newHCN = new HCN(5,6);
        System.out.println("Chiều dài của hình chữ nhật mới là: "+newHCN.a);
        System.out.println("Chieu rộng của hình chữ nhật mới là: "+newHCN.b);
        System.out.println("Chu vi của hình chữ nhật mới là: "+newHCN.V);
        System.out.println("Diện tích của hình chữ nhật mới là: "+newHCN.S);
    }
}
