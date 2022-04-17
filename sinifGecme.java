import java.util.Scanner;
public class sinifGecme {
    public static void main(String[] args){
        int mat,fiz,kim,biyo,turkce;

        Scanner inp= new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat= inp.nextInt();

        System.out.println("Fizik notunuz : ");
        fiz=inp.nextInt();

        System.out.println("Kimya notunuz : ");
        kim= inp.nextInt();

        System.out.println("Biyoloji notunuz : ");
        biyo= inp.nextInt();

        System.out.println("Türkçe notunuz : ");
        turkce= inp.nextInt();

        double average = (mat+fiz+kim+biyo+turkce)/5;
        if((mat >= 0 && mat <= 100) && (fiz >= 0 && fiz <= 100) && (kim >= 0 && kim <= 100) && (biyo >= 0 && biyo <= 100 ) &&
        (turkce>=0&&turkce<=100)) {
                System.out.println("Ortalamaniz : " + average);
            if (average<=55) {
                System.out.println("Maalesef. Sinifta kaldiniz :( ");
            }else{
                System.out.println("Tebrikler! Sinifi gectiniz :)");
            }

        }else{
                System.out.println("Lütfen 0 ile 100 arasinda bir not giriniz!");
        }
    }
}
