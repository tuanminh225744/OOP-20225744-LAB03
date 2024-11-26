package hust.soict.dsai.lab01;

import java.util.Scanner;

public class PhuongTrinhBacNhat2An {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap cac he so cua he phuong trinh:");
        System.out.print("a11 = ");
        double a11 = scanner.nextDouble();
        System.out.print("a12 = ");
        double a12 = scanner.nextDouble();
        System.out.print("a21 = ");
        double a21 = scanner.nextDouble();
        System.out.print("a22 = ");
        double a22 = scanner.nextDouble();
        System.out.print("b1 = ");
        double b1 = scanner.nextDouble();
        System.out.print("b2 = ");
        double b2 = scanner.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("He co nghiem duy nhat:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Hệ có vô số nghiệm.");
            } else {
                System.out.println("Hệ vô nghiệm.");
            }
        }

        scanner.close();
    }
}