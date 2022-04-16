import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {
        int a,b,c,d,e;
        double total,armut = 2.14, Elma = 3.67, Domates = 1.11, Muz = 0.95, Patlıcan = 5.00;
        Scanner inp= new Scanner(System.in);
        System.out.println("Armut kac kilo : ");
        a=inp.nextInt();
        double arm=armut*a;
        Scanner input= new Scanner(System.in);
        System.out.println("Elma kac kilo? : ");
        b=inp.nextInt();
        double elm=Elma*b;
        Scanner girdi= new Scanner(System.in);
        System.out.println("Domates kac kilo? : ");
        c=inp.nextInt();
        double dom=Domates*c;
        Scanner gir= new Scanner(System.in);
        System.out.println("Muz kac kilo? : ");
        d=inp.nextInt();
        double muz=Muz*d;
        Scanner gird= new Scanner(System.in);
        System.out.println("Patlıcan kac kilo? : ");
        e=inp.nextInt();
        double pat=Patlıcan*e;
        total=arm+elm+dom+muz+pat;
        System.out.println("Toplam Tutar : " + total);
    }


}