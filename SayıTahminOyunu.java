import java.util.Scanner;

public class SayıTahminOyunu {
    public static void main(String[] args) {
        int tahmin,sayac=0,puan =100;
        Scanner tara= new Scanner(System.in);
        int tut = (1+(int)(Math.random()*100));
        System.out.println("İlk Tahmininiz...:");

        do{
            tahmin= tara.nextInt();
            sayac++;
            if (tahmin==tut)
                System.out.println("Bravo! "+sayac+" tahminde " +tut+ " sayısını bildiniz");
            else if(tahmin<tut)
                System.out.println("Daha büyük bir sayı gir!\n ");
            else
                System.out.println("Daha küçük bir sayı gir!\n");
            puan-=10;

        }while (tahmin != tut);
        System.out.println("Puanınız..:"+puan);

    }
}
