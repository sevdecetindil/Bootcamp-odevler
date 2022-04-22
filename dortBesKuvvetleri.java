import java.util.Scanner;

public class dortBesKuvvetleri {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n;
        System.out.print("Sınır Sayısını Giriniz : ");
        n= inp.nextInt();

        System.out.println("Dördün Katları : ");
        for (int i=1; i<=n; i*=4){

            System.out.println(i);
        }

        System.out.println("-------------------------");

        System.out.println("Beşin Katları : ");
        for (int i=1; i<=n; i*=5){
            System.out.println(i);
        }
    }
}
