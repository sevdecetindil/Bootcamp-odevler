import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //degiskenleri olustur
        int mat,fizik,kimya,biyoloji,turkce,muzik;

        //scanner sınıfımızı tanımlayalım
        Scanner inp = new Scanner(System.in);

        //kullanicidan degerleri alalım
        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Biyoloji notunuz : ");
        biyoloji = inp.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + biyoloji + turkce + muzik);
        double ort = toplam/6.0;
        System.out.print("Not ortalamanız : " + ort);

        String sonuc = (ort>60) ? "\nSınıfı geçti." : "\nSınıfta kaldı." ;
        System.out.println(sonuc);
    }
}
