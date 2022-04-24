import java.util.Scanner;

public class enBuyukEnKucukSayı {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int m=1,min=0,max=0;
        System.out.print("Kac tane sayi gireceksiniz? : ");
        int n= inp.nextInt();

        while (n >= m){
            if (n>1){
                System.out.print(m + ". Sayiyi giriniz : ");
                int k= inp.nextInt();
                if (k>min && k>max){
                    max=k;
                    if (min==0){
                        min=k;
                    }
                }
                if (k<min && k<max){
                    min=k;
                    if (max==0){
                        max=k;
                    }
                }
            }
            m++;
        }
        System.out.print("En buyuk sayi : " + max + "\nEn kucuk sayi : " + min);
    }
}
