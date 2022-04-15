import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //degiskenleri olustur
        double kdvucret,ucret;

        //scanner sınıfımızı tanımlayalım
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan degerleri alalim
        System.out.print("KDV'siz fiyat : ");
        ucret = inp.nextDouble();

        //ucret 1000den büyük veya eşitse kdv orani %8, küçükse %18 alınacak.
        kdvucret=(ucret >= 0 && ucret < 1000) ? 0.18 : 0.08;
        double kdv = (ucret*kdvucret);
        double kdvli = (ucret*kdvucret+ucret);
        System.out.println("KDV'siz fiyat : "+ ucret);
        System.out.println("KDV tutari : "+ kdv);
        System.out.println("KDV'li fiyat : "+ kdvli);
    }
}
