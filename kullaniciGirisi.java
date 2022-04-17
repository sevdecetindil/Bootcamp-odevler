import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args){

        String userName,password,secim,newPass;
        Scanner inp= new Scanner(System.in);

        System.out.println("Kullanici adinizi giriniz : ");
        userName= inp.nextLine();

        System.out.println("Sifrenizi giriniz : ");
        password=inp.nextLine();

        if(userName.equals("patika")&&(password.equals("123"))) {
            System.out.println("Hosgeldiniz :) ");
        }
        else if (userName.equals("patika") && (password.equals("1234"))) {
                System.out.println("Sifreniz hatali!");
                System.out.println("Sifrenizi degistirmek ister misiniz?");
                secim = inp.nextLine();
                if (secim.equals("evet")) {
                    System.out.println("Lutfen yeni sifrenizi giriniz : ");
                    newPass = inp.nextLine();
                    if (newPass.equals("123") || (newPass.equals("1234"))) {
                        System.out.println("Daha once kullandiginiz bir sifre girdiniz.Sifre olusturulmadi!");
                    } else {
                        System.out.println("Yeni sifre basarili sekilde olusturuldu.");
                    }
                }
            }
        else {
            System.out.println("Bilgileriniz hatali!");
        }

    }
}
