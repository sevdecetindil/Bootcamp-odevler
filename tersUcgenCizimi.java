import java.util.Scanner;

public class tersUcgenCizimi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int n = inp.nextInt();

        for (int i=n; i>0; i--){
            for (int k=1; k<=(n-i);k++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
