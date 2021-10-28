package OOPS;

public class Demo1 {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setData("product_001","Santoor",100);
        System.out.println(product1.getName());
        System.out.println(product1.getCode());
        System.out.println(product1.getPrice());
        Product product2 = new Product();
        product2.setData("product_002","hammam",101);
        System.out.println("first print = " +product2.getName());;
        System.out.println("second print = "+product2.getCode());
    }
}
