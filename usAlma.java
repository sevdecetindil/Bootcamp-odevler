import java.util.Scanner;

public class usAlma {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        int n,k;
        System.out.print("Ussu alinacak sayiyi giriniz : ");
        n= inp.nextInt();
        System.out.print("Us olacak sayiyi giriniz : ");
        k= inp.nextInt();
        int total=1;

        for (int i=1; i<=k ; i++){
            total *= n;
        }
        System.out.println(n+ " ^ " +k+ " = " +total);
    }
}
