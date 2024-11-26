package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;

public class MonthDaysCalculator {
    public static void main(String[] args) {

        String monthInput = JOptionPane.showInputDialog(null, "Nhập tháng:", "Nhập liệu", JOptionPane.INFORMATION_MESSAGE);
        String yearInput = JOptionPane.showInputDialog(null, "Nhập năm:", "Nhập liệu", JOptionPane.INFORMATION_MESSAGE);
        
        int year = Integer.parseInt(yearInput);
        
        int days = getDaysInMonth(monthInput, year);

        JOptionPane.showMessageDialog(null, "Tháng " + monthInput + " năm " + year + " có " + days + " ngày.", "Kết quả", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int getDaysInMonth(String monthInput, int year) {
        switch (monthInput) {
            case "January": case "Jan.": case "Jan": case "1":
                return 31;
            case "February": case "Feb.": case "Feb": case "2":
                return isLeapYear(year) ? 29 : 28; 
            case "March": case "Mar.": case "Mar": case "3":
                return 31;
            case "April": case "Apr.": case "Apr": case "4":
                return 30;
            case "May": case "5":
                return 31;
            case "June": case "Jun": case "6":
                return 30;
            case "July": case "Jul": case "7":
                return 31;
            case "August": case "Aug.": case "Aug": case "8":
                return 31;
            case "September": case "Sep.": case "Sep": case "9":
                return 30;
            case "October": case "Oct.": case "Oct": case "10":
                return 31;
            case "November": case "Nov.": case "Nov": case "11":
                return 30;
            case "December": case "Dec.": case "Dec": case "12":
                return 31;
            default:
                return -1; 
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}
