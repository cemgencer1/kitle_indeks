import java.util.Scanner;
public class kitle {
    public static void main (String[]args)
    {
        double boy,kilo,indeks;
        Scanner veri = new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz(metre cinsinden giriniz)  :");
        boy = veri.nextDouble();
        System.out.print("Kilonuzu Giriniz :");
        kilo = veri.nextDouble();
        indeks = (kilo/(boy*boy));
        System.out.print("Vücut Kitle İndeksi :" + indeks);
    }
}
