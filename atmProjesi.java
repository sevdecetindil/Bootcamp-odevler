import java.util.Scanner;

public class atmProjesi {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String userName, password;
        int right=3;
        int balance=3000;
        int select;

        while (right > 0) {
            System.out.print("Kullanici adinizi giriniz : ");
            userName = inp.nextLine();
            System.out.print("Sifrenizi giriniz : ");
            password = inp.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Kodluyoruz bankasina hosgeldiniz!");
                do {
                    System.out.println("1-Para Cekme\n" +
                            "2-Para Yatirma\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Cikis Yap");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
                    select=inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Lutfen cekmek istediginiz para miktarini giriniz : ");
                            int price= inp.nextInt();
                            if (balance<price){
                                System.out.println("Bakiyeniz yetersiz!");
                            }else{
                                balance -= price;
                            }
                            break;
                        case 2:
                            System.out.print("Lutfen yatirmak istediginiz para miktarini giriniz : ");
                            price= inp.nextInt();
                            balance += price;
                            break;
                        case 3:
                            System.out.println("Hesap bakiyeniz : "+balance);
                            break;
                        case 4:

                            break;
                    }
                }while (select!=4);
                System.out.println("Iyi gunler dileriz.");
                break;
            }else{
                right--;
                System.out.println("Hatalı sifre veya kullanici adi girdiniz! Tekrar deneyin.");
                if (right==0){
                    System.out.println("Hesabiniz bloke edilmistir! Lütfen banka ile iletisime geciniz.");
                }else{
                    System.out.println("Kalan hakkiniz : " + right);
                }
            }










        }
    }
}
