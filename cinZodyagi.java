import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args){
        int dogumYili;
        String burc="";
        Scanner inp= new Scanner(System.in);

        System.out.println("Dogum Yilinizi Giriniz : ");
        dogumYili= inp.nextInt();

        switch (dogumYili%12) {
            case 1:
                burc = "Maymun";
                break;
            case 2:
                burc = "Horoz";
                break;
            case 3:
                burc = "Kopek";
                break;
            case 4:
                burc = "Domuz";
                break;
            case 5:
                burc = "Fare";
                break;
            case 6:
                burc = "Okuz";
                break;
            case 7:
                burc = "Kaplan";
                break;
            case 8:
                burc = "Tavsan";
                break;
            case 9:
                burc = "Ejderha";
                break;
            case 10:
                burc = "Yilan";
                break;
            case 11:
                burc = "At";
                break;
            case 12:
                burc = "Koyun";
                break;
        }
        System.out.println("Burcunuz : " + burc);
    }
}
