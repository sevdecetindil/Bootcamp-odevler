import java.util.Scanner;

public class asalSayiRecursive {

    static int asal(int n ){
        int sayac=0;
        for (int i=2;i<n;i++){
            if (n%i==0){
                sayac=1;
            }
        }
        return sayac;
    }

    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int n = inp.nextInt();
        if (asal(n)==1){
            System.out.println(n + "sayisi ASAL sayi degildir.");
        }else{
            System.out.println(n + " sayisi ASAL sayidir.");
        }

    }
}
