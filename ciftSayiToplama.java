import java.util.Scanner;

public class ciftSayiToplama {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        int n, sum = 0;

        do {
            System.out.print("Sayi Giriniz : ");
            n = inp.nextInt();
            if (n%4==0 && n%2==0){
                sum+=n;
            }
        }while (n > 0);
        System.out.println("Toplam : " + sum);
    }
}
