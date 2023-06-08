import java.util.Random;
import java.util.Scanner;

public class Mainwork4{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       Random ygadaika = new Random();
      int chyslozugadaika=0,varianigrok=0,sproba=0;
     do {
         System.out.println("Введите число от 1 до 10");
         varianigrok = scan.nextInt();
         chyslozugadaika = ygadaika.nextInt(10);
         System.out.println("В угадайке выпало "+chyslozugadaika+".");
         System.out.println("-------------");
         sproba++;
     }

     while (varianigrok!=chyslozugadaika);
     System.out.println("COOL YOU WIN з"+sproba+"попытыки");
        }


    }


