import java.util.Scanner;
public class vucutKitleIndeksi {
    public static void main(String[] args){
        double kg, boy;

        Scanner inp= new Scanner(System.in);
        System.out.println("Kilonuzu giriniz : ");
        kg= inp.nextDouble();
        Scanner input= new Scanner(System.in);
        System.out.println("Boyunuzu giriniz : ");
        boy=input.nextDouble();
        double indeks=kg/(boy*boy);
        System.out.println("Vücut indeksiniz : " + indeks);

    }

}
