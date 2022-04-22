import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);

        int n,r,kombinasyon,totaln=1,totalr=1,totalnr=1;

        System.out.print("1. sayiyi giriniz : ");
        n=inp.nextInt();
        System.out.print("2. sayiyi giriniz : ");
        r=inp.nextInt();

        for (int i=1; i<=n; i++){
            totaln=totaln*i;
        }
        for (int i=1; i<=r; i++){
            totalr=totalr*i;
        }
        for (int i=1;i<=(n-r); i++){
            totalnr=totalnr*i;
        }
        kombinasyon=totaln/(totalr*totalnr);
        System.out.println(n + "'in " +r+ "'li kombinasyonu : " +kombinasyon);

    }
}
