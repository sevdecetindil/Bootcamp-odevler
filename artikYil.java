import java.util.Scanner;

public class artikYil {
    public static void main(String[] args){

        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Yil giriniz: ");
        yil = input.nextInt();

        if (yil >= 0) {
            if (yil%4 == 0) {
                if (yil%100 != 0) {
                    System.out.print(yil + " yili" + " bir artik yildir.");
                } else if (yil%100 == 0 && yil%400 == 0) {
                    System.out.print(yil + " yili" + " bir artik yildir.");
                } else {
                    System.out.print(yil + " yili" + " bir artik yil degildir.");
                }
            } else {
                System.out.print(yil + " yili" + " artik bir yil degildir.");
            }
        } else {
                System.out.print("Gecersiz deger.");
        }
    }
}
