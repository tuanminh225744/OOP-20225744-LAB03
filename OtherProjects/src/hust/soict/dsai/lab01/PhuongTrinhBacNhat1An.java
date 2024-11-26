package hust.soict.dsai.lab01;
import java.util.Scanner;

public class PhuongTrinhBacNhat1An {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        double a=scanner.nextDouble();
        System.out.println("Nhap b:");
        double b=scanner.nextDouble();
        if (a==0) {
            if (b==0) {
                System.out.println("He co vo  so nghiem");
            }else{
                System.out.println("He vo nghiem");
            }
        }
        System.out.println("He co nghiem duy nhat: x=" + (-b)/a);
        scanner.close();
    }
}