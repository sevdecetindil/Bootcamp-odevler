import java.util.Scanner;
public class ucgenAlan {
    public static void main(String[] args) {
        //degisken olusturalim
        int a, b, c, u;
        double Area;

        //kullanicidan degerleri alalim
        Scanner inp = new Scanner(System.in);
        System.out.print("1. kenari giriniz : ");
        a = inp.nextInt();
        System.out.print("2. kenari giriniz : ");
        b = inp.nextInt();
        System.out.print("3. kenari giriniz : ");
        c = inp.nextInt();
        u = (a + b + c) / 2;
        Area = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.print("Ucgenin Alani : " + Area);
    }
}
