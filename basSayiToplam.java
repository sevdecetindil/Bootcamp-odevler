import java.util.Scanner;

public class basSayiToplam {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        int n,basValue=0,result=0;
        System.out.print("Sayi giriniz : ");
        n= inp.nextInt();
        while (n != 0){
            basValue= n%10;
            result+=basValue;
            n/=10;
        }
        System.out.println(result);
    }
}
