import java.util.Scanner;

public class asalSayi1den100 {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int sayac = 0;
        for(int i=2;i<=100;i++)
        {
            int kontrol = 0;
            for (int n = 2; n < i; n++)
            {
                if (i % n == 0)
                {
                    kontrol = 1;
                    break;
                }
            }

            if(kontrol==0)
            {
                System.out.print(i+"\n");
                sayac++;
            }
        }
    }
}
