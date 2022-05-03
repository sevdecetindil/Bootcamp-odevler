import java.util.Scanner;

public class gelismisHesapMakinesi {
    static int sum(int a, int b){
        int result = a+b;
        System.out.println("Toplam : " + result);
        return result;
    }
    static int minus(int a, int b){
        int result = a-b;
        System.out.println("Cikarma : " + result);
        return result;
    }
    static int times(int a, int b){
        int result = a*b;
        System.out.println("Carpma : " + result);
        return result;
    }
    static int divided(int a, int b){
        if (b==0){
            return 0;
        }
        int result = a/b;
        System.out.println("Bolum : " + result);
        return result;
    }
    static int power(int a,int b){
        int result=1;

        for (int i=1; i<=b ; i++) {
            result *= a;
        }
        return result;
    }
    static int mod(int a, int b){
        return a%b;
    }
    static void calc(int a, int b){
        System.out.println("Cevresi : " + (2*(a+b)));
        System.out.println("Alani : " + (a*b));
    }

    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        int select;

        System.out.println("------HESAP MAKINESI------");


        String menu = "1.Toplama islemi\n"
                +"2.Cıkarma islemi\n"
                +"3.Carpma islemi\n"
                +"4.Bolme islemi\n"
                +"5.Uslu sayi hesaplama\n"
                +"6.Mod alma\n"
                +"7.Dikdortgen alani ve cevresi hesaplama\n"
                +"0.Cikis yap";


        while (true) {
            System.out.println(menu);
            System.out.print("Bir islem seciniz : ");
            select = inp.nextInt();
            if (select == 0){
                break;
            }
                System.out.print("Ilk sayiyi girin : ");
            int a = inp.nextInt();
            System.out.print("Ikinci sayiyi girin : ");
            int b = inp.nextInt();
            int result = 0;

            System.out.println("------------------------------------");

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    if (divided(a,b)==0);
                    System.out.println("Ikinci sayi 0'dan farklı olmalı!");
                    break;
                case 5:
                    System.out.println("Us Hesaplama : " + power(a,b));
                    break;
                case 6:
                    System.out.println("Mod Islemi : " + mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Gecersiz giris!");
            }
        }
        System.out.println("Gule Gule!");
    }
}
