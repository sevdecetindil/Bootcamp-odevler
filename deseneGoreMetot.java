import java.util.Scanner;

public class deseneGoreMetot {
    static void ekle(int n,int temp){
        System.out.print(" " + temp);
        if(n==temp){
            return ;
        }else{
            ekle(n,temp+5);
        }
    }
    static void cikar(int n,int temp){
        System.out.print(" " + temp);
        if(temp<=0){
            ekle(n,temp+5); ;
        }else{
            cikar(n,temp-5);
        }

    }
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int n= inp.nextInt();
        cikar(n,n);
    }
}
