import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double m, kg, kutleindeksi;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu (Metre Cinsinden) Giriniz : ");
        m = input.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz :");
        kg = input.nextDouble();

        kutleindeksi = kg / (m * m);
        System.out.println("Vüzut Kütle İndeksiniz :" + kutleindeksi);
    }
}