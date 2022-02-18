
package javaapplication5;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b = 0;
        System.out.print("nhap a: ");
        while (true) {
            try {
                a = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println("Vui long nhap so nguyen !");
                System.out.print("nhap a: ");
            }
        }
        System.out.print("nhap b: ");
        while (true) {
            try {
                b = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println("Vui long nhap so nguyen !");
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
