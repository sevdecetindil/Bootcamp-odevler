import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n,sum=0;
        System.out.print("Lutfen sayi giriniz : ");
        n= inp.nextInt();

        for (int i=1; i<n; i++){
            if (n%i==0){
                sum+=i;
            }
        }
        if (sum==n){
            System.out.println(n + " mukemmel sayidir.");
        }else{
            System.out.println(n + " mukemmel sayi degildir.");
        }
    }
}
