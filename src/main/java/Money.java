import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double money;
        int month;
        double interset_rate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien gui: ");
        money = sc.nextDouble();
        System.out.println("Nhap so thang gui: ");
        month = sc.nextInt();
        System.out.println("Nhap lai suat: ");
        interset_rate = sc.nextDouble();
        double total_interset = 0;
        for (int i = 0; i < month; i++) {
            total_interset = money * (interset_rate / 100) / 12 * month;
        }
        System.out.println("Lai suat cua ban la: " + total_interset);


    }
}
