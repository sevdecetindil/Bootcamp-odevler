import java.util.Scanner;
public class havaSicakligi {
    public static void main(String[] args) {

        int heat;

        Scanner inp = new Scanner(System.in);
        System.out.println("Sicaklik giriniz : ");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if(heat>=5 && heat<10){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if(heat>=10 && heat<=15){
            System.out.println("Piknik ya da sinemaya gidebilirsiniz.");
        }
        else if(heat>15 && heat<25){
            System.out.println("Piknik yapabilirsiniz.");
        }else if(heat==25){
            System.out.println("Piknige ya da yüzmeye gidebilirsiniz.");
        }
        else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
