package javaapplication5;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.print("nhap ban kinh r: ");
        while (true) {
            try {
                r = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println("Vui long nhap so thuc !");
                System.out.print("nhap ban kinh r: ");
            }
        }
        double c = 2 * r * 3.14159;
        System.out.println("chu vi hinh tron la: " + c);
    }
}
