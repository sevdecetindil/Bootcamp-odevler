import java.util.Scanner;

public class burcBulma {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        int day,month;

        System.out.println("Dogdugunuz ayi giriniz : ");
        month= inp.nextInt();
        System.out.println("Dogdugunuz gunu giriniz : ");
        day= inp.nextInt();

        if(month == 1)
        {
            if(day < 22)
            {
                System.out.print("Oglak");
            }
            else if(day >= 22)
            {
                System.out.print("Kova");
            }
            else
            {
                System.out.print("Gecersiz!");
            }
        }
        else if(month == 2)
        {
            if(day < 20)
            {
                System.out.print("Kova");
            }
            else if(day >= 20)
            {
                System.out.print("Balik");
            }
            else
            {
                System.out.print("Gecersiz!");
            }
        }
        else if(month == 3)
        {
            if(day < 21)
            {
                System.out.print("Balik");
            }
            else if(day >= 21)
            {
                System.out.print("Koc");
            }
            else
            {
                System.out.print("Gecersiz!");
            }
        }
        else if(month == 4)
        {
            if(day < 21)
            {
                System.out.print("Koc");
            }
            else if(day >= 2)
            {
                System.out.print("Boga");
            }
            else
            {
                System.out.print("Gecersiz!");
            }
        }
        else if(month == 5)
        {
            if(day < 22)
            {
                System.out.print("Boga");
            }
            else if(day >= 22)
            {
                System.out.print("Ikizler");
            }
            else
            {
                System.out.print("Gecersiz!");
            }
        }
        else if(month == 6)
        {
            if(day < 23)
            {
                System.out.print("Ikizler");
            }
            else if(day >= 23)
            {
                System.out.print("Yengec");
            }
            else
            {
                System.out.print("Gecersiz!");
            }
        }else if(month == 7)
        {
            if(day < 23)
            {
                System.out.print("Yengec");
            }
            else if(day >= 23)
            {
                System.out.print("Aslan");
            }
            else
            {
                System.out.print("Gecersiz!");
            }
        }else if(month == 8)
        {
            if(day < 23)
            {
                System.out.print("Aslan");
            }
            else if(day >= 23)
            {
                System.out.print("Basak");
            }
            else
            {
                System.out.print("Gecersiz!");
            }
        }
        else if(month == 9)
        {
            if(day < 23)
            {
                System.out.print("Basak");
            }
            else if(day >= 23)
            {
                System.out.print("Terazi");
            }
            else
            {
                System.out.print("Gecersiz!");
            }
        }else if(month == 10)
        {
            if(day < 23)
            {
                System.out.print("Terazi");
            }
            else if(day >= 23)
            {
                System.out.print("Akrep");
            }
            else
            {
                System.out.print("Gecersiz!");
            }
        }else if(month == 11)
        {
            if(day < 22)
            {
                System.out.print("Akrep");
            }
            else if(day >= 22)
            {
                System.out.print("Yay");
            }
            else
            {
                System.out.print("Gecersiz!");
            }
        }
        else if(month == 12)
        {
            if(day < 22)
            {
                System.out.print("Yay");
            }
            else if(day >= 22)
            {
                System.out.print("Oglak");
            }
            else
            {
                System.out.print("Gecersiz!");
            }
        }

    }
}
