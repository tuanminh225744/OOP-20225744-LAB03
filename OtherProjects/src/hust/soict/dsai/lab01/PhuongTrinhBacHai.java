package hust.soict.dsai.lab01;


import java.util.Scanner;

public class PhuongTrinhBacHai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap cac he so cua he phuong trinh:");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        
        double delta = b*b-4*a*c;
        if (delta>0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem phan biet:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }else{
            if (delta==0) {
                double x = (-b) / (2 * a);
                System.out.println("Phuong trinh mot nghiem:");
                System.out.println("x = " + x);
            }else{
                System.out.println("Phuong trinh vo nghiem:");
            }
        }
        
        scanner.close();
    }
}