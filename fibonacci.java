import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n1=0,n2=1,n3;
        System.out.print("Fibonacci serisinin eleman sayisi : ");
        int sayac= inp.nextInt();
        System.out.print(n1 + " " + n2);

        for (int i=2; i<sayac ; i++){
            n3=n1+n2;
            System.out.print(" " + n3);
            n1=n2;
            n2=n3;
        }
    }
}
