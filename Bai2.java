package javaapplication5;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a, b = 0;
        System.out.print("nhap a: ");
        while (true) {
            try {
                a = Byte.parseByte(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println("Vui long nhap so >= -127 <=128");
                System.out.print("nhap a: ");
            }
        }
        System.out.print("nhap b: ");
        while (true) {
            try {
                b = Byte.parseByte(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println("Vui long nhap so >= -127 <=128");
                System.out.print("nhap b: ");
            }
        }
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(Math.pow(a, b));  
    }
}
