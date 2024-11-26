package hust.soict.dsai.lab01;


import java.util.Scanner;
import javax.swing.JOptionPane;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Strnum1;
        Strnum1=JOptionPane.showInputDialog("Nhap So Thu Nhat:");
        double num1 = Double.parseDouble(Strnum1);
        String Strnum2;
        Strnum2=JOptionPane.showInputDialog("Nhap So Thu Hai:");
        double num2 = Double.parseDouble(Strnum2);
        double tong = num1 + num2;
        double hieu = num1 - num2;
        double tich = num1 * num2;
        double thuong;
        double du;
        if (num2 != 0) {
            thuong = num1 / num2;
            du = num1 % num2;
        } else {
            System.out.println("khong the chia cho 0.");
            thuong = Double.NaN; 
            du = Double.NaN; 
        }

        JOptionPane.showMessageDialog(null, "Tong:"+tong+"\n"+"Hieu:"+hieu+"\n"+"Tich:"+tich+"\n"+"Thuong:"+thuong+"\n"+"Du:"+du);
        scanner.close();
    }
}