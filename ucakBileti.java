import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {

        int mesafe, yas, yolculukTipi;
        double toplamTutar, mesafeBasiUcret = 0.10;
        Scanner inp = new Scanner(System.in);

        System.out.println("Mesafeyi KM cinsinden giriniz : ");
        mesafe = inp.nextInt();
        System.out.println("Yasinizi giriniz : ");
        yas = inp.nextInt();
        System.out.println("Yolculuk tipini giriniz (Tek yön => 1 , Gidis-Donus => 2) : ");
        yolculukTipi = inp.nextInt();
        toplamTutar = mesafe * mesafeBasiUcret;

        if((mesafe > 0 && yas > 0) && (yolculukTipi == 1 || yolculukTipi == 2)) {
            if (yas < 12) {
                if (yolculukTipi == 1) {
                    toplamTutar -= toplamTutar * 0.5;
                    System.out.print("Bilet Fiyati : " + toplamTutar);
                } else {
                    toplamTutar -= toplamTutar * 0.5;
                    toplamTutar -= toplamTutar * 0.2;
                    toplamTutar *= 2;
                    System.out.print("Bilet Fiyati : " + toplamTutar);
                }
            } else if (yas >= 12 && yas <= 24) {
                if (yolculukTipi == 1) {
                    toplamTutar -= toplamTutar * 0.1;
                    System.out.print("Bilet Fiyati : " + toplamTutar);
                } else {
                    toplamTutar -= toplamTutar * 0.1;
                    toplamTutar -= toplamTutar * 0.2;
                    toplamTutar *= 2;
                    System.out.print("Bilet Fiyati : " + toplamTutar);
                }
            } else if (yas >= 65) {
                if (yolculukTipi == 1) {
                    toplamTutar -= toplamTutar * 0.3;
                    System.out.print("Bilet Fiyati : " + toplamTutar);
                } else {
                    toplamTutar -= toplamTutar * 0.3;
                    toplamTutar -= toplamTutar * 0.2;
                    toplamTutar *= 2;
                    System.out.print("Bilet Fiyati : " + toplamTutar);
                }
            } else {
                if (yolculukTipi == 1) {
                    toplamTutar = toplamTutar;
                    System.out.print("Bilet Fiyati : " + toplamTutar);
                }
                else {
                    toplamTutar *= 2;
                    System.out.print("Bilet Fiyati : " + toplamTutar);
                }
            }
        } else {
            System.out.print("Hatali veri girdiniz.");
        }
    }
}
