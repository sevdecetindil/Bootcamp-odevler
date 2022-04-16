import java.util.Scanner;
public class daireAlaniCevresi {
    public static void main(String[] args){

        int r,aci;
        double pi=3.14;

        Scanner inp= new Scanner(System.in);
        System.out.println("Dairenin yaricapini giriniz : ");
        r=inp.nextInt();
        double alan=pi*r*r;
        double cevre=2*pi*r;
        System.out.println("Dairenin dilim acisini giriniz : ");
        aci= inp.nextInt();
        double dilimAlan=(pi*r*r*aci)/360;

        System.out.println("Dairenin alani : " + alan);
        System.out.println(("Dairenin cevresi : " + cevre));
        System.out.println("Daire diliminin alani : " + dilimAlan);


    }

}
